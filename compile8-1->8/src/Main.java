
public class Main {

	public static void main(String[] args) {
		String title = "------   a   ------";
		//8-1
		System.out.println(title.replace("a","8-1"));
				/*
				 * オブジェクト指向のデザインパターン23種類
				 *そのうちの「Gof」のデザインパターンから、Strategyのパターンをラムダ式で実現している。
				 *	ラムダ式はオブジェクトを隠蔽できる
				 *　ラムダ式を使う時はメソッドが一つのオブジェクトの場合使用できる
				 *	メソッドが一つのインターフェース（関数型インターフェース）のポリモーフィズムを実現する
				 */
		Algorithm algorithm =(String name) ->{
			System.out.println("hello, " + name);
		};
		Service service = new Service();
		service.setLogic(algorithm);
		service.doProcess("Lambda");
		//8-2
		System.out.println(title.replace("a","8-2"));
		//8-3
		System.out.println(title.replace("a","8-3"));
		//8-4
		System.out.println(title.replace("a","8-4"));
		//8-5
		System.out.println(title.replace("a","8-5"));
		//8-6
		System.out.println(title.replace("a","8-6"));
		//8-7
		System.out.println(title.replace("a","8-7"));
		//8-8
		System.out.println(title.replace("a","8-8"));
	}

}

 class Service{
	 private Algorithm logic;
	 public void setLogic(Algorithm logic) {
		 this.logic = logic;
	 }
	 public void doProcess(String name) {
		 System.out.println("start");
		 this.logic.perform(name);
		 System.out.println("end");
	 }
 }
