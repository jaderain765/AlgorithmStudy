import java.util.Scanner;

public class J569 {
	public static void main(String[] args) {
		// 변수선언부
		int successful = 0;

		// 입력부
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			// 메소드로 빼봤습니다. 마우스를 갖다 대면, 설명을 볼 수 있어요.
			if (passOrFail(80, new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() })) {
				System.out.println("pass");
				successful++;
				continue;
			}
			System.out.println("fail");
		}
		sc.close();

		// 출력부
		System.out.println("Successful : " + successful);
	}

	// ** 메서드 주석 작성법 **
	// 메서드를 작성 후 [Alt Shift J] 를 누르면 메소드 설명란이 나옵니다.
	// 메소드와 각 파라미터가 무엇을 하는지, 등을 적을 수 있습니다.
	// 메소드 주석은 스크립트에서 마우스를 갖다 대면, 작성한 주석이 출력됩니다.
	// 나만 알아보는 코드가 아닌, 모두가 알아볼 수 있는 코드를 작성합니다.

	/**
	 * 통과인지 아닌지 확인해주는 메소드 입니다.
	 * 
	 * @param avg 통과 기준이 되는 평균값을 입력해주세요.
	 * @param num 점수를 배열(파라미터)의 형식으로 입력해주세요.
	 * @return 통과시 true를 탈락시 false를 반환합니다.
	 */
	static boolean passOrFail(int avg, int... num) {
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		if (sum / num.length >= avg)
			return true;
		return false;
	}
}