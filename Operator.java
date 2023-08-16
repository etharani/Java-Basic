class Operator{
	public static void main(String []args){
		int x=10;
		int y=3;
		System.out.println("Arithmetic Operators");
		System.out.println(x+y);//13
		System.out.println(x-y);//7
	    System.out.println(x*y);//30
	    System.out.println(x/y);//3
	    System.out.println(x%y);//1
	    System.out.println("-------Addition-----------");
		System.out.println("x+y\t"+x+y);       //x+y 103
		System.out.println(x+y+"\tx+y");       //13 x+y
		System.out.println("x+y\t"+(x+y));     //x+y 13
		System.out.println("--------Subtraction-----------");
		// error -> System.out.println("x-y\t"+x-y);
		System.out.println(x-y+"\tx-y");        //7 x-y
		System.out.println("x-y\t"+(x-y));      //x-y 7
		System.out.println("--------Multiplication-----------");
		System.out.println("x*y\t"+x*y);        //x*y 30
		System.out.println(x*y+"\tx*y");        //30 x*y
		System.out.println("x*y\t"+(x*y));      //x*y 30
		System.out.println("---------Division-----------");
		System.out.println("x/y\t"+x/y);        //x/y 3
		System.out.println(x/y+"\tx/y");        //3 x/y
		System.out.println("x/y\t"+(x/y));      //x/y 3
		System.out.println("----------Modulus-----------");
		System.out.println("x%y\t"+x%y);        //x%y 1
		System.out.println(x%y+"\tx%y");        //1 x%y
		System.out.println("x%y\t"+(x%y));      //x%y 1
		
		int a=10;
		System.out.println("Assignment Arithmetic Operators");
		System.out.println("a=10");
		System.out.println("a:- "+a);//10
		a=a+5;
		System.out.println("a=a+5");
		System.out.println("a:- "+a);//15
		a+=5; // a=a+5;
		System.out.println("a+=5");
		System.out.println("a:- "+a);//20
		a-=15;//a=a-15;
		System.out.println("a-=15");
		System.out.println("a:- "+a);//5
		a*=3;//a=a*3;
		System.out.println("a*=3");
		System.out.println("a:- "+a);//15
		a/=5;//a=a/5;
		System.out.println("a/=5");
		System.out.println("a:- "+a);//3
		a%=2;//a=a%2;
		System.out.println("a%=2");
		System.out.println("a:- "+a);//1
		
		System.out.println("Increment and Decrement Operators");
		System.out.println("post increment operator(a++)");
		a++;
		System.out.println("a:- "+a);//2
		System.out.println("pre increment operator(++a)");
		++a;
		System.out.println("a:- "+a);//3
		System.out.println("post decrement operator(a--)");
		a--;
		System.out.println("a:- "+a);//2
		System.out.println("pre decrement operator(--a)");
		--a;
		System.out.println("a:- "+a);//1
		
		System.out.println("----------------");
		System.out.println("a++ :"+(a++));         //1
		System.out.println("a :"+a);               //2
		System.out.println("++a :"+(++a));         //3
		
		System.out.println("----------------");
		System.out.println("a-- :"+(a--));          //3
		System.out.println("a :"+a);                //2
		System.out.println("--a :"+(--a));          //1
		
		System.out.println("Relational Operators");
		System.out.println(x==y);//false
		System.out.println(x!=y);//true
		System.out.println(x<y);//false
		System.out.println(x>y);//true
		System.out.println(x<=y);//false
		System.out.println(x>=y);//true
		System.out.println(!(x==y));//true
		
		System.out.println("x==y:"+(x==y));//x==y: false
	//	System.out.println("x==y:"+x==Y); error
	
	    System.out.println("Logical Operators");
		System.out.println("------And------");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		System.out.println("------OR------");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
	
	}
}

		
		
		