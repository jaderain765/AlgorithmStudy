import java.util.Scanner;
import java.util.Stack;

public class J602 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++)
			stack.push(sc.next());
		sc.close();
		
		for(int i = 0; i < 5; i++)
			System.out.println(stack.pop());
		
		// [풀이]
		// 그냥 스택을 이용한 풀이입니다.
		// 쌓아둔 기록들을 역순으로 출력하기에 "뒤로가기"같은 기능에 주로 사용됩니다.
	}
}
