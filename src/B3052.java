import java.util.Scanner;

public class B3052 {
	public static void main(String[] args) {
		//변수선언부
		int[] rest = new int[42]; // 0 ~ 41 크기의 배열이다.
		
		//입력부
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			rest[sc.nextInt()%42]++;
		}
		// 만약에 입력받은 수(sc.nextInt())에 42로 나눠서 2가 나올 경우
		// [ 0, 0, 0, 0, 0, 0, ... 에서
		// [ 0, 0, 1, 0, 0, 0, ... 이 된다.
		// 결과적으론 나머지 갯수가 있는 배열위치에 값이 1추가된다.
		sc.close();
		
		//출력부
		int count = 0;
		for(int i : rest) {
			if(i != 0) count++;
		}
		System.out.println(count);
	}
}
