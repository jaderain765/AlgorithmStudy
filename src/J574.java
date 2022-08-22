import java.util.Scanner;
import java.util.TreeSet;

public class Q574 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result;

		// [풀이1]을 이용한 풀이
		result = max(sc.nextInt(), sc.nextInt(), sc.nextInt());

		// [풀이2]를 이용한 풀이 (갯수에 제한없이 최댓값을 구하는 방법)
//		result = max2(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		sc.close();

		System.out.println(result);
	}

	// [풀이1]
	// 1번째수와 2번째수를 비교해서 큰수를 찾은다음, 3번째수랑 비교해서 큰걸 출력하면 된다.
	static int max(int n1, int n2, int n3) {
		if (n1 < n2) {
			if (n2 < n3)
				return n3;
			else // n2 > n3
				return n2;
		} else { // n1> n2
			if (n1 < n3)
				return n3;
			else // n1 > n3
				return n1;
		}
		//만약 모든 값이 같을 경운 n1이 출력되나, 상관없다(같기때문에)
	}

	// [풀이2]
	// 이번문제는 갯수가 적어 직접비교하나 이 이상으로 늘어나면
	// Collection 객체를 이용하여 구하는게 쉽다.
	// (예) TreeSet에 넣으면 알아서 정렬이된다.
	static int max2(int... n) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i : n) {
			ts.add(i);
		}
		return ts.last();
	}
}
