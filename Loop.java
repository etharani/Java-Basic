class Loop{
 public static void main (String args[]){
	System.out.println("-----While Loop-----"); 
 int x=1;
 while (x<=5){
	 System.out.println(x);
	 x++;
 }
 System.out.println("x :"+x);
 System.out.println("-----------------");
 int a=1;
 boolean bool= true;
 while (bool){
	 System.out.println(a);
	 if(a==5){
		 bool=false;
	 }
	 a++;
 }
 System.out.println("a :"+a);
 System.out.println("-----------------");
 int b=1;
 boolean bool1= true;
 while (bool1){
	 System.out.println(b);
	 if(b==5){
		 break;
	 }
	 b++;
 }
 System.out.println("b :"+b);
 System.out.println("-----------------");
 int c=1;
 while (c<=5){
	 int d=1;
	 while(d<=3){
	 System.out.print(d);
	 d++;
     }	 
	 System.out.println(c);
	 c++;
 }
 System.out.println("-----For Loop-----"); 
 for(int s=1;s<=5;s++){
	 System.out.println(s);
 }
 System.out.println("-----------------");
 for(int t=1;t<=5;t++){
	 for(int u=1;u<=3;u++){
		System.out.print(u); 
	 }
	 System.out.println(t);
 }
 System.out.println("-----------------");
 for(int v=1;v<=5;v++){
	 if(v==3){
		 break;
	 }
	 System.out.println(v);
 }
 System.out.println("-----------------");
 for(int w=1;w<=5;w++){
	 if(w==3){
		 continue;
	 }
	 System.out.println(w);
 }
 System.out.println("-----Do While Loop-----"); 
 int e=1;
 do{
	System.out.println(e); 
	e++;
 } while(e<=5);
 }
 }
 