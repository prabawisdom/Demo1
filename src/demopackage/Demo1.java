package demopackage;

import org.testng.Assert;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hai";
		String b="hai1";
		boolean boo=a.equals(b);
		Assert.assertFalse(boo);
	}

}
