import java.util.Scanner;

public class J3106 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_A;
		String num_S;
		int num_B;

		while (true) {
			if ((num_A = sc.nextInt()) == 0)
				break; // 0이 들어올 경우 종료
			num_S = sc.next();
			num_B = sc.nextInt();
			System.out.println(solution(num_A, num_S, num_B));
		}

		sc.close();
	}

	static String solution(int num_A, String num_S, int num_B) {
		// 나눌값이 0 일경우 0을 반환한다.
		if(num_S.equals("0")) return "0";
		
		// A 진수에서 10진수로 바꾸는것 역시 메소드화 하였다.
		long newNum = numAto10(num_A, num_S);

		// 문제에서 10진수를 구하라고 하였을경우 그냥 출력한다.
		if (num_B == 10) {
			return "" + newNum;
		}

		// 10진수를 B진수로 바꾼다.
		String result = num10toB(newNum, num_B);

		return result;
	}

	/**
	 * A진수인 S를 10진수로 바꾸는 메소드
	 * 
	 * @param num_A
	 * @param num_S
	 * @return
	 */
	static long numAto10(int num_A, String num_S) {
		long result = 0; // 10진수 변환 결과를 저장할 변수
		// 10진수 변환 결과는 int(약21억)을 넘길수있다.
		long aPowNum = 1; // 자릿수계산을 위한 승수 (예)... 2^3, 2^2, 2^1 ,2^0
		//이건 예상 못했으나, 자릿수 역시 int 범위를 넘아간다.
		
		while (num_S.length() != 0) {
			result += charToNum(num_S.charAt(num_S.length() - 1)) * aPowNum;
			// charToNum()메소드에 문자열형태의 숫자S의 마지문 부분을 추출한것을 숫자로 변환한다.
			num_S = num_S.substring(0, num_S.length() - 1);
			// 실제로 숫자 일의 자리를 제거한다.
			aPowNum *= num_A; // aPowNum은 1, 2, 4, 8,... 이런식으로커진다.
		}

		return result;
	}

	/**
	 * 10진수를 B진수로 변환하는 메소드입니다.
	 * 
	 * @param num	바꿀 10진수
	 * @param num_B	B진법으로 변환
	 * @return	문자열 형태로 수를 반환
	 */
	static String num10toB(long num, int num_B) {

		String result = "";
		while (num != 0) {
			result = numToChar((int)(num % num_B)) + result;
			num /= num_B;
		}

		return result;
	}

	/**
	 * 문자를 숫자로 바꾸는 메소드
	 * 
	 * @param cha 바꿀 문자
	 * @return 정수값으로 변환
	 */
	static int charToNum(char cha) {

		if('0' <= cha && cha <= '9') return cha - '0';

		return cha - ('A') + 10;
	}

	/**
	 * 숫자를 문자로 바꾸는 메소드
	 * 
	 * @param num 바꾸고 싶은 문자
	 * @return 0 ~ 35 사이의 문자 값으로 변환
	 */
	static char numToChar(int num) {
		char[] toNum = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		
		// 팁) 일일이 추가하지말고, 이런식으로 출력문을 짜서 추가할 숫자를 넣는다.
//		for(char c = '0'; c <= 'Z'; c++) {
//			if(c > '9' && c < 'A') continue; // 9와 A사이는 페스한다.
//			System.out.print("\'" + c+"\', ");
//		}
		
		return toNum[num];
	}
}