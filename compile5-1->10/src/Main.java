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
				 * aは左辺で1次元配列として定義しているが、右辺では２次元配列のインスタンスを作成しようとしているためNG
				 * bはintの配列型を定義しているのに、右辺でdouble型の定義をしているのでNG
				 * fは２次元配列なのは一致しているが、左大括弧にて１次元目のインスタンスを作成していないのに、要素のみを入れることはできない
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
				/*
				 * オブジェクト型配列を生成した時は、初期化としてnullが入る
				 *	インスタンス化した場合はnullが追加されているので、要素を追加しないといけない。
				 *  forの処理文で呼び出そうとしてもヌルポになるため、例外が発生する
				 */
				Item[] items = new Item[3];
				//int[] itemss = new int[3];
				int total5 = 0;

				for(int i = 0 ; i < items.length;i++) {
					total5 += items[i].price;
				}

				System.out.println(total5);
		//5-6
		System.out.println(title.replace("a","5-6"));
				/*
				 *  配列にnullを代入しても、要素の数は変わらない
				 *  出力の時、nullはリテラルのため表示はできる
				 */
				String[] array6 = {"A","B","C","D"};
				array6[0] = null;
				for(String str : array6)
				System.out.print(str);
				System.out.println();
		//5-7
		System.out.println(title.replace("a","5-7"));
				/*
				 *
				 */
				//int[] a7 =new int[2]{2,3};
				int b7[][] = {};
				int[][] c7 = new int[][] {};
				int[] d;
				d = new int[]{2,3};
				//int e[];
				//e = {2,3};
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

