package Dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import XYZBank.Bank;

import Client.BankClient;

public class DaoImp implements DaoInt {
	

	
	public int  createAccount(BankClient bean) {
		int accNum=(int)((Math.random()*900)+100);
        System.out.println("your acc number is "+accNum);
        return accNum;
        //ClientMap.put(arg0,)
       
       }

	
	public double showBalance(int id) {
		Map<Integer,BankClient> cm=new HashMap<Integer,BankClient>();
		//cm.put(101, new BankClient("prasanna","tp nagar, ayanavaram, chennai",9962723088L,7865908L,101,500));
		
		Set<Integer> keys=cm.keySet();
		Iterator<Integer> it=keys.iterator();
		while (it.hasNext()) {
			Integer accNum = it.next();
			if(accNum==id)
			{
			BankClient cus=cm.get(accNum);
			return cus.balance;
			}
		
		
		}
		return 0;
	}

	

	@Override
	public void deposit(double deposit) {
		System.out.println("enter acc number");
		
		
        
	}
	@Override
	public void withdraw(double withdraw ) {
		// TODO Auto-generated method stub
        
	}

	@Override
	public void fundTransfer(int num1,int cid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printTransactions(BankClient bean) {
		// TODO Auto-generated method stub

	}

}
