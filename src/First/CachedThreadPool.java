package First;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String[] args) {
		//线程池 线程数无限制 
		ExecutorService exec = Executors.newCachedThreadPool();
		
		//限制只有1个线程
//		ExecutorService exec = Executors.newSingleThreadExecutor();
		
		//限定了只有5个线程
//		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}

}
