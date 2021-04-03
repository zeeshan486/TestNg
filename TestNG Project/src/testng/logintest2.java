package testng;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class logintest2 {
	@Test
	  public void test4() {
		  String a = "syed";
		  String b = "syed";
		  assertEquals(a,b);
		  System.out.println("test4");
	  }
  @Test
  public void test5() {
	  String a = "syed";
	  String b = "syedali";
	  assertEquals(a,b);
	  System.out.println("test5");
  }
}
