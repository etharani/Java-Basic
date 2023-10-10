class MB extends MA{
int y=5;
void getY(){
System.out.println("By:\t"+this.y);
}
/*
int b;
MB(){
	this.b=67;
}
void getY1(){
System.out.println("Bb:\t"+this.b);
}
*/
int b;
MB(int a, int b){
	super(a);
	this.b=b;
}
void getY1(){
System.out.println("Bb:\t"+this.b);
}

}