package First.practice;

public class MainThreadTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new RunnableTest()).start();
		}
		System.out.println("run is over");
	}
}
