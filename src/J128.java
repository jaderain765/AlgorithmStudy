import java.util.Scanner;

public class Q128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1, count = 0;

		while (num != 0) {
			num = sc.nextInt();
			// 3이나 5의 배수일때 넘긴다.
			if (num % 3 == 0 || num % 5 == 0) continue;
			count++;
		}
		sc.close();

		System.out.println(count);
	}
}
