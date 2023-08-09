import java.util.Scanner;
class Array{
public static void main(String args[]){
	/*int[]a;
	a=new int [5];
	a[0]=5;
	a[1]=15;
	a[2]=25;
	a[3]=35;
	a[4]=45;
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	System.out.println("---------------");
	for(int i=0;i<5;i++){
		System.out.println(a[i]);
	}
	System.out.println("---------------");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	System.out.println("---------------");
	for(int i:a){
		System.out.println(i);
	}
	System.out.println("---------------");
	int []b=new int [5];
	System.out.println(b.length);
	System.out.println("---------------");
	int []c={5,10,15,20};
	System.out.println(c.length);
	System.out.println("------2 Dimensional Array---------");
	
	int[] [] a1=new int[3][2];
	a1[0][0]=7;
	a1[0][1]=8;
	
	a1[1][0]=9;
	a1[1][1]=10;
	
	a1[2][0]=11;
	a1[2][1]=12;
	System.out.println(a1[1][1]);
	System.out.println("---------------");
	for(int i=0;i<3;i++){
		for(int j=0;j<2;j++){
			System.out.print(a1[i][j]+",");
		}
		System.out.println("");
	}
	System.out.println("---------------");
	for(int[]s:a1){
		for(int j:s){
			System.out.println(j);
		}
	}
	System.out.println("------2 Dimensional Array Homework---------");
	Scanner input=new Scanner(System.in); 
	int [][]stu=new int[5][3];
    double Avg;
    for (int i=0;i<stu.length;i++) {
    int Total=0;
	System.out.println("Enter Student "+(i+1)+"-->Marks Details");
	for (int j=0;j<stu[i].length;j++) { 
	System.out.print("Enter Subject"+(j+1)+" Marks?");
    stu[i][j]=input.nextInt();
    Total+=stu[i][j];
	}
    System.out.println("Total Marks is: "+Total); 
	Avg= Total/3.0;
    System.out.println("Average is: "+Avg);
	}
	*/
	System.out.println("------2 Dimensional Array Method -2---------");
	int [][]x1=new int [3][];
	x1[0]=new int [2];
	x1[1]=new int [3];
	x1[2]=new int [5];
	x1[0][0]=5;
	x1[0][1]=10;
	
	x1[1][0]=15;
	x1[1][1]=20;
	x1[1][2]=25;
	
	x1[2][0]=30;
	x1[2][1]=35;
	x1[2][2]=40;
	x1[2][3]=45;
	x1[2][4]=50;
	for(int i1=0;i1<x1.length;i1++){
		for(int j1=0;j1<x1[i1].length;j1++){
			System.out.print(x1[i1][j1]+",");
		}
		System.out.println("");
	}
	System.out.println("---------------");
	for(int[] i2:x1){
		for(int j2:i2){
			System.out.print(j2+",");
		}
		System.out.println("");
	}
	System.out.println("------2 Dimensional Array Method-2 ---Homework-2---------");
	Scanner in= new Scanner(System.in); 
	int [][]s1=new int[5][];
    double A1;
	for (int a1=0;a1<s1.length;a1++) {
      int T1=0;
	  System.out.println("Enter Student "+(a1+1)+"-->Marks Details");
	  System.out.print("How many subject marks?");
      int c=in.nextInt();
	  s1[a1]=new int [c];
	  for(int b1=0;b1<s1[a1].length;b1++){
		 System.out.print("Enter Subject"+(b1+1)+" Marks?");
		 s1[a1][b1]=in.nextInt();
         T1+=s1[a1][b1];
	    }
    System.out.println("Total Marks is: "+T1); 
	A1= T1/c;
    System.out.println("Average is: "+A1);
	}
}
}