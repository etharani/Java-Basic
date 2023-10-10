class B extends A{
int y=5;
void getY(){
System.out.println("By:\t"+this.y);
}
/*
int b;
B(){
	this.b=67;
}
void getY1(){
System.out.println("Bb:\t"+this.b);
}
*/
int b;
B(int a, int b){
	super(a);
	this.b=b;
}
void getY1(){
System.out.println("Bb:\t"+this.b);
}

int a=99;
void display(){
	super.display();
	System.out.println("Bb:\t"+this.b);
	System.out.println("Ba:\t"+this.a);
	System.out.println("ABa:\t"+super.a);
}
}