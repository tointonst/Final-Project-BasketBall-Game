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
		JOptionPane
				.showMessageDialog(
						frame,
						"Nice to meet you "
								+ name
								+ "!"
								+ "\n"
								+ name
								+ ", we are going to play 3 on 3 Basketball."
								+ "\nThere are 6 players to Choose from, pick 3 to be on your team.");
		}

	public static ArrayList<Player> makeTeam(ArrayList<Player> dataOfPlayers)
		{
		int teamCounter = 0;
		int peopleCounter = dataOfPlayers.size() - 1;
		ArrayList<Player> myTeam = new ArrayList<Player>();
		do
			{
			Object[] options = new Object[dataOfPlayers.size()];
			for (int i = 0; i < dataOfPlayers.size(); i++)
				{
				options[i] = dataOfPlayers.get(i).getNameOfPlayer();
				}
			userPlayer = JOptionPane.showOptionDialog(frame,
					"Which player would you like to have on your team?",
					"Players", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options,
					options[peopleCounter]);
			peopleCounter--;
			myTeam.add(dataOfPlayers.get(userPlayer));
			dataOfPlayers.remove(userPlayer);
			teamCounter++;
			} while (teamCounter < 3);
		return myTeam;

		}

	public static ArrayList<Player> printMyTeam(ArrayList<Player> myTeam)
		{

		Collections.sort(myTeam, new Comparator<Player>()
			{
				public int compare(Player s1, Player s2)
					{
					return s1.getPosition().compareToIgnoreCase(
							s2.getPosition());
					}

			});

		JOptionPane.showMessageDialog(frame,
				"This is your team by player and each of their stats.");
		for (int i = 0; i < myTeam.size(); i++)
			{
			JOptionPane.showMessageDialog(frame, "Name                 "
					+ "3Point%  2point%  finish%" + "\n"
					+ myTeam.get(i).toString());
			myTeam.get(i).myPlayerTemperature.streak();

			}

		return myTeam;
		}

	public static int myShootBall(ArrayList<Player> myTeam, int area, int player)
		{
		double userShotRandomNumber = (Math.random() * 100);
		int points = 0;
		switch (area)
			{
			case 1:
				{
				userShotPercentage = myTeam.get(player).getLayupPercentage();
				break;
				}
			case 2:
				{
				userShotPercentage = myTeam.get(player).getMidRangePercentage();
				break;
				}
			case 3:
				{
				userShotPercentage = myTeam.get(player)
						.getThreePointPercentage();
				break;
				}

			}
		if (userShotPercentage > userShotRandomNumber)
			{
			JOptionPane.showMessageDialog(frame, myTeam.get(player)
					.getNameOfPlayer() + " shoots and makes it.");
			switch (area)
				{
				case 1:
					{
					points = 2;
					break;
					}
				case 2:
					{
					points = 2;
					break;
					}
				case 3:
					{
					points = 2;
					break;
					}
				}
			} else
			{
			JOptionPane.showMessageDialog(frame, myTeam.get(player)
					.getNameOfPlayer() + " shoots and misses it.");
			points = 0;
			}
		return points;
		}

	public static int myPassBall(ArrayList<Player> myTeam, int player)
		{
		int nextPlayer = 0;
		int playerDecision = (int) (Math.random() * 2) + 1;
		switch (player)
			{
			case 0:
				{

				JOptionPane.showMessageDialog(frame, myTeam.get(player)
						.getNameOfPlayer()
						+ " passes the ball to "
						+ myTeam.get(playerDecision).getNameOfPlayer() + ".");
				nextPlayer = playerDecision;
				break;
				}
			case 1:
				{
				if (playerDecision == 1)
					{
					JOptionPane.showMessageDialog(frame, myTeam.get(player)
							.getNameOfPlayer()
							+ " passes the ball to "
							+ myTeam.get(0).getNameOfPlayer() + ".");
					nextPlayer = 0;
					} else
					{
					JOptionPane.showMessageDialog(frame, myTeam.get(player)
							.getNameOfPlayer()
							+ " passes the ball to "
							+ myTeam.get(playerDecision).getNameOfPlayer()
							+ ".");
					nextPlayer = 2;
					}

				break;
				}
			case 2:
				{
				if (playerDecision == 2)
					{
					JOptionPane.showMessageDialog(frame, myTeam.get(player)
							.getNameOfPlayer()
							+ " passes the ball to "
							+ myTeam.get(0).getNameOfPlayer() + ".");
					nextPlayer = 0;
					} else
					{
					JOptionPane.showMessageDialog(frame, myTeam.get(player)
							.getNameOfPlayer()
							+ " passes the ball to "
							+ myTeam.get(playerDecision).getNameOfPlayer()
							+ ".");
					nextPlayer = 1;
					}
				break;
				}

			}
		return nextPlayer;
		}

	public static int computerShootBall(ArrayList<Player> dataOfPlayers,
			int area, int player)
		{
		double userShotRandomNumber = (Math.random() * 100);
		int points = 0;
		switch (area)
			{
			case 1:
				{
				userShotPercentage = dataOfPlayers.get(player)
						.getLayupPercentage();
				break;
				}
			case 2:
				{
				userShotPercentage = dataOfPlayers.get(player)
						.getMidRangePercentage();
				break;
				}
			case 3:
				{
				userShotPercentage = dataOfPlayers.get(player)
						.getThreePointPercentage();
				break;
				}

			}
		if (userShotPercentage > userShotRandomNumber)
			{
			JOptionPane.showMessageDialog(frame, dataOfPlayers.get(player)
					.getNameOfPlayer() + " shoots and makes it.");
			switch (area)
				{
				case 1:
					{
					points = 2;
					break;
					}
				case 2:
					{
					points = 2;
					break;
					}
				case 3:
					{
					points = 2;
					break;
					}
				}
			} else
			{
			JOptionPane.showMessageDialog(frame, dataOfPlayers.get(player)
					.getNameOfPlayer() + " shoots and misses it.");
			points = 0;
			}
		return points;
		}

	public static int computerPassBall(ArrayList<Player> dataOfPlayers,
			int player)
		{
		int nextPlayer = 0;
		int playerDecision = (int) (Math.random() * 2) + 1;
		switch (player)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, dataOfPlayers.get(player)
						.getNameOfPlayer()
						+ " passes the ball to "
						+ dataOfPlayers.get(playerDecision).getNameOfPlayer()
						+ ".");
				nextPlayer = playerDecision;
				break;
				}
			case 1:
				{
				if (playerDecision == 1)
					{
					JOptionPane.showMessageDialog(frame,
							dataOfPlayers.get(player).getNameOfPlayer()
									+ " passes the ball to "
									+ dataOfPlayers.get(0).getNameOfPlayer()
									+ ".");
					nextPlayer = 0;
					} else
					{
					JOptionPane.showMessageDialog(frame,
							dataOfPlayers.get(player).getNameOfPlayer()
									+ " passes the ball to "
									+ dataOfPlayers.get(playerDecision)
											.getNameOfPlayer() + ".");
					nextPlayer = 2;
					}

				break;
				}
			case 2:
				{
				if (playerDecision == 2)
					{
					JOptionPane.showMessageDialog(frame,
							dataOfPlayers.get(player).getNameOfPlayer()
									+ " passes the ball to "
									+ dataOfPlayers.get(0).getNameOfPlayer()
									+ ".");
					nextPlayer = 0;
					} else
					{
					JOptionPane.showMessageDialog(frame,
							dataOfPlayers.get(player).getNameOfPlayer()
									+ " passes the ball to "
									+ dataOfPlayers.get(playerDecision)
											.getNameOfPlayer() + ".");
					nextPlayer = 1;
					}
				break;
				}

			}
		return nextPlayer;
		}

	public static void playGame(ArrayList<Player> dataOfPlayers,
			ArrayList<Player> myTeam) throws InterruptedException
		{
		Collections.sort(dataOfPlayers, new Comparator<Player>()
			{
				public int compare(Player s1, Player s2)
					{
					return s1.getPosition().compareToIgnoreCase(
							s2.getPosition());
					}

			});
		
		int myTeamPoints = 0;
		int myPoints = 0;
		int computerTeamPoints = 0;
		int computerPoints = 0;
		boolean myTeamHasBall = true;
		boolean computerTeamHasBall = true;
		JOptionPane.showMessageDialog(frame, "The game is to 11 by 2s and 3s and make it take it all the way."
				+ "\nIts your ball to start.");

		
		
		
		do
			{
			while (myTeamHasBall == true)
			{
			int nextPlayer = 0;
			JOptionPane.showMessageDialog(frame, myTeam.get(0)
					.getNameOfPlayer()
					+ " has the ball at the top of the key.");
			Thread.sleep(2000);
			int playerDecision = (int) (Math.random() * 2) + 1;
			if (playerDecision == 1)
				{
				nextPlayer = myPassBall(myTeam, nextPlayer);
				int nextPlayerDecision =1;
				while (nextPlayerDecision ==1)
					 {
					 Thread.sleep(2000);
					 nextPlayerDecision = (int)(Math.random()*2)+1;
					 if(nextPlayerDecision==1)
						 {
						 
						 nextPlayer = myPassBall(myTeam, nextPlayer);
						 }
					 else
						 {
						 myPoints = myShootBall(myTeam, 2, nextPlayer);
							myTeamPoints = myTeamPoints + myPoints;
							JOptionPane.showMessageDialog(frame, "Your teams has "
									+ myTeamPoints + " points and the other team has "
									+ computerTeamPoints + " points.");
							if (myPoints > 0)
								{
								myTeamHasBall = true;
								JOptionPane.showMessageDialog(frame, "Since you made it, it's your ball at the top of the key");
								} 
							else
								{
								myTeamHasBall = false;
								computerTeamHasBall = true;
								JOptionPane.showMessageDialog(frame, "The other team got the rebound and the ball is reset at the top of the key");
								break;
								}
						 }
					 } 
				}
			else
				{
				myPoints = myShootBall(myTeam, 3, nextPlayer);
				myTeamPoints = myTeamPoints + myPoints;
				JOptionPane.showMessageDialog(frame, "Your teams has "
						+ myTeamPoints + " points and the other team has "
						+ computerTeamPoints + " points.");
				if (myPoints > 0)
					{
					myTeamHasBall = true;
					JOptionPane.showMessageDialog(frame, "Since you made it, it's your ball at the top of the key");
					} 
				else
					{
					myTeamHasBall = false;
					computerTeamHasBall = true;
					JOptionPane.showMessageDialog(frame, "The other team got the rebound and the ball is reset at the top of the key");
					break;
					}
				}
			}
		while (computerTeamHasBall == true)
		{
		int nextPlayer = 0;
		JOptionPane.showMessageDialog(frame, dataOfPlayers.get(0)
				.getNameOfPlayer()
				+ " has the ball at the top of the key.");
		Thread.sleep(2000);
		int playerDecision = (int) (Math.random() * 2) + 1;
		if (playerDecision == 1)
			{
			nextPlayer = computerPassBall(dataOfPlayers, nextPlayer);
			int nextPlayerDecision =1;
			while (nextPlayerDecision ==1)
				 {
				 Thread.sleep(2000);
				 nextPlayerDecision = (int)(Math.random()*2)+1;
				 if(nextPlayerDecision==1)
					 {
					 
					 nextPlayer = computerPassBall(dataOfPlayers, nextPlayer);
					 }
				 else
					 {
					 computerPoints = computerShootBall(dataOfPlayers, 2, nextPlayer);
						computerTeamPoints = computerTeamPoints + computerPoints;
						JOptionPane.showMessageDialog(frame, "Your teams has "
								+ myTeamPoints + " points and the other team has "
								+ computerTeamPoints + " points.");
						if (computerPoints > 0)
							{
							computerTeamHasBall = true;
							JOptionPane.showMessageDialog(frame, "Since they made it, they get the ball at the top of the key");
							} 
						else
							{
							computerTeamHasBall = false;
							myTeamHasBall = true;
							JOptionPane.showMessageDialog(frame, "Your team got the rebound and the ball is reset at the top of the key");
							break;
							}
					 }
				 } 
			}
		else
			{
			computerPoints = computerShootBall(dataOfPlayers, 3, nextPlayer);
			computerTeamPoints = computerTeamPoints + computerPoints;
			JOptionPane.showMessageDialog(frame, "Your teams has "
					+ myTeamPoints + " points and the other team has "
					+ computerTeamPoints + " points.");
			if (computerPoints > 0)
				{
				computerTeamHasBall = true;
				JOptionPane.showMessageDialog(frame, "Since they made it, they get the ball at the top of the key");
				} 
			else
				{
				computerTeamHasBall = false;
				myTeamHasBall = true;
				JOptionPane.showMessageDialog(frame, "Your team got the rebound and the ball is reset at the top of the key");
				break;
				}
			}
		}
		if(myTeamPoints>5)
		{
			JOptionPane.showMessageDialog(frame, "congradulations you won");	
		}
		else if (computerTeamPoints>5)
		{
			JOptionPane.showMessageDialog(frame, "sorry you lost");
		}
		else
		{
			
		}
		
		}while (myTeamPoints < 5 || computerTeamPoints < 5);

		}
	}

	