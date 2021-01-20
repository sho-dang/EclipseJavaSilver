public class Main {

	public static void main(String[] args) {
		String title ="-----  a  -----";
		//4-1
		System.out.println(title.replace("a","4-1"));
			/*
			 *0~4の数字を順番に表示したい。
			 *whileの式の中に入るコードとして正しいものはどれ
			 *A:b<5   0,1,2,3,4
			 *B:5<b   出力されない
			 *C:5<a   0,1,2,3,4,5
			 *D:a<5	  出力されない
			 *E:true  出力されない
			 *F:false  コンパイルエラー
			 *
			 *while文はtrueを戻す間、繰り返さないといけない。
			 *条件式は必ず真偽値を戻さないといけない
			 */
			int a1 = 11;
			int b1 = 0;
			while(b1<5) {
				if(true) {
					System.out.println(b1);
				}
				a1--;
				b1++;
			}
		//4-2
		System.out.println(title.replace("a","4-2"));
			/*
			 * 0~4の数字を順番に表示したい。
			 * {}の前後に入る式として正しいものはどれ
			 * do(a2 < 5)     while;
			 * do(5 < a2)     while;
			 * do          while(a2 < 5)
			 * do          while(5 < a2)
			 *
			 * do while文は、while文と同じく、trueを戻す間は繰り返さないといけない
			 * while文と違う点は、条件判定のタイミングで、処理を実行してから繰り返しの判定を行っている
			 * ルール
			 * ・doの後ろには（）がつかない
			 * ・whileの後ろに条件式を記述する
			 * ・セミコロンで終了する
			 */
			int a2 = 0;
			do{
				System.out.println(a2++);
			}while(a2<5);

		//4-3
		System.out.println(title.replace("a","4-3"));
			/*
			 * while文やdo-while文でも中カッコ「 {} 」を省略できる
			 * 省略した場合、1つの文だけが繰り返し処理として扱われる。
			 * 省略したにもかかわらず、処理を複数記述した場合はコンパイルエラーとなる
			 */
			int a3 = 0;
			/*
			while(a3<5)
				do
					a3++;
				    System.out.println(a3);
				    while(true);
			*/
		//4-4
		System.out.println(title.replace("a","4-4"));
			/*
			 * for文  for(初期化文;条件文;更新文)の構成
			 * 初期化文では一時変数の宣言,複数定義する場合、変数は同じ型でなければならない
			 * 条件文では真偽値を戻す式
			 * 更新文は繰り返し処理が終わってから、一時変数の値を変更する
			 *
			 */
			/*
			for(int i = 1,int j = 2;i < 5;i++) {
				System.out.println(i * j);
			}
			*/
		//4-5
		System.out.println(title.replace("a","4-5"));
			/*
			 * for文の条件式の中で定義した「total」はローカル変数となるため、
			 * for文の中でしか変数を使用できない.
			 * すなわち、「total」は出力できず、コンパイルエラーとなる。
			 */
			int a5 = 1;

			for(int b = 2,total = 0;b <= 5 ;b++) {
				total = a5 * b;
			}
			//System.out.println(total);

		//4-6
		System.out.println(title.replace("a","4-6"));
			/*
			 * 0を表示するために、条件文に当てはまるものはどれ
			 *  A: i < 0    初めから0より大きくないため、処理が実行されない
			 *  B: i == 0   正解。iは0であるためtrueを返す。繰り返されると１になる為、表示は0のみとなる。
			 *  C: 0 < i    初めからiは、0より大きくないため、処理が実行されない
			 *  D: 1 < 2   iの更新がされないので、無限ループとなってしまう。
			 */
			for(int i = 0;i==0;i++) {
				System.out.println(i);
			}

		//4-7
		System.out.println(title.replace("a","4-7"));
			/*
			 *  for文の条件文が複数定義しているので、コンパイルエラーとなる。
			 *  複数定義できるのは初期化と更新文である。
			 *  条件文として&&（かつ）や||（または）の記述がある場合は、結果的に返すのが真偽値のどちらかになる為、OK
			 */
		/*
		for(int i = 0 ,j = 0 ;i < 3,j<3 ; i++) {
			System.out.println(i++);
			j += i;
		}
		*/
		//4-8
		System.out.println(title.replace("a","4-8"));
			/*
			 * 更新文は複数定義可能
			 * ルールとして更新文は、繰り返し処理の後に実行されるということを忘れずに。
			 * 0,1,2,が正解
			 */
		for(int i = 0 ;i < 3; i++, period()) {
			System.out.print(i);
		}
		System.out.println();

		//4-9
		System.out.println(title.replace("a","4-9"));
			/*
			 * 10を表示したい
			 *
			 */
		int array[][] = new int[][]{{1,2},{2,3,4}};
		int total = 0;
		for(int i = 0 ; i < array.length ;i++ ) { //0,1
			for(int j = i; j < array[i].length ; j++) {//lengthは0
				total +=array[i][j];
			}


		}
			System.out.println(total);

		//4-10
		System.out.println(title.replace("a","4-10"));
			/*
			 *  無限ループになるものはどれ
			 *A : int i = 0 ;true;i++  //条件文がずっとtrueのため
			 *B : int i = 0 ;false;i++  //ここはfalseでは処理を終了するのでループしない
			 *C : int i = 0 ;;i++	//条件文が省略できるが、繰り返されるのみ
			 *D : int i = 0 ;i<5;   //更新文も省略できるが、値が変動しないので繰り返される
			 */
			/*
			for(int i = 0 ;;i++) {
				System.out.println();
			}
			*/
		//4-11
		System.out.println(title.replace("a","4-11"));
			/*
			 *拡張for文ルール
			 *for(型  変数 :  集合)
			 *集合の型と、一時変数の型の互換性があることが大事。
			 *集合の型がStringであっても、Object型は互換性があるので使える。(Stringクラス自体がObject型)
			 *
			 *
			 */
			String[][] arrays = {{"A","B","C"}};
			for(Object obj : arrays) {
				System.out.println(obj);
			}
		//4-12
		System.out.println(title.replace("a","4-12"));
			/*
			 * １次元配列では、まだメモリ番地は生成されない。
			 * なので、拡張for文で、String配列の中のString型を出力できる。
			 * ２次元配列では、メモリ番地が与えられる。
			 * その中にString配列が入っているので、出力してもメモリの番地が表示される。
			 *
			 */
			String[] array12 = {"A","B","C"};
			for(String str : array12) {
				str = "D";
			}
			for(String str : array12) {
				System.out.print(str);
			}
			System.out.println();

		//4-13
		System.out.println(title.replace("a","4-13"));
			/*
			 * 元となるコードと同じ結果を出力するものはどれ
			 *  前置インクリメントは初めから、変数に１をプラスする
			 *  後置インクリメントは、その時の変数の代入時は値は変化していない。
			 *  ただし、定義した変数には１はプラスされている。
			 *  結果的にどれも一致しない「E」が正解である
			 */
			int num13 = 10;
			do {
				num13++;
			}while(++num13 <10);
				System.out.print(num13);
				System.out.println(" 元のコード");

			num13 = 10;
			while(++num13 < 10) {
				num13++;
			}
				System.out.println(num13);
			num13 = 10;
			while(++num13 <= 10) {
				num13++;
			}
				System.out.println(num13);
			num13 = 10;
			while(num13++ < 10) {
				num13++;
			}
				System.out.println(num13);
			num13 = 10;
			while(num13++ <= 10) {
				num13++;
			}
				System.out.println(num13);

		//4-14
		System.out.println(title.replace("a","4-14"));
			/*
			 *ifは{}無しのためbreakのみ適用
			 *初めのfor文で繰り返し回数を決める（2回）
			 *中にfor文があるので
			 */
			String[] array14 = {"A","B"};
			for(String a : array14) {
				for(String b : array14) {
					if("B".equals(b))
						break;
						System.out.print(b);
				}
			}System.out.println();

		//4-15
		System.out.println(title.replace("a","4-15"));
			/*
			 * 1,2,3,4,5それぞれのパターンのときのifを実行する
			 * 1 =  割り切れないため +1
			 * 2 =  スルー
			 * 3 = あまり1となるため、+3
			 * 4 =  スルー
			 * 5 =  あまり1のため、+5
			 *
			 * total=9
			 */
			int[] array15 = {1,2,3,4,5};
			int total15 = 0;
			for(int i :array15) {
				if(i % 2 == 0) //1+
					continue;
					total15 += i ;
			}
			System.out.println();

		//4-16
		System.out.println(title.replace("a","4-16"));
			/*
			 *ラベルはさまざまなところへ付けられる
			 */
			//コードブロック
				a: {
				System.out.println("a");
				if(true)
				break a;
				System.out.println("i");
				}
			//ループ文
				b: for(int i = 0 ; i< 5 ; i++){
					System.out.println(i);
				}

				c: if(true) {
					System.out.println("あ");
				}
		//4-17
		System.out.println(title.replace("a","4-17"));
			/*
			 *
			 */
			int total17 = 0 ;
			a: for(int i = 0;i < 5 ; i++ ) {

				b: for(int j = 0 ; j < 5 ; j++) {
						if(i % 2 == 0) continue a;
						if(3<j) break b;
						total += j;
					}
			}
	}
	public static void period() {
		System.out.print(",");
	}
}
