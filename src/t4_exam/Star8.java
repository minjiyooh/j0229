package t4_exam;
/*

 					***** 
  			   ****
  			    ***
  			     **
  			      *
*/
public class Star8 {
	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) { //열
			for(int j=1; j<=i-1; j++) { //행
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++) { 
				System.out.print("*");
			}	
			System.out.println();
		}
	}
}
