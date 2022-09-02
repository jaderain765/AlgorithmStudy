import java.util.Scanner;

public class J1309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial = sc.nextInt();
		sc.close();

		solution1(factorial); // while
		solution2(factorial); // 재귀
		
		// 이문제는 두방식의 큰차이가 없습니다.
		// 피보나치와 달리 값을 저장할 필요가 없습니다.
	}
	
	
	/**
	 * 단순 반복문으로 푼 방법입니다.
	 * 
	 * @param factorial
	 */
	private static void solution1(int factorial) {
		int num = factorial;
		long result = 1;
		
		while(num != 0) {
			if (num == 1) {
				System.out.println("1! = 1");
				break;
			}
			System.out.println(num + "! = " + num + " * " + (num - 1) + "!");
			
			result *= num--;
		}
		System.out.println(result);
	}

	/**
	 * 재귀를 이용해서 푸는 방법입니다. 단 입력받은 수가 13을 넘어갈시 int타입에서 깨지기에 똑같은 구동방식이나, 타입만 다른 long
	 * 팩토리얼을 호출합니다.
	 * 
	 * @param factorial 구하고싶은 팩토리얼수를 입력합니다.
	 */
	private static void solution2(int factorial) {
		if (factorial >= 13) { // 13부터 팩토리얼 값이 차이난다.
			System.out.println(longFactorial(factorial));
			return;
		}
		System.out.println(intFactorial(factorial));
	}

	private static int intFactorial(int num) {
		if (num == 1) {
			System.out.println("1! = 1");
			return 1;
		}

		String print = num + "! = " + num + " * " + (num - 1) + "!";
		System.out.println(print);

		return num * intFactorial(num - 1);
	}

	private static long longFactorial(long num) {
		if (num == 1) {
			System.out.println("1! = 1");
			return 1;
		}

		String print = num + "! = " + num + " * " + (num - 1) + "!";
		System.out.println(print);

		return num * longFactorial(num - 1);
	}
}
