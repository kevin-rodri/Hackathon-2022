
import java.awt.Font;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HackApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Accessability App");
		frame.setSize(800, 600);
		frame.setVisible(true);
		JLabel entry = new JLabel("Welcome to our app");
		entry.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.add(entry);
		entry.setSize(200, 60);
		entry.setLocation(325,150);
		
		
		JButton buttonOne = new JButton("Option One");
		frame.add(buttonOne);
		buttonOne.setSize(100,50);
		buttonOne.setLocation(100, 450);
		
		JButton buttonTwo = new JButton("Option Two");
		frame.add(buttonTwo);
		buttonTwo.setSize(100,50);
		buttonTwo.setLocation(250, 450);
		
		
		JButton buttonThree = new JButton("Option Three");
		frame.add(buttonThree);
		buttonThree.setSize(100,50);
		buttonThree.setLocation(400, 450);
	}

}
