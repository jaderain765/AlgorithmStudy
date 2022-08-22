import java.util.Scanner;

public class Q575 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.println(myPow(n1, n2));

		// 물론 제곱의 경우에 Math함수에서 기본적으로 제공하고 있다.
		// Math.pow는 double 타입으로 받고, 출력해주기 때문에 형변환이 필요하다.
		// [pow]
//		System.out.println((int)Math.pow(n1, n2));

		sc.close();
	}

	static int myPow(int n1, int n2) {
		int result = 1;

		// 반복문을 순회하면서 지수에 맞게 계산한다.
		for (int i = 0; i < n2; i++) {
			result *= n1;
		}

		return result;
	}
}
