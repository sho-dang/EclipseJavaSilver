package com.sample;

import com.sample.Enum.name;

public class Main {
	public static void main(String[] args) {
		String title ="-----  a  -----";
		//3-1
		System.out.println(title.replace("a","3-1"));
				/*
				 * aの+=5の計算をしたものを代入する
				 */
				int a = 3;
				int b = a +=5;
				System.out.println(b);

		//3-2
		System.out.println(title.replace("a","3-2"));
				/*
				 *マイナス演算子は減算することと、正負を反転させる役割がある
				 *この場合、マイナス演算子を逆転させてから掛け算を行う
				 */
				int num = 10;
				System.out.println(10 * - num);

		//3-3
		System.out.println(title.replace("a","3-3"));
				/*
				 *  byte = (-128~127) a3は2進数を計算すると128となるためintに変換される 8ビット
				 *  short = (-32768~32767) b3は shortの範囲内のためOK  16ビット
				 *  long = 64ビット int型にlongの値は入れられないため
				 *  float = 小数点より小さい値を扱うので、double型の値は入らない
				 */
				//byte a3 = 0b10000000;
				short b3 = 128 + 128;
				//int c3 = 2 * 3L;
				//float d3 = 10.0;

		//3-4
		System.out.println(title.replace("a","3-4"));
				/*前置インクリメント、後置インクリメント
				 *前置だと ++a4 は 1+a4となる
				 *後置だと a4++ は a4の代入を終えてから"次のa4の変数へ+1"をする
				 */
				int a4 = 10;
				int bd = 10;
				int c4 = a4++ + a4;

				int b4 = a4++ + a4 + a4-- - a4-- + ++a4;
				System.out.println(b4);
				//System.out.println(c4);

		//3-5
		System.out.println(title.replace("a","3-5"));
				/*
				 *  比較演算子は数値にしか適応されない
				 */
				boolean a5 = true;
				boolean b5 = true;
				//System.out.println(a5 <= b5);
		//3-6
		System.out.println(title.replace("a","3-6"));
				/*
				 * &&で,左右の式がtrueじゃなければfalseになるため
				 */
				int a6 = 10;
				int b6 = 10;
				if(10 < a6 && 10 < ++b6) {
					System.out.println(a6 + b6);
				}
		//3-7
		System.out.println(title.replace("a","3-7"));
				/*
				 *
				 */
				int a7 = 100,b7 = 20 , c7 = 30;
				System.out.println(a7 % b7 * c7 + a7 / b7);

		//3-11
		System.out.println(title.replace("a","3-11"));
				/*
				 *
				 */
				Object a11 = new Object();
				Object b11 = null;
				System.out.println(a11.equals(b11));

		//3-12
		System.out.println(title.replace("a","3-12"));
				/*
				 *
				 */
				String a12 = "sample";
				String b12 = "sample";
				System.out.print(a12 == b12);
				System.out.print(", ");
				System.out.println(a12.equals(b12));
		//3-13
		System.out.println(title.replace("a","3-13"));
				/*
				 *
				 */
				String a13 = new String("sample");
				String b13 = "sample";
				System.out.print(a13 == b13);
				System.out.print(", ");
				System.out.println(a13.equals(b13));

		//3-14
		System.out.println(title.replace("a","3-14"));
				/*
				 *
				 */
				String a14 = "abc";
				String b14 = new String(a14);

				int count = 0 ;
				if(a14.intern() == "abc") {
					count++;
				}
				if(b14.intern() == "abc") {
					count++;
				}
				if(a14.intern() == b14.intern()) {
					count++;
				}
				System.out.println(count);

		//3-15
		System.out.println(title.replace("a","3-15"));
				/*
				 *
				 */
				int num15 =10;
				if(num15 <= 10)
				//if num15 <= 10
				//if(num15 <= 10) then
				//if num15 <= 10 then
				System.out.println("ok");

		//3-16
		System.out.println(title.replace("a","3-16"));
				/*
				 *
				 */
				if(false)
				System.out.println("A");
				System.out.println("B");

		//3-17
		System.out.println(title.replace("a","3-17"));
				/*
				 *
				 */
				int num17 = 10;
				if(num17 < 10)
					System.out.println("A");
				else
					System.out.println("B");
				if(num17 == 10)
					System.out.println("C");

		//3-18
		System.out.println(title.replace("a","3-18"));
				/*
				 *
				 */
				int num18 = 10;
				if(num18 == 100)
					System.out.println("A");
				else if (10 < num18)
					System.out.println("B");
				else
				if(num18 == 10)
					System.out.println("C");
				else
				if (num18 == 10)
					System.out.println("D");

		//3-19
		System.out.println(title.replace("a","3-19"));
				/*
				 *
				 */
				char a19 = 'A';
				byte b19 = 127;
				short c19 = 30000;
				int d19 = 19;
				long e19 = 10L; //switchできない
				String f19 = "FF";
				name creature = name.Sato; //switchできるがdefaultも定義しないといけない
				boolean  h19 = true;

				switch(a19) {
				case 'A' : System.out.println("A");
				break;
				}
				switch(b19) {
				case 127 : System.out.println("B");
				break;
				}
				switch(c19) {
				case 30000 : System.out.println("C");
				break;
				}
				switch(d19) {
				case 19 : System.out.println("D");
				break;
				}
				/*
				switch(e19) {
				case 10L : System.out.println("E");
				break;
				}
				*/
				switch(f19) {
				case "FF" : System.out.println("F");
				break;
				}
				switch(creature) {
				case Sato : System.out.println("G");
				break;
				default : System.out.println("なし");
				}
				/*
				switch(h19) {
				case true : System.out.println("H");
				break;
				}
				*/
		//3-20
		System.out.println(title.replace("a","3-20"));
				/*
				 *
				 */
				final int NUM = 0 ;
				int num20 = 10 ;
				switch (num20) {
				//case "10" : System.out.println("A");
				//			break;
				//case num20 : System.out.println("B");
				//			break;
				case 2*5 : System.out.println("C");
							break;
				case NUM : System.out.println("D");
							break;
				}
		//3-21
		System.out.println(title.replace("a","3-21"));
				/*
				 *
				 */
				int num21 = 1 ;
				switch (num21) {
				case 1 :
				case 2 :
				case 3 : System.out.println("A");
				case 4 : System.out.println("B");
				default:
					System.out.println("C");
		}
	}
	}

