package neu.com.ThreadStudy.part3.demo3;

public class Run2 {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		C c1 = new C(myStack);
		C c2 = new C(myStack);
		C c3 = new C(myStack);
		C c4 = new C(myStack);
		C c5 = new C(myStack);
		P_Thread pT = new P_Thread(p);
		pT.start();
		C_Thread ct1=new C_Thread(c1);
		C_Thread ct2=new C_Thread(c2);
		C_Thread ct3=new C_Thread(c3);
		C_Thread ct4=new C_Thread(c4);
		C_Thread ct5=new C_Thread(c5);
		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();
		ct5.start();
	}
}
