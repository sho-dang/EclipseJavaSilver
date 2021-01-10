package com.compile;

public class Main {

	public static void main(String[] args) {
		var a = new B(); //型推論では作成したBの型が当てられる
		//a = new C(); //ただし、Bの型にCの型は当てられないのでコンパイルエラーとなる
		a.test();
	}

}
