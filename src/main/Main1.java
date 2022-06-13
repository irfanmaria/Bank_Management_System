package main;

import java.util.ArrayList;
import java.util.List;

import DAO.Dao_Abstract;
import DAO.Dao_Method;
import DAO.EmployeesDao;
import DAO.accountDao;
import DAO.bankDao;
import DAO.branchDao;
import DAO.customerDao;
import DAO.employeeDao;
import DAO.loanDao;
import Model.Account;
import Model.Bank;
import Model.Branch;
import Model.Customer;
import Model.Employee;
import Model.Loan;

public class Main1 {

	public static void main(String[] args) {
		
		// Employee class
		List<Employee> e=new ArrayList<>();
		List<Account> a=new ArrayList<>();
		List<Customer> c=new ArrayList<>();
		List<Branch> b=new ArrayList<>();
		List<Loan> l=new ArrayList<Loan>();
		List<Account> aa1=new ArrayList<Account>();
		List<Account> aa2=new ArrayList<Account>();
		List<Account> aa3=new ArrayList<Account>();
		List<Employee> e1=new ArrayList<>();
		List<Employee> e2=new ArrayList<>();
		List<Employee> e3=new ArrayList<>();
		List<Customer> cc1=new ArrayList<>();
		List<Customer> cc2=new ArrayList<>();
		List<Customer> cc3=new ArrayList<>();
		List<Bank> bb=new ArrayList<>();
		
		
		
		Employee ee=new Employee(1,"Maria","karachi","@gmail",921);
		Employee ee1=new Employee(2,"Rida","karachi","@gmail",921);
		Employee ee2=new Employee(3,"Uzair","karachi","@gmail",921);
		Account a1=new Account(1,349,"current");
		Account a2=new Account(2,359,"current");
		Account a3=new Account(3,369,"current");
		Customer c1=new Customer(1,"Owais","Karachi",a1,444444);
		Customer c2=new Customer(2,"Hassan","Lahore",a2,444444);
		Customer c3=new Customer(3,"Fayaz","Karachi",a3,444444);
		Branch b1=new Branch(1,"Branch 5","Kashmir road",e1,cc1,a);
		Branch b2=new Branch(2,"Branch 2","Faisal road",e2,cc2,a);
		Branch b3=new Branch(3,"Branch 3","Orangi town",e3,cc3,a);
		Loan l1=new Loan(1,429, 3000000,"current", "12-3-4");
		Loan l2=new Loan(2,429, 3000000,"current", "12-3-4");
		Loan l3=new Loan(3,429, 3000000,"current", "12-3-4");
		Bank bbank=new Bank(1,"Al Habib",b);
		bb.add(bbank);
		e.add(ee);
		e.add(ee2);
		e.add(ee1);
		a.add(a1);
		a.add(a2);
		a.add(a3);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		l.add(l1);
		l.add(l2);
		l.add(l3);
		aa1.add(a1);
		aa2.add(a2);
		aa3.add(a3);
		e1.add(ee);
		e2.add(ee1);
		e3.add(ee2);
		cc1.add(c1);
		cc2.add(c2);
		cc3.add(c3);
		
		System.out.println("****** Bank Method ***************");
		bankDao db=new bankDao(bb);
		db.create(bb);
		bb=db.getAll();
		for(Bank bank:bb)
		{
			System.out.println(bank.getId()+","+bank.getBank_name()+","+bank.getBranch());
		}
		
		Bank bank=db.getById(0);
		System.out.println(bank.getId()+","+bank.getBank_name()+","+bank.getBranch());
		
		//db.update(bbank);
	
		
		
		System.out.println("****** Branch Method ***************");
		branchDao br=new branchDao(b);
		br.create(b);
		b=br.getAll();
		for(Branch branch:b)
		{
			System.out.println(branch.getId()+","+branch.getBranch_name()+","+branch.getAddress()+","+branch.getAccount()+","+branch.getCustomer()+","+branch.getEmployee());
		}
		br.update(b2);
		br.delete(b3);
		
		Branch branch=br.getById(0);
		System.out.println(branch.getId()+","+branch.getBranch_name()+","+branch.getAddress()+","+branch.getAccount()+","+branch.getCustomer()+","+branch.getEmployee());
		
		System.out.println("****** Employee Method ***************");
		EmployeesDao emp=new EmployeesDao(e);
		emp.create(e);
		
	
		
		
		
		e=emp.getAll();
		for(Employee employee:e)
		{
			System.out.println(employee.getId()+","+employee.getName()+","+employee.getAddress()+","+employee.getEmail()+","+employee.getNumber());
		}
		
		emp.delete(ee);
		
		emp.update(ee1);
		
		Employee s=emp.getById(1);
		
		System.out.println(s.getId()+","+s.getName()+","+s.getAddress()+","+s.getEmail()+","+s.getNumber());
		
		System.out.println("****** Customer Method ***************");
		customerDao cc=new customerDao(c);
		cc.create(c);
		c=cc.getAll();
		for(Customer customer:c)
		{
			System.out.println(customer.getId()+","+customer.getAddress()+","+customer.getCustomer_name()+","+customer.getMobile_number()+","+customer.getAccount());
		}
		cc.delete(c3);
		c2.setCustomer_name("uzair");
		c2.setCustomer_name("Faria");
		cc.update(c2);
		Customer customer=cc.getById(1);
		System.out.println(customer.getId()+","+customer.getAddress()+","+customer.getCustomer_name()+","+customer.getMobile_number()+","+customer.getAccount());
		
		
		System.out.println("****** Account Method ***************");
		accountDao aa=new accountDao(a);
		aa.create(a);
		a=aa.getAll();
		for(Account account:a)
		{
			System.out.println(account.getId()+","+account.getAccount_number()+","+account.getAccount_type());
		}
		
		a3.setAccount_number(434);
		aa.update(a2);
		aa.delete(a3);
		Account account=aa.getById(0);
		System.out.println(account.getId()+","+account.getAccount_number()+","+account.getAccount_type());
		
		
		System.out.println("****** Loan Method ***************");
		loanDao ll=new loanDao(l);
		ll.create(l);
		l=ll.getAll();
		for(Loan loan:l)
		{
			System.out.println(loan.getId()+","+loan.getLoan_no()+","+loan.getLoan_type()+","+loan.getAmount()+","+loan.getDate());
			
		}
		ll.delete(l3);
		l2.setAmount(450000);
		ll.update(l2);
		Loan loan=ll.getById(0);
		System.out.println(loan.getId()+","+loan.getLoan_no()+","+loan.getLoan_type()+","+loan.getAmount()+","+loan.getDate());
		
		
	
		
		
	}

}
