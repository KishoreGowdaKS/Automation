package com.acttime.testscript;


import org.checkerframework.checker.signature.qual.FullyQualifiedName;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
@Test
	public void creatCustomer() {
	Assert.fail();
		Reporter.log("creatCustomer",true);
	}
@Test(dependsOnMethods = "creatCustomer")
	public void deleteCustomer() {
	
	Reporter.log("deleteCustomer",true);
	}
@Test
	public void modifyCustomer() {
	Reporter.log("modifyCustomer",true);
	}



}
