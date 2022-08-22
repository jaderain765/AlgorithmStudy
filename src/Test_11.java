import java.util.Scanner;

public class Test_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 좌표을 입력하세요(예: 0 0 1 2 10 15)");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		System.out.printf("무게 중심: (%.1f, %.1f)\n",(x1+x2+x3)/3.0,(y1+y2+y3)/3.0);
		
		sc.close();
	}

}
