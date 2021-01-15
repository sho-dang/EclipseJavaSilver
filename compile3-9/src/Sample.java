
public class Sample {

	private int num;
	private String name;

	public Sample(int num,String name) {
		this.num = num;
		this.name = name;
	}
	public boolean equals(Object obj) {
		if(obj == null) {
			return false; //引数のオブジェクトがnullの時は、falseを返す
		}
		if(obj instanceof Sample){ //引数のオブジェクト(インスタンス)がSampleの時、
			Sample s = (Sample) obj; //オブジェクトをSampleにキャスト
			return s.num == this.num;
			//同一性の確認 キャストしたオブジェクトのnumは、このSampleクラスのnumと同じである
		}
		return false;
	}
}
