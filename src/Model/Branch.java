package Model;

import java.util.List;

public class Branch extends Base_Model {
	
	
	String branch_name,Address;
	List<Employee> employee;
	List<Customer> customer;
	List<Account> account;
	
	public Branch()
	{
		
	}
	public Branch(int id,String branch_name, String address, List<Employee> employee, List<Customer> customer,
			List<Account> account) {
		super(id);
		this.branch_name = branch_name;
		Address = address;
		this.employee = employee;
		this.customer = customer;
		this.account = account;
	}
	

	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Branch [branch_name=" + branch_name + ", Address=" + Address + ", employee=" + employee + ", customer="
				+ customer + ", account=" + account + "]";
	}
	
}
