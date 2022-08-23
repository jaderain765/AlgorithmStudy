import java.util.Scanner;

public class J1291 {
	public static void main(String[] args) {
		// 변수선언부
		int s, e;

		// 입력부
		Scanner sc = new Scanner(System.in);
		// do-while로 한번 이상 입력받게 한다.
		do {
			s = sc.nextInt();
			e = sc.nextInt();
			// 정수범위를 만족 하지 못할 경우 루프를 탈출할 수 없게 한다.
			if ((s >= 2 && s <= 9) && (e >= 2 && e <= 9)) {
				break;
			}
			// 위의 범위조건을 만족못할시 INPUT ERROR!를 출력 후 다시 루프해서 입력받는다.
			System.out.println("INPUT ERROR!");
		} while (true);
		sc.close();

		// 출력부
		for (int i = 1; i <= 9; i++) {
			// ***문제설명에서 보면 입력값의 대소관계가 없다고 하니, 두 케이스로 나눠서 작성해야한다.***
			for (int j = s; ;) {
				System.out.printf("%d * %d = %2d", j, i, j * i);
				// %2d는 2자리를 유지하게 해준다.10의자리는 그대로 1의 자리는 끝에맞춰서 출력한다.
				System.out.print((j == e) ? "\n" : "   ");
				// 출력하는 단의 마지막의 경운 다음줄에, 출력중인 경운 세칸을 띄운다.
				
				// 반복하며 j가 변하면서 e(끝값)과 같을 경운 탈출한다.
				if(j == e) break;
				// s가 e보다 클 경운 j를 감소시키며, e가 클경운 j를 증가시켜며 반복한다. 
				if (s > e)
					j--;
				else
					j++;
			}
		}
	}
}