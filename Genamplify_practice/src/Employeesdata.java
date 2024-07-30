
public class Employeesdata {
	
	
	
	int Employeeid ;
	String name ;
	String location ;
	String contactnumber ;
	
	void EmployeeData() {
		
		System.out.println("The Employee id is = "+Employeeid);
		System.out.println("The Employee name is = "+name);
		System.out.println("The Employee location is = "+location);
		System.out.println("The Employee Contact Number is "+contactnumber);
		
	}
	
	public static void main(String[]args) {
		
		System.out.println("......Here one of Genamplify Solution hub Employee With No Data.....");
		Employeesdata E = new Employeesdata();
		E.EmployeeData();
		
		
		System.out.println("....Here Genamplify solution Hub Employee 1 Data...");
		
		Employeesdata F = new Employeesdata();
		F.Employeeid = 202301;
		F.name = "Megavath Rajesh";
		F.location = "Madapur, Hyderabad";
		F.contactnumber = "8499899558" ;
		F.EmployeeData();
		
		
		System.out.println("....Here Genamplify Solution Hub  Employee 2 Data...");
		Employeesdata J = new Employeesdata();
		J.Employeeid = 202302;
		J.name = "Pawan kalyan";
		J.location = "Nizamabad";
		J.contactnumber = "9182077308" ;
		J.EmployeeData();
		
		
		System.out.println("....Here Genamplify Solution Hub Employee 3 Data...");
		Employeesdata K = new Employeesdata();
		K.Employeeid = 202302;
		K.name = "Ram charan ";
		K.location = "Chennai";
		K.contactnumber = "9949994038" ;
		K.EmployeeData();
		
	}

}
