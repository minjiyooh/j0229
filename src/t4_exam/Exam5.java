package t4_exam;

//4x + 5y = 60 을 만족하는 x와 y의 값을 출력?
public class Exam5 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y < 10; y++) {
				if((4*x + 5*y) == 60){
					System.out.println("(x="+x+" , y=" +y +")");
					cnt++;
					
				}
			}
		}
	}

}
