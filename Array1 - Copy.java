class Array1{
		public static void whatslt(int n) {
    if (n> 10) { whatslt(n/10); } System.out.print(n % 10);}
	
public static void main(String args[]){
 int [][] a= new int [10][5];
 for(int i=0;i<10;i++){
 for(int j=0;j<5;j++){
 System.out.print(""+a[i][j]);
 }
 
 System.out.println("\n");
 }
 
whatslt(5);
 }
 
 
 }
 