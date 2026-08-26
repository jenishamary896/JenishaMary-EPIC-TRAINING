import java.util.Scanner;                                                                                                             import java.util.Scanner;
class Customer{
    String cusName;
    String cusPhNo;
    int cusAge;
    
    int index = 0;
   
    Customer[] cusArr = new Customer[100]; 
    
    Customer(){
        
    }
    Customer(String n,String p ,int a){
        this.cusName = n;
        this.cusPhNo = p; //current class refer
        this.cusAge = a;
    }
        
    void createCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Cus name:");
        String name = in.nextLine();
        System.out.println("Enter the Cus phno:");
        String phno = in.nextLine();
        System.out.println("Enter the Cus age:");
        int age = in.nextInt();
        Customer cus = new Customer(name,phno,age);
        cusArr[index++] = cus;
        System.out.println("Customer Created Successfully");
        
    }
    void displayCustomer(){
    for(int i=0;i<index;i++){
        System.out.println("cusname:"+cusArr[i].cusName);
        System.out.println("cusPhNo:"+cusArr[i].cusPhNo);
        System.out.println("cusage:"+cusArr[i].cusAge);
        
    }
}

   
}
class Product{
    String proName;
    int proPrice;
    int proQuantity;
    int index=0;
    Product[] proArr=new Product[100];
    
    Product(){
        
        }
        
    Product(String n,int p,int q){
       this.proName=n;
       this.proPrice=p;
       this.proQuantity=q;
    }
    void createProduct(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Pro name:");
        String name = in.nextLine();
        System.out.println("Enter the Pro price:");
        int price = in.nextInt();
        System.out.println("Enter the Pro Quantity:");
        int quantity = in.nextInt();
        Product pro = new Product(name,price,quantity);
        proArr[index++] = pro;
        System.out.println("Product Created Successfully");
        
    }
     void displayProduct(){
    for(int i=0;i<index;i++){
        System.out.println("proName:"+proArr[i].proName);
        System.out.println("proPrice:"+proArr[i].proPrice);
        System.out.println("proQuantity:"+proArr[i].proQuantity);
        
    }
}
    
}


public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    Customer cus = new Customer();
	    Product pro = new Product();
	    
	    while(true){
	        System.out.println("1.create Customer 2.Display Customer 3.create Product 4.display Product");
	        int n=in.nextInt();
	        switch (n) {
	           case 1:{
	               cus.createCustomer();
	               break;
	        }
	        case 2:{ 
	            cus.displayCustomer();
	            break;
	        }
	        case 3:{
	            pro.createProduct();
	            break;
	        }
	        case 4:{
	            pro.displayProduct();
	            break;
	        }
	    }
	    }
	    
	}
}
