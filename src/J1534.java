import java.util.Scanner;

public class J1534 {
	public static void main(String[] args) {
		// 입력부
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int notation = sc.nextInt(); // 진법 notation
		sc.close();

		// 다른 방법들을 이용해서 풀어봤습니다. 주석으로 속도차이를 적어뒀어요.

		solution1(num, notation);
		// Runtime : 0.153 ms

		solution2(num, notation);
		// Runtime : 0.049 ms

		solution3(num, notation);
		// Runtime : 0.026 ms
		
		// 정올사이트 기준이 아닌, System.nanoTime()을 연산해서 계산했습니다.
	}

	private static void solution1(int num, int notation) {
		// Integer의 클래스를 이용해서 간단히 출력할 수 있습니다.
		String result1 = Integer.toString(num, notation).toUpperCase();
		// .toUpperCase()를 이용해서 소문자를 대문자로 변환해야 이문제를 통과 할 수 있습니다.
		System.out.println(result1);
	}

	private static void solution2(int num, int notation) {
		// 직접 계산하는 방법
		char[] numArr = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		// 문자배열을 만들어두고, index에 원하는 값을 입력하는것으로 출력하게 합니다.
		// "0123456789ABCDEF"를 .charAt(index)해서 해도 됩니다.
		String result2 = "";

		while (num != 0) {
			// result2 += numArr[num % notation];
			// 이런식으로 계산 하면 첫번째자리가 맨처음으로 출력되기에 빌더로 바꾼 후 .reverse()해야합니다.

			result2 = numArr[num % notation] + result2;
			// 이런식으로 구문을 짜면 다음자릿수가 앞부분에 들어갑니다.
			num /= notation; // 일의 자리를 제거했음으로 10을 나눠줍니다. 다음 일의자리는 십의 자리가 됩니다.
			// 이런식으로 계속 나누다보면 0이 돼서 탈출합니다.
		}
		System.out.println(result2);
	}

	/**
	 * 2번 과 같으나, 스트링 빌더를 이용하는 방법입니다. String 연산보다 빌더나 버퍼를 이용하는 것이 더빠르고, 많은 기능을 제공합니다.
	 * 빌더와 버퍼중에 빌더를 사용한 이유는 빌더가 알고리즘 테스트에서 근소하게 더 빠르기 때문입니다. 버퍼는 멀티스레드를 지원하여 안정성에서 큰
	 * 장점이있으나, 실무가 아닌 알고리즘 테스트(싱글스레드 환경)에선 버퍼를 사용합니다.
	 * 
	 * @param num      변환 할 10진수
	 * @param notation 바꿀 진법
	 */
	private static void solution3(int num, int notation) {
		char[] numArr = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		StringBuilder result3 = new StringBuilder("");

		while (num != 0) {
			result3.insert(0, numArr[num % notation]);
			// 0번 자리(index)에 원하는 문자를 삽입합니다.
			num /= notation;
		}
		System.out.println(result3);
	}
}
