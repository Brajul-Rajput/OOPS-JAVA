import java.util.Scanner;
public class funmul {
   public static void printtable(int a){
    for(int i=1;i<=10;i++){
        int mul=a*i;
        System.out.println(a+" * "+i+" = "+mul);
        return;
    }
   } 
   public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
printtable(a);
   }
}
