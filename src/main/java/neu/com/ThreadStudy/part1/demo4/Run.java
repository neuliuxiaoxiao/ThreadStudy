package neu.com.ThreadStudy.part1.demo4;


public class Run {

	public static void main(String[] args) {
		Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		System.out.println("���н���!");
	}

}
