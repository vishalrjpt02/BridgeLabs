package Singleton;

public class Eager {
	
	public static void main(String []args)
	{
		System.out.println(eager.getInstance());
	}
}
 class eager
 {
	 private static final eager Bridgelab=new eager();
		
		private eager(){}
		
		public static eager getInstance()
		{
			return Bridgelab;
		}
 }
