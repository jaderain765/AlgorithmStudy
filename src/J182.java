import java.util.Scanner;

public class J182 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cha1 = sc.next().charAt(0);
		char cha2 = sc.next().charAt(0);
		sc.close();
		System.out.println(cha1+cha2+" "+(int)Math.abs(cha1-cha2));
	}
}
