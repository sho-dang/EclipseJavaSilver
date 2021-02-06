package compile12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
	static int num = 23;
	static String str;
	public static void main(String[] args) {
		String title = "------   a   ------";

		System.out.println(title.replace("a","12-5"));
				/*
				 *  クラスフィールド変数はローカル変数共に同じ変数を定義することは可能
				 *	通常メソッドにおいて、クラスフィールドを呼び出す時は、「クラス名.変数名」で呼び出す
				 *	クラスメソッドにおけるクラスフィールドの呼び出しは、変数名のみで良い。
				 *	一方、インスタンス変数を呼び出す場合は「this.変数名」を使用する
				 */
				int num = Main.num;
				System.out.println(num);

		System.out.println(title.replace("a","12-13"));
				/*  Stringはオブジェクト型のため、デフォルトの値はnull
				 *  初期化せずに呼び出せばヌルポとなってしまう
				 *
				 */
			/*

				switch(str) {
				case "10" :str +="10";
				default : str += "def";
				case "20" :str +="20";
				}
			*/
		System.out.println(title.replace("a","12-17"));
				/*
				 * インナークラスとはクラスの中に別なクラスを作成することである
				 * アクセス修飾子は全て付けることができる
				 * インナークラスを使う時は、下記のように
				 * 親クラスとなるインスタンスを作成したのち、
				 * 「親クラス.new インナークラス名」でインスタンスを作成する
				 */
				Main main = new Main();
				Inner inner = main.new Inner();

		System.out.println(title.replace("a","12-31"));
				var alpabet = new ArrayList<>(Arrays.asList(new String[] {"A","B","C","D","E"}));
				alpabet.sort((var a,var b) -> -a.compareTo(b));
				alpabet.forEach(System.out::println);

		System.out.println(title.replace("a","12-34"));
				char c = 'C';
				switch('C') {
				case 'C'|'C':
					System.out.println("ok");
					break;
				}

		System.out.println(title.replace("a","12-53"));
				/*
				 * float型は小数点第一位を表示させる。
				 * そして、double型より扱える桁数が少ないのが特徴
				 * Math.roundは小数点第一位を切り捨てるAPI
				 * int,double,floatそれぞれ、引数に入れたときに処理は違う
				 * 例えば、int型の値を引数に入れた場合は小数点が切り捨てられる
				 * float型で値を入れたい場合は、float型でキャストして計算しないといけない
				 */
				float fl = Math.round((float)5/2*100) /(float)100;
				System.out.println(fl);


		System.out.println(title.replace("a","12-**"));
				List<String> li  =new ArrayList<String>(Arrays.asList(new String[] {"A","B","C"} ));
				System.out.println(li.get(0));
				li.forEach(System.out::println);

		System.out.println(title.replace("a","12-**"));
					/*
					 * 使用クラス詳細
					 *
					 * Sample クラス
					 * 		フィールド "taro"
					 * 		helloメソッド nameを使う
					 *
					 * SubSample クラス （Sampleクラスを継承）
					 * 		フィールド "jiro"
					 * 		helloメソッド nameメソッドを使う
					 */

				//スーパークラス型へ同じクラスのインスタンスを生成
				Sample sample = new Sample();
				System.out.println(sample.name);//taro
				sample.hello();//hello taro

				//スーパークラス型へサブクラス型のインスタンスを作成(アップキャスト)
				Sample sample2 = new SubSample();
				System.out.println(sample2.name);//taro
				sample2.hello();//hello jiro

				//サブクラス型へ同じクラスのインスタンスを作成
				SubSample sub = new SubSample();
				System.out.println(sub.name);//jiro
				sub.hello();//hello jiro

				/* サブクラスの型へスーパークラス型のインスタンスを作成はできない
				SubSample sub2 = new Sample();
				System.out.println(sub.name);//jiro
				sub.hello();//hello jiro
				*/

				//ダウンキャスト コンパイルエラーは出ないが実行時に例外が発生する
				//SubSample sub3 =(SubSample) new Sample();
				//System.out.println(sub3.name);
				//sub3.hello();
	}
	void sample() {

		/*
		 * ラムダ式では変化する値を使えないので、コンパイルエラーとなる
		 */
		int i = 0;
		Supplier<Integer> foo = () -> i;
		//i++;
		System.out.println(foo.get());
	}
	class Inner{
		Inner(){
			System.out.println("これはインナークラスです");
		}
	}
}
