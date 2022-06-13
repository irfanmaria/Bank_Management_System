package DAO;

import java.util.ArrayList;
import java.util.List;

import Model.Base_Model;


public abstract class Dao_Abstract<T> implements Dao_Method<T> {
	
	List<T> l=new ArrayList<>();
	public List<T> getAll()
	{
		return l;
	}
	
	public void create(List<T> t)
	{
		l.addAll(t);
		System.out.println("Data is saved in database");
	}
	
	public void delete(T t)
	{
		l.remove(t);
		System.out.println("Data is deleted in database");
	}
	
	
	
	
	public abstract void update(T t);
	
	
	
	
	
	
	public T getById(int id)
	{
		return l.get(id);
	}
	

	
	
	
	
	

}
