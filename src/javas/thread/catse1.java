package javas.thread;

//  һ�������������̷߳���ͬһ������object�е����synchronized(this)ͬ�������ʱ��һ��ʱ����ֻ����һ���̵߳õ�ִ�С�
//��һ���̱߳���ȴ���ǰ�߳�ִ�������������Ժ����ִ�иô���顣

public class catse1 implements Runnable {
	int sleep =0;
	public synchronized void run() {
//         synchronized(this) {  
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
		}
//         }  
	}
	

	public catse1(int sleep) {
		super();
		this.sleep = sleep;
	}


	public static void main(String[] args) {
		catse1 t1 = new catse1(1000);
		Thread ta = new Thread(t1, "A");
		Thread tb = new Thread(t1, "B");
		ta.start();
		tb.start();
		
//		catse1 t1 = new catse1(500);
//		catse1 t2 = new catse1(1000);
//		Thread ta = new Thread(t1, "A");
//		Thread tb = new Thread(t2, "B");
//		ta.start();
//		tb.start();
	}
}