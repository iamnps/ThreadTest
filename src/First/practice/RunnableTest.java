package First.practice;

public class RunnableTest implements Runnable{
	
	private static int j = 0;
	private final int temp = j++;
	
	public RunnableTest(){
		System.out.println(temp + "runMethod is start");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();//有了这段代码，会使你的输出变得非常不一样
			System.out.println(temp + "runMethod" + i);
		}
	}

}
