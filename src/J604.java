import java.util.Scanner;

public class J604 {

	public static void main(String[] args) {
		String[] strArr = new String[10];
		char cha;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			strArr[i] = sc.next();
		}
		cha = sc.next().charAt(0);
		
		sc.close();

		for(String s : strArr) {
			if(s.charAt(s.length()-1) == cha)
				System.out.println(s);
		}
	}
}
