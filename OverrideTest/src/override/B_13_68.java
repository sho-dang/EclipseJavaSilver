package override;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class B_13_68 extends A_13_68{
		/*
		public ArrayList<Integer> test(Set<Character> s){
			return null;
		}
		*/

		public List<Integer> test(TreeSet<String> s){
			return null;
		}

		/*
		public List<Integer> test(Set<String> s){
			return null;
		}
		*/
		/*
		public List<Object> test(Set<CharSequence> s){
			return null;
		}
		*/
		/*
		public List<Integer> test(Set<CharSequence> s){
			return null;
		}
		*/
		public ArrayList<Number> test(Set<CharSequence> s){
			return null;
		}

		//戻り値のオーバーライド確認

			/* 共変値(サブクラス)でのオーバーライド不可
			public List<String>  text(){
				return null;
			}
			*/

			//共変値でも引数が違えばオーバーロードとして定義可能
			public List<String>  text(String name){
				return null;
			}

			//同じ型バラメータであればオーバーライド可能
			public List<Object> text(){
				return null;
			}

		//引数のオーバーライド確認
			//引数違いではオーバーロードとして定義可能
			public String returnText() {
				return null;
			}
			//型パラメータ同じであれば、オーバーライド可能
			public String returnText(List<String> list) {
				return null;
			}
			//共変値(実装クラス)でオーバーロードとして定義可能
			//@Override //オーバーライドアノテーションをつけるとエラーとなる
			public String returnText(ArrayList<String> list) {
				return null;
			}
			//Setのオーバーライド確認
			public String returnText(Set<String> list) {
				return null;
			}
			//共変値(実装クラス)でオーバーロードとして定義可能
			public String returnText(TreeSet<String> list) {
				return null;
			}
}
