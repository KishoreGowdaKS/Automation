package practice1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class robotclass {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("notepad");
		 Robot r1 = new Robot();
		 Thread.sleep(2000);
		 r1.keyPress(KeyEvent.VK_CAPS_LOCK);
		r1.keyPress(KeyEvent.VK_R);
		r1.keyPress(KeyEvent.VK_C);
		r1.keyPress(KeyEvent.VK_B);
		 Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_S);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		 Thread.sleep(2000);
		 r1.keyPress(KeyEvent.VK_C);
			r1.keyPress(KeyEvent.VK_C);
			r1.keyPress(KeyEvent.VK_B);
			r1.keyPress(KeyEvent.VK_ENTER);
			 Thread.sleep(4000);
			r1.keyPress(KeyEvent.VK_ALT);
			r1.keyPress(KeyEvent.VK_F4);
		
		
		}

}
