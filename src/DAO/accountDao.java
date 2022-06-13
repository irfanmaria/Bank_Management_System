package DAO;

import java.util.List;

import Model.Account;

public class accountDao extends Dao_Abstract<Account> {
	
	List<Account> a;
	
	public accountDao(List<Account> a)
	{
		this.a=a;
	}

	@Override
	public void update(Account t) {
		
		a.get(t.getId()).setAccount_number(t.getAccount_number());
		System.out.println("Data is updated" +t.getId());
	}

}
