
public interface InterfaceA {
	/*
	 * JavaSE8から、インターフェイスに処理内容を記述する場合、defaultをつければ
	 * 処理内容を実装したメソッドをそのまま使用できる。
	 */
	default void sample() {
		//return "A";
		System.out.println("sample");
	}
}
