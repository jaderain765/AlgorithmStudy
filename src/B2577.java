import java.util.Scanner;

public class B2577 {
	public static void main(String[] args) {
		//변수 선언 및 입력부
		int num, count;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 이문제 처럼 따로 값을 저장할 필요가 없을 경운, 아래의 문장처럼 하나로 합칠 수 있다.
		// num = sc.nextInt()*sc.nextInt()*sc.nextInt();
		// 코드를 간결하고, 메모리 낭비를 소소하게(12byte) 막아주지만, 가독성이 떯어진다.
		sc.close();
		
		count = 0;
		num = a*b*c;
		// 문제에서 각수는 1000보다 작다고 명시되어 있기에 세수를 곱했을 때
		// 1,000,000,000 보다 클리없음으로 안심하고 int(약 21억)를 써도 된다.
		
		
		
		// 방법1
		// 문자열로 바꿔서 출력 하는 방법
		String strNum = ""+num;
		
		// cha에 '0'부터 '9'까지 들어가며, '0'부터 탐색하면된다.
		for(char cha = '0'; cha <= '9'; cha++) {
			for(int i = 0; i < strNum.length(); i++) {
				if(strNum.charAt(i) == cha) count++;
			}
			System.out.println(count); // 숫자i를 새고 출력한다.
			count = 0; //출력후 초기화해서 다음 수를 새로저장한다.
		}
		
		// 방법2 (이게 압도적으로 빠릅니다.)
		// 배열에 저장해서 출력하는법
		int[] arr = new int[10];
		while (num != 0) {
			arr[num%10]++;
			num /= 10;
			// 10으로 나머지 계산을 하면 일의자리가 반환됩니다. 그다음,
			// 10으로 나눠주면 일의자리가 없어지고 다음자리인 십의자리가 반환됩니다.
			// 이를 무한반복하면 언젠가 0이 되는데, 이때 while 조건으로 인해 끝납니다.
		}
		for(int i : arr)
			System.out.println(i);
		
		// 출력 시 둘중 하나를 주석처리후 출력합니다.
	}
}
