import java.util.Scanner;

public class B1149 {/*백준 1149*/
	public static void main(String[] args) {
		// 변수선언 및 입력부
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] RGB = new int[N][];
		int red, green, blue;
		for (int i = 0; i < N; i++) {
			red = sc.nextInt();
			green = sc.nextInt();
			blue = sc.nextInt();

			RGB[i] = new int[] { red, green, blue };
		}
		sc.close();
		System.out.println("입력된 배열 확인용 출력문");
		System.out.println(java.util.Arrays.deepToString(RGB).replace("], [", "]\n["));
		
		// 풀이
		// Main 메서드에 풀고, 답이 나올경우 그대로 옮겨서 메소드로 만듭니다.
		// 일반적인 풀이에서 매개변수는 입력받은 변수를 그대로 넣어주면 식을 전혀고치지 않고 사용할 수 있습니다.
		// 메소드로 만드는 이유는 다른 풀이가 생각날경우 다른방법으로도 풀기 위해섭니다.(다른 풀이가 생각난다면 말이죠...)
		
		solution1(N, RGB); //DP풀이
		// 메모리 16756KB 시간 172ms
		solution2(new int[3], RGB, 0); //재귀풀이
		// 메모리 18308KB 시간 188ms	
	}

	// 접근제한자를 둬서 다른 클래스에서 불러지는 것을 막습니다.
	private static void solution1(int N, int[][] RGB) {
		int[][] DP = new int[N][3];
		for (int i = 0; i < DP.length; i++) {
			for (int j = 0; j < 3; j++) {
				// 처음 케이스의 경우 그냥 RGB 값을 받아온다.
				if (i == 0) {
					DP[i][j] = RGB[i][j];
					continue;
				}
				// 이전 값이 있을경우(i >= 1)
				// 기존의 최적값(min)을 더해가면서 반복한다.
				if (j == 0) {
					DP[i][0] = Math.min(DP[i - 1][1], DP[i - 1][2]) + RGB[i][0];
				} else if (j == 1) {
					DP[i][1] = Math.min(DP[i - 1][0], DP[i - 1][2]) + RGB[i][1];
				} else if (j == 2) {
					DP[i][2] = Math.min(DP[i - 1][0], DP[i - 1][1]) + RGB[i][2];
				}
			}
		}
		// 완성된 배열안에서 마지막 값(N-1)중에 최소값이 정답이다.
		System.out.println("\nDP배열 확인문 (마지막 배열값이 최적해로 구해져있는것을 볼 수 있다.)");
		System.out.println(java.util.Arrays.deepToString(DP).replace("], [", "]\n["));

		System.out.print("\n답 : "); // 마지막 인덱스에서 최솟값출력
		System.out.println(Math.min(DP[N - 1][0], Math.min(DP[N - 1][1], DP[N - 1][2])));
	}
	
	private static void solution2(int[] arr, int[][] RGB, int index) {
		int[] lastArr = arr.clone(); //기존의 배열값을 복사해둔다.(Arrays.copyOf()를 사용해도 된다.)
		// 배열의 값 복사는 무.조.건. 메소드를 사용해야한다.('=' 을 사용할 경우 주소를 복사한다.)
		
		for(int i = 0; i < 3; i++) {
			if(index == 0) {
				arr[i] = RGB[index][i];
				continue;
			}
			// 기존의 배열값을 조회하여 위치(i)가 겹치지 않는 최소 값을 구하고, 현제위치의 값을 더한다.
			if(i == 0) {
				arr[0] = Math.min(lastArr[1], lastArr[2]) + RGB[index][0];
			}
			else if(i == 1) {
				arr[1] = Math.min(lastArr[0], lastArr[2]) + RGB[index][1];
			}
			else if(i == 2) {
				arr[2] = Math.min(lastArr[0], lastArr[1]) + RGB[index][2];
			}
		}
		
		// ** 종료조건 **
		// 재귀문은 루프에 빠지지않게 종료조건을 고려하며 작성해야한다.
		if(++index == RGB.length) {
			// index를 늘이며, 배열의 길이값과 같아졌을때 답을 출력하고 끝낸다.
			System.out.println(Math.min(arr[0], Math.min(arr[1], arr[2])));
			return;
		}
		
		// 위의 종료조건을 만족하지 않으면, 종료조건을 만족할때 까지 재귀한다.
		solution2(arr, RGB, index);
	}
}
