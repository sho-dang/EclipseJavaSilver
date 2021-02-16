package compile13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args){
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

		System.out.println(title.replace("a", "13-34"));
				int[][] arrayInt = new int[2][4];
					//2次元配列の要素の初期化時点ではデフォルト値で表示できる
					System.out.println(arrayInt[1][2]);
				//要素をそのまま入れる場合には[][]で要素を代入
				arrayInt[0][0] = 1 ;
				arrayInt[1][0] = 2 ;
				//1次元配列を初期化する場合には下のように記述(もともと持っていた要素を置き換える)
				//もともと2つの配列に4つずつ要素を確保していたが、
				//初期化をすることで要素数が変更される
				arrayInt[0]=new int[]{1,2,3,4,5};
				arrayInt[1]=new int[]{1,2};

				for(int[] a : arrayInt) {
					for(int b : a) {
						System.out.println(b);
					}
				}
				//2次元配列の中身の1次元配列の要素を初期化している場合は、
				//例：2次元配列で初期化した時の個数
				//System.out.println(arrayInt[1][2]);

		System.out.println(title.replace("a", "13-42"));
				//try-with-resource
				Sample42 sm = new Sample42();
				sm.copy("","");

		System.out.println(title.replace("a", "13-74"));
				char[][] array1 = {{'a','b'},{'c','d'}};
				char[][] array2 = array1.clone();
				char[] array3 = array1[1].clone();

				System.out.println(array1[1]==array3);
				//System.out.println(array1[1]==array3[1]);
				System.out.println(array1[1]==array2[1]);
				System.out.println(array1.equals(array2));

		System.out.println(title.replace("a", "13-76"));
				String upName = "abcde";
				String kanaNum = "あいうえお01234";

				System.out.println(upName.toUpperCase());
				System.out.println(kanaNum.toUpperCase());
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
class Sample42{
	public void copy(String src,String dest){


		try(InputStream inputStream =new FileInputStream(src);
			OutputStream outputStream = new FileOutputStream(dest)){

			byte[] buf = new byte[100];
			int n;
			while ((n = inputStream.read(buf)) >= 0) {
				outputStream.write(buf,0,n);
			}
			//throw new IOException();
		}catch (IOException e){
			System.out.println("catch完了");
		}finally {
			System.out.println("finally");
		}
	}
}
