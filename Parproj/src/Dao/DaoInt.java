package Dao;

import Client.BankClient;

public interface DaoInt {
	
	public int createAccount(BankClient bean);
	public double showBalance(int id);
	public void withdraw(double withdraw);
	public void deposit(double deposit);
	public void fundTransfer(int num1,int cid);
	public void printTransactions(BankClient bean);
}


