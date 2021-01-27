package Sample;

import java.util.ArrayList;
import java.util.Scanner;
class EmpDetail{
	String name;
	String id;
	String desig;
	String sal;
	public EmpDetail(String name, String id, String desig, String sal) {
		
		this.name = name;
		this.id = id;
		this.desig = desig;
		this.sal = sal;
	}
	
	
}

public class Main {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of employes : ");
	int n=sc.nextInt();
	EmpDetail[] e=new EmpDetail[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter the  Employee "+(i+1)+ " details");
		
		System.out.print("Enter the Emp_name : ");
		String name=sc.next();
		
		System.out.print("Enter the Emp_id : ");
		String id=sc.next();
		
		System.out.print("Enter the Emp_designation : ");
		String desig=sc.next();
		
		System.out.print("Enter the Emp_salary : ");
		String sal=sc.next();
		
		e[i] =new EmpDetail(name,id,desig,sal);
	}
	System.out.printf("Emp_Name","Emp_id","Emp_designation","Emp_salary","%20s %20s %20s %20s");
	System.out.println();
	for(int i=0;i<n;i++) {
		System.out.format(e[i].name,e[i].id,e[i].desig,e[i].sal,"%20s %20s %20s %20s");
		System.out.println();
	}
	}
}