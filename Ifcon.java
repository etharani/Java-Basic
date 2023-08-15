import java.util.Scanner;
class Ifcon{
public static void main(String args[]){
	System.out.println("Line 1");
	boolean bool=true;
	if(bool){
		System.out.println("Line 2");
	}
	else{
		System.out.println("Line 3");
	}
	if(true){
		System.out.println("If condition true");
	}
	
	System.out.println("----------------------------");
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter your name:");
	String name=scan.next();
	System.out.print("Enter your mark:");
	int mark=scan.nextInt();
	System.out.println("Your name::"+name);
	System.out.println("Your mark::"+mark);
	if(100>=mark && mark>=50){
		System.out.println("Pass Mark");
	}
	else{
		System.out.println("Fail Mark");
	}
	
	System.out.println("---------------");
	System.out.print("Your Grade::");
	if((100>=mark)&& (mark>=0)){
	if((100>=mark) && (mark>=75)){
		System.out.println("A");
	}
	else if((75>=mark) && (mark>=65)){
		System.out.println("B");
	}
	else if((65>=mark) && (mark>=55)){
		System.out.println("C");
	}
	else if((55>=mark) && (mark>=45)){
		System.out.println("D");
	}
	else{
		System.out.println("F");
	}
	}
	else{
		System.out.println("Error mark");
	}
	System.out.println("-------------------------------");
	System.out.println("-----Bank fixed Deposit--------");
	Scanner m=new Scanner(System.in);
	System.out.print("Fixed deposit Money?");
	int money=m.nextInt();
	System.out.print("Money Deposit Month?");
	int month=m.nextInt();
	System.out.println("Deposit money::"+money);
	System.out.println("Deposit month::"+month);
	if((month>0)){
		if((6>=month)&& (month>=1)){
			System.out.println("Interest Percentage is 10%");
			System.out.println("Interest:"+(money*0.1));
		}
		else if((12>=month)&& (month>=6)){
			System.out.println("Interest Percentage is 12%");
			System.out.println("Interest:"+(money*0.12));
		}
		else{
			System.out.println("Interest Percentage is 14%");
			System.out.println("Interest:"+(money*0.14));
		}
	}
	else{
		System.out.println("Incorrect Month");
	}
}
}