import java.util.Scanner;

public class J2857 {
	public static void main(String[] args) {
		// 변수 선언부
		String[] strArr = new String[15]; //한번에 들어올수 있는 문자의 최대갯수는 15개이다.
		java.util.Arrays.fill(strArr, "");
		//문자열 배열은 null로 초기값이 설정되어있어서 ""로 초기화한다.
		String str;
		
		//입력부
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			str = sc.next();
			// 처음부터 입력되는 문자갯수가 아니라 문자열의 길이만큼 배열을 만들고,
			// 문자열이 입력되면 입력된 문자열의 길이만큼 반복해서 한자리씩 잘라서 저장한다.
			for(int j = 0, n = str.length(); j < n; j++)
				strArr[j] += str.charAt(j);
		}
		// 이렇게 저장하면 들어온 문자가 가로가 아닌, 세로로 저장이 된다.
		// 주어진 문자 : [AABCDD, afzz, 09121, a8EWg6, P5h3kx]
		// 세로로 저장 : [Aa0aP, Af985, Bz1Eh, Cz2W3, D1gk, D6x, , ...
		sc.close();
		
		// 출력부
		for(String s : strArr) {
			System.out.print(s);
		}
	}
}
