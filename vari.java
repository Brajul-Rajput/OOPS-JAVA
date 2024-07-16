                                          /*Variable */
 public class vari {
    int c=30;            // Instance variable
    static int a=10;     //Static variable
    public static void main(String[]args){
        int b=20;      // Local variable
        System.out.println(a);
        System.out.println(b);
        vari ref=new vari();
        System.out.println(ref.c);
    }
}
