
public abstract class Abst {
	//抽象メソッドはabstractを付けないとコンパイルエラーとなる

	//フィールドのアクセス修飾子の制限は無し
	String str1;
	public String str2;
	protected String str3;
	private String str4;

	//staticも同様にアクセス修飾子の制限は無い
	static int num1;
	static public int num2;
	static protected int num3;
	static private int num4;

	//finalも通常のクラスと同様の仕様
	final int fin1 = 1;
	final public int fin2 = 2;
	final protected int fin3 = 3;
	final private int fin4 = 4;


	//抽象メソッドはprivate以外は定義可能
	abstract void Abst1();
	public abstract void Abst2();
	protected abstract void Abst3();
	//private abstract void Abst4();

	//実装済みメソッドにはアクセス修飾子の制限は無い
	void method1(){
		int num;
		//System.out.println(num);
	};
	public void method2() {System.out.println(str1);}
	protected void method3() {}
	private void method4() {}


}
