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


	/**
	 * 2-15
	 */
		//コンパイルした時に正しいものはどれ
		/**
		 * lengthは文字数を返すメソッド
		 * abcdeの場合、戻り値は5である。
		 * ただし、charAtで選択する場合は「abcde」= 「01234」のため５は存在しない。
		 * そのため、コンパイルエラーとなる
		 */
		//System.out.println(str.charAt(str.length()));

	/**
	 * 2-16
	 */
		//コンパイルした時に正しいものはどれ
		/*
		 * startWith()はboolean型
		 * この場合、「b」が開始しているかどうかということなのでtrueが返される
		 */
		System.out.println(str.substring(1,3).startsWith("b"));

	/**
	 * 2-17
	 */
		//実行した時に、Hello,Java!が表示されるのはどれ
		/**
		 * concatはStringで用意されているメソッド
		 * インスタンス（Hello,）が保持する文字列を、引数として渡された文字列を連結する
		 */
		String strA = "Hello, ".concat("Java!");
		//String strB = "Hello, ".append("Java!"); //StringBuilderクラスのメソッド
		//String strC = "Hello, ".add("Java!");  //Stringクラスに存在しない
		//String strD = "Hello, ".plus("Java!");  //Stringクラスに存在しない

		System.out.println(strA);

	/**
	 * 2-18
	 */
		//コンパイル結果がどうなるか
		/**
		 * +演算子で数値加算と文字列結合がある場合は、左から順に計算される
		 * 10 + 20 + "30" + 40
		 * 30 + "30" + 40
		 * "3030" + 40
		 * "303040"となる
		 */
		System.out.println(10 + 20 + "30" + 40);
	}
}
