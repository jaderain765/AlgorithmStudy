import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1920 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 변수 선언 및 입력부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
		int N = Integer.parseInt(br.readLine()); // (1 <= N <= 100,000)

		int[] arr_N = new int[N];
		int i = 0;
		for(String s : br.readLine().split(" ")) {
			arr_N[i++] = Integer.parseInt(s);
		}

		int M = Integer.parseInt(br.readLine()); // (1 <= M <= 100,000)
		int[] arr_M = new int[M];
		i = 0;
		for(String s : br.readLine().split(" ")) {
			arr_M[i++] = Integer.parseInt(s);
		}
		

		java.util.Arrays.sort(arr_N);

		int mid, start, end;

		for (int findNum : arr_M) {
			start = 0;
			end = arr_N.length - 1; // -1을 해주는 이유는 index 오버 할수 있기때문
			while (true) {
				mid = (end + start) / 2;
				
				if (arr_N[mid] == findNum) {
					bw.write("1");
					break;
				}
				
				if (arr_N[mid] > findNum)
					end = mid - 1;
				else
					start = mid + 1;

				if (end < start) {
					bw.write("0");
					break;
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
