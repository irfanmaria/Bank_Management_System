package DAO;

import java.util.List;

import Model.Customer;

public class customerDao extends Dao_Abstract<Customer> {

	List<Customer> c;
	public customerDao(List<Customer> c)
	{
		this.c=c;
	}
	public void update(Customer t) {
		
		c.get(t.getId()).setCustomer_name(t.getCustomer_name());
		
	}

}
