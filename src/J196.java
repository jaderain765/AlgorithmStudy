import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q196 {
	public static void main(String[] args) {
		// 클래스 배열을 만든다.
		People[] peo = new People[3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0, n = peo.length; i < n; i++) {
			peo[i] = new People(sc.next(), sc.next(), sc.next());
		}

		sc.close();

		// name객체로 비교하여 정렬한다.
		Arrays.sort(peo, new Comparator<People>() {
			@Override
			public int compare(People o1, People o2) {
				return o1.name.compareTo(o2.name);
			}
		});

		// [결과확인]
		// 정렬이 잘 됐는지 확인한다.
//		String print = Arrays.toString(peo);
//		System.out.println(print);

		// 답
		System.out.println(peo[0]);
		// toString을 오버라이딩 해뒀기에 바로 원하는 값이 나온다.
	}
}

class People {
	String name;
	String tel;
	String addr;

	// 캡슐화 생략

	People() {
	}

	People(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	@Override
	public String toString() {
		// 문제에서 제시한 출력문의 형태에 맞게 toString의 return값을 수정해준다.
		return String.format("name : %s\ntel : %s\naddr : %s\n", this.name, this.tel, this.addr);
	}
}
