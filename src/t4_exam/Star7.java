package t4_exam;
/*
 							* 
 						 **	
 						***
 					 ****
 					*****
*/
public class Star7 {
	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) { //열
			for(int j=1; j<=5-i; j++) { //행
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) { 
				System.out.print("*");
			}	
			System.out.println();
		}
	}
}
