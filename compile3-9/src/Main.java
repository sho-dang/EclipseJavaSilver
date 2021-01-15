
public class Main {

	public static void main(String[] args) {
		Sample a =new Sample(10, "a"); //インスタンスのidはaとbで違う
		Sample b =new Sample(10, "b"); //Sampleクラスでequalsメソッドを再定義している
		System.out.println(a.equals(b));
		/*
		 *インスタンスごとにデフォルトのequalsメソッドが定義されている
		 *public boolean equals(Object obj){
		 *    return this = obj;
		 */
	}

}
