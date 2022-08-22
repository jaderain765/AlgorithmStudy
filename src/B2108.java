import java.util.Scanner;

public class B2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[sc.nextInt()];
		int sum = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
			sum += numArr[i];
		}
		
		sc.close();
		
		java.util.Arrays.sort(numArr);
		
		//산술평균
		System.out.printf("%.0f\n",(float)sum/numArr.length);
		//중앙값
		System.out.println(numArr[numArr.length/2]);
		
		//범위
		System.out.println(numArr[numArr.length-1] - numArr[0]);
	}
}
