package compile13;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
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
	}
	private static void test(int num)throws IOException,IndexOutOfBoundsException{
		if(num < 10) {
			throw new FileNotFoundException();
		}else {
			throw new IndexOutOfBoundsException();
		}
	}

}
