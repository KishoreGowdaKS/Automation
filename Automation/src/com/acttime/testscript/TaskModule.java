package com.acttime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class TaskModule extends BaseClass  {
@Test
	public void creatTask() {
	Reporter.log("creatTask",true);
	}
@Test
	public void deleteTask() {
	Reporter.log("deleteTask",true);
	}
@Test
	public void modifyTask() {
	Reporter.log("modifyTask",true);
	}
}
