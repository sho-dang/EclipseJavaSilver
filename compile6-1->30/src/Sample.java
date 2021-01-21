
public class Sample {
	public Sample(){
		System.out.println("A");  //初期化子の後にコンストラクタが実行される
	}
	{
		System.out.println("B");	//初期化子がはじめに実行される
	}
}
