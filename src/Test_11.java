import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test_11 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		
		// bw.write("출력문장"); // 출력
		// bw.newLine(); //줄바꿈이나, \n을 사용하는것이 좋다.
		// bw.flush(); // 남아있는 데이터를 모두출력 시킴
		// bw.close(); 스트림을 닫음
		// br.readLine();으로 입력받음
	}

}
