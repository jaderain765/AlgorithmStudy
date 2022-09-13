import java.util.Arrays;
import java.util.Scanner;

public class J610 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.next();
		}
		
		sc.close();
		
		Arrays.sort(arr);
		for(int i = 4; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
