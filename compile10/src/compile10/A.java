package compile10;

public class A {
	public void hello()throws TestException {
		B b = new B();
		try {
		b.hello();
		}catch(SampleException e) {
			throw new TestException("test");
		}
	}
}
