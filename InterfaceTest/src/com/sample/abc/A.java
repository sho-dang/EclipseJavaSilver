package com.sample.abc;

/**
 * @param スーパークラス
 * @param private修飾子とコンストラクタは引継ぎできない
 */

public class A {

	/**
	 * @param 引数ありのコンストラクタだと問題が発生する
	 * @param デフォルトコンストラクタは引数無しのコンストラクタを呼び出す
	 */

	public A(String hoge) {
		System.out.println(hoge);
	}

	public void Test() {
		System.out.println("A");
	}
}
