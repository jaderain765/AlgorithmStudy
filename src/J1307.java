import java.util.Arrays;
import java.util.Scanner;

public class Q1307 {
	public static void main(String[] args) {
		System.out.println("출력할 사각형의 수를 입력하세요.: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // num 정사각형
		sc.close();

		char[][] char_arr = new char[num][num];
		char cha = 'A';

		// 이중for문으로 이중배열에 'A'부터 값을 넣는다.
		for (int i = 0; i < char_arr.length; i++) {
			for (int j = 0; j < char_arr[i].length; j++) {
				// 다만, 'Z'이후의 문자가 나올시 'A'로 리셋해준다.
				if (cha > 'Z')
					cha = 'A';

				// 문자는 아스키코드에 해당하기에 +1을해주면 다음 문자가 입력된다.
				char_arr[(num - 1) - j][(num - 1) - i] = cha++;

				// 여기서 i와 j의 위치를 바꾸면, 새로로 저장이된다.(대각선 반전)
				// char_arr[j][i] = cha++;
				// ..., 3, 2, 1, 0 이런순서(역순)로 저장하기 위해선
				// (배열의 최댓값 - 1 - i)를 하면 역순으로 입력된다.
				// 이런 방식으로 배열을 뒤집어서 원하는 형태를 만들 수 있다.

				// 자바의 정석 5-9번 연습문제와 비슷한 문제입니다.
			}
		}

		// [답]
		// [이중배열 출력 방식]
		System.out.println("이중배열 출력방식1");

		for (int i = 0; i < char_arr.length; i++) {
			for (int j = 0; j < char_arr[i].length; j++) {
				System.out.print(char_arr[i][j] + " ");
			}
			System.out.println();
		}

		// [배열을 문자로 출력하는방식]
		System.out.println("\n이중배열 출력방식2");

		for (int i = 0; i < num; i++) {
			System.out.println(Arrays.toString(char_arr[i]));
		}

		// [이중배열을 출력하는 Arrays문]
		System.out.println("\n이중배열 출력방식3");

		System.out.println(Arrays.deepToString(char_arr));
		// 이방식을 알아두고, 중간중간에 출력하면서 원하는 모양인지 확인한다.
	}
}
