package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeData {
@Id
private int id;
private String name;
private double salary;
private long mno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public long getMno() {
	return mno;
}
public void setMno(long mno) {
	this.mno = mno;
}
@Override
public String toString() {
	return "EmployeeData [id=" + id + ", name=" + name + ", salary=" + salary + ", mno=" + mno + "]";
}

}
