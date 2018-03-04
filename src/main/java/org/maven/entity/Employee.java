package org.maven.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;
	private String deg;
	
	public Employee() {}
	
	public Employee(String ename, double salary, String deg) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDeg() {
		return deg;
	}
	
	public void setDeg(String deg) {
		this.deg = deg;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
	}

}
