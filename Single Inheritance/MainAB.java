class MainAB{
public static void main (String args []){
System.out.println("Single Inheritance");
System.out.println("-------------------------");
/*
B objB=new B();
objB.getY();
objB.getX();

System.out.println("default constructor");
B objB=new B();
objB.getY1();
objB.getX1();
*/
/*
System.out.println("parameter constructor");
B objB1=new B(23,45);
objB1.getY1();
objB1.getX1();
*/
System.out.println("----Method Overriding----");
B obj=new B(88,60);
obj.display();

}
}