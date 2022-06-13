package DAO;

import java.util.List;

import Model.Account;
import Model.Loan;

public class loanDao extends Dao_Abstract<Loan> {
	
	List<Loan> l;
	public loanDao(List<Loan> l)
	{
		this.l=l;
	}

	@Override
	public void update(Loan t) {
		
		l.get(t.getId()).setAmount(t.getAmount());
		
	}

}
