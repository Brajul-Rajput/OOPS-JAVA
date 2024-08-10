class c{
    int a;
    String b;
    c(){
a=20;
b="codehub";
System.out.println(a+" "+b);
    }
    c(c ref){
a=ref.a;
b=ref.b;
System.out.println(a+" "+b);
    }
}
public class copyc {
   public static void main (String []args){
    c r=new c();
    c r1=new c(r);
   } 
}