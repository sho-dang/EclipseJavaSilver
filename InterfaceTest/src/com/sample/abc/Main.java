package com.sample.abc;

public class Main {
	public static void main(String[] args) {
		B b = new B(); //Aクラスの特徴を引き継ぐ
		//b.Test();
		//b.hello();
		SampleImpl s = new SampleImpl();
		s.method();
		s.method2();
		s.method4();
	}
}
