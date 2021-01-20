public class Main {

	public static void main(String[] args) {
		String title ="-----  a  -----";

		//5-1
		System.out.println(title.replace("a","5-1"));
				/*
				 *配列の型を定義するということは、配列のインスタンスを作成するということである。
				 * 問題のコードは、0が入っていて、要素を扱わないインスタンスとなっている
				 * int[] array1 = new int[];要素の数を入れておかないとコンパイルエラーとなる
				 *  インスタンスを作成しただけであるので。表示はメモリの番地となる。
				 */
				int array1[] = new int[0];
				System.out.println(array1);
		//5-2
		System.out.println(title.replace("a","5-2"));
				/*
				 * コンパイルエラーが発生するかしないか
				 * 結果、どれもコンパイルエラーとはならない
				 * 初期化（インスタンス化していないのでsysoutで表示はできない）
				 */
				int[] a2;  //1次元配列
				int b2[];  //1次元配列
				int[][] c2;  //2次元配列
				int d2[][];  //2次元配列
				int[] e2[];  //2次元配列
				int[][] f2[];  //3次元配列

		//5-3
		System.out.println(title.replace("a","5-3"));
				/*
				 * 要素の数指定はインスタンス作成時にしかできない
				 */
				//int[3] a3;
				//int b[2];
				//int[2] c3[];
				//int d[3][];
		//5-4
		System.out.println(title.replace("a","5-4"));
				/*
				 *
				 */
				//int a4[] = new int[2][3];
				//int[] b4 = new int[2.3];
				int c4[] = new int[2*3];
				int x = 2, y = 3;
				int[] d4 = new int[x * y];
				int[][] e4 = new int[2][];
				//int f4[][] = new int[][3];




		//5-5
		System.out.println(title.replace("a","5-5"));
		//5-6
		System.out.println(title.replace("a","5-6"));
		//5-7
		System.out.println(title.replace("a","5-7"));
		//5-8
		System.out.println(title.replace("a","5-8"));
		//5-9
		System.out.println(title.replace("a","5-9"));
		//5-10
		System.out.println(title.replace("a","5-10"));

	}
}
/*
 * //5-1
		System.out.println(title.replace("a","5-1"));
		//5-2
		System.out.println(title.replace("a","5-2"));
		//5-3
		System.out.println(title.replace("a","5-3"));
		//5-4
		System.out.println(title.replace("a","5-4"));
		//5-5
		System.out.println(title.replace("a","5-5"));
		//5-6
		System.out.println(title.replace("a","5-6"));
		//5-7
		System.out.println(title.replace("a","5-7"));
		//5-8
		System.out.println(title.replace("a","5-8"));
		//5-9
		System.out.println(title.replace("a","5-9"));
		//5-10
		System.out.println(title.replace("a","5-10"));

 */

