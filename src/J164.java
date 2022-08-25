import java.util.Scanner;

public class J164 {
	public static void main(String[] args) {
		// 4개의 제기차기 점수를 받을 수 있는 클래스 배열을 만듭니다.
		Jegi[] jegi = new Jegi[4];
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0, n = jegi.length; i < n; i++) {
			System.out.print((i + 1) + "class? ");
			jegi[i] = new Jegi(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

		sc.close();

		Jegi.printAll(jegi);
	}
}

class Jegi {
	int score1;
	int score2;
	int score3;

	private int totalScore;

//	Jegi() {}

	/**
	 * 제기차기반의 객체의 점수를 입력받는 생성자입니다.
	 * 입력과 동시에 whatScore()메소드가 사용되며, 외부클래스에선 변경할 수 없는 총점에 저장이됩니다.
	 * 
	 * @param score1 첫번째 학생이 낸 점수입니다.
	 * @param score2 두번째 학생이 낸 점수입니다.
	 * @param score3 세번째 학생이 낸 점수입니다.
	 */
	Jegi(int score1, int score2, int score3) {
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;

		whatScore();
	}

	/**
	 * 제기차기의 점수를 합산해주는 메소드입니다.
	 * 접근제한자가 걸린 총점에 저장됩니다.
	 */
	private void whatScore() {
		totalScore += score1 + score2 + score3;
	}

	/**
	 * 클래스 배열로 생성된 모든 객체들의 총점을 출력해주는 메소드입니다.
	 * 
	 * @param jegi Jegi 클래스 배열을 매개변수로 받습니다.
	 */
	static void printAll(Jegi[] jegi) {
		int n = 1;
		for (Jegi j : jegi) {
			String out = String.format("%dclass : %d", n++, j.totalScore);
			System.out.println(out);
		}
	}
}
