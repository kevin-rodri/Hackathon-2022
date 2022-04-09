
import java.awt.Color;
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

		JLabel entry = new JLabel("Welcome to our app");
		entry.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.add(entry);
		entry.setSize(200, 60);
		entry.setLocation(325, 150);

		JLabel entry3 = new JLabel("Information about this app:");
		entry3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.add(entry3);
		entry3.setSize(255, 60);
		entry3.setLocation(290, 200);

		JLabel entry2 = new JLabel(
				"<html>This app is made to educate people about some of the disabilities that people live with everyday. 1 out of 4 people in United States of America have a disability. It is important to learn about disability so we can gain knowledge about how we can help people with disability. This app aims to spread information about this topic.<br/> To learn more about disabilities, click the next button.</html>");
		entry2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.add(entry2);
		entry2.setSize(1000, 60);
		entry2.setLocation(400, 250);

		JButton buttonOne = new JButton("Next");
		frame.add(buttonOne);
		buttonOne.setSize(50, 50);
		buttonOne.setLocation(650, 475);
		buttonOne.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {
				frame.remove(entry);
				frame.remove(entry3);
				frame.remove(entry2);
				frame.repaint();

				// After clicking next
				JLabel instructions = new JLabel(
						"<html>Click on either of the three buttons to learn more about them. Once you are finished you can pressed the back button if you <br/> want to learn more!</html>");
				instructions.setFont(new Font("Times New Roman", Font.BOLD, 14));
				frame.add(instructions);
				instructions.setSize(1000, 100);
				instructions.setLocation(5, 200);

				JButton buttonadhd = new JButton("ADHD");
				frame.add(buttonadhd);
				buttonadhd.setSize(100, 50);
				buttonadhd.setLocation(10, 450);

				JButton buttonThree = new JButton("Autism");
				frame.add(buttonThree);
				buttonThree.setSize(100, 50);
				buttonThree.setLocation(125, 450);

				JButton buttonSources = new JButton("Sources");
				frame.add(buttonSources);
				buttonSources.setSize(100, 50);
				buttonSources.setLocation(400, 450);

				JButton buttonptsd = new JButton("PTSD");
				frame.add(buttonptsd);
				buttonptsd.setSize(100, 50);
				buttonptsd.setLocation(250, 450);
				buttonptsd.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {}

					@Override
					public void mousePressed(MouseEvent e) {
						frame.remove(buttonadhd);
						frame.remove(buttonThree);
						frame.remove(buttonptsd);
						frame.remove(instructions);
						frame.remove(buttonSources);
						buttonOne.setText("Back");
						
						buttonOne.addMouseListener(new MouseListener(){

							@Override
							public void mouseClicked(MouseEvent e) {}

							@Override
							public void mousePressed(MouseEvent e) {
								frame.repaint();
								
							}

							@Override
							public void mouseReleased(MouseEvent e) {}

							@Override
							public void mouseEntered(MouseEvent e) {}

							@Override
							public void mouseExited(MouseEvent e) {}
						
						});
						frame.repaint();

					}

					@Override
					public void mouseReleased(MouseEvent e) {}

					@Override
					public void mouseEntered(MouseEvent e) {}

					@Override
					public void mouseExited(MouseEvent e) {}

				});

				buttonadhd.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {}

					@Override
					public void mousePressed(MouseEvent e) {
						frame.remove(buttonadhd);
						frame.remove(buttonThree);
						frame.remove(buttonptsd);
						frame.remove(instructions);
						frame.remove(buttonSources);
						buttonOne.setText("Back");

						JLabel entry = new JLabel("Attention deficit hyperactivity disorder");
						entry.setFont(new Font("Times New Roman", Font.BOLD, 20));
						frame.add(entry);
						entry.setSize(500, 60);
						entry.setLocation(250, 1);
						JLabel entry2 = new JLabel("Symptoms of ADHD:");
						entry2.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry2);
						entry2.setSize(400, 60);
						entry2.setLocation(1, 40);
						JLabel entry3 = new JLabel(
								"<html>The primary features of ADHD include inattention and hyperactive-impulsive behavior. ADHD symptoms start<br/>before age 12, and in some children, they're noticeable as early as 3 years of age. ADHD symptoms can be mild,<br/>moderate or severe, and they may continue into adulthood. ADHD occurs more often in males than in females,<br/> and behaviors can be different in boys and girls.</html>");
						entry3.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry3);
						entry3.setSize(10000, 100);
						entry3.setLocation(1, 75);
						JLabel entry4 = new JLabel(
								"<html>There are three subtypes of ADHD.<br/>* Predominantly inattentive: The majority of symptoms fall under inattention.<br/>* Predominantly hyperactive/impulsive. The majority of symptoms are hyperactive and impulsive.<br/>* Combined. This is a mix of inattentive symptoms and hyperactive/impulsive symptoms.</html>");
						entry4.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry4);
						entry4.setSize(10000, 100);
						entry4.setLocation(1, 200);

						JLabel entry5 = new JLabel(
								"<html>How do you help people with ADHD.<br/>* Understand the potential impairments of ADHD.<br/>* Acknowledge the impact ADHD has on you.<br/>* Assess your loved one’s readiness to change.<br/>* Know the best treatments for ADHD</html>");
						entry5.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry5);
						entry5.setSize(10000, 100);
						entry5.setLocation(1, 325);

						

						JLabel entry6 = new JLabel(" ");
						entry6.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry6);
						entry6.setSize(10000, 100);
						entry6.setLocation(1, 500);
						
						
					
						buttonOne.addMouseListener(new MouseListener(){

							@Override
							public void mouseClicked(MouseEvent e) {}

							@Override
							public void mousePressed(MouseEvent e) {
								frame.remove(entry);
								frame.remove(entry2);
								frame.remove(entry3);
								frame.remove(entry4);
								frame.remove(entry5);
								frame.remove(entry6);
								frame.repaint();
								
							}

							@Override
							public void mouseReleased(MouseEvent e) {}

							@Override
							public void mouseEntered(MouseEvent e) {}

							@Override
							public void mouseExited(MouseEvent e) {}
						
						});
							
						
						frame.repaint();

					}

					@Override
					public void mouseReleased(MouseEvent e) {}

					@Override
					public void mouseEntered(MouseEvent e) {}

					@Override
					public void mouseExited(MouseEvent e) {}

				});

				buttonThree.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {}

					@Override
					public void mousePressed(MouseEvent e) {
						frame.remove(buttonadhd);
						frame.remove(buttonThree);
						frame.remove(buttonptsd);
						frame.remove(instructions);
						frame.remove(buttonSources);
						buttonOne.setText("Back");
						
						buttonOne.addMouseListener(new MouseListener(){

							@Override
							public void mouseClicked(MouseEvent e) {}

							@Override
							public void mousePressed(MouseEvent e) {
								
								frame.repaint();
								
							}

							@Override
							public void mouseReleased(MouseEvent e) {}

							@Override
							public void mouseEntered(MouseEvent e) {}

							@Override
							public void mouseExited(MouseEvent e) {}
						
						});
						
						frame.repaint();

					}

					@Override
					public void mouseReleased(MouseEvent e) {}

					@Override
					public void mouseEntered(MouseEvent e) {}

					@Override
					public void mouseExited(MouseEvent e) {}

				});

				buttonSources.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {}

					@Override
					public void mousePressed(MouseEvent e) {
						frame.remove(buttonadhd);
						frame.remove(buttonThree);
						frame.remove(buttonptsd);
						frame.remove(instructions);
						frame.remove(buttonSources);

						JLabel entry6 = new JLabel(
								"<html>Source for ADHD: https://www.healthline.com/health/adhd/dating-someone-with-adhd<br/>https://www.mayoclinic.org/diseases-conditions/adhd/symptoms-causes/<html>");
						entry6.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry6);
						entry6.setSize(10000, 100);
						entry6.setLocation(1, 100);
						buttonOne.setText("Back");
						
						
						buttonOne.addMouseListener(new MouseListener(){

							@Override
							public void mouseClicked(MouseEvent e) {}

							@Override
							public void mousePressed(MouseEvent e) {
								frame.remove(entry6);
								frame.repaint();
								
							}

							@Override
							public void mouseReleased(MouseEvent e) {}

							@Override
							public void mouseEntered(MouseEvent e) {}

							@Override
							public void mouseExited(MouseEvent e) {}
						
						});
						frame.repaint();

					}

					@Override
					public void mouseReleased(MouseEvent e) {}

					@Override
					public void mouseEntered(MouseEvent e) {}

					@Override
					public void mouseExited(MouseEvent e) {}

				});
			}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

		});

	}

}
