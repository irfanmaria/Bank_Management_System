package Model;

public class Account extends Base_Model {

	int account_number;
	
	
	String account_type;
	public Account(int id, int account_number, String account_type) {
		super(id);
		this.account_number = account_number;
		this.account_type = account_type;
	}
	
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	
	public String toString() {
		return "Account [account_number=" + account_number + ", account_type=" + account_type + "]";
	}
	
}
