package First;

public class MoreBasicThreads {
	public static void main(String[] args) {
		/**
		 * ��δ�������������˵���̹߳�ϵ��
		 * for��������5���̣߳�����ִ�е�˳��ȴ�ǽ����
		 * ����ÿ��ִ������Ľ�����ܻ᲻һ����������Ϊ�̵߳��ȵĽ��
		 */
		for (int i = 0; i < 5; i++) {
			new Thread(new LiftOff()).start();
		}
		System.out.println("Waiting for LiftOff!");
	}
}
