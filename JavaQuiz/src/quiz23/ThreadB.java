package quiz23;

public class ThreadB implements Runnable {
//다운로드
	@Override
	public void run() {
		
		System.out.print("동영상 다운을 시작합니다:");
		//stringbuffer의 경우 싱글스레드에서 사용
		//멀티 스레드의 경우 builder 를 사용
		
		for(int i = 1; i <=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print("*");
			
		}
		System.out.println("\n동영상 다운이 끝났습니다");
		
		
	}

	
}
