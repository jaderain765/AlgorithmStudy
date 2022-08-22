import java.util.Scanner;

public class Q546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			sum += sc.nextInt();
		}
		
		float avg = (float)sum/num;
		System.out.printf("avg : %.1f\n", avg);
		System.out.println((avg>=80)? "pass" : "fail");
		sc.close();
	}
}
