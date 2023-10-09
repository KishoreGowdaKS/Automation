package com.acttime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ProjectModule extends BaseClass  {
@Test
	public void creatProject() {
	Reporter.log("creatProject",true);
	}
@Test
	public void deleteProject() {
	Reporter.log("deleteProject",true);
	}
@Test
	public void modifyProject() {
	Reporter.log("modifyProject",true);
	}

}
