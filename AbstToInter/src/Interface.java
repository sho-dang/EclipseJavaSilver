
public interface Interface extends Abstract{
	default void method() {
		System.out.println("ABCD");
	}

	/* オブジェクトクラスのオーバーライドはできない
	default String toString() {
		return "";
	};
	*/
}
