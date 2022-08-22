import java.util.Scanner;

public class B1152 /* Main */ {
	public static void main(String[] args) {
		// 입력부
		Scanner sc = new Scanner(System.in);
		// next()가 아닌 nextLine()으로 받아야 띄어쓰기까지 입력된다.
		String str = sc.nextLine();
		sc.close();

		// " "(공백)으로 split 해서 배열의 크기를 재면 단어의 갯수를 알수있다.
		// 그전에 시작과 끝부분에 있을 수 있는 공백을 지우기 위해 trim()을 사용한다.
		str = str.trim();
		// str에 trim()을 하여 양쪽에 있는 공백이 삭제 되었다.

		// str을 " "으로 잘라낸다. 공백이 두개 연속으로 있는 경우는 없으며, 배열의 길이가 단어의 갯수가 된다.
		String[] strArr = str.split(" ");
		
		
		// 출력부
		// [예외사항]
//		System.out.println("         ".trim());
		//공백만 있는 문자열이 들어오면 trim()을 해도 단어 하나가 있는걸로 인식됩니다.
		if(strArr.length == 1 && strArr[0].length()==0) {
			System.out.println(0);
		}else {
			System.out.println(strArr.length);
			
			// 물론 이모든것을 순서대로 한줄에 적으면 한줄만에 만들어 낼 수 있다.
//			System.out.println(str.trim().split(" ").length);
			// (쓸대없는 메모리 차지를 막을 수 있다는 장점이있으나, 이해도가 떯어질 수 있는 코드다.)
		}
	}
}
