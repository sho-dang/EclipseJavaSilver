
public class Sample {
	private int num;

	public Sample(int num) {
		this.num = num;
	}
	//オーバーライドしているように見えるが、実際はオーバーロードとなっている
	//オーバーライドするにはシグニチャ（メソッド名〜引数のこと）が一致していなければならないため
	//下記のメソッドはSampleのクラスで定義しているのでオーバーロードとなる
	public boolean equals(Sample obj) {
		if(obj == null) {
			return false;
		}
		return this.num == obj.num;
	}
}
