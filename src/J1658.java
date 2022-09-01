import java.util.Scanner;

public class J1658 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new Solution_J1658(sc.nextInt(),sc.nextInt()));
		sc.close();
	}
}


// 장황하게 적어뒀지만, 결국 소인수분해입니다.
// 두수를 모두 나눠보는것보다, 인수를 구해서 출력하는것이 시간을 더 아낄 수 있습니다.
// 대신 아래의코드는 메모리를 숫자크기만큼 쓰기에 메모리오버의 가능성이 있습니다.
// 저는 계산하기 편하게 인덱스를 기준으로 만들었지만, list를 이용하면 메모리도 아끼면서 실행할 수 있습니다.
class Solution_J1658{
	int num1;
	int num2;
	
	int[] arr1;
	int[] arr2;
	
	int max; //두 수중 더큰수를 기준으로 배열을 만들고, 인수들을 저장한다.그때 사용할 max 값이다.
	
	private int commonMultiple; //공약수
	private int commonFactor;	//공배수
	
	public Solution_J1658(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		//숫자 num을 만들기 위한 인수들의 갯수를 저장한다.
		max = Math.max(num1, num2);
		
		arr1 = new int[max+1];
		arr2 = new int[max+1];
		
		divisor(arr1, num1);
		divisor(arr2, num2);
		
		setCommonMultiple();
		setCommonFoctor();
	}
	
	void divisor(int[] arr, int num) {
		int i = 2;
		
		while(num != 1) {
			if (num % i == 0) {
				arr[i]++;
				num /= i;
			}
			else {
				i++;
			}
		}
//		System.out.println(java.util.Arrays.toString(arr));
	}
	
	//공배수 구하는 방법
	void setCommonMultiple() {
		int result = 1;
		
		for(int i = 1; i <= max; i++) {
			if(arr1[i] == 0 && arr2[i] == 0) //둘다 0일경우 pass
				continue;
			result *= Math.pow(i, Math.max(arr1[i], arr2[i]));
		}
		
		commonMultiple = result;
	}
	
	// 공약수 구하는 방법
	void setCommonFoctor() {
		int result = 1;

		for(int i = 1; i <= max; i++) {
			if(arr1[i] == 0 || arr2[i] == 0) //둘중하나라도 0일경우 pass
				continue;
			result *= Math.pow(i, Math.min(arr1[i], arr2[i]));
		}
		commonFactor = result;
	}
	
	@Override
	public String toString() {
		return commonFactor + "\n" + commonMultiple;
	}
}
