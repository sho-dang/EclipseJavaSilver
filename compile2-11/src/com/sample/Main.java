package com.sample;

public class Main {

	public static void main(String[] args) {
	/**
	 * 2-11
	 */
		//コンパイルした時に正しいものはどれ
		String str = "abcde";//文字コードは0から始まるので、この場合、「01234」の順番となる
		//System.out.println(str.charAt(5));//そのため、「5」は存在しないので例外がスローされる

	/**
	 * 2-12
	 */
		//コンパイルした時に正しいものはどれ
		/**
		 * indexOfは、引数で指定した文字列がどこに存在するかを返すメソッド
		 * 例えば引数が「c」だった場合、帰ってくる場合「2」となる。その文字列の始まりとなる文字位置を返す。
		 * もし、指定した文字が存在しない場合は、全て「-1」を返す
		 */
		System.out.println(str.indexOf(0));

	/**
	 * 2-13
	 */
		//コンパイルした時に正しいものはどれ
	/**
	 *	substringメソッドは第一引数から第二引数までの文字列を抽出するメソッド
	 * 「 ab | cd | e 」２文字目から4文字目までを切り取るという意味になる
	 */
		System.out.println(str.substring(2,4));

	/**
	 * 2-14
	 */
		//コンパイルした時に正しいものはどれ
		/**
		 *  replaseは文字列を文字列で置き換えることができる
		 *  replaceAllは文字列を、文字列と正規表現で置き換えることができる
		 */
		String strr = "aaaa";
		System.out.println(strr.replace("aa", "b"));
	}
}
