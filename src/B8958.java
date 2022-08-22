import java.util.Scanner;

public class B8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, num = 0;
		String[] str;

		// [풀이]
		// 1. i개를 연속으로 맞췄을 때 획득 할 수 있는 점수를 미리 계산해서 저장해둔다.
		int[] score = new int[81];
		for (int i = 1; i < score.length; i++) {
			// 숫자 num이 차례대로 커지면서 전에 값에 더해진다.
			score[i] = score[i - 1] + (++num);
			// score[0] = 0 점
			// score[1] = score[0] + 1 = 1 점
			// score[2] = score[1] + 2 = 3 점
			// score[3] = score[2] + 3 = 6 점
			// score[4] = score[3] + 4 = 10 점
			// .
			// .
			// .
		}

		// 2. 입력받은 OX문을 X단위로 잘라 연속된 O의 개수를 센다.
		for (int i = 0; i < n; i++) {
			// split을 이용해서 잘른다.
			str = sc.next().split("X");
			// [OO, , O, , OOO]
			// 위의 형태로 연속된 O의 개수를 세기 쉽게 잘린다.
//			System.out.println(java.util.Arrays.toString(str));

			// 미리계산해둔 점수표에서 점수를 찾아와 합계에 계산한다.
			for (int j = 0; j < str.length; j++) {
				// O의 갯수를 세서 점수표에서 점수를 가져온다.
				sum += score[str[j].length()];
			}

			System.out.println(sum);
			sum = 0;
		}

		sc.close();
	}
}
