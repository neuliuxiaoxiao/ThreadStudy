package neu.com.ThreadStudy.part2.demo2;

public class Run {

	public static void main(String[] args) {
		try {
			Object lock = new Object();
			ThreadA a = new ThreadA(lock);
			a.start();
			Thread.sleep(50);
			ThreadB b = new ThreadB(lock);
			b.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
