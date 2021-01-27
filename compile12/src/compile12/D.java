package compile12;

import java.util.ArrayList;
import java.util.List;



public class D extends C{
	public static void main(String[] args) {
		List<A> listA = new ArrayList<>();
		listA.add(new D());

		List<B> listB = new ArrayList<>();
		listB.add(new C());

		List<B> listC = new ArrayList<>();
		listC.add(new D());

		List<D> listD = new ArrayList<>();
		//listD.add(new C());

		List<A> listE = new ArrayList<>();
		listE.add(new C());
	}
}
