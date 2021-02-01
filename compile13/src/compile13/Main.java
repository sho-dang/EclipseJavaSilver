package compile13;

import java.io.FileNotFoundException;
import java.io.IOException;

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
	}
	private static void test(int num)throws IOException,IndexOutOfBoundsException{
		if(num < 10) {
			throw new FileNotFoundException();
		}else {
			throw new IndexOutOfBoundsException();
		}
	}



}
