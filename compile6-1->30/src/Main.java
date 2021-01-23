

public class Main {

	public static void main(String[] args) {
		String title = "-----  a  -----";
				//6-1
				System.out.println(title.replace("a","6-1"));

				//6-2
				System.out.println(title.replace("a","6-2"));
				//6-3
				System.out.println(title.replace("a","6-3"));
						/*
						 *  NULLと出力できるのはどれ
						 *  どれも不正解
						 */
						Object obj1 = null;
						Object obj2 = false;
						//Object obj3 = NULL;
						Object obj4 = "";
						System.out.println(obj4);
				//6-4
				System.out.println(title.replace("a","6-4"));
						/*
						 *
						 */
						Object a4 = new Object();
						Object b4 = new Object();  //どこの参照もされていないのでガベージコレクションとなる
						Object c4 = a4;
						a4 = null;
						b4 = null;

				//6-5
				System.out.println(title.replace("a","6-5"));
				//6-6
				System.out.println(title.replace("a","6-6"));
						/*
						* staticルール
						staticのメンバ（フィールド、メソッド）はstatic領域と呼ばれるところに保管される。
						static同士であれば変数とメソッドは自由に使える。

						staticではないメソッドが取り出す時は、
						「クラス名.フィールド名」
						もしくは、インスタンスを作成する
						staticではないメソッドから呼び出す時は、上記の方法でstaticフィールドを呼び出すことができる。

						staticなメソッドはstaticなフィールドやメソッドしか呼び出せない
						staticなメソッドはstaticではないフィールドやメソッドに干渉できない
						（なぜなら、存在しないものを呼び出すことになるから）
						 */
				//6-7
				System.out.println(title.replace("a","6-7"));
				//6-8
				System.out.println(title.replace("a","6-8"));
				//6-9
				System.out.println(title.replace("a","6-9"));
				//6-10
				System.out.println(title.replace("a","6-10"));
				//6-11
				System.out.println(title.replace("a","6-11"));
				//6-12
				System.out.println(title.replace("a","6-12"));
				//6-13
				System.out.println(title.replace("a","6-13"));
				//6-14
				System.out.println(title.replace("a","6-14"));
				//6-15
				System.out.println(title.replace("a","6-15"));
				//6-16
				System.out.println(title.replace("a","6-16"));
				//6-17
				System.out.println(title.replace("a","6-17"));
				//6-18
				System.out.println(title.replace("a","6-18"));
				//6-19
				System.out.println(title.replace("a","6-19"));
				//6-20
				System.out.println(title.replace("a","6-20"));
				//6-21
				System.out.println(title.replace("a","6-21"));
						/*
						 *
						 */
						Sample s = new Sample();

				//6-29
				System.out.println(title.replace("a","6-29"));
						/*
						 *  メソッドの引数には値のコピーを渡す。
						 *  そのため、インスタンスの元の値が変化するわけではない。
						 *  メソッドの変更した結果を使用したい場合はreturnで取得する。
						 */
						Sample29 s29 = new Sample29(10);
						modify29(s29.num);
						System.out.println(s29.num);


				//6-30
				System.out.println(title.replace("a","6-30"));
						/*
						 *  メソッドの引数にオブジェクト型を渡した場合は、参照値を渡している。
						 *  そのため、インスタンスの値をメソッドで変更すると、参照しているフィールドの値を変更しているので、
						 *  値の更新がされる。
						 */
						Sample29 s30 = new Sample29(10);
						modify30(s30);
						System.out.println(s30.num);
	}
	private static void modify29(int num) {
		num *= 2;
	}
	private static void modify30(Sample29 s) {
		s.num *= 2;
	}

}
