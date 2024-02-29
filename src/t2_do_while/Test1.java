package t2_do_while;
/*
     do {
          수행할 내용....
      } while (조건식);                ** 한 번은 무조건 수행 **
 */
public class Test1 {
	public static void main(String[] args) {
		int i = 10;
		
		do {
			i++;
			System.out.println(i);
		} while(i < 10);
	}
                 //수행을 하지않기 때문에 답이 이상한 결과가나옴 11
}
