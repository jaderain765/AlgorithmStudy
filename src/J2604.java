import java.util.Scanner;

public class J2604 {
	public static void main(String[] args) {
		// 변수선언부
		char[] bowl;

		// 입력부
		Scanner sc = new Scanner(System.in);
		bowl = sc.next().toCharArray();
		sc.close();

		// 풀이
		// [방법1] 이해하기 쉬운코드
		boolean position = false;
		// 그릇이 (위를 보고있을 때 = true
		// 그릇이 )바닥쪽을 보고있을때 = false;

		if (bowl[0] == ')') // 처음 그릇은 방향상관없이 10cm라서 그릇 방향값을 반대로 해준다.
			position = true;

		int result = 0;

		for (char c : bowl) {
			// 그릇의 방향이 같을 때 +5
			if ((c == '(') == position) // 둘다 true이거나, 둘다 false일때 (즉, 같은 방향일때)
				result += 5;
			// 그릇의 방향이 다를 때 +10
			else {
				result += 10;
				position = !position; // 그릇방향을 반대로 바꾼다.
			}
		}
		System.out.println(result);

		// [방법2] 짧고, 빠르고, 간단한 코드
		int result2 = 10;
		for (int i = 0; i < bowl.length - 1; i++) {
			if (bowl[i] != bowl[i + 1])
				result2 += 5; // 다음값과 비교후 다를경우 5cm 더추가
			result2 += 5; // 기본적으로 5cm 추가
			// 방향이 다를경우엔 위의 조건에서 추가된 값까지 더해 +10cm가 된다.
			// else를 어떻게든 사용하지 않기 위한 몸부림;;
		}
		System.out.println(result2);
	}
}
