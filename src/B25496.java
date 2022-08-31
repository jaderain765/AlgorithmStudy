import java.util.Arrays;
import java.util.Scanner;

public class B25496 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firo = sc.nextInt();// 현제 피로도
		
		// 이거 때문에 틀립니다. 피로도가 200이상인 상태로 시작할경우 0을 출력하고 프로그렘을 강제 종료합니다.
		if(firo >= 200) {
			System.out.println(0);
			System.exit(0); //안정적(예외나 에러를 배출하지않고)으로 프로그렘을 종료
		}
		
		int num = sc.nextInt();	// 만들 갯수
		
		int arr[] = new int[num]; // 만들고 싶은 장신구들의 피로도 저장
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int count = 0; //만든 장신구 갯수 카운트
		
		
		// 정렬을 해서 피로도가 낮은것 부터 만들어서 최대한 많은 장신구를 만들다가 피로도를 오버할경우 break
		Arrays.sort(arr); //[1 1 8 10 20]
		
		for(int i : arr) {
			firo += i; // 191 192 200
			count++;
			if(firo >= 200) break;
		}
		
		System.out.println(count);
	}

}
