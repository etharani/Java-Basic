class Student{
int id;
String name;
int m1,m2,m3;

/*
void setStudent(){
id=100;
name="Tharani";
}


void getStudent(){
System.out.println("Student ID: "+id);
System.out.println("Student Name: "+name);
}

void setStudent1(int ids,String names){
id=ids;
name=names;
*/
Student(int id,String name){
	this.id=id;
	this.name=name;
}
void setMarks(int m1, int m2, int m3){
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}

int calTotal(){
	int Total =this.m1+this.m2+this.m3;
	return Total;
}

double calAvg(int t){
	double av=t/3.0;
	return av;
}

String getResult(double a){
   String res=null;
	if(a>=50){
		res="Pass";
	}
	else{
		res="Fail";
	}
	return res;
}
void getStudent(){
	System.out.println("Student ID:\t"+this.id);
	System.out.println("Student Name:\t"+this.name);
	System.out.println("Student Mark 1:\t"+this.m1);
	System.out.println("Student Mark 2:\t"+this.m2);
	System.out.println("Student Mark 3:\t"+this.m3);
	int tot =calTotal();
	double av=calAvg(tot);
	String res=getResult(av);
	System.out.println("Total:\t"+tot);
	System.out.println("Average:\t"+av);
	System.out.println("Result:\t"+res);
	
   
}
}

class MainStudent{
public static void main(String args[]){
/*
System.out.println("----Default Method-----");
Student stu = new Student();
stu.setStudent();
stu.getStudent();

Student stu1 = new Student();
stu1.setStudent();
stu1.getStudent();
System.out.println("----Parameters Method-----");
Student s1 = new Student();
s1.setStudent1(101,"Kithu");
s1.getStudent();

Student s2 = new Student();
s2.setStudent1(102,"Ranitha");
s2.getStudent();
*/
Student stu= new Student(101,"Tharani");
stu.setMarks(60,90,75);
stu.getStudent();
}
}