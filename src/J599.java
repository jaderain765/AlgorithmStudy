import java.util.Scanner;

public class J599 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		sc.close();
		
		for(char c : arr) {
			if('A' <= c && c <= 'Z' || 'a' <= c && c <= 'z')
			System.out.print((""+c).toUpperCase());
		}
	}
}
