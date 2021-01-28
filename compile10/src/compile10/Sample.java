package compile10;


public class Sample {
		public void test(String val) throws Exception {

			if(val == null){
				throw new Exception();
			}

			if("".equals(val)) {
				throw new IllegalArgumentException();
			}
			System.out.println("do samething");
		}
}
