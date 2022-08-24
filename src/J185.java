import java.util.Scanner;

public class J185 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.next().indexOf(sc.next().charAt(0));
//		int 문자위치 = 문자열.indexOf(찾을 문자);
		System.out.println((n != -1) ? n : "No");
		sc.close();
	}
	
	// 문자열 : sc.next()로 문자를 찾을 문자열을 받습니다.
	// 찾을 문자 : sc.next().charAt(0)로 문자열을 입력 후 문자로 바꿉니다.
	// 문자 위치 : 문자열.indexOf('찾을 문자')로 '찾을 문자'가 어디있는지 문자열에서 찾아냅니다.(못찾을 경운 -1을 반환합니다.)
	// 출력문 : 위의 방법으로 찾아낸 문자를 삼항연산자를 이용해서 -1일 경우 "No"를 아닐경우 위치를 출력하게합니다. 
	
	// 가독성과 코드 이해도를 버리고, 저렇게 한줄로 쓸 수 있습니다.
}
