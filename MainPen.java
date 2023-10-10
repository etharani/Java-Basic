class Pen{
String color;
float height;
float weight;
String madeIn;
String brand;

void write(){
	System.out.println("This is write method");
}
} 

class MainPen{
public static void main(String args []){
Pen p;
p=new Pen();

System.out.println("Color:"+p.color);
System.out.println("Height:"+p.height);
System.out.println("Weight:"+p.weight);
System.out.println("MadeIn:"+p.madeIn);
System.out.println("Brand:"+p.brand);

p.color="Red";
p.height=12.5f;
p.weight=5;
p.madeIn="India";
p.brand="Ten";

p.write();
System.out.println("Color:"+p.color);
System.out.println("Height:"+p.height);
System.out.println("Weight:"+p.weight);
System.out.println("MadeIn:"+p.madeIn);
System.out.println("Brand:"+p.brand);
}
}
