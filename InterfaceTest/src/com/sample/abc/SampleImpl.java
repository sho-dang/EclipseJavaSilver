package com.sample.abc;

public class SampleImpl implements SampleInterface{

		public void method() {
			System.out.println(str);
			method4();
		}
		//void method2() { }
		public void method2() { }

		public void method4() {
			System.out.println("オーバーライド");
		}

}
