package t4_exam;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		int select;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.println("선택> ");
			select=sc.nextInt();
			
		}
		
		sc.close();
	}
}
