package quiz23;

public class MainClass {

	
	public static void main(String[] args) {
		
		ThreadA v1 = new ThreadA();
		ThreadB d1 = new ThreadB();
		
		Thread thread1 = new Thread(v1);
		Thread thread2 = new Thread(d1);
		
		thread1.start();
		thread2.start();
		
		
		
	}
	
}
