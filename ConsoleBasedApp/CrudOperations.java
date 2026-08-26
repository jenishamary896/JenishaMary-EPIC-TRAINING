package controller;
import java.util.*;
import model.Customer;
import services.CustomerService;

public class CustomerController implements CustomerService{
 ArrayList<Customer> cusArr=new ArrayList<>();
  int id=0;
   public void createCustomer() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter  the name: ");
	  String name=sc.nextLine();
	  System.out.println("enter phno: ");
	  String phno=sc.nextLine();
	 
	  Customer obj=new Customer(name,phno,id);
	  cusArr.add(obj);
	  System.out.println("customer added successfully");
	  id++;
  }
   public void displayCustomer() {
	   for(Customer data:cusArr) {
		   System.out.println(data.getCusName());
		   System.out.println(data.getCusPhNo());
		   System.out.println(data.getCusId());
		   
	   }
   }
   public void changeName() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter cus id: ");
	   int id=sc.nextInt();
	   sc.nextLine();
	   System.out.println("enter the name to change:");
	   String name =sc.nextLine();
	   cusArr.get(id).setCusName(name);
	   System.out.println("name changed successfully");
	   
   }
 public void deleteCustomer() {
	Scanner sc=new Scanner(System.in) ;
	System.out.println("enter the id to be deleted:");
	int n=sc.nextInt();
	int index=0;
	for(Customer cus:cusArr) {
		if(cus.getCusId()==n) {
			cusArr.remove(index);
			System.out.println("customer removed successfullly");
			break;
		}
		index++;
	}
 }
}

package model;

public class Customer {
	String cusName;
    String cusPhNo;
    int cusId;
    public Customer(String cusName,String cusPhno,int cusId) {
    	this.cusName=cusName;
    	this.cusPhNo=cusPhno;
    	this.cusId=cusId;
    }
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusPhNo() {
		return cusPhNo;
	}
	public void setCusPhNo(String cusPhNo) {
		this.cusPhNo = cusPhNo;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
     

}

package services;

public interface CustomerService {
    void createCustomer();
    void displayCustomer();
    void changeName();
    void deleteCustomer();
}

package main;
import java.util.Scanner;
import controller.CustomerController;
import services.CustomerService;
public class Main {
   public static void main(String[] args) {	
   CustomerService cc=new CustomerController();
   Scanner sc=new Scanner(System.in);
   while(true) {
	   System.out.println("1.create customer 2.Display customer 3.update customer 4.delete customer");
	   int n=sc.nextInt();
	   switch(n) {
	   case 1:{
		   cc.createCustomer();
		   break;
	   }
	   case 2:{ 
		   cc.displayCustomer();
		   break;
		   }
	   case 3:{
		   cc.changeName();
		   break;
	   }
	   case 4:{
		   cc.deleteCustomer();
		   break;
	   }
	   
   }
	   }
   }
}
   
   
   


  
