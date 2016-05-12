package First;

public class BasicThreads {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting for LiftOff");
	}

}
