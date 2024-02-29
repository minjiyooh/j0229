package t4_exam;

import java.util.Scanner;

// 1개의 주사위를 던졌을때 나오는 숫자 맞추기 게임
public class Test4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su , rand, ans; //바깥에다가 선언을 해야 밖에서도 안에서도 su를 쓸 수 있음.
		
		while(true) {
			while(true) {
			System.out.print("출력될 주사위 눈금을 입력하세요? ");
			su = sc.nextInt();
			
			if(su >= 1 && su<=6)break;
			System.out.println("1~6까지의 수를 입력하세요");
		}
	
			rand = (int)(Math.random()*6) + 1; //+1을 하는 이유:Math.random() 메서드는 0.0(포함)부터 1.0(미포함)  
		                                   //1을 더하면 범위가 1.0에서 7.0(미포함)
		
			if(su == rand) System.out.println("정답입니다.");
			else System.out.println("틀렸습니다. 출력된 주사위 눈금은 "+ rand +" 입니다.");
		
			System.out.print("계속 할까요? (1:계속/0.그만)"+ "");
			ans = sc.nextInt();
		
			if(ans == 0) break;
		
		}
		System.out.println("작업끝....");
		sc.close();
	}
}
