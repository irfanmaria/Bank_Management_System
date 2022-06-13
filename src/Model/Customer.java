package Model;

import java.util.List;

public class Customer extends Base_Model {
 
	String customer_name,Address;
	Account account;
	int mobile_number;
	public Customer(int id, String customer_name, String address, Account account, int mobile_number) {
		super(id);
		this.customer_name = customer_name;
		Address = address;
		this.account = account;
		this.mobile_number = mobile_number;
	}
	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	@Override
	public String toString() {
		return "Customer [customer_name=" + customer_name + ", Address=" + Address + ", account=" + account
				+ ", mobile_number=" + mobile_number + "]";
	}
	
}
