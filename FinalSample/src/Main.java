
public class Main {

	public static void main(String[] args) {
		final int number ;

		number = 100;
		System.out.println(number);

		FinalInt fi = new FinalInt();
		System.out.println(fi.number1);

		FinalInt fi2 = new FinalInt(10);
		System.out.println(fi2.number1);
	}

}
