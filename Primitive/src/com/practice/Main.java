package com.practice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ifWhile1();


	}

	public static void ifWhile1() {
		int val = 7;
		boolean flug = true; //書籍ではbooleanの型がboolになっていたためコンパイルエラーとなる
		if(flug == true) {
			do { //tureだったら実行
				System.out.println(val);
				val --;
			} while (val > 0);//繰り返し判定
		}
	}

	public static void primitive2() {
		//int型でコンパイルエラーとなるのはどれ
		/**
		 * a = 267は10進数の整数リテラル表記
		 * b = 接頭語が0で始まるのは8真数であるからOK
		 * c = 接頭語が0xで始まるのは16真数であるからOK
		 * d = 接頭語が0bで始まるのは2真数であるからOK
		 */

		int a = 267;
		int b = 0413;
		int c = 0x10B;
		int d = 0b100001011;
		//int e = 0827;
	}
	public static void primitive3() {
		//コンパイルエラーとなるのはどれ
		/**
		 *  アンダースコアは桁数の多いリテラル表記を見やすくするために導入された
		 *  ルール
		 *  ・リテラルの先頭と末尾には記述できない
		 *  ・記号の前後には記述できない
		 */
		int a = 123_456_789;
		int b = 5_________2;
		//int c = _123_456_789;
		//int d = 123_456_789_;
		//float e = 3_.1415F;
		//int f = 999_99_9999_L;
		int g = 0b0_1;
		int h = 0_52;
		//int i = 0x_52;
	}
	public static void char4() {
		//char方の変数の初期化として正しいものはどれ

		//char a = "a";
		//char b = 'abc';
		char c = 89;//16進数の４桁の数値(16×16×16×16)を変換できることから、数値(1~65536)の変換が可能なため
		//char d = null;

	}
	public static void primitive5() {
		//コンパイルエラーとなるものはどれ
		/**
		 * javaでは変数やメソッド、クラスのことを識別子と呼ぶ
		 * 識別子のルール
		 * ・予約語は記述できない（String、int、boolean、if、whileなど）
		 * ・使える記号はアンダースコア「_」、通貨記号「$」のみ
		 * ・数字から始めてはいけない
		 */

		int $a = 100;
		int b_ = 200;
		int _0 = 300;
		//int ${d} = 400; //$は使えるが、{}の記号は使えない
		//int g.a = 700;  //変数名に「.」があるとエラーとなる。ただし、「,」だと使える？
	}
	public static void var6() {
		//コンパイルエラーとならないものはどれ
		/**
		 * 型推論：変数宣言時のデータ型を推論する機能
		 * ローカル変数＝スコープ内で定義した変数
		 * varの型で定義した場合、Stringやintといった型指定をしなくとも、値の記述に応じて、自動で型を決定してくれる
		 * 型推論のルール
		 * ・右辺の値に応じて型決定をする
		 * ・メソッドの戻り値から型決定をする
		 * ・ラムダ式からは変数の型を推論できない
		 * ・配列の初期化を行うと型を推論できない
		 * ・ダイヤモンド演算子で型が推論できない場合はObject型<Object>が適用される
		 */

		//var a;  //右辺が無い
		//var b = null;  //nullでは型決定ができない
		//var c = () -> {};  // ラムダ式は型推論ができない
		//var d = {1,2,3};  // 配列初期化では型推論ができない
		var e = new ArrayList<>(); //ダイヤモンド演算子で指定された型を参照する。<>の場合は自動的にObject型が指定されているためOK
	}
	public static void name() {

	}
}