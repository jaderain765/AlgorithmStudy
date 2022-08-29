import java.util.Scanner;

public class J135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new J135_Solution(sc.nextInt(), sc.nextInt()));
		// 솔루션을 클래스로 만들고, 생성자에서 입력값을 받게한 후 toString을 오버라이딩해서 별도의 인스턴스 생성없이 출력문을 만들었습니다.
		sc.close();
	}
}

/**
 * 정올 135번 반복제어문2-형성평가6번 문제를 해결하기 위한 클래스입니다. 필드값으로 합계와 평균을 저장하며, toString을 오버라이딩
 * 했기에 인스턴스를 출력하면 알아서 답으로 나옵니다.
 */
class J135_Solution {
	int sum;
	float avg;

//	public J135_Solution() {}

	/**
	 * 기본 생성자를 쓰지 않고, 바로 값을 받은 후 합계와 평균을 구하는 메소드에 값을 전달한다.
	 * 
	 * @param startNum 시작값을 입력한다.
	 * @param endNum   끝값을 입력한다.
	 */
	public J135_Solution(int startNum, int endNum) {
		sumAndAvg(startNum, endNum);
	}

	/**
	 * 3의 배수나 5의 배수가 나올경우, sum에 합쳐주고 다합치고 나면, avg에 count해둔 수 만큼 나눠준 저장한다.
	 * 
	 * @param startNum 시작값
	 * @param endNum   끝값
	 */
	void sumAndAvg(int startNum, int endNum) {
		// 시작값이 더클경운 바꿔줘야한다.
		if (startNum > endNum) {
			// 신박한 스왑방법;;
			endNum = swap(startNum, startNum = endNum);
		}

		int count = 0;
		sum = 0;

		for (int i = startNum; i <= endNum; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				count++;
				sum += i;
			}
		}
		avg = (float) sum / count;
	}
	
	static int swap(int a, int b) {
		return a;
	}

	@Override
	public String toString() {
		// 포멧문을 사용하고 싶을 경우 String 내부 메소드를 이용하여 만듭니다.
		return String.format("sum : %d\navg : %.1f", sum, avg);
	}
}
