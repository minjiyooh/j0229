package t3_for;

/*
	for(int i=초기값; 조건식; 증감치) {
	  조건을 만족할때 수행처리할 내용...
	}
*/
public class Test4 {
	public static void main(String[] args) {
		// 조건을 만족하면 해당 조건만큼만 처리할 내용을 수행한다.
		
		int i = 0 ; 
		
		for(;;) { //아무것도 안쓰면 참으로 본다
			i++;
			System.out.println(i);
			
			if(i == 10) break;
		}
		//System.out.println("작업끝..");
	}
}
