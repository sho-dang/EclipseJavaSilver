package com.sample;

public class Main {

	public static void main(String[] args) {
		Sample s1 = new Sample(10);
		Sample s2 = s1;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		s1 = new Sample(10);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		/**
		 * s1 = 100 101 102 103
		 * s2 = 100 101 102 103
		 * s1書き換え = 200 201 202 203
		 *
		 */
	}

}
