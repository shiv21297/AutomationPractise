package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NotepadTest {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(2000);
		
		Robot robo=new Robot();
		
		robo.keyPress(KeyEvent.VK_S);
		robo.keyPress(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		}
}

