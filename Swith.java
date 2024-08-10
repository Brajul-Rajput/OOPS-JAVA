import java.util.*;
public class Swith {
    public static void main(String[]args){
Scanner sc=new Scanner (System.in);
System.out.println("enter the value of a:");
int a=sc.nextInt();
System.out.println("enter the value of b:");
int b=sc.nextInt();
System.out.println("select character + , -  , *  ,  /  ,  %  ");
char op=sc.next().charAt(0);
switch(op){
    case '+':
    System.out.println("Addition : "+ (a+b));
    break;
    case '-':
    System.out.println("Subtraction  : " + (a-b));
    break;
    case '*':
    System.out.println("Multiple  :  "+ (a*b));
    break;
    case '/':
    System.out.println("Division : "+ (a/b));
    break;
    case '%':
    System.out.println("Modulo : "+ (a%b));
    break;
default:
System.out.println("wrong operator");
}
    }
}
