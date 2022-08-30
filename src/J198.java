import java.util.Scanner;

public class J198 {
	public static void main(String[] args) {
		// 입력부
		Scanner sc = new Scanner(System.in);
		int fh = sc.nextInt();
		float fw = sc.nextFloat();
		int mh = sc.nextInt();
		float mw = sc.nextFloat();
		sc.close();

		J198_Solution me = new J198_Solution(fh, fw, mh, mw);

		// toString 오버라이딩 입니다.^^
		System.out.println(me);
	}
}

class J198_Solution {
	private int fatherHeight;
	private int motherHeight;

	private float fatherWeight;
	private float motherWeight;

	private int myHeight;
	private float myWeight;

	// public J198_Solution() {}
	// 기본 생성자는 일부러 사용하지 않았습니다.
	// 아래의 생정자를 무조건 사용하게 하기 위함입니다.

	/**
	 * 오직 이 생성자를 이용해서 값을 셋팅할 수 있습니다. 캡슐화가 귀찮아서가 아니라, 아래의 생성자를 이용하면 바로 값이 나오게 하기
	 * 위함입니다. 이 생성자와 toString 이외엔 모두 private하게하여 값을 변경할 수 없게하고, 입력받은 값이 없으면 계산하는
	 * 메소드를 동작시킬 수 없게 합니다.
	 * 
	 * @param fatherH 아버지 키
	 * @param fatherW 아버지 몸무게
	 * @param motherH 어머니 키
	 * @param motherW 어머니 몸무게
	 */
	public J198_Solution(int fatherH, float fatherW, int motherH, float motherW) {
		fatherHeight = fatherH;
		fatherWeight = fatherW;
		motherHeight = motherH;
		motherWeight = motherW;

		myInformation();
	}

	/**
	 * 학생의 몸무게와 키를 계산하는 부분은 메소드화 해서 생성자 안에 넣습니다. 접근제한을 두는 이유는 기본 생성자를 못쓰게 함으로서 무조건
	 * 어머니 아버지의 정보를 입력하게 하고, 필드값이 무조건 있을경우에만, 값을 계산하게 하는 겁니다.
	 */
	private void myInformation() {
		myHeight = (fatherHeight + motherHeight) / 2;
		myWeight = (fatherWeight + motherWeight) / 2;
		// 소수점 반올림
		myWeight = ((float) Math.round(myWeight * 10) / 10);

		myHeight += 5;
		myWeight -= 4.5;
	}

	@Override
	public String toString() {
		String result;

		result = "height : " + myHeight + "cm\n";
		result += "weight : " + myWeight + "kg";

		return result;
	}
}
