class info{
    int age=19;               /*DATA */
    String name="brajul";


       void printinfo(){                /*METHOD */
        System.out.println(age+"  "+name);
    }
    }

public class Demo{
    public static void main(String[]args){
info s=new info();                /*OBJECT */
s.printinfo();
    }
}