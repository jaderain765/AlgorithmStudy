import java.util.Scanner;

public class Q1840 {
	public static void main(String[] args) {
		// 변수선언부
		int n;
		int m;
		int[][] cheese;
		boolean[][] visit;

		// 출력할 치즈 시간 겟수
		int timeResult = 0;
		int cheeseResult = 0;

		// 입력부
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		cheese = new int[n][m];
		visit = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				cheese[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// 치즈 배열에 치즈가 있을 경우 치즈채크실시
		int temp = cheeseCount(cheese);
		;
		// 우선 임시변수에 치즈가 있는지 확인후 1개이상 있을 때 반복해서 치즈를 지워나간다.
		while (temp > 0) {
			// 치즈의 모습이 어떻게 변하는지 보여주는 메서드다.
//			printCheese(timeResult, cheese);
			// 치즈의 모양이 궁금할시 출력해본다.

			timeResult++; // 몇번 진행되는지 카운트하는 변수다.
			cheeseResult = temp; // 마지막에 치즈가 얼마나 남아있는지 확인하는 변수다.

			visit = new boolean[n][m];
			// 방문 확인용 불린 배열을 초기화 해줘야 한다.
			check_cheese(0, 0, cheese, visit);

			temp = cheeseCount(cheese);
		}

		// 출력부
		System.out.println(timeResult);
		System.out.println(cheeseResult);
	}

	// 치즈 채크 계산 메서드
	static void check_cheese(int x, int y, int[][] cheese, boolean[][] visit) {
		// 이미 갔던곳일 경우 pass
		if (visit[x][y])
			return;
		// 현제 좌표 x,y를 방문함으로 변경
		visit[x][y] = true;

		// 주변을 탐색해서 치즈일 경우 공기로 변경
		// 윗쪽탐색
		if (x - 1 >= 0) {
			airMeetCheese(x - 1, y, cheese, visit);
		}
		// 아랫쪽탐색
		if (x + 1 < cheese.length) {
			airMeetCheese(x + 1, y, cheese, visit);
		}
		// 왼쪽탐색
		if (y - 1 >= 0) {
			airMeetCheese(x, y - 1, cheese, visit);
		}
		// 오른쪽탐색
		if (y + 1 < cheese[0].length) {
			airMeetCheese(x, y + 1, cheese, visit);
		}
		// [중요]
		// 위치를 미리 계산하고 들어가야 배열 초과오류가 나지않는다.
	}

	// 치즈에 얼마나 남아있는지 확인 하는 메서드
	static int cheeseCount(int[][] arr) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1)
					result++;
			}
		}

		return result;
	}

	// 치즈배열 그림을 그려주는 메서드다.
	static void printCheese(int n, int[][] arr) {
		System.out.println(n + 1 + " 회차 진행중...");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0)
					System.out.print("□ ");
				else
					System.out.print("■ ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void airMeetCheese(int x, int y, int[][] cheese, boolean[][] visit) {
		// 치츠가 있을 경우
		if (cheese[x][y] == 1) {
			cheese[x][y] = 0;
			visit[x][y] = true;
		}
		// 치즈가 없을 경우
		else {
			// 방문 하지 않았을경운 방문한다.
			if (!visit[x][y])
				check_cheese(x, y, cheese, visit);
		}
	}
}
