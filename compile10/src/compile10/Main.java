package compile10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
			String title = "------   a   ------";


			int num = 0;

			try {
				//Object obj = null;
				Object obj = "sample";
				System.out.println(obj.toString());

				//例外が発生した時点でcatchに移動するため
				//num++は到達不能コードとなる。numは加算されない
				num = num / 0;

			}catch(NullPointerException ex){
				System.out.println("復帰完了");
				//catchは例外処理を分岐させることができる
			}catch(ArithmeticException ex){
				System.out.println("ArithmeticExceptionをcatchしました");
			}finally {
				System.out.println("finally");
			}
			System.out.println("ok");
			System.out.println(num);

			Sample sample = new Sample();
			try {
			sample.test("");
			}catch (IllegalArgumentException ex ) {
				System.out.println("do something");
			}catch (Exception e) {
				System.out.println("Exceptionを検知しました");
			}

			A a = new A();
			try {
				a.hello();
			} catch (TestException e) {
				System.out.println(e);;
			}

			System.out.println(title.replace("a","10-1"));
					try {
						if(args.length == 0) {
							System.out.println("A");
						}
					}catch (NullPointerException e) {
						System.out.println("B");
					}finally {
						System.out.println("C");
					}

			System.out.println(title.replace("a","10-3"));
					/*
					 * Exceptionを拡張したSampleException
					 * SampleExceptionを拡張したSubSampleException（Exceptionも持っている）
					 * 1つ目のcatchで全て例外をcatchできてしまうので2つ目のcatchは到達不能となる
					 *
					 */
					try {
						sample2();
						sub();

					} catch (Sample2Exception e) {
						System.out.println("A");
					}
					/*
					catch (SubSampleException e) {
						System.out.println("B");
					}
					*/

			System.out.println(title.replace("a", "10-10"));
					/*
					 *  io処理はtry-catch-finallyの外で変数を定義しなければならない
					 *  なぜなら、tryとfinallyの両方にアクセスしないといけないため
					 *  仮定
					 *  tryで処理を入れて、catchで例外の処理を行う
					 *  finallyで結果的にio処理をクローズさせるため
					 */
					FileInputStream is = null;
					try {
						is = new FileInputStream("sample.text");
						throw new FileNotFoundException();
					} catch (Exception e) {
						System.out.println("A");
					}finally {
						if(is != null) {
							try {
								is.close();
							} catch (IOException e) {
								throw new RuntimeException();
							}
						}
						System.out.println("B");
					}

			System.out.println(title.replace("a","10-6"));
					int result = sample();
					System.out.println(result);

	}

	private static int sample() {
		//10−6のメソッド
		try {
			throw new RuntimeException();
		}catch(RuntimeException e) {
			return 10;
		}finally {
			return 20;
		}
	}
	private static void sample2() throws Sample2Exception{
		throw new Sample2Exception();
	}
	private static void sub() throws SubSample2Exception{
		throw new SubSample2Exception();
	}



}

class Sample2Exception extends Exception{}
class SubSample2Exception extends Sample2Exception{}

