package ch7;
import java.awt.*;
import java.awt.event.*;

public class Exercise7_28 {

	public static void main(String[] args) {
		Frame f = new Frame();

		f.addWindowListener(new WindowAdapter() { 
		
		public void windowClosing(WindowEvent e) { 

			e.getWindow().setVisible(false); 

			e.getWindow().dispose(); 
			System.exit(0); 

			} 

		}); 

	}

}