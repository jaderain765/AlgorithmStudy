import java.util.Scanner;

public class Q1856 {
	public static void main(String[] args) {
		System.out.println("높이n과 너비m을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int num = 0;
		sc.close();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) { // = 홀수일 때
				for (int j = 0; j < m; j++) {
					System.out.print(++num + " ");
				}
			} else { // if(1 % 2 == 0) = 짝수일 때
				num += m;
				for (int j = 0; j < m; j++) {
					System.out.print((num - j) + " ");
				}
			}
			System.out.println();
		}

		// 문제의 힌트에 이중배열을 이용하는 방식이 있지만, 이중배열은 출력문도 따로 작성 해야하기에 귀찮다.
		// 위의 방식으로 하면, 홀수줄 일때의 케이스와 짝수줄 일때의 케이스로 나눠 바로 출력할 수 있다.

	}
}
