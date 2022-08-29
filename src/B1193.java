import java.util.Scanner;

public class B1193 {
	public static void main(String[] args) {
		// 두가지 방법으로 풀었습니다.
		Scanner sc = new Scanner(System.in);
		System.out.println(solution2(sc.nextInt()));
		sc.close();

	}
	// 문제 분류룰 보면, (수학,구현)으로 되어있다. 배열을 이용해야하는것 처럼보이나
	// 문제에서 최댓값으로 주어지는 10,000,000을 넣기에는 리소스낭비가 심하니 계산해버리는것이 좋다.

	// [방법1]
	/**
	 * num 번째 배열의 값을 구하는 메소드다. 단순하게 어느 한쪽값이 1일될때 까지 감소,증가 하며 문제에 맞게 값을 출력시키는 프로그렘이다.
	 * 
	 * @param num 구하고자하는 번째의 수를 입력한다.
	 * @return
	 */
	static String solution1(int num) {
		int[] arr = new int[] { 1, 1 };
		int count = 1;

		while (count != num) {
			if (arr[0] == 1) {
				arr[1]++;
				count++;
				if (count == num)
					break;
//				System.out.println(java.util.Arrays.toString(arr));
				while (arr[1] != 1) {
					arr[0]++;
					arr[1]--;
					count++;
					if (count == num)
						break;
//					System.out.println(java.util.Arrays.toString(arr));
				}
			} else {
				arr[0]++;
				count++;
				if (count == num)
					break;
//				System.out.println(java.util.Arrays.toString(arr));
				while (arr[0] != 1) {
					arr[0]--;
					arr[1]++;
					count++;
					if (count == num)
						break;
//					System.out.println(java.util.Arrays.toString(arr));
				}
			}
		}
		return String.format("%d/%d", arr[0], arr[1]);
	}

	// [방법2]
	/**
	 * 방법1은 1/1부터 증가 감소 시키며 처음부터, 모든 값을 만들어 보는 방법이었다면, 이번엔 원하는 값이 몇번째 열에 있는지 구한후,
	 * 원하는 값을 계산해 버리는 방식이다. 이방식은 i열에 최소값, 최대값을 구해버린후, 원하는 위치의 값을 출력하는 메소드다.
	 * 
	 * @param num 1과 마찬가지로, 원하는 번째의 위치를 입력한다.
	 * @return
	 */
	static String solution2(int num) {

		if (num == 1)
			return "1/1";

		int n = 1, m = 1; // n은 최소값 , m은 최댓값을 갖는다.
		int i = 1;

		// 원하는 값이 몇번째 열에 있는지 구하는 반복문이다. 무엇을 구하는지 궁금할 시, 아래의 print문을 주석해제하면 알 수 있다.
		while (true) {
			n = m + 1;
			m += ++i;
//			System.out.println(i + "번째열에 있으며, 최소:" + n + " / 최대:" + m + "사이에 있다.");
			if (m >= num)
				break;
		}

		if (i % 2 == 0) {
			return 1 + (num - n) + "/" + (i - (num - n));
		} else {
			return (i - (num - n)) + "/" + (1 + (num - n));
		}
	}
}
