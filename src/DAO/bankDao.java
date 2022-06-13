package DAO;

import java.util.List;

import Model.Bank;

public class bankDao extends Dao_Abstract<Bank> {
	
	List<Bank> l;
	public bankDao(List<Bank> l)
	{
		this.l=l;
	}

	@Override
	public void update(Bank t) {
		l.get(t.getId()).setBank_name("Bank 5");
		
	}

}
