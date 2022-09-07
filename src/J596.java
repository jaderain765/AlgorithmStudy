import java.util.Scanner;


public class J596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();
		
		if(num < str.length())
			str = str.substring(str.length()-num,str.length());
		
		System.out.println(new StringBuilder(str).reverse());
	}

}
