package oopLab1410;

public class main {

	public static void main(String args[]) {
		// creating objects
	
	student s=new student();
    s.name="example1";
	s.p_num="00**-*******";
	s.email="example1@gmail.com";
	s.address="city1";
	s.status="Regular";		
	s.disp();
	
	employee e=new employee();
	
	e.name="example2";
	e.p_num="01**-*******";
	e.email="example2@gmail.com";
	e.address="city2";		
	e.salary=150000;
	e.office="OGDCL";
	e.date_hired="October 2002";
	e.disp();
	
	faculty f=new faculty();
    f.name="example3";
	f.p_num="02**-*******";
	f.email="example3@gmail.com";
	f.address="city3";
	f.of_hrs="9-5";
	f.rank="18";
	f.office="OGDCL";
	f.salary=120000;
	f.date_hired="September 2006";
	f.disp();
	
    staff s1=new staff();
	
	s1.name="example4";
	s1.p_num="03**-*******";
	s1.email="example4@gmail.com";
	s1.salary=15000;
	s1.office="OGDCL";
	s1.date_hired="January 2000";
	s1.title="Security Supervisor";
	s1.disp();
	
	
	}

}
