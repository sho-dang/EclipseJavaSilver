
public class Extend extends Abst{
	//アクセス修飾子無し
	void Abst1() {}		        //可能
	//public void Abst1() {}    //可能
	//protected void Abst1(){}  //可能
		//private void Abst1() {}  //不可

	//public
	public void Abst2() {}  //可能
		//void Abst2() {}		     //不可
		//protected void Abst2() {}  //不可
		//private void Abst2() {}    //不可

	//protected
	protected void Abst3() {} //可能
	//public void Abst3() {}  //可能
		//void Abst3(){}            //不可
		//private void Abst3() {}   //不可

	//privateは全て不可
}
