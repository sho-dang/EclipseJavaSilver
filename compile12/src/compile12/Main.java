package compile12;

import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		String title = "------   a   ------";

		System.out.println(title.replace("a","12-4"));

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
