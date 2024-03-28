package clientDemos;

public class clientDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();		
		//Employee -> Data Type / Class,	e1 -> Object of Employee
		//emp.empId = 101;
		emp1.setEmpId(101);
		emp1.setEmployeeName("Veera");
		emp1.setBasicSalary(10000);
		emp1.setGender("Female");
		
		System.out.println("Name: " + emp1.getEmployeeName());
		
		emp1.displayData();
		System.out.println();
		
		Employee emp2 = new Employee();
		emp2.setEmpId(123);
		emp2.setEmployeeName("Saranya");
		emp2.setBasicSalary(10000);
		emp2.setGender("Female");
		emp2.displayData();
		System.out.println();
		
		Employee emp3 = new Employee();
		//emp3.setAllData(456, "Nikhil", 15000, "Male");
		//emp3.setEmployeeName("Pratyush");
		emp3.displayData();
		System.out.println();
		
		Employee emp4 = new Employee(111, "Ankush", 10000, "Male");
		emp4.setBasicSalary(15000);
		emp4.displayData();
	}


	}

