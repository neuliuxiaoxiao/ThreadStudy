package neu.com.ThreadStudy.part1.demo1;

public class Run {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		mythread.start();
		System.out.println("运行结束");
	}

}
