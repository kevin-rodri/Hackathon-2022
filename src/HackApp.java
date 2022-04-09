
import java.awt.Font;
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

		JButton buttonOne = new JButton("Next");
		frame.add(buttonOne);
		buttonOne.setSize(50,50);
		buttonOne.setLocation(650, 475);
		buttonOne.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
					frame.remove(entry);
					frame.remove(entry3);
					frame.remove(entry2);
					frame.repaint();
					
					
					// After clicking next 
					JButton buttonadhd = new JButton("ADHD");
					frame.add(buttonadhd);
					buttonadhd.setSize(100,50);
					buttonadhd.setLocation(100, 450);
					
					
					JButton buttonThree = new JButton("Autism");
					frame.add(buttonThree);
					buttonThree.setSize(100,50);
					buttonThree.setLocation(250, 450);
					
					
					JButton buttonptsd = new JButton("PTSD");
					frame.add(buttonptsd);
					buttonptsd.setSize(100,50);
					buttonptsd.setLocation(400, 450);
					buttonptsd.addMouseListener(new MouseListener() {

						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mousePressed(MouseEvent e) {
							frame.remove(buttonadhd);
							frame.remove(buttonThree);
							frame.remove(buttonptsd);
							buttonOne.setText("Back");
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
					

					buttonadhd.addMouseListener(new MouseListener() {

						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mousePressed(MouseEvent e) {
								frame.remove(buttonadhd);
								frame.remove(buttonThree);
								frame.remove(buttonptsd);
								buttonOne.setText("Back");
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
				

					buttonThree.addMouseListener(new MouseListener() {

						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mousePressed(MouseEvent e) {
							frame.remove(buttonadhd);
							frame.remove(buttonThree);
							frame.remove(buttonptsd);
							buttonOne.setText("Back");
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
		
	
		
		
		
	}

	

	



}
