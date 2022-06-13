package DAO;

import java.util.List;

import Model.Branch;

public class branchDao extends Dao_Abstract<Branch> {

	List<Branch> b;
	
	public branchDao(List<Branch> b)
	{
		this.b=b;
	}
	
	

	public void update(Branch t) {
	
		l.get(t.getId()).setAddress("Branch 4");
		System.out.println("Data is updated");
		
	}

}
