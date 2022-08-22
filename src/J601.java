import java.util.Scanner;

public class Q601 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		// [풀이]
		// substring(문자열 자르기)으로 기준위치(i)를 기준으로 잘라서
		// [i부터끝까지] + [0(처음)부터 기준위치(i)까지]로 출력한다.
		// .substring(기준위치) : 기준위치부터 끝까지 츌력한다.
		// .substring(기준위치1,기준위치2) : 위치1부터 2(포함안됨)까지 출력한다.

		for (int i = 1; i <= str.length(); i++) {
			System.out.println(str.substring(str.length() - i) + str.substring(0, str.length() - i));
		}
	}
}
