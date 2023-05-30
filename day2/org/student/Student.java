package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		
		System.out.println("student name Rekha");
	}
	public void studentDept()
	{
		System.out.println("student department ECE");
	}
	public void studentId()
	{
		System.out.println("student id 12");
		
	}
	public static void main(String[] args) {
		
		Student s=new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();
		
		//Department d=new Department();
		//d.collegeCode();
		//d.collegeName();
		//d.collegeRank();
		//d.deptName();
		
		// TODO Auto-generated method stub

	}

}
