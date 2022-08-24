import java.util.Scanner;

public class J187 {
	public static void main(String[] args) {
		// 변수선언부
		String str;

		// 입,출력부
		Scanner sc = new Scanner(System.in);
		str = sc.next();

		// 문자열을 지워나가는 과정에서 1이되면 탈출합니다.
		for (int i = str.length(); i > 1; i--) {
			// delChar메소드에 마우스 커서를 올리면 설명이 출력됩니다.(이클립스)
			str = delChar(str, sc.nextInt());
			System.out.println(str);
		}
		sc.close();
	}

	/**
	 * 문자열과 문자를 지울 인덱스를 받아 지우고, 변한 문자열을 출력하는 메소드 입니다.
	 * 
	 * @param str      바꿀 문자열을 입력합니다.
	 * @param delIndex 지울 문자가 있는 위치를 입력합니다.
	 * @return 바뀐 문자열을 리턴합니다.
	 */
	static String delChar(String str, int delIndex) {
		// 입력받은 인덱스가 문자열의 길이를 초과할시, 마지막 문자만 지우고 출력한다.
		if (str.length() < delIndex)
			return str.substring(0, str.length() - 1);

		// 위의 조건을 통과하지만 않으면 (처음, 인덱스 -1)부터 (인덱스 부터 마지막)이런식으로 출력된다.
		return str.substring(0, delIndex - 1) + str.substring(delIndex);
	}
}
