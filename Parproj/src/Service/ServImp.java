package Service;

import Dao.DaoImp;
import Client.BankClient;


public class ServImp implements ServiceInt {
DaoImp d= new DaoImp();
	
	public int createAccount(BankClient bean) {
		// TODO Auto-generated method stub
		
       return d.createAccount(bean);
	}

	
	public double showBalance(int id) {
		// TODO Auto-generated method stub
		return d.showBalance(id);
        
	}

	 
	
	public void deposit(double deposit) {
		// TODO Auto-generated method stub
      // return d.deposit();
	}

	
	public void fundTransfer(int num1,int cid) {
		// TODO Auto-generated method stub
      //  return d.fundTransfer();
	}

	
	 

	@Override
	public void withdraw(double withdraw) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void printTransactions(BankClient bean) {
		// TODO Auto-generated method stub
		
	}

}
