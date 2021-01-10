package com.sample;

public class Main {

	public static void main(String[] args) {
		String str = "hoge, world.";
		hello(str);//String変数を変更できないため値は元のまま出力される
		//String sss = str.replaceAll("あ","hello");
		System.out.println(str);
	}
	public static void hello(String msg) {
		//replaceAllはStringの文字を置き換えるメソッド
		//Stringは不変オブジェクトのため、一度定義した変数は変更できない
		//そのため、新しく変更するには新しくインスタンスを作成しないといけない
		msg.replaceAll("hoge", "hello.");
	}

}
