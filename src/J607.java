import java.util.Scanner;

public class J607 {
//	public static void main(String[] args) {
//		// 입력부
//		Scanner sc = new Scanner(System.in);
//		String str1 = sc.next();
//		String str2 = sc.next();
//		sc.close();
//		
//		// 문자열 자르기
//		str1 = str1.substring(0,2);
//		str2 = str2.substring(2);
//		
//		// 출력부
//		System.out.println(str1 + str2 + str1);
//	}
	
	//위 메인메소드를 압축한것
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str;
//		System.out.println((str=sc.next().substring(0,2)) + sc.next().substring(2) + str);
//		sc.close();
//	}
	
	//빌더로 푼것
	public static void main(String[] args) {
		
		// 입력부
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder(sc.next()); // ABCDE
		sb.delete(2,sb.length()); //2 뒤에 있는거 지움 = AB
		sb.append(sb); //지운거에 sb 붙임 = ABAB
		sb.insert(2, sc.next().substring(2)); // 인덱스 2위치에 삽일할 문자열(ERTY) 삽입 = ABERTYAB
		
		sc.close();
		
		System.out.println(sb);
	}
}
