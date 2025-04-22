//package EXO2;
//public class ThreadMatrix extends Thread{
//    
//int a[][];    
//int b[][];    
//int c[][];    
//int p = 9;
//    
//
//public ThreadMatrix(int a [][],int b [][]) {
//	this.a=a;
//	this.b=b;
//	
//}
//
//@Override
//	public void run() {
//		// TODO Auto-generated method stub
//	for(int i=0;i<3;i++){    
//		for(int j=0;j<3;j++){ 
//			int somme;
//			for(int k = 0;k<p;k++) {
//			
//			
//		somme=a[i][k]+b[k][j];    //use - for subtraction  
//		somme = c[i][j];
//		System.out.print(c[i][j]+" ");    
//		}    
//		System.out.println();//new line    
//		}   
//	}
//}
//
//public static void main(String args[]){  
////creating two matrices    
//int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
//int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
//
//ThreadMatrix t1= new ThreadMatrix(a, b);
//
//t1.start();
//
//}}  