import java.util.Scanner;

public class J565 {
	public static void main(String[] args) {
		int num;
		int[] tenDigit = new int[10];
		// 10의 자리가 0인것 부터 9인것까지 몇갠지 세어주는 배열입니다.
		// (선언 시 0으로 초기화되기에 증감연산자로 쉽게 추가할 수 있습니다.)
		
		Scanner sc = new Scanner(System.in);
		
		while((num = sc.nextInt()) != 0) {
			tenDigit[num/10]++;
		}
		// [풀이]
		// while(반복조건부)에 정수값을 입력받음과 동시에 변수에 저장합니다.(신기하죠?)
		// 입력 받은 숫자가 0이 아닐시, 10의자리 배열에 수를 추가하는데,
		// 특정숫자를 /10 을 할경우 몫으로 10의 자리가 나옵니다.
		// 따로 변수에 저장하는일 없이 바로 10의자리 배열에 1을 더해줍니다.
		
		sc.close();
		
		for(int i = 0, len = tenDigit.length; i < len; i++) {
			// for의 변수선언부에 타입만같다면 얼마든지 변수를 추가할 수 있습니다.
			// 조건부에 length를 쓴다면, 반복될때 마다 계산하기에 변수로 저장 후 합니다.
			if(tenDigit[i] != 0)
				System.out.println(i + " : " + tenDigit[i]);
		}
	}
}
