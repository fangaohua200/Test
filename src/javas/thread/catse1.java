package javas.thread;

//  一、当两个并发线程访问同一个对象object中的这个synchronized(this)同步代码块时，一个时间内只能有一个线程得到执行。
//另一个线程必须等待当前线程执行完这个代码块以后才能执行该代码块。

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