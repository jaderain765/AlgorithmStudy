import java.util.Scanner;

// 배열2 자가진단1
public class J564 {
//public class Main {
	public static void main(String[] args) {
		// [변수선언부]
		int[] arr = new int[('Z'-'A')+1]; // 알파벳 길이의 배열을 만든다.
		// 알파벳 배열(25칸)은 0(A)~25(Z)까지 알파벳의 나온 횟수를 저장한다.
		char cha;

		// [입력부]
		Scanner sc = new Scanner(System.in);
		// 루프를 돌려주기전에 한번 문자를 받는다.
		cha = sc.next().charAt(0);
		// 문자가 'A'와'Z'사이의 값일 경우 아래의 조건을 만족하여 알파벳배열의 값이 오른다.
		while (cha >= 'A' && cha <= 'Z') {
			// '입력된 알파벳 문자'에서 'A'(65)를 빼면 알파벳순서로 0~25 사이의 정수가 나온다.
			// A(0) ~ Z(25)까지 나올때 마다 해당 알파벳 위치에 1을 더해준다.
			arr[cha - 'A']++;
			// 다음 조건확인을 위해 입력받는다. while 조건을 통과하지 못할시 탈출한다.
			cha = sc.next().charAt(0);
		}
		sc.close();

		// [출력부]
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				System.out.println((char) (i + 'A') + " : " + arr[i]);
		}
	}
}