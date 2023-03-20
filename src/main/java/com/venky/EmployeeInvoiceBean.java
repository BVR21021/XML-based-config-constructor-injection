package com.venky;

public class EmployeeInvoiceBean {
	private int empid;
	private String empName;
	private double empSalary;
	
	
	public EmployeeInvoiceBean(int empid, String empName, double empSalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeeInvoiceBean [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	double ta=0;double da=0;double hra=0;double pf=0;double GrossSalary=0;double NetSalary=0;
	
	public void CalculateSalary() {
		if(empSalary<30000) {
			ta=empSalary*7/100;
			da=empSalary*9.25/100;
			hra=empSalary*11/100;
			pf=empSalary*12.25/100;
			System.out.println("TA:"+ta+"DA:"+da+"HRA:"+hra+"PF:"+pf);
			
		}		
		else if(empSalary>30000&&empSalary<=60000) {
			ta=empSalary*13/100;
			da=empSalary*15/100;
			hra=empSalary*11/100;
			pf=empSalary*22.25/100;
			System.out.println("TA:"+ta+"DA:"+da+"HRA:"+hra+"PF"+pf);
			
		}
		else if(empSalary>=60000) {
			ta=empSalary*23/100;
			da=empSalary*25/100;
			hra=empSalary*21/100;
			pf=empSalary*27.25/100;
			System.out.println("TA:"+ta+"DA:"+da+"HRA:"+hra+"PF"+pf);
			
		}
	}
		public void printGrossSalary() {
		      GrossSalary=ta+da+hra+pf;
			System.out.println("Gross Salary:"+GrossSalary);
		}
		public void printNetSalary() {
			 NetSalary=empSalary-GrossSalary;
			 System.out.println("Net Salary:"+NetSalary);
		}
	
	
}
