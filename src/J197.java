import java.util.Scanner;

// [풀이]
// 1. 우선 사각형 클래스를 만든다.
class Square {
	int x1;
	int y1;
	int x2;
	int y2;

	// 캡슐화 생략

	// Square() {}

	// 2. 기본생성자를 일부러 만들지 않아서 무.조.건. 좌표를 입력하게 만든다.
	Square(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// 3. 넓이를 구하는 메소드를 만든다.
	String sumSquare(Square sqr) {
		String result = "";

		// 두 사각형을 덮는 큰 사각형의 좌표를 구한다.
		// 왼쪽 아래는 두사각형의 왼쪽 아래 좌표중 가장 작은 값들이고,
		// 오른쪽 위는 두사각형의 오른쪽 위 좌표중 가장 큰 값이다.

		// Math.min, max는 괄호안의 수 중 작은값과 큰값을 비교해서 반환해준다.
		// double 타입으로 반환되기에 형변환을 해서 저장한다.
		result += (int) Math.min(this.x1, sqr.x1) + " ";
		result += (int) Math.min(this.y1, sqr.y1) + " ";
		result += (int) Math.max(this.x2, sqr.x2) + " ";
		result += (int) Math.max(this.y2, sqr.y2);
		// 코드로 표현하면 이렇게 된다.

		return result;
	}
}

public class Q197 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Square sqr1 = new Square(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		Square sqr2 = new Square(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		sc.close();

		// [출력문]
		System.out.println(sqr1.sumSquare(sqr2));
	}
}
