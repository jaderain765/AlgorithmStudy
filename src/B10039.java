import java.util.Scanner;

public class B10039 {
	public static void main(String[] args) {
		//변수 선언부
		int sum = 0;
		//입력부
		Scanner sc = new Scanner(System.in);
		//for(변수선언; 반복조건; 반복시 변화)중에 변수선언부에 score를 함께 선언해서 반복문안에서만 사용한다.
		for (int i = 0, score; i < 5; i++) {
			score = sc.nextInt();
			if(score < 40) score = 40;
			sum += score;
		}
		
		sc.close();
		//평균을 구할 때 double 값이 될 일은 없다고 문제에서 선언되었다.
		System.out.println(sum/5);
	}
}
