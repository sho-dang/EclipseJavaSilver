
public class Static {
		/*
		 * クラスフィールド
		 * 「クラス名.クラスフィールド名」で値を使用できる
		 * インスタンスの作成をすることなく値を使用できる。
		 * 値を代入していない場合はデフォルト値が適用される
		 * String＝null  int = 0
		 */
		static String string2;
		static int num2;



		/*staticの値を初めから定義していた場合
		 * 代入した値をそのまま取得できる
		 */
		static String string3 = "BBB";
		static int num3 = 10;


		/*
		 * インスタンスフィールド
		 * staticではないフィールド
		 * インスタンス作成時に呼び出すことができるフィールド
		 *
		 */
		String string ;
		int num;

		/*
		 *
		 */

		//コンストラクタでクラスフィールドを初期化
		public Static() {
			this.string2 = "S";
			this.num2 = 5;
		}

		/* ローカル変数について
		 * フィールドの変数とメソッド内で同じ変数を持っていて、メソッド内で変数を使う場合、
		 * メソッド内のローカル変数が優先される。
		 * thisを使ってフィールド変数を明示してあげなければ、ローカル変数が優先されるので、
		 * フィールド変数には干渉しないことになる
		 *
		 */
		public Static(int num,String string) {
			num = num;//thisを明示しないと、引数の変数へ再代入という形となる
			string = string;//thisを明示しないと、引数の変数へ再代入という形となる
			System.out.println(string);//ローカル変数が優先されて表示される
			System.out.println(num);//ローカル変数が優先されて表示される
		}

		//static初期化子について
		static String string4;
		static int num4;
		static {
			string4 = "string4初期化完了";
			num4 = 300;
		}


}
