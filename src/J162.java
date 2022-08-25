import java.util.Scanner;

public class J162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 클래스로 만들어서 객체지향적으로 짜봤습니다. ㅎㅎ
		Array162 arr = new Array162(sc.nextInt(), sc.nextInt());
		sc.close();
		
		// toString이 오버라이딩 되어있기에 객체명만 출력해도 잘나옵니다.
		System.out.println(arr);
	}
}

/**
 * 정올 162번문제 를 푸는 클래스입니다.
 */
class Array162 {
	// 접근제한 되어 있는 배열을 만듭니다.
	private int[] newArray;
	
	//public Array162() {} // 기본생성자는 사용하지않음
	
	/**
	 * 객체를 생성 후 배열을 만들고 시작값들을 추가시켜주는 생성자입니다.
	 * 
	 * @param startNum1	첫 번째값을 추가합니다.
	 * @param startNum2	두 번째값을 추가합니다. 
	 */
	public Array162(int startNum1, int startNum2) {
		this.newArray = new int[10];
		
		this.newArray[0] = startNum1;
		this.newArray[1] = startNum2;
		
		this.arrayMake();
	}
	
	/**
	 * 전전값과 전값을 더한후 10 나머지 연산하여 일의 자리만 추가 시켜주는 메소드 입니다. 
	 */
	private void arrayMake() {
		int num;
		for(int i = 2; i < 10; i++) {
			num = (this.newArray[i-2] + this.newArray[i-1]) % 10;
			this.newArray[i] = num;
		}
	}
	
	/**
	 *객체만 출력해도 바로 출력되도록 toString()을 오버라이딩 합니다.
	 */
	@Override
	public String toString() {
		String result = "";
		
		for(int i : this.newArray) {
			result += String.format("%d ", i);
		}
		
		return result.trim();
	}
}
