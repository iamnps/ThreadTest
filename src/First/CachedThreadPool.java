package First;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String[] args) {
		//�̳߳� �߳��������� 
		ExecutorService exec = Executors.newCachedThreadPool();
		
		//����ֻ��1���߳�
//		ExecutorService exec = Executors.newSingleThreadExecutor();
		
		//�޶���ֻ��5���߳�
//		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}

}