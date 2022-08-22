import java.util.Scanner;

public class Q1338 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		char cha = 'A';
		String[] arr = new String[num];

		// 1.반복문을 통해 0행부터 4행까지 만든다.
		for (int i = 0; i < num; i++) {
			// 반복문을 통해 0열부터 4열까지 만든다.
			for (int j = i; j < num; j++) {
				// 초기값인 null을 없에고 ""빈칸으로 초기화 해준다.
				if (arr[j] == null)
					arr[j] = "";
				// Z보다 커지면(문자는 아스키코드로 자동적으로 대응해준다.) A로 변경한다.
				if (cha > 'Z')
					cha = 'A';

				// cha문자를 차례대로 커지게 하면서 " "공백을 추가해준다.
				arr[j] += (cha++) + " ";
			}
		}

		// [중간풀이]
		// A
		// B F
		// C G J
		// D H K M
		// E I L N O
		// 순서나 형태는 맞으나, 앞부분에 자리에 맞게 공백을 추가해야한다.
//		System.out.println(java.util.Arrays.toString(arr));

		// 2. 이젠 정답에서 제시한 자리를 맞춰 출력하면된다.
		// 두가지의 방법이 있다.
		for (int i = 0; i < num; i++) {
			// [방법 1 자리를 계산해서 출력하는 방법]
			// 행에 맞게 공백을 출력해두고,
			for (int j = 0; j < (num - i) - 1; j++) {
				System.out.print("  ");
			}
			// 마지막에 미리만들어둔 문자열을 출력하며, 열을 변경한다.
			System.out.println(arr[i]);

			// [방법 2 format을 이용해서 출력하는 방법]
			System.out.printf("%" + (num * 2) + "s\n", arr[i]);
		}
	}
}
