package compile12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		String title = "------   a   ------";

		System.out.println(title.replace("a","12-4"));


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
}
