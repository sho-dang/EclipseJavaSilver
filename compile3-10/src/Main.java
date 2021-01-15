
public class Main {

	public static void main(String[] args) {
		Object a = new Sample(10);
		Object b = new Sample(10);
		//デフォルトのequalsメソッドが使用されている
		System.out.println(a.equals(b));
	}

}
