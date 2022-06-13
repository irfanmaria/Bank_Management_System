package Model;

import java.util.List;

public class Bank extends Base_Model {
	String bank_name;
	List<Branch> branch;
	public Bank(int id,String bank_name, List<Branch> branch) {
		super(id);
		this.bank_name = bank_name;
		this.branch = branch;
	}
	
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public List<Branch> getBranch() {
		return branch;
	}
	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	
}
