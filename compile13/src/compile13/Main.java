package compile13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String title = "------  a  ------";


		//A
		/*
		 *throwしているIOExceptionをcatchしていない
		 */
		/*
		try {test(0);}
		catch(FileNotFoundException e) {}
		catch (IndexOutOfBoundsException e) {}
		*/

		//B
		/* IOExceptionをcatchしていない
		try {test(0);}
		catch(IndexOutOfBoundsException e) {}
		catch (FileNotFoundException e) {}
		*/

		//C
		/* catchが複数あるがFileNotFoundExceptionもIOExceptionの一部のため重複している
		try {test(0);}
		catch(FileNotFoundException | IOException e) {}
		*/

		//D

		try {test(0);}
		catch(IOException e) {}
		//*/

		//E

		/* IOExcptionをcatchしていない
		try {test(0);}
		catch (FileNotFoundException | IndexOutOfBoundsException e) {}
		//*/


		Sample sample = new Sample();
		System.out.println(sample.toString());


		System.out.println(title.replace("a", "13-5"));
				/*
				 *
				 */
				Sample5 sample5 = new Sample5();

				System.out.println(sample5.value5);
				System.out.println(sample5.num5);

		System.out.println(title.replace("a", "13-20"));
				/*
				 * 配列を表示する時、呼び出した値がnullの場合、そのままnullが表示される
				 * オブジェクトの場合は、ヌルポになる
				 * 配列の値の場合は、nullとなると仮定。
				 */
				String[] array = new String[5];
				array[1]= "A";
				array[2]= "B";
				array[3]= "C";
				for(String str : array) {
				System.out.print(str);
				}
				System.out.println(array[0]);


		System.out.println(title.replace("a", "13-29"));

			final int numss;
			//System.out.println(numss);//初期化していないと値を使用できない
			numss = 3;
			//numss = 6; finalのため1度目の代入の後は変更できない
			System.out.println(numss);

		System.out.println(title.replace("a", "13-31"));
			/*
			 * Mapについて
			 *
			 */
			Map<String,String> maps = new HashMap<>();
			maps.put("A","こんにちは");
			maps.put("B","おはようございます");
			maps.put("C","こんばんは");

			SampleB31 sa  = new SampleB31();
			sa.set(maps);
			System.out.println(sa.getC());
			System.out.println(maps.get("A"));
			System.out.println(maps.get("B"));
			System.out.println(maps.get("C"));
			System.out.println(maps.values());
			System.out.println(maps.keySet());
	}
	private static void test(int num)throws IOException,IndexOutOfBoundsException{
		if(num < 10) {
			throw new FileNotFoundException();
		}else {
			throw new IndexOutOfBoundsException();
		}
	}



}
class Sample5{
	String value5 ;
	int num5;
}
class Sample31{
	private Collection collection;
	public void set(Collection collection) {
		this.collection = collection;
	}
	public Collection getC() {
		return this.collection;
	}
}
class SampleB31 extends Sample31{
	public void set(Map<String,String> map) {
		set(map.values());
	}
}
