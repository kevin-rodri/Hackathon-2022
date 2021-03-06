
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HackApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Accessability App");
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel entry = new JLabel("Welcome!");
		entry.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.add(entry);
		entry.setSize(200, 30);
		entry.setLocation(325, 170);

		JLabel entry3 = new JLabel("Information About This App:");
		entry3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.add(entry3);
		entry3.setSize(255, 60);
		entry3.setLocation(290, 210);

		//https://docs.oracle.com/javase/tutorial/uiswing/components/html.html (line 34)
		JLabel entry2 = new JLabel(
				"<html>This app is made to educate people about some of the disabilities that people live with everyday. 1 out of 4 people in United States of America have a disability. It is important to learn about disability so we can gain knowledge about how we can help people with disability. This app aims to spread information about this topic.<br/> To learn more about disabilities, click the next button.</html>");
		entry2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.add(entry2);
		entry2.setSize(1000, 60);
		entry2.setLocation(400, 300);
		
		// https://stackoverflow.com/questions/6673833/using-an-imageicon-and-a-jlabel (lines 40-45)
		ImageIcon pic = new ImageIcon("Images/access.jpg");
		JLabel image = new JLabel(pic);
		frame.add(image);
			image.setSize(207, 173);
			image.setLocation(100, 375);
		

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
				frame.remove(image);
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
				
				JButton help = new JButton("Resources");
				frame.add(help);
				help.setSize(100, 50);
				help.setLocation(510, 450);

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
						frame.remove(help);

						JLabel entry = new JLabel("Post-traumatic stress disorder");
						entry.setFont(new Font("Times New Roman", Font.BOLD, 20));
						frame.add(entry);
						entry.setSize(500, 60);
						entry.setLocation(250, 1);
						JLabel entry2 = new JLabel("What is PTSD");
						entry2.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry2);
						entry2.setSize(400, 60);
						entry2.setLocation(1, 40);
						JLabel entry3 = new JLabel("<html>A disorder in which a person has difficulty recovering after experiencing or witnessing a terrifying event.<br/>The condition may last months or years, with triggers that can bring back memories of the trauma,<br/>accompanied by intense emotional and physical reactions. Types of events that can lead to PTSD include:<br/>serious accidents. physical or sexual assault.</html>");
						entry3.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry3);
						entry3.setSize(10000, 100);
						entry3.setLocation(1, 75);
						JLabel entry4 = new JLabel("Symptoms of PTSD");
						entry4.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry4);
						entry4.setSize(10000, 100);
						entry4.setLocation(1, 145);

						JLabel entry5 = new JLabel("<html>* Inability to Focus.<br/>* Flashbacks.<br/>* Intense Anger.<br/>* Physical Illness.<br/>* Inability to Connect / Isolation and Depression</html>");
						entry5.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry5);
						entry5.setSize(1000, 100);
						entry5.setLocation(1,210);
						

						JLabel entry6 = new JLabel("<html>How can you help a person with PTSD:<br/><br/>* Be Supportive.<br/>* Be Patient (Don't Pressure Them).<br/>* Don't Judge.<br/>* Show Respect.<br/>* Learn About Their Triggers. <br/>* Encourage Them to Seek Treatment.</html>");
						entry6.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry6);
						entry6.setSize(1000, 200);
						entry6.setLocation(1,300);
			

						JLabel entry7 = new JLabel(" ");
						entry7.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry7);
						entry7.setSize(10000, 100);
						entry7.setLocation(1, 500);

						buttonOne.setText("Back");
						
						ImageIcon pic = new ImageIcon("Images/ptsd.png");
						JLabel image = new JLabel(pic);
						frame.add(image);
						image.setSize(204, 204);
						image.setLocation(350, 300);

						
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
								frame.remove(entry7);
								frame.remove(image);
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
						frame.remove(help);
						buttonOne.setText("Back");

						JLabel entry = new JLabel("Attention Deficit Hyperactivity Disorder");
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
								"<html>The primary features of??ADHD??include inattention and hyperactive-impulsive behavior. ADHD??symptoms start<br/>before age 12, and in some children, they're noticeable as early as 3 years of age. ADHD??symptoms can be mild,<br/>moderate or severe, and they may continue into adulthood. ADHD??occurs more often in males than in females,<br/> and behaviors can be different in boys and girls.</html>");
						entry3.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry3);
						entry3.setSize(10000, 100);
						entry3.setLocation(1, 75);

						JLabel entry4 = new JLabel(
								"<html>There are three subtypes of ADHD.<br/><br/>* Predominantly inattentive.??The majority of symptoms fall under inattention.<br/>* Predominantly hyperactive/impulsive.??The majority of symptoms are hyperactive and impulsive.<br/>* Combined.??This is a mix of inattentive symptoms and hyperactive/impulsive symptoms.</html>");
						entry4.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry4);
						entry4.setSize(10000, 100);
						entry4.setLocation(1, 200);

						JLabel entry5 = new JLabel(
								"<html>How do you help people with ADHD.<br/><br/>* Understand the potential impairments of ADHD.<br/>* Acknowledge the impact ADHD has on??you.<br/>* Assess your loved one???s readiness to change.<br/>* Know the best treatments for ADHD</html>");
						entry5.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry5);
						entry5.setSize(10000, 100);
						entry5.setLocation(1, 325);
						

						

						JLabel entry6 = new JLabel(" ");
						entry6.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry6);
						entry6.setSize(10000, 100);
						entry6.setLocation(1, 500);
						

						ImageIcon pic = new ImageIcon("Images/ahd.jpg");
						JLabel image = new JLabel(pic);
						frame.add(image);
						image.setSize(158, 170);
						image.setLocation(500, 300);

					
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
								frame.remove(image);
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
						frame.remove(help);
						frame.remove(buttonSources);
						buttonOne.setText("Back");
						

						ImageIcon pic = new ImageIcon("Images/autism.jpg");
						JLabel image = new JLabel(pic);
						frame.add(image);
						image.setSize(100, 100);
						image.setLocation(650, 350);

						JLabel entry = new JLabel("Autism");
						entry.setFont(new Font("Times New Roman", Font.BOLD, 20));
						frame.add(entry);
						entry.setSize(500, 60);
						entry.setLocation(350,1);
						JLabel entry2 = new JLabel("What is Autism:");
						entry2.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry2);
						entry2.setSize(400, 60);
						entry2.setLocation(1,40);
						JLabel entry3 = new JLabel("<html>Autism, or??autism spectrum disorder (ASD), refers to??a broad range of conditions characterized by<br/>challenges with social skills, repetitive behaviors, speech and nonverbal communication.<br/>According to the Centers for Disease Control, autism affects an estimated 1 in 44 children in the United States today.</html>");
						entry3.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry3);
						entry3.setSize(10000, 100);
						entry3.setLocation(1,75);
						JLabel entry4 = new JLabel("Symptoms of Autism:");
						entry4.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry4);
						entry4.setSize(10000, 100);
						entry4.setLocation(1,170);
						JLabel entry6 = new JLabel("<html>* A lack of??eye??contact<br/>* A narrow range of interests or intense interest in certain topics<br/>* High sensitivity to sounds, touches, smells, or sights that seem ordinary to other people<br/>* Not looking at or listening to other people.<br/>* Not looking at things when another person points at them.</html>");
						entry6.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry6);
						entry6.setSize(10000, 100);
						entry6.setLocation(1,245);
						
						
						JLabel entry5 = new JLabel("<html>How do you help people with Autism:<br/><br/>* Build on your child's interests.<br/>* Offer a predictable schedule.<br/>* Teach tasks as a series of simple steps.<br/>* Actively engage your child's attention in highly structured activities.<br/>* Provide regular reinforcement of behavior.</html>");
						entry5.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry5);
						entry5.setSize(10000, 130);
						entry5.setLocation(1,375);
						
						JLabel entry7 = new JLabel(" ");
						entry7.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry7);
						entry7.setSize(10000, 100);
						entry7.setLocation(1,500);

						
						buttonOne.addMouseListener(new MouseListener(){

							@Override
							public void mouseClicked(MouseEvent e) {}

							@Override
							public void mousePressed(MouseEvent e) {

								frame.remove(image);
								frame.remove(entry);
								frame.remove(entry2);
								frame.remove(entry3);
								frame.remove(entry4);
								frame.remove(entry5);
								frame.remove(entry6);
								frame.remove(entry7);
								
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

				help.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						frame.remove(buttonadhd);
						frame.remove(buttonThree);
						frame.remove(buttonptsd);
						frame.remove(instructions);
						frame.remove(buttonSources);
						frame.remove(help);
						buttonOne.setText("Back");
						

						JLabel entry = new JLabel("Resources");
						entry.setFont(new Font("Times New Roman", Font.BOLD, 20));
						frame.add(entry);
						entry.setSize(500, 60);
						entry.setLocation(350,1);
						JLabel entry2 = new JLabel("Resources you can use for ADHD:");
						entry2.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry2);
						entry2.setSize(400, 60);
						entry2.setLocation(1,40);
						
						JLabel entry10 = new JLabel("<html>* A psychologist, a psychiatrist, or a neurologist is best equipped to diagnose ADHD in adults. A master level therapist is<br/>recommended only for the initial screening.<br/>* Only a psychiatrist, neurologist, or family physician can prescribe medication for adults with ADHD.<br/>* If you need counseling, choose a psychologist or master level therapist. A psychiatrist is a good choice, depending on his<br/>or her ability to provide counseling that helps solve problems. </html>");
						entry10.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry10);
						entry10.setSize(10000, 100);
						entry10.setLocation(1,90);
						
						JLabel entry11 = new JLabel("<html> Resources for Autism: <br/><br/>* Asperger/Autism Network: The Asperger/Autism Network (AANE) provides individuals, families, and professionals<br/>with information, education, community, support, and advocacy.<br/>* Autism Highway: Started by a woman whose son was diagnosed with autism, Autism Highway is both informative and<br/>fun. The website is easy to navigate and it provides an extensive list of autism-related events and specialists.<br/>In addition, Autism Highway includes interactive games for kids.</html>");
						entry11.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry11);
						entry11.setSize(10000, 200);
						entry11.setLocation(1,175);
						
						JLabel entry12 = new JLabel("<html> Resources for PTSD: <br/><br/>* American Academy of Child and Adolescent Psychiatry:??The AACAP is the leading national professional medical<br/>association dedicated to treating and improving the quality of life for children, adolescents, and families affected by<br/>mental, behavioral, or developmental disorders<br/>* American Academy of Experts in Traumatic Stress: The American Academy of Experts in Traumatic Stress is a<br/>network of professionals committed to the advancement of intervention for survivors of trauma.</html>");
						entry12.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry12);
						entry12.setSize(10000, 200);
						entry12.setLocation(1,325);
						
						
						JLabel entry7 = new JLabel(" ");
						entry7.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry7);
						entry7.setSize(10000, 100);
						entry7.setLocation(1,500);

						
						buttonOne.addMouseListener(new MouseListener(){

							@Override
							public void mouseClicked(MouseEvent e) {}

							@Override
							public void mousePressed(MouseEvent e) {
								frame.remove(entry);
								frame.remove(entry2);
								frame.remove(entry10);
								frame.remove(entry11);
								frame.remove(entry12);
								frame.remove(entry7);
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
				
				buttonSources.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) {}

					@Override
					public void mousePressed(MouseEvent e) {
						frame.remove(buttonadhd);
						frame.remove(buttonThree);
						frame.remove(buttonptsd);
						frame.remove(instructions);
						frame.remove(help);
						frame.remove(buttonSources);

						JLabel entry = new JLabel("<html>Source for ADHD: https://www.healthline.com/health/adhd/dating-someone-with-adhd<br/>https://www.mayoclinic.org/diseases-conditions/adhd/symptoms-causes/<html>");
						entry.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry);
						entry.setSize(10000, 100);
						entry.setLocation(1, 100);
						
						JLabel entry2 = new JLabel("<html>Source for Autism: https://www.autismspeaks.org/what-autism<br/>https://www.helpguide.org/articles/autism-learning-disabilities/<html>");
						entry2.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry2);
						entry2.setSize(10000, 100);
						entry2.setLocation(1, 175);
						
						JLabel entry3 = new JLabel("<html>Source for PTSD: https://www.psychiatry.org/patients-families/ptsd/what-is-ptsd<br/>https://www.therecoveryvillage.com/mental-health/ptsd/<html>");
						entry3.setFont(new Font("Times New Roman", Font.BOLD, 15));
						frame.add(entry3);
						entry3.setSize(10000, 100);
						entry3.setLocation(1, 275);
						
						
						
						buttonOne.setText("Back");
						
						
						buttonOne.addMouseListener(new MouseListener(){

							@Override
							public void mouseClicked(MouseEvent e) {}

							@Override
							public void mousePressed(MouseEvent e) {

								
								frame.repaint();
								frame.remove(entry);
								frame.remove(entry2);
								frame.remove(entry3);
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
