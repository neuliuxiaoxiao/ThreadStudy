package neu.com.ThreadStudy.part2.demo3;

public class Service {

	public void testMethod(Object lock){
		try {
			synchronized (lock) {
				System.out.println("begin wait");
				//lock.wait();
				Thread.sleep(40000);
				System.out.println("end wait");
			}
		} catch (Exception e) {
		}
	}
}
