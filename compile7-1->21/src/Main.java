
public class Main {

	public static void main(String[] args) {
		String title ="-----  a  -----";

		 //7-1
		System.out.println(title.replace("a","7-1"));

		Child child = new Child();
		child.hello();

		//7-4
		System.out.println(title.replace("a","7-4"));

		InterfaceB bb = new InterfaceB();
		bb.sample();

		//7-6
		System.out.println(title.replace("a","7-6"));
		InterfaceC cc = new InterfaceC();
		cc.sample();
	}

}
