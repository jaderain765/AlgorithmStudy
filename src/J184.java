public class J184 {
	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		for(int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z' || 'a' <= str.charAt(i) && str.charAt(i) <= 'z' || '0' <= str.charAt(i) && str.charAt(i) <= '9')
				System.out.print((str.charAt(i)+"").toLowerCase());
		}
	}
}