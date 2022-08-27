
/**
 * 프로그렘 시간측정 클라스 입니다.
 * 
 * @author MASTER
 *
 */
public class Timelab {
	private long runTime;
	private long startTime;
	
	public Timelab() {
		startTime = System.nanoTime();
	}
	
	void start() {
		startTime = System.nanoTime();
	}
	
	long save() {
		runTime = System.nanoTime() - startTime;
		return runTime;
	}
	
	long time() {
		return runTime;
	}
	
	void cleer() {
		runTime = 0;
		startTime = 0;
	}
	
	void out() {
		System.out.printf("Runtime : %.3f ms\n", (double)save()/1000000);
	}
}





