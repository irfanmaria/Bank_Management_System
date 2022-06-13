package Model;

import java.util.List;

public class Loan extends Base_Model {

	int loan_no,amount;
	String loan_type,date;
	public Loan(int id, int loan_no, int amount, String loan_type, String date) {
		super(id);
		this.loan_no = loan_no;
		this.amount = amount;
		this.loan_type = loan_type;
		this.date = date;
	}
	
	public int getLoan_no() {
		return loan_no;
	}
	public void setLoan_no(int loan_no) {
		this.loan_no = loan_no;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

    
}
