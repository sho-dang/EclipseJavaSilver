
public class Main {

	public static void main(String[] args) {
		String title ="-----  a  -----";

		 //7-1
		System.out.println(title.replace("a","7-1"));
			/*
			 * 継承とは機能を拡張すること
			 * 拡張する元となるクラスを、基底クラス、または、スーパークラスと呼ぶ。
			 * 拡張したクラスを、派生クラス、またはサブクラスと呼ぶ。
			 * 生産性を向上させる。
			 * 共通部分を別のプログラムとして準備し、プログラムの差分を定義して、結合することを差分プログラミングと呼ぶ。
			 * 何度も同じコードを書く手間を省くことができる。
			 *
			 * 既存クラスから拡張する時は、extends
			 * interfaceクラスは、型だけを定義する。
			 * 自動的にアクセス修飾子としてpublicが付与される。protectedやprivateで就職することはできない。
			 * クラスの多重継承は不可能。継承は一つまで。
			 * interfaceは多重実現できる。ただし、同じメソッドがある場合は、どちらか判定できないのでコンパイルエラーとなる。
			 *
			 *
			 */

		Child child = new Child();
		child.hello();

		//7-4
		System.out.println(title.replace("a","7-4"));

		InterfaceB bb = new InterfaceB();
		bb.sample();

		//7-6
		System.out.println(title.replace("a","7-6"));
		InterfaceC cc = new InterfaceC();
		cc.sample();

		//7-10
		System.out.println(title.replace("a","7-10"));
		Integer integer = new Integer();
		integer.out();
		Number number = new Number();
		number.out();

		//7-12
		System.out.println(title.replace("a","7-12"));
		A a = new A();
		A b = new B();
		System.out.print(a.val);
		System.out.print(b.val);
		a.print();
		b.print();
		System.out.println();


		//7-12
		System.out.println(title.replace("a","7-20"));
		new B2();
		//System.out.println(b2);
	}


}

 class A{
	 String val = "A";
	 void print() {
		 System.out.print(val);
	 }
 }

 class B extends A{
	 String val = "B";
 }

 class A2{
	 public A2() {
		 System.out.println("A");
		 }
 }


 class B2 extends A2{
	 public B2() {
		 super();
		 System.out.println("B");
	 }
 }


