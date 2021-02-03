import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String title = "------   a   ------";

		Sample[] samples = { new Sample(2,"B"),
							new Sample(3, "C"),
							new Sample(1, "A")};

	List<Sample> list = new ArrayList<Sample>(Arrays.asList(samples));
	list.sort(new SampleComparator());
	for(Sample str : list) {
		System.out.println(str.getName());
	}
	List<Integer> list2 = Arrays.asList(new Integer[] {3,2,1});
	list2.sort((a,b) -> -a.compareTo(b));
	for(Integer num : list2) {
		System.out.println(num);
	}

	LocalDate a = LocalDate.of(2019,8,19);
	LocalDate b = LocalDate.of(2019,8,20);
	b.with(DayOfWeek.MONDAY);
	System.out.println(a.equals(b)+","+a.isBefore(b));
	System.out.println();

	System.out.println(title.replace("a","9-17"));
			/* Arrays asListではリストの変更は本来できないが、
			 * mutableなオブジェクトであるArrayListの引数へ入れることで、変更することができる。
			 *
			 *
			 */
			List<String> listA = new ArrayList<>(Arrays.asList(new String[]{"A","B","C","D"}));
			listA.removeIf(
					(String str) -> str.equals("B")
					);
			listA.forEach(System.out::println);

			//ArraysでのimmutableなコレクションではremoveIfをしようとすると例外が発生する
			List<String> listB = Arrays.asList(new String[]{"A","B","C","D"});
			listB.removeIf(
					(String str) -> str.equals("B")
					);
			listB.forEach(System.out::println);
	}

}
