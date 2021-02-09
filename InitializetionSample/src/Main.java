
public class Main {

	public static void main(String[] args) {
		String sikiri = "--------------------";

		System.out.println(sikiri);

				System.out.println(Static.string2);//クラスフィールドデフォルト値の表示
				System.out.println(Static.num2);//クラスフィールドデフォルト値の表示

		System.out.println(sikiri);

				System.out.println(Static.string3);//クラスフィールド 定義時に値を入れた場合
				System.out.println(Static.num3);//クラスフィールド 定義時に値を入れた場合

		System.out.println(sikiri);

				Static sta = new Static(); //インスタンスの作成、この時点で、クラスフィールドを初期化している
				System.out.println(sta.string);//インスタンスフィールドの表示
				System.out.println(sta.num);//インスタンスフィールドの表示

		System.out.println(sikiri);

				System.out.println(Static.string2);//コンストラクタで初期化したクラスフィールドを表示
				System.out.println(Static.num2);//コンストラクタで初期化したクラスフィールドを表示

		System.out.println(sikiri);

				Static sta2 = new Static(100,"ローカル変数"); //オーバーロードのインスタンス作成
				//先にコンストラクタのローカル変数表示が行われる
				//変数は同じでもthisを明示しなければ、ローカル変数への再代入となるため、クラスフィールドは変わらない
				System.out.println(sta2.string);//初期化されたのはローカル変数のため、値はデフォルトのまま
				System.out.println(sta2.num);//初期化されたのはローカル変数のため、値はデフォルトのまま

		System.out.println(sikiri);

				System.out.println(Static.string4);
				System.out.println(Static.num4);


				/*
				 * 通常初期化子、static初期化子、コンストラクタの初期化の順位
				 */
				System.out.println(Init.string4);//static初期化子のみ実行される
				Init init = new Init();//インスタンス化
				System.out.println(Init.string4);//コンストラクタが最終更新となる
				/*
				 * 検証結果
				 * インスタンス作成前はstatic初期化子のみが実行される
				 * インスタンス作成後は「static初期化子 → 通常初期化子 → コンストラクタの初期化」
				 * 左から順に優先順位が高い結果となった。
				 */
	}

}
