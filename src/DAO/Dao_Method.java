package DAO;

import java.util.List;

public interface Dao_Method<T> {

	
	
	
	List<T> getAll();
	
	public void create(List<T> t);
	
	T getById(int id);
	
	void delete(T t);
	
	void update(T t);
}
