import java.util.Scanner;

public class Q186 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.next().length();
		int num2 = sc.next().length();
		sc.close();
		
		//[풀이]
		//결국 문제에서 묻는 것은 문자가 아닌 문자의 개수니까
		//처음부터 next()를 받아서 int로 저장한다.
		
		if(num1 > num2) System.out.println(num1);
		else System.out.println(num2);
	}
}
