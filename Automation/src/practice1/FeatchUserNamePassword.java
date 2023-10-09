package practice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FeatchUserNamePassword {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Data/commondata.property");
		Properties pro = new Properties();
		pro.load(fis);
		String url = pro.getProperty("url");
		System.out.println(url);
		String un = pro.getProperty("username");
		System.out.println(un);
		String pwd = pro.getProperty("password");
		System.out.println(pwd);
	}

}
