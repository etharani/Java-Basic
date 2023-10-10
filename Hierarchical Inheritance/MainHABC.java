class MainHABC{
public static void main (String args []){
System.out.println("Hierarchical Inheritance");
System.out.println("-------------------------");
System.out.println("default constructor");
HB objB=new HB();
objB.getY();
objB.getX();

HC objC=new HC();
objC.getZ();
objC.getX();

HA objA=new HA();
objA.getX();
/*
System.out.println("parameter constructor");
HB objB=new HB(30,40);
objB.getY();
objB.getX();

HC objC=new HC(55,88);
objC.getZ();
objC.getX();

HA objA=new HA(15);
objA.getX();
*/
}
}