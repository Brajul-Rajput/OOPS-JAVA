import java.util.Scanner;
public class function {
    public static void printname(String name){
        System.out.println(name);
        return;
    }
   public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    String name=sc.nextLine ();
printname(name);
   } 
}
