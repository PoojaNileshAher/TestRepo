package clientDemos;

public class Employee {
	private int empId;
	private String empName;
	private double basicSalary;
	private String gender;
	
	public Employee()					//Defaul / Plain / No Parameter Constructor
	{
		empId = 100;
		empName = "Nikhil";
		basicSalary = 20000;
		gender = "Male";
		
		System.out.println("Default Constructor Called!!!");
	}
	public Employee(int id, String nm, double bs, String gn)	//Parameterized Constructor
	{
		empId = id;
		empName = nm;
		basicSalary = bs;
		gender = gn;
		System.out.println("Parameterized Constructor Called!!!");
	}
	
	public void setEmpId(int id)				//Mutator Function / setter
	{
		empId = id;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setEmployeeName(String name)
	{
		empName = name;
	}
	public String getEmployeeName()				//Accessor Function / getter
	{
		return empName;
	}
	public void setBasicSalary(double bs)
	{
		basicSalary = bs;
	}
	public void setGender(String gen)
	{
		gender = gen;
	}
	
	public void displayData()					//Facilitator Function
	{
		System.out.println("Employee Id  : " + this.empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Basic Salary : " + this.basicSalary);
		System.out.println("Gender       : " + this.gender);
	}


}
