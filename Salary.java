import java.util.Scanner;
class Salary{
	public static void main(String args[]){
String Name;
String Designation;
String Month;
double BasicSalary;
double TotalSalary;
double Tax=0;
double NetSalary;
Scanner s= new Scanner(System.in); 
System.out.print("Enter the Name:");
Name =s.nextLine();
System.out.print("Enter the Designation:");
Designation =s.nextLine();
System.out.print("Enter the Month:");
Month =s.nextLine();
System.out.print("Enter the Basic Salary:");
BasicSalary =s.nextInt();
	TotalSalary=BasicSalary+(BasicSalary*1.5);
	if(0<TotalSalary && TotalSalary<=50000){
		Tax=TotalSalary*0.08;
		
	}
	else if(50000<TotalSalary && TotalSalary<=200000){
		Tax=TotalSalary*0.16;
		
	}
	else if(200000<TotalSalary){
		Tax=TotalSalary*0.24;
		
	}
	else{
		System.out.println("Error");
	}
	NetSalary=(TotalSalary-Tax);
	System.out.println("****Pay Advice****");
	System.out.println("Name:"+Name);
	System.out.println("Designation:"+Designation);
	System.out.println("Month:"+Month);
	System.out.println("Basic Salary:"+BasicSalary);
	System.out.println("Total Salary is:"+TotalSalary);
	System.out.println("Tax:"+Tax);
	System.out.println("Net Salary is:"+NetSalary);
	

	}
}