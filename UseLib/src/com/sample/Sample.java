//packageは一番先頭で宣言する 宣言の前に書けるのはコメントのみである
package com.sample;

import com.sample.lib.Test;  //exports,requiresで宣言したパッケージのみimportできる
import com.sample.lib2.Hello;

public class Sample {
	public static void main(String[] args) {
		Test test = new Test();
		test.execute();

		Hello hello = new Hello();
		hello.say();
	}




}
