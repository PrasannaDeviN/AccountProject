package Client;

public class BankClient {

String cname;
String address;
long phNum;
long panNum;
int accNum;
public double balance;
/*int id;
double deposit,withdraw;*/
public BankClient()
{
	
}



public int getAccNum() {
	return accNum;
}
public BankClient(String cname, String address, long phNum, long panNum, int accNum, double balance) {
	super();
	this.cname = cname;
	this.address = address;
	this.phNum = phNum;
	this.panNum = panNum;
	this.accNum = accNum;
	this.balance = balance;
}
public void setAccNum(int accNum) {
	this.accNum = accNum;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhNum() {
	return phNum;
}
public void setPhNum(long phNum) {
	this.phNum = phNum;
}
public long getPanNum() {
	return panNum;
}
public void setPanNum(long panNum) {
	this.panNum = panNum;
}
@Override
public String toString() {
	return "Client [cname=" + cname + ", address=" + address
			+ ", phNum=" + phNum + ", panNum=" + panNum + "]";
}


}
