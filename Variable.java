class Variable{
    public static void main (String args[]){
		int x;
		x=10;
		System.out.println(x);
		System.out.println("x");
	/*	int x;
		x=20;
		System.out.println(x);// error
        */
		x=20;
		System.out.println(x);
		
        byte b;
        b=20;
		System.out.println(b);
	/*	byte b1;
		b1=150;
		System.out.println(b1);// error
	*/
        long l=543675;
		System.out.println(l);
		//long l1=54637228345545454; error
		long l1=54637228345545454L;
		long l2=45433233473375847l;
		System.out.println(l1);
		System.out.println(l2);
		
	/*	float f=10.3f;
		System.out.println(f);// error
		*/
		float f=10.3f;
		System.out.println(f);
		float f1=13.53F;
		System.out.println(f1);
		
		double d=12.344;
		System.out.println(d);
		double d1=15.67d;
		System.out.println(d1);
		double d2=34.675D;
		System.out.println(d2);
		
		char c1='A';
		System.out.println(c1);
	/*	char c2="A";
		System.out.println(c2);// error
		*/
		char c2=65;
		System.out.println(c2);
		char c3=0101;
		System.out.println(c3);
		char c4=0x41;
		System.out.println(c4);
		char c5='\u0041';
		System.out.println(c5);
		char c6=0b1000001;
		System.out.println(c6);
		
		int ic2=65;
		System.out.println(ic2);
		int ic3=0101;
		System.out.println(ic3);
		int ic4=0x41;
		System.out.println(ic4);
		int ic5='\u0041';
		System.out.println(ic5);
		int ic6=0b1000001;
		System.out.println(ic6);
		
		boolean bool1= true;
		System.out.println(bool1);
		boolean bool2= false;
		System.out.println(bool2);
		
	    
		
	}
}