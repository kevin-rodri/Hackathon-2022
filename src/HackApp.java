
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
		
		JLabel entry3 = new JLabel("Information about this app:");
		entry3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.add(entry3);
		entry3.setSize(255, 60);
		entry3.setLocation(290,200);
		
		JLabel entry2 = new JLabel("<html>This app is made to educate people about some of the disabilities that people live with everyday. 1 out of 4 people in United States of America have a disability. It is important to learn about disability so we can gain knowledge about how we can help people with disability. This app aims to spread information about this topic.<br/> To learn more about disabilities, click the next button.</html>");
		entry2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.add(entry2);
		entry2.setSize(1000, 60);
		entry2.setLocation(400,250);
//		JButton buttonOne = new JButton("Option One");
//		frame.add(buttonOne);
//		buttonOne.setSize(100,50);
//		buttonOne.setLocation(100, 450);
//		
//		JButton buttonTwo = new JButton("Option Two");
//		frame.add(buttonTwo);
//		buttonTwo.setSize(100,50);
//		buttonTwo.setLocation(250, 450);
//		
//		
//		JButton buttonThree = new JButton("Option Three");
//		frame.add(buttonThree);
//		buttonThree.setSize(100,50);
//		buttonThree.setLocation(400, 450);
		
	}

}
