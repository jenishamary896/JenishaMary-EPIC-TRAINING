class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
}
class Payment extends Employee{
    int salary;
    Payment(String name,int salary){
        super(name);
        this.salary=salary;
    }
}
public class Main{
    public static void main(String[] args){
       Payment obj=new Payment("jeni",10000);//this is called obj binding
      System.out.println(obj.name);
      System.out.println(obj.salary);
    }
}
// this is super keyword concept where we are getting sal in diff cls to do microserver to avoid any crashes and to directly access the parent cls
