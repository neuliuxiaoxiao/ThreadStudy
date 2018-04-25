package neu.com.ThreadStudy.part3.demo3;

public class C {

	private MyStack myStack;
	public C(MyStack myStack){
		super();
		this.myStack=myStack;
	}
	public void popService(){
		System.out.println("pop="+myStack.pop());
	}
}
