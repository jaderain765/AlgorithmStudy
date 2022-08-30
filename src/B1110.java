import java.util.Scanner;

public class B1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new Solution_B1110(sc.nextInt())); // {1}
		sc.close();

	}
	// {1}
	// int num = sc.nextInt();
	// Solution_B1110 instance = new Solution_B1110(num);
	// System.out.println(instance);

	// 위의 문장을 한줄로 줄여서 사용한 것입니다.
	// 객체를 생성하지 않고, 바로 값을 입력후 오버라이딩된 toString()으로 출력합니다.
}

/**
 * 백준 1110문제 더하기 사이클을 해결하기 위해 만든 클래스입니다.
 */
class Solution_B1110 {
	private int n1;
	private int n2;

	private int count = 0;

	private int num;
	private int newNum;

//	public Solution_B1110() {}

	public Solution_B1110(int num) {
		this.num = num;

		newNumberMake2_1(num);
	}

	// [방법1] : 재귀함수 사용
	void newNumberMake(int num) {
		n1 = num / 10; // 십의 자리를 저장(없을 경우 알아서 0이 저장됨)
		n2 = num % 10; // 일의 자리를 저장

		newNum = (n2 * 10) + ((n1 + n2) % 10);
		// 기존 일의 자리(n2)가 *10이 되어 십의 자리가 되고,
		// 십의 자리와 일의 자리가 합쳐진 수의 일의자리가 새로운 일의 자리가 됩니다.
		count++;

		// System.out.println(newNum);

		if (this.num != newNum)
			newNumberMake(newNum);
		// 처음 숫자num이 나올때까지 재귀를 돌려서 출력시킨다.
	}

	// [방법2] : do - while문을 이용한 간단한 방법
	void newNumberMake2(int num) {
		int n = num;
		do {
			count++;
			n = (n % 10) * 10 + (n / 10 + n % 10) % 10; // 계산식 축약
		} while (num != n);
	}
	
	// [방법2 축약] : while문 조건 안에 계산을 넣어 더 축약시키는 방법(...)
	void newNumberMake2_1(int num) {
		int n = num;
		count = 1;
		while (num != (n = (n % 10) * 10 + (n / 10 + n % 10) % 10))
			count++;
	}

	@Override
	public String toString() {
		// 출력 타입을 맞추기 위해 ""에 더한다.
		return "" + count;
	}
}