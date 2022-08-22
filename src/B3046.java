import java.util.Scanner;

public class B3046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R1 = sc.nextInt();
		int R2;
		int S = sc.nextInt();
		sc.close();
		
		// [계산 방법]
		// (R1 + R2) / 2 = S
		// R1 + R2 = S * 2
		// R2 = (S * 2) - R1
		
		R2 = (S * 2) - R1;	//ㅎㅎ
		
		System.out.println(R2);
	}
}
