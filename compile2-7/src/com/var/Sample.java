package com.var;


public class Sample {
	//private var value ; //型推論はローカル変数でしか定義できないためフィールド変数に書くとコンパイルエラーとなる
	/*
	public Sample(var value) { //型推論を引数で使うことはできない。なぜなら、右辺の値によって型を判断しているから。
		this.value = value;
	}
	*/
	public void test() {
		//System.out.println(value); //コンパイルエラーのため表示できない
	}
}
