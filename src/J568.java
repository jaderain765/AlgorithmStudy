import java.util.Scanner;

public class Q568 {
	public static void main(String[] args) {
		// 변수 선언부
		int[][] firstArray = new int[2][4];
		int[][] secondArray = new int[2][4];

		// 입력부
		Scanner sc = new Scanner(System.in);
		System.out.println("first array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				firstArray[i][j] = sc.nextInt();
			}
		}
		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				secondArray[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// 출력부
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(firstArray[i][j] * secondArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
