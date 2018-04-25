package neu.com.ThreadStudy.part1.demo3;

public class MyThread extends Thread {

	private int i;

	public MyThread(int i) {
		super();
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i);
	}

}
