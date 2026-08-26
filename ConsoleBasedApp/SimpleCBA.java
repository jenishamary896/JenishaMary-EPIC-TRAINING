import java.util.Scanner;
class Customer{
    String name;
    String phno;
    int age;
    void createCustomer(){
        System.out.println("Customer Created");
    }
    void displayCustomer(){
        System.out.println("Displayed Created");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    Customer cus = new Customer();
		while(true){
		    System.out.println("1)Create Customer \n 2)Display Customer");
		    int n = in.nextInt();
		    switch(n){
		        case 1:{
		            cus.createCustomer();
		            break;
		        }
		        case 2:{
		            cus.displayCustomer();
		            break;
		        }
		    }
		}
	}
}

