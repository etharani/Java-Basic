class A{
int x=10;
void getX(){
System.out.println("Ax:\t"+this.x);
}
/*
int a;
A(){
	this.a=12;
}
void getX1(){
System.out.println("Aa:\t"+this.a);
}

*/
int a;
A(int a){
	this.a=a;
}
void getX1(){
System.out.println("Aa:\t"+this.a);
}

void display(){
	System.out.println("Aa:\t"+this.a);
}
}