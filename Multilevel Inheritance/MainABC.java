class MainABC{
public static void main (String args []){
System.out.println("Multilevel Inheritance");
System.out.println("-------------------------");
/*
MC objc=new MC();
objc.getY();
objc.getX();
objc.getZ();

System.out.println("default constructor");
MC objC=new MC();
objC.getY1();
objC.getX1();
objC.getZ1();
*/
System.out.println("parameter constructor");
MC objc1=new MC(23,66,45);
objc1.getY1();
objc1.getX1();
objc1.getZ1();

}
}