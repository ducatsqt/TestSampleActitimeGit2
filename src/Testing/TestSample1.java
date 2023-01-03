package Testing;

public class TestSample1 {

	
	String mytest="pass";
	
	public void test()
	{
		if(mytest.contains("pa"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
	}
	public static void main(String[] args) {
		System.out.println("test sample");

	}

}
