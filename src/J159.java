import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Integer[] arr = new Integer[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
