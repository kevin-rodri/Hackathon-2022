
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HackApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Accessability App");
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		//https://stackoverflow.com/questions/21357286/adding-a-editable-text-box-to-a-jframe 
		JTextField text = new JTextField();
		frame.add(text);
		text.setSize(200, 50);
		text.setLocation(375, 200);
		*/
		
		JLabel entry = new JLabel("Welcome to our app");
		entry.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.add(entry);
		entry.setSize(200, 60);
		entry.setLocation(325,150);
		
		
		JButton buttonOne = new JButton("Next");
		frame.add(buttonOne);
		buttonOne.setSize(100,50);
		buttonOne.setLocation(675, 475);
		buttonOne.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
					frame.remove(entry);
					frame.repaint();
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		});
		
	
		
		/*
		JButton buttonTwo = new JButton("Option Two");
		frame.add(buttonTwo);
		buttonTwo.setSize(100,50);
		buttonTwo.setLocation(250, 450);
		
		
		JButton buttonThree = new JButton("Option Three");
		frame.add(buttonThree);
		buttonThree.setSize(100,50);
		buttonThree.setLocation(400, 450);
		*/
	}

	

	



}
