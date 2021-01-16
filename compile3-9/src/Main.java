
public class Main {

	public static void main(String[] args) {
		Sample a =new Sample(10, "a"); //インスタンスのidはaとbで違う
		Sample b =new Sample(10, "b"); //Sampleクラスでequalsメソッドを再定義している
		String c = "R";
		String d = "R";
		String f = new String("R");
		Object e = new Object();

		System.out.println(c.equals(f));
		/*
		 *インスタンスごとにデフォルトのequalsメソッドが定義されている
		 *public boolean equals(Object obj){
		 *    return this = obj;
		 */
	}

}
