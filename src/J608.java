import java.util.Scanner;

public class J608 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		System.out.print((str.indexOf('c') > -1)? "Yes ":"No ");
		System.out.println((str.indexOf("ab") > -1)? "Yes":"No");
	}
	// 문자열.indexOf("찾을문자열 또는 문자")는 문자열에서 위치를 반환해주는 메소드인데,
	// 당연히 음수가 나올수없다. 허나, 찾는 문자가 없을경우 -1을 반환한다.
}