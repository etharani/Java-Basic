class MainIA{
   public static void main (String args []){
            
			A objA=new A();
			objA.getA();
			System.out.println("A \t:"+objA.a);
			System.out.println("----------");
			objA.getX();
			System.out.println("IA\t:"+IA.X);
			System.out.println("----------");
		    System.out.println("----------");
			 
			B objB=new B();
			objB.getB();
			System.out.println("B \t:"+objB.b);
			System.out.println("----------");
			objB.getX();
			System.out.println("IA\t:"+IA.X);
			
			
		}
	}