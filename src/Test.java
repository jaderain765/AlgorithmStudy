
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}


class Brmake{
	private String str;
	
	private Brmake() {}
	
	private static Brmake brstr = new Brmake();
	
	public static void inputStr(String input) {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		this.str = br.readLine();
		
		
	}
	
}