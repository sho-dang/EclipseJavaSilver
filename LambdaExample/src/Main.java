import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		Function<String,Integer> func1 = string -> Integer.parseInt(string);
		System.out.println(func1.apply("12345"));
		System.out.println("applyメソッドは、Function<T,R>のTの引数を、Rの引数に変換して値を返す");

		Function<String,String> wrapD = str ->  "\"" + str + "\"";
		Function<String,String> wrapS = str ->  "'" + str + "'";
		String result = wrapD.apply(wrapS.apply("hoge"));
		System.out.println(result);

		//composeはFanction処理の前に別の処理を施すことができる
		Function<String,String> wrapDS = wrapD.compose(wrapS);
		System.out.println(wrapDS.apply("hoge"));

		//identityメソッド Fanctionオブジェクトで受け取った値をそのまま返す。
		Function<String,String> iden = Function.identity();
		System.out.println(iden.apply("アイデンティティー"));

		//Functionの拡張インターフェース
		//Functionオブジェクトの引数で渡した値を、戻り値としてそのまま同じ型で返す
		UnaryOperator<String> unary = str -> "[" + str + "]";
		System.out.println(unary.apply("hoge"));

		Consumer<String> consumer = str -> System.out.println("Consumerはacceptメソッドで引数の値を受け取り、"+ str);
		consumer.accept("埋め込んで処理を実行する");

		//andthenメソッドは下記の記述の場合、引数で渡された時、「hoge」の処理をした後、「fuga」の処理を行う
		Consumer<String> hoge = str -> System.out.println("hoge " + str);
		Consumer<String> fuga = str -> System.out.println("fuga " + str);
		Consumer<String> piyo = hoge.andThen(fuga);
		piyo.accept("piyo");



		//Supplier
		//引数を受け取らず、値を返す
		Supplier<String> supplier = () -> "hoge";
		System.out.println(supplier.get());

		Predicate<String> predicate = str -> str.isEmpty();
		System.out.println(predicate.test(""));
		System.out.println(predicate.test("hoge"));

		Predicate<String> isHoge = Predicate.isEqual("hoge");
		System.out.println(isHoge.test("fuga"));
		System.out.println(isHoge.test("hoge"));

		Predicate<Object> isNull = Predicate.isEqual(null);
		System.out.println(isNull.test(null));
		System.out.println(isNull.test(""));

		Predicate<String> isUpperCase = str -> str.matches("[A-Z]+");
		Predicate<String> isAlphabet = str -> str.matches("[a-zA-Z]+");

		Predicate<String> predicate2 = isUpperCase.and(isAlphabet);
		System.out.println(predicate2.test("HOGE"));
		System.out.println(predicate2.test("hoge"));

		Predicate<String> isEmpty = str -> str.isEmpty();
		Predicate<String> isNotEmpty = isEmpty.negate();

		//
		System.out.println(isNotEmpty.test(""));
		System.out.println(isNotEmpty.test("hoge"));



	}

}
