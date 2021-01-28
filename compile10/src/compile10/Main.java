package compile10;

public class Main {

	public static void main(String[] args) {
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


	}

}
