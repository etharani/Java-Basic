class PrivateStudent{
int id;
String name;
int m1,m2,m3;
private int total;
private double avg;
private String result;
PrivateStudent(int id,String name){
	this.id=id;
	this.name=name;
}
void setMarks(int m1, int m2, int m3){
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}

private void calTotal(){
	this.total =this.m1+this.m2+this.m3;
}

private void calAvg(){
	this.avg=this.total/3.0;
}

private void getResult(){
   if(this.avg>=50){
		this.result="Pass";
	}
	else{
		this.result="Fail";
	}
}
void getStudent(){
	System.out.println("Student ID:\t"+this.id);
	System.out.println("Student Name:\t"+this.name);
	System.out.println("Student Mark 1:\t"+this.m1);
	System.out.println("Student Mark 2:\t"+this.m2);
	System.out.println("Student Mark 3:\t"+this.m3);
	calTotal();
	calAvg();
	getResult();
	System.out.println("Total:\t"+total);
	System.out.println("Average:\t"+avg);
	System.out.println("Result:\t"+result);
	
   
}
}

class MainPStudent{
public static void main(String args[]){
PrivateStudent stu= new PrivateStudent(111,"Kithu");
stu.setMarks(90,60,30);
stu.getStudent();
}
}