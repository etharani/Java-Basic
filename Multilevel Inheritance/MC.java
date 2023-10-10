class MC extends MB{
int z=25;
void getZ(){
System.out.println("Cz:\t"+this.z);
}
/*
int c;
MC(){
	this.c=57;
}
void getZ1(){
System.out.println("Cz:\t"+this.c);
}
*/
int c;
MC(int a, int b,int c){
	super(a,b);
	this.c=c;
}
void getZ1(){
System.out.println("Cz:\t"+this.c);
}

}