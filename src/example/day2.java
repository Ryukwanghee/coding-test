package example;

import java.util.Scanner;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		
		
		 * int n = sc.nextInt(); 
		 * if(n >=1 && n <10) { for (int i = 1; i < 10; i++) {
		 * System.out.println(n + " * " + i + " = " + i*n); } }
		 */
		
		/*Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		if( A > B) {
			System.out.println(">");
		} else if( A < B ) {
			System.out.println("<");
		} else
			System.out.println("==");
			*/
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		  for(int i = 1; i < N+1; i++) { 
			  for(int a = 1; a < i+1; a++) {
				  System.out.print("*"); 
			  } 
			  System.out.println(" "); 
		  }
		 
		for(int i=1; i< N+1; i++) {
			for(int a=N-i; a>0; a--) {
				System.out.print(" ");
			}
			for(int b=1; b<i+1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		

}
