package practice1;


import org.testng.annotations.Test;



public class Demo1 {
	@Test(priority = 3,dependsOnMethods = "demoB")
	
	public void demoA() {
	
		System.out.println("From DemoA");
		
	}
@Test(priority = 1,enabled = true)

public void demoB() {
		
		System.out.println("From DemoB");
		
	}
@Test(priority = 2,invocationCount = 2)
public void demoC() {
	
	System.out.println("From DemoC");
	
}
}
