package neu.com.ThreadStudy.part2.demo1;

public class MyThread1 extends Thread{

	private Object lock;
	public MyThread1(Object lock){
		super();
		this.lock=lock;
	}
	public void run(){
		synchronized (lock) {
			try {
				System.out.println("开始  wait time ="+System.currentTimeMillis());
				lock.wait();
				System.out.println("结束 wait time ="+System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
