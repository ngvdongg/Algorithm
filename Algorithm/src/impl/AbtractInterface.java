package impl;

public class AbtractInterface {
	public static void main(String[] args) throws Exception {
//		AbtractInterface a=new AbtractInterface();
		superclass sp=new subclass();
		subclass sub= (subclass)sp;
		sub.action();
		sub.run(1, 2.0);
		 
		
	}
}
