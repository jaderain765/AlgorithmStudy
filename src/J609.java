import java.util.Arrays;
import java.util.Scanner;

public class J609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		sc.close();
		Arrays.sort(str);
		System.out.println(str[0]);
	}
}
