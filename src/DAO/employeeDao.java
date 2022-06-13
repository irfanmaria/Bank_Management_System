package DAO;

import java.util.ArrayList;
import java.util.List;

import Model.Employee;

public class employeeDao extends Dao_Abstract<Employee> {
	
	List<Employee> l=new ArrayList<>();
	
	public employeeDao()
	{
		super();
		l.add(new Employee(1,"Maria","karachi","@gmail",921));
		l.add(new Employee(1,"Maria","karachi","@gmail",921));
		l.add(new Employee(1,"Maria","karachi","@gmail",921));
	}

	@Override
	public void update(Employee t) {
		
		l.get(t.getId()).setName(t.getName());
		System.out.println("Data is updated for this id"+t.getId()+"and set the name is");
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return l;
	}
	
	


}
