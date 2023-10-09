package practice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Data/commondata.property");
		Properties pobj = new Properties();
		pobj.load(fis);
		String url = pobj.getProperty("url");
		System.out.println(url);
		String un = pobj.getProperty("username");
		System.out.println(un);
		String pwd = pobj.getProperty("password");
		System.out.println(pwd);
		
		
		
	}

}
