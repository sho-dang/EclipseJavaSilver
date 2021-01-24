
public interface InterfaceA {
	/*
	 * JavaSE8から、インターフェイスに処理内容を記述する場合、defaultをつければ
	 * 処理内容を実装したメソッドをそのまま使用できる。
	 * defaultは継承元であるスーパークラスのみが定義できる（継承したサブクラスである実現クラスでデフォルトとして持つべき処理）
	 */
	default void sample(){
		//return "A";
		System.out.println("sample");
	}
}
