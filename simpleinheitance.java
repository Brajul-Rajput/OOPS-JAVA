class Student{
    String name;
    int roll_no;
    String subject;
    public void disp(){
        System.out.println("enter the name ,roll no and  subject :");
    }
}
class brajul extends Student{
    public void show(){
name="brajul";
roll_no=10;
subject="java development";
System.out.println(name+"  "+roll_no+"  "+subject);
    }

}

public class simpleinheitance {
    public static void main(String[]args){
        brajul prin=new brajul();
        prin.disp();
        prin.show();
    }
}
