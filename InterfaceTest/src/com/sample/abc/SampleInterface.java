package com.sample.abc;


public interface SampleInterface {

	//インターフェースには定数のフィールドしか定義できない
	//そしてpublicのみが適応される

			//String s ;
			String str = "A";
			int number = 3;
			final int FN = 5;

			public String str2 = "";
			//private String str3 = "";
			//protected String str4 = "";

	/*基本的にはpublicかアクセス修飾子無しのメソッドが定義できるが、
	 * 実装先ではpublicに変換される
	 * つまり、実装先ではアクセス修飾子無しでは実装できず、全てpublicとして扱われる
	 */

	void method() ;
	public void method2();

	/*
	 * privateで定義はできるようだが、使用はできない
	 * 基本はpublicか修飾子無し(publicに変更される)
	 */
	private void method3() {
		System.out.println();
	};
	//protectedのアクセス修飾子は付けられない
	//protected void method4();

	default public void method4() {
		System.out.println("デフォルト");
	}
}
