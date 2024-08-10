class A{
    int pen ;
    String name;
  /*   A(){
pen=10;
name="brajul";
    }*/
    public void show(){
        System.out.println("print "+ pen +" print :"+name);
    }
}
public class defaultc {
  public static void main(String[]args){
    A pr=new A();
    pr.show();
  }  
}
