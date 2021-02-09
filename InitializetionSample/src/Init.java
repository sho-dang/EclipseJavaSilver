
public class Init {
	static String string4;

	static {
		string4 = "static初期化子の勝利";
	}

	{
		string4 = "通常初期化子の勝利";
	}
	public Init(){
		string4 = "コンストラクタ初期化子の勝利";
	}

}
