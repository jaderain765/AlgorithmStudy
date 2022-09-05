import java.util.Scanner;

public class M001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 면의 갯수
		int B = sc.nextInt(); // 주사위의 갯수
		sc.close();

		int[] dice = new int[B]; // 주사위의 갯수만큼 배열 선언

		// M & N 문제입니다.

		solution(dice, A, 0); // {0,0,0}
	}

	static void solution(int[] dice, int A, int index) {

		// 1회 재귀될때 해당 인덱스의 값이 커집니다.
		dice[index]++;

		if (index != dice.length - 1) { // 출력할 값이 모자른 경우
			solution(dice, A, index + 1);
		} else {	// 출력할 값이 가득 찬경우
			System.out.println(java.util.Arrays.toString(dice));
		}
		
		// 만약 해당 인덱스의 끝에 도달했을 경우 해당인덱스를 최기화 후 return 종료한다.
		// 각트리의 끝에 도달할 경우 다음케이스로 넘어가며, 모든케이스를 검증 후 종료 되는 것이다.
		if (dice[index] == A) {
			dice[index] = 0;
			return;
		}
		
		// 아직 출력할 인덱스가 있을 경우 다시 재귀한다.
		solution(dice, A, index);
	}
}
