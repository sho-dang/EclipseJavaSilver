package override;

public class B extends A{

	public void test() {
		super.test();//前処理を追加できる
		System.out.println("B");
	}
}
