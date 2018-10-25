package XYZBank;

import java.util.HashMap;
import java.util.Scanner;

import Client.BankClient;
import Service.ServImp;

public class Bank {
	
	


	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		ServImp s=new ServImp();
		BankClient bean=new BankClient();
		
			Bank b=new Bank();
			while(true) {
			System.out.println("Welcome to XYZ Bank");
			System.out.println("1. CREATE ACCOUNT ");
			System.out.println("2. SHOW BALANCE");
			System.out.println("3. DEPOSIT");
			System.out.println("4. WITHDRAW");
			System.out.println("5. FUND TRANSFER");
			System.out.println("6. PRINT TRANSACTION");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				
				
				Scanner sc1=new Scanner(System.in);
				System.out.println("enter name");
				String cname=sc1.nextLine();
				Scanner sc2=new Scanner(System.in);
				bean.setCname(cname);
				System.out.println("enter address");
				String address=sc2.nextLine();
				bean.setAddress(address);
				Scanner sc3=new Scanner(System.in);
				System.out.println("enter PHONE num" );
				long phNum=sc3.nextLong();
				Scanner sc4=new Scanner(System.in);
				bean.setPhNum(phNum);
				System.out.println("enter PAN number");
				long panNum=sc4.nextLong();
				bean.setPanNum(panNum);
				s.createAccount(bean);
				break;
				
			case 2:
				Scanner sc5=new Scanner(System.in);
				System.out.println("enter account number");
				int id=sc5.nextInt();
				System.out.println(s.showBalance(id));
			break;
			case 3:
				Scanner sc6=new Scanner(System.in);
				System.out.println("enter the acc number");
				//int accNum=
			
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
	}	}
			
			
			
				
				
				
			