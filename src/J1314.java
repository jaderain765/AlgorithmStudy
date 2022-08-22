import java.util.Scanner;

public class Q1314 {
	public static void main(String[] args) {
		System.out.print("얼마나 큰 문자사각형2를 만드시겠습니까? : ");
		// 채점시 이부분은 지울것!!!
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		// [풀이]
		// 1. 우선 num 사이즈의 정사각 이중배열을 만든다.
		char[][] cha_arr = new char[num][num];
		char cha = 'A';

		// 2. 처음부터 열을 고려하여 저장하면 되지만, 행으로 만들고 뒤집는 방식으로 풀겠다.
		for (int i = 0; i < cha_arr.length; i++) {
			for (int j = 0; j < cha_arr.length; j++) {
				// Z문자 다음엔 A로 반복된다.
				if (cha > 'Z')
					cha = 'A';

				// 짝수열 일땐 정방향으로 저장한다.
				if (i % 2 == 0) {
					cha_arr[i][j] = cha++;
				}
				// 홀수열 일땐 역방향으로 저장한다.
				else {
					// j가 역순으로 나올려면 (행의 크기) - j 하면, 점점 작아지는 값을 갖게된다.
					cha_arr[i][(cha_arr.length - 1) - j] = cha++;
				}
			}
		}

		// [중간결과]
		// A B C D
		// H G F E
		// I J K L
		// P O N M
		
//		// [중간결과 출력문]
//		for(int i = 0; i < num; i++) {
//			System.out.println(java.util.Arrays.toString(cha_arr[i]));
//		}

		// 3. 이제 출력문을 작성하면 되나, 아직 원하는 모양이 나오지 않았다.
		// 원하는 모양이 나올려면, 대각선 대칭으로 돌려줘야 한다.
		for (int i = 0; i < cha_arr.length; i++) {
			for (int j = 0; j < cha_arr[i].length; j++) {
				System.out.print(cha_arr[j][i] + " ");
			}
			System.out.println();
		}
		// 출력문의 i와 j의 위치를 바꿀시 행과 열의 위치가 바뀌기 때문에 대각선대칭의 모양이된다.
		// 물론, 2.의 조건문에서 cha++를 저장할때 i와 j의 위치를 바꾸면, 원하는 모양대로 저장되어 나온다.
	}
}
