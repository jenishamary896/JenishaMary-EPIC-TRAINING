import java.util.*;
abstract class Payment{
    int transactionId;
    String name;
    int amount;
    Payment(int transactionId,String name,int amount){
        this.transactionId=transactionId;
        this.name=name;
        this.amount=amount;
    }
     abstract boolean Validadepayment();
     abstract void Processpayment();
     abstract double Calculatetransactionfee();
     abstract double Cashback();
     
     double Calculatefinalamount(){
         return amount + Calculatetransactionfee() - Cashback();
     }
     void displayPayment(){
         System.out.println("tarnsactionID:"+transactionId);
         System.out.println("name:"+name);
         System.out.println("amount:"+amount);
     }


    
}
class CreditCardPayment extends Payment{
    String creditNo;
   
    CreditCardPayment(int transactionId,String name,int amount,String creditNo){
        super(transactionId,name,amount);
        this.creditNo=creditNo;
       
    }

    boolean Validadepayment(){
        if(creditNo.length()==16){
            return true;
        }
        else{
           return false;
        }
        
    }
    
    void Processpayment(){
        System.out.println("your payment is processing");
    }
 
    double Calculatetransactionfee(){
        return amount*(2.0/100);
    }
  
    double Cashback(){
        return amount*(5.0/100);
    }
    
   
}
class UPIpayment extends Payment{
    String UPIid;
   
    UPIpayment(int transactionId,String name,int amount,String UPIid){
        super(transactionId,name,amount);
        this.UPIid=UPIid;
       
    }
  
    boolean Validadepayment(){
        if(UPIid.contains("@")){
            return true;
        }
        else{
             return false;
        }
        
    }
  
    void Processpayment(){
        System.out.println("your payment is processing");
    }
   
    double Calculatetransactionfee(){
        return amount*(0.5/100);
    }
  
    double Cashback(){
        return amount*(2.0/100);
    }
    
}
class NetBankingPayment extends Payment{
    String accountNo;
   
    NetBankingPayment(int transactionId,String name,int amount,String accountNo){
        super(transactionId,name,amount);
        this.accountNo=accountNo;
       
    }
  
    boolean Validadepayment(){
        if(accountNo.length()==10){
            return true;
        }
        else{
           return false;
        }
       
    }
   
    void Processpayment(){
        System.out.println("your payment is processing");
    }
   
    double Calculatetransactionfee(){
        return amount*(1.0/100);
    }
   
    double Cashback(){
        return amount*(1.0/100);
    }
    
}

public class Main
{
	public static void main(String[] args) {
	    CreditCardPayment c=new CreditCardPayment(101,"jeni",5678,"3456789027367854");
	    UPIpayment u=new UPIpayment(234,"thilak",7654,"67r@345");
	    NetBankingPayment n=new NetBankingPayment(654,"jesi",7676,"65795r4367");
	    if(c.Validadepayment()==true){
	      c.displayPayment();
	      c.Processpayment();
	      System.out.println(c.Calculatetransactionfee());
	      System.out.println(c.Cashback());
	      System.out.println(c.Calculatefinalamount());
	    }
	    if(u.Validadepayment()==true){
	      u.displayPayment();
	      u.Processpayment();
	      System.out.println(u.Calculatetransactionfee());
	      System.out.println(u.Cashback());
	      System.out.println(u.Calculatefinalamount());
	    }
	    if(n.Validadepayment()==true){
	      n.displayPayment();
	      n.Processpayment();
	      System.out.println(n.Calculatetransactionfee());
	      System.out.println(n.Cashback());
	      System.out.println(n.Calculatefinalamount());
	    }
	   
	
	}
}
// payment project
