
import java.awt.*;
import java.util.Collections;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PlayGame
	{
	private static final long serialVersionUID = 1L;
	static JFrame frame = new JFrame();
	static String name;
	static int userPlayer, computerPlayer;
	static boolean keepPlaying = true;
	static int userShotChoice, computerShotChoice;
	static double userShotPercentage, computerShotPercentage;
	static String userShotOutcome, computerShotOutCome;
	static int userTotalMisses, computerTotalMisses;

	public static void greetPlayer()
		{
		name = JOptionPane.showInputDialog("What is your name?"); 
		JOptionPane.showMessageDialog(frame, "Nice to meet you " + name + "!" + 
				"\n" + name + ", we are going to play 3 on 3 Basketball."
				+ "\nThere are 6 players to Choose from, pick 3 to be on your team");
		}
	
	public static ArrayList<Player> makeTeam(ArrayList<Player> dataOfPlayers)
		{
	    int teamCounter=0;
	    int peopleCounter = dataOfPlayers.size()-1;
	    ArrayList<Player> myTeam = new ArrayList<Player>();
	    do
	    	{
	    	Object[] options =  new Object[dataOfPlayers.size()];
			for(int i =0; i< dataOfPlayers.size(); i++)
				{
				options[i] = dataOfPlayers.get(i).getNameOfPlayer();
				}
			userPlayer = JOptionPane.showOptionDialog(frame, "Which player would you like to have on your team?",
					"Players",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options[peopleCounter]);
			peopleCounter--;
			myTeam.add(dataOfPlayers.get(userPlayer));
			dataOfPlayers.remove(userPlayer);
			teamCounter++;
	    	}  while(teamCounter<3);
	  return myTeam;
	    
		}
	public static ArrayList<Player> printMyTeam(ArrayList<Player> myTeam)
		{
	
		
		
		Collections.sort(myTeam,new Comparator<Player>() {
	         public int compare(Player s1, Player s2) {
	                return s1.getPosition().compareToIgnoreCase(s2.getPosition());
	        }
	         
	    });
		
		
		for(int i =0; i<myTeam.size(); i++)
		{
		System.out.println(myTeam.get(i).toString());
		}
        return myTeam;
		}
	public static void playGame(ArrayList<Player> dataOfPlayers, ArrayList<Player> myTeam) throws InterruptedException
		{
		Collections.sort(dataOfPlayers,new Comparator<Player>() {
	         public int compare(Player s1, Player s2) {
	                return s1.getPosition().compareToIgnoreCase(s2.getPosition());
	        }
	         
	    });
		System.out.println("We are going to tip off");
		Thread.sleep(2000);

		if (myTeam.get(2).getPosition().equals("5"))
			{
			System.out.println("You won the tip ");
			System.out.println("The ball was tiped to " + myTeam.get(0).getNameOfPlayer() + ". He dribbles down court then passes it to " + myTeam.get(1).getNameOfPlayer());
			    if(myTeam.get(1).getPosition().equals("2"))
			    	{
			    	double userShotRandomNumber = (Math.random() * 100);
			    	if ()
			    	}
			}
		else
			{
			System.out.println("You lost the tip");
			}
		
		
		
		
		
			
	}
		
		
		
	

	public static void shootShots()
		{
		Object[] options = {DataOfPlayers.dataOfPlayers.get(0).getNameOfPlayer(), DataOfPlayers.dataOfPlayers.get(1).getNameOfPlayer(), DataOfPlayers.dataOfPlayers.get(2).getNameOfPlayer()};
		userPlayer = JOptionPane.showOptionDialog(frame, "Which player would you like to play with?",
				"Your Player",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[2]);

		if (userPlayer == 0)
			{
			computerPlayer = 1;
			}
		else
			{
			computerPlayer = 0;
			}

		do
			{
			double userShotRandomNumber = (Math.random() * 100);
			double computerShotRandomNumber = (Math.random() * 100);
			Object[] whichShot =
						{ "Free Throw", "Three Pointer", "Mid Range Shot", "Dunk",
								"Backwards Shot" };
			userShotChoice = JOptionPane.showOptionDialog(frame, "Which shot would you like to take?",
					"Choose Shot",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, whichShot, whichShot[4]);

			switch (userShotChoice)
				{
				case 0:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer ).getFreeThrowPercentage();
					break;
					}
				case 1:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer ).getThreePointPercentage();
					break;
					}
				case 2:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer ).getMidRangePercentage();
					break;
					}
				case 3:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer ).getDunkPercentage();
					break;
					}
				case 4:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer ).getBackwardsShotPercentage();
					break;
					}
				}
			
			if (userShotChoice==3)
				{
				JOptionPane.showMessageDialog(frame, "Are you ready to try to Dunk?");
				}
			else
				{
				JOptionPane.showMessageDialog(frame, "Are you ready to shoot the " + whichShot[userShotChoice] + "?");
				}
			
			if (userShotPercentage >= userShotRandomNumber)
				{
				JOptionPane.showMessageDialog(frame, "Nice you made the "
						+ whichShot[userShotChoice] + ".");
				userShotOutcome = "make";
				} 
			else
				{
				JOptionPane.showMessageDialog(frame, "Sorry you missed the "
						+ whichShot[userShotChoice] + ".");
				userShotOutcome = "miss";
				}

			computerShotChoice = userShotChoice;
			switch (computerShotChoice)
				{
				case 0:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer ).getFreeThrowPercentage();
					break;
					}
				case 1:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer ).getThreePointPercentage();
					break;
					}
				case 2:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer ).getMidRangePercentage();
					break;
					}
				case 3:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer ).getDunkPercentage();
					break;
					}
				case 4:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer ).getBackwardsShotPercentage();
					break;
					}
				}
			
			if (computerShotChoice==3)
				{
				JOptionPane.showMessageDialog(frame, "Your opponent is ready to try to Dunk?");
				}
			else
				{
				JOptionPane.showMessageDialog(frame, "Your opponent is about to shoot the " + whichShot[userShotChoice] + "?" );				
				}
			
		
			if (computerShotPercentage >= computerShotRandomNumber)
				{
				JOptionPane.showMessageDialog(frame,"Your opponent made the "
						+ whichShot[userShotChoice] + ".");
				computerShotOutCome = "make";
				} 
			else
				{
				JOptionPane.showMessageDialog(frame, "Your opponent missed the "
						+ whichShot[userShotChoice] + ".");
				computerShotOutCome = "miss";
				}
			
			if (userShotOutcome.equals("make")
					&& computerShotOutCome.equals("make"))
				{
				JOptionPane.showMessageDialog(frame, "Since you both made the "
						+ whichShot[userShotChoice]
						+ ", no one gets a Letter.");
				} 
			else if (userShotOutcome.equals("make")
					&& computerShotOutCome.equals("miss"))
				{
				JOptionPane.showMessageDialog(frame,"Since you made the "
						+ whichShot[userShotChoice]
						+ " and he missed. He gets a Letter.");
				computerTotalMisses++;
				} 
			else if (userShotOutcome.equals("miss")
					&& computerShotOutCome.equals("make"))
				{
				JOptionPane.showMessageDialog(frame,"Since you missed the "
								+ whichShot[userShotChoice]
								+ " and he made the "
								+ whichShot[userShotChoice]
								+ ". You get a Letter.");
				userTotalMisses++;
				} 
			else
				{
				JOptionPane.showMessageDialog(frame,"Both of you missed the "
						+ whichShot[userShotChoice]
						+ ". So neither gets a letter.");
				}
			
			//JOptionPane.showMessageDialog(frame, "userPercent" + userShotPercentage
			//		+ "\n" + "userrandom" + userShotRandomNumber
			//		+ "\n" + "compPercent" + computerShotPercentage
			//		+ "\n" + "comprandom " + computerShotRandomNumber
			//		+ "\n" + "compPlayer#" + computerPlayer
			//		+ "\n" + "compShot#" + computerShotChoice
			//		+ "\n" + "userPlayer#" + userPlayer
			//		+ "\n" + "userShot#" + userShotChoice);

			switch (userTotalMisses)
				{
				case 1:
					{
					JOptionPane.showMessageDialog(frame, "Your total letters are: P ");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(frame,"Your total letters are: PI");
					break;
					}
				case 3:
					{
					JOptionPane.showMessageDialog(frame, "Dang man. Sorry but that was your last letter. You have PIG and lost the game.");
					keepPlaying = false;
					System.exit(0);
					break;
					}
				}

			switch (computerTotalMisses)
				{
				case 1:
					{
					JOptionPane.showMessageDialog(frame,"Opponents total letters are : P");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(frame,"Opponents total letters are : PI");
					break;
					}
				case 3:
					{
					JOptionPane.showMessageDialog(frame,"Congratulations man. That was his last Letter and he has recived PIG. You have won the GAME!.");
					keepPlaying = false;
					System.exit(0);
					break;
					}
				}

			} while (keepPlaying == true);
		}
	}
