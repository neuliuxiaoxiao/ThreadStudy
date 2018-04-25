package neu.com.ThreadStudy.part2.demo3;

public class Test {

	public static void main(String[] args) {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		ThreadB b = new ThreadB(lock);
		b.start();
	}
}
