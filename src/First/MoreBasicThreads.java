package First;

public class MoreBasicThreads {
	public static void main(String[] args) {
		/**
		 * 这段代码的输出是最能说明线程关系的
		 * for里面会出现5个线程，但是执行的顺序却是交叉的
		 * 而且每次执行输出的结果可能会不一样，这是因为线程调度的结果
		 */
		for (int i = 0; i < 5; i++) {
			new Thread(new LiftOff()).start();
		}
		System.out.println("Waiting for LiftOff!");
	}
}
