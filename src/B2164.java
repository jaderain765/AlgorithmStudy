//import java.util.Scanner;
//
//public class B2164 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ans(sc.nextInt());
//		sc.close();
//		
//		
//		
//	}
//	static void ans(int n) {
//		
//		if(n == 1) {
//			System.out.println(1);
//			return;
//		}
//		
//		for(int i = 1, count=2; ; i*=2) {
//			for(int j = 1; j <= i; j++) {
//				if(count++ == n) {
//					System.out.println(2*j);
//					return;
//				}
////				System.out.print(2*j + " ");
//			}
////			System.out.println();
//		}
//	}
//}


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N == 1 || N == 2) {
			System.out.println(N);
			System.exit(0);
		}
		
		Queue<Integer> queue = new LinkedList<>();
		if(N % 2 == 1) {
			queue.offer(N);
		}
		for(int i = 2; i <= N; i+=2) queue.offer(i);
		
		int size = queue.size();

		while(size > 1) {
			queue.remove();
			size--;
			if(size == 1) {
				System.out.println(queue.peek());
				break;
			}
			queue.offer(queue.poll());
		}
	}
}