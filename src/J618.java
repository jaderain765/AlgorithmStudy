import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q618 {
	public static void main(String[] args) {
		// Prople 클라스로 이름,키,몸무게를 만든다.
		People[] peo = new People[5];

		// 클래스 배열을 만들어 반복문으로 저장할 것이다.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			peo[i] = new People(sc.next(), sc.nextInt(), sc.nextDouble());
		}
		sc.close();

		// [방법 1] : compareTo를 이용하는방법
		System.out.println("name");
		Arrays.sort(peo, new Comparator<People>() {
			@Override
			public int compare(People o1, People o2) {
				return o1.name.compareTo(o2.name);
			}
		});

		for (int i = 0; i < 5; i++) {
			// 반복문을 돌려 결과을 확인하나,
			// 출력문을 간단하게 위해 toString을 오버라이딩 해야한다.
			System.out.println(peo[i].toString());
		}

		// [방법 2] : compare을 이용하는방법
		System.out.println("\nweight");
		Arrays.sort(peo, new Comparator<People>() {
			@Override
			public int compare(People o1, People o2) {
				// 역순정렬이기에 o2, o1순서로 비교했다.
				return (int) (o2.weight * 10) - (int) (o1.weight * 10);
				// compare은 음수, 0 , 양수에 따라 정렬 결과가 달라진다.
				// double 같은 경우는 int로 바꿔서 비교하거나, 조건문으로 비교해서 음수나 양수를 return하면 된다.
			}
		});

		for (int i = 0; i < 5; i++) {
			System.out.println(peo[i].toString());
		}
	}
}

//class People {
//	String name;
//	int height;
//	double weight;
//
//	public People() {
//	}
//
//	public People(String name, int height, double weight) {
//		this.name = name;
//		this.height = height;
//		this.weight = weight;
//	}
//
//	// toString을 오버라이딩 해서 결과 확인을 용이하게한다.
//	@Override
//	public String toString() {
//		return String.format("%s %d %.1f", this.name, this.height, this.weight);
//	}
//}
