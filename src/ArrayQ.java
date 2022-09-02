
public class ArrayQ {

	public static void main(String[] args) {
		//배열이란?
		
		int num = 0; //그냥 숫자
		
		int[] arr = new int[5]; // 크기지정
		//arr = { 0, 0, 0, 0, 0};
		//크기 만큼 숫자 삽입 할 수 있는 연속적인 공간
		
		int[][] arr2 = new int[5][5]; 
		//arr2 = 
		//{{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		// { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		// { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		// { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		// { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}} 값이 아닌 배열을 평면봐표에 넣는 공간 행렬과 비슷한 개념이다.
		
		
		//배열을 출력할 때
		// arr의 값은 0~4 임으로 이런식으로 반복
//		for(int i = 0; i < arr.length; i++) // i = 0~4
//			System.out.println(arr[i]);
		//0이 차례대로나온다.
		
		//이중 배열 출력할때
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
