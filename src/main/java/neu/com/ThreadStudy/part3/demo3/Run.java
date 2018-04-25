package neu.com.ThreadStudy.part3.demo3;

public class Run {

	public static void main(String[] args) {
		final MyStack myStack = new MyStack();
		
		
		new Thread(new Runnable() {
			P p = new P(myStack);
			public void run() {
				while (true) {
					p.pushService();
				}
			}
		}).start();
		new Thread(new Runnable() {
			C c = new C(myStack);
			public void run() {
				while (true) {
					c.popService();
				}
			}
		}).start();
	}
}
