package oopLab1410;

public class employee extends person{

	String office;
	int salary;
	String date_hired;
	
	
	
    
    void disp(){
		
		System.out.println("Name of the employee: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + p_num);
		System.out.println("Email: " + email);
		System.out.println("Department: " + office);
		System.out.println("Salary: " + salary);
		System.out.println("Date Hired: " + date_hired);
}	

	
	
}
