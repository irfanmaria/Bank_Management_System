package DAO;

import java.util.List;

import Model.Employee;

public class EmployeesDao extends Dao_Abstract<Employee> {

	
	
	List<Employee> l;
	
	public EmployeesDao(List<Employee> l)
	{
		this.l=l;
	}
	public void update(Employee t) {
		
		l.get(t.getId()).setName("Marias");
		System.out.println("Data is updated");
		
	}

}
