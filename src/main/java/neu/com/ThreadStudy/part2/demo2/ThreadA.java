package neu.com.ThreadStudy.part2.demo2;

public class ThreadA  extends Thread{

	private Object lock;
	public ThreadA(Object lock){
		super();
		this.lock=lock;
	}
	@Override
	public void run() {
		try {
			synchronized (lock) {
				if(MyList.size()!=5){
					System.out.println("wait start = "+System.currentTimeMillis());
						lock.wait();
					System.out.println("wait ebd = "+System.currentTimeMillis());
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
