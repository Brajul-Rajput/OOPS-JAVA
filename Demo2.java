class pen{
    String color;   /*DATA */
String type;

public void show(){
    System.out.println("BLACK COLOR BALL PEN");      /*METHOD */
}
}
public class Demo2 {
    public static void main(String []args){
pen pen1=new pen(); /*OBJECT */
pen1.color="black";
pen1.type="ball";
pen1.show();
    }
}
