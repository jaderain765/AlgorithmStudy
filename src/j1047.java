import java.util.Scanner;

public class j1047 {

	// [방법1]
	/**
	 * 피보나치 출력 메소드입니다. 재귀문을 사용하여 원하는 피보나치 값을 출력합니다.
	 * 
	 * @param n 원하는 번째의 피보나치수를 출력합니다.
	 * @return 예를 들어 n으로 10이 들어올경우, 리턴값이 1이 나오는 fibo(1)과 fibo(2)가 리턴될때까지 작은수의
	 *         fibo(n-1)를 불러옵니다.
	 */
	static int fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		return fibo(n - 1) + fibo(n - 2);
	}

	// [방법2]
	static int[] fiboArr = new int[41];

	/**
	 * fibo()와 달리 배열에 한번이라도 계산했던 피보나치 값은 저장하고, 나중에 불러오는 식으로 만들어진 메소드입니다. DP(Dynamic
	 * Programming)를 사용하는 방식인데 재귀를 사용하다보면, 한번 계산 했던 값을 또 계산해서 리소스를 낭비할 수 있습니다. 한번이라도
	 * 계산한값은 저장하고 불러내기만 하면되기에 낭비를 막아줍니다.
	 * 
	 * @param n
	 * @return
	 */
	static int fibo2(int n) {
		if (fiboArr[n] != 0)
			return fiboArr[n];

		if (n == 1 || n == 2) {
			fiboArr[n] = 1;
			return 1;
		}
		fiboArr[n] = fibo2(n - 1) + fibo2(n - 2);
		return fiboArr[n];
	}

	// [방법3]
	// 그냥 while문으로 푸는 방법입니다.
	// ...이게 가장 리소스 낭비가 적을 것같네요...
	// 실제로 이게 가장빠릅니다. 180ms정도로 재귀에비해 상당히 빠릅니다.ㄷㄷ
	static int fibo3(int num) {
		if (num == 1 || num == 2)
			return 1;

		int n1 = 1;
		int n2 = 1;
		int n3 = 1, count = 2;

		while (count++ < num) {
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
		}

		return n3;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(fibo3(sc.nextInt()));
		sc.close();
	}
}
