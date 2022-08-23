import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[9];
		
		int max = -1, num;
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			if(max < num) max = num;
			arr[i] = "" + num;
		} 
		
		sc.close();
		
		System.out.println(max);
		System.out.println(java.util.Arrays.asList(arr).indexOf(""+max));
	}

}
