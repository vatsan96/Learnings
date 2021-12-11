package test;

import org.testng.annotations.Test;

public class TestTutorial {


	
	@Test
	public void test() {
		System.out.println("abc");
	}
	
	@Test
	public void test2() {
		System.out.println("def");
		String str = "123RAM1222";
		String str1 = str.substring(2);
		System.out.println(str1);
	}


}
