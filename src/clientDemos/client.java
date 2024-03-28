package clientDemos;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
