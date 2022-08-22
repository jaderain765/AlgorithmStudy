import java.util.Scanner;

public class Q1303 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int num = 1;
		
		for(int i = 0; i < n1; i++) {
			for(int j = 0; j < n2; j++) {
				//num이 ++로 1씩 커지면서 출력된다. 
				System.out.print((num++) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
