package PackB;
import PackA.A;
public class B extends A{
	
     int y;
	 
     public B(){
            this.y=15;
     }
	 
     public void getY(){
            System.out.println("BY:\t"+this.y);
     }
}