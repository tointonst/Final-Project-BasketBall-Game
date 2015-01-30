import java.util.Scanner;

public class PlayGame
	{
	static String name;
	static int userPlayer, computerPlayer;
	static boolean keepPlaying = true;
	static int userShotChoice, computerShotChoice;
	static double userShotPercentage, computerShotPercentage;
	static String userShotOutcome, computerShotOutCome;
	static int userTotalMisses, computerTotalMisses;
	static String garbageVariable , garbageVariable2;

	public static void greetPlayer()
		{
		System.out.println("Hello, whats your name?");
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		System.out.println("Nice to meet you " + name + "!");
		System.out.println(name + ", we are going to play PIG Basketball.");
		System.out.println("");
		}

	public static void shootShots()
		{
		int counter = 1;
		System.out
				.println("Which player would you like to play with. Choose the number according to the player.");
		for (Player showPlayers : DataOfPlayers.dataOfPlayers)
			{
			System.out.println("(" + counter + ")"
					+ showPlayers.getNameOfPlayer());
			counter++;
			}
		Scanner userInput = new Scanner(System.in);
		userPlayer = userInput.nextInt();

		if (userPlayer == 1)
			{
			computerPlayer = 2;
			} else
			{
			computerPlayer = 1;
			}
		//System.out.println("You");

		String[] whichShot =
			{ "Free Throw", "Three Pointer", "Mid Range Shot", "Dunk",
					"Backwards Shot" };

		do
			{
			System.out.println("");
			double userShotRandomNumber = (Math.random() * 100);
			double computerShotRandomNumber = (Math.random() * 100);
			System.out.println("Which shot would you like to take?");
			int counter2 = 1;
			for (String printShot : whichShot)
				{
				System.out.print("(" + counter2 + ")" + printShot + "   ");
				counter2++;
				}
			Scanner userInput1 = new Scanner(System.in);
			userShotChoice = userInput1.nextInt();

			switch (userShotChoice)
				{
				case 1:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getFreeThrowPercentage();
					break;
					}
				case 2:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getThreePointPercentage();
					break;
					}
				case 3:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getMidRangePercentage();
					break;
					}
				case 4:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getDunkPercentage();
					break;
					}
				case 5:
					{
					userShotPercentage = DataOfPlayers.dataOfPlayers.get(
							userPlayer - 1).getBackwardsShotPercentage();
					break;
					}
				}
			System.out.println("");
			if (userShotChoice==4)
				{
				System.out.println("Are you ready to try to Dunk?(Press Enter)");
				}
			else
				{
				System.out.println("Are you ready to shoot the " + whichShot[userShotChoice - 1] + "?(Press Enter)" );
				}
			Scanner userInput2 = new Scanner(System.in);
			garbageVariable = userInput2.nextLine();
			if (userShotPercentage >= userShotRandomNumber)
				{
				System.out.println("Nice you made the "
						+ whichShot[userShotChoice - 1] + ".");
				userShotOutcome = "make";
				} else
				{
				System.out.println("Sorry you missed the "
						+ whichShot[userShotChoice - 1] + ".");
				userShotOutcome = "miss";
				}

			computerShotChoice = userShotChoice;
			switch (computerShotChoice)
				{
				case 1:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer - 1).getFreeThrowPercentage();
					break;
					}
				case 2:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer - 1).getThreePointPercentage();
					break;
					}
				case 3:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer - 1).getMidRangePercentage();
					break;
					}
				case 4:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer - 1).getDunkPercentage();
					break;
					}
				case 5:
					{
					computerShotPercentage = DataOfPlayers.dataOfPlayers.get(
							computerPlayer - 1).getBackwardsShotPercentage();
					break;
					}
				}
			System.out.println("");
			if (computerShotChoice==4)
				{
				System.out.println("Your opponent is ready to try to Dunk?(Press Enter)");
				}
			else
				{
				System.out.println("Your opponent is about to shoot the " + whichShot[userShotChoice - 1] + "?(Press Enter)" );				}
			
			Scanner userInput3 = new Scanner(System.in);
			garbageVariable2 = userInput3.nextLine();
			if (computerShotPercentage >= computerShotRandomNumber)
				{
				System.out.println("Your opponent made the "
						+ whichShot[userShotChoice - 1] + ".");
				computerShotOutCome = "make";
				} else
				{
				System.out.println("Your opponent missed the "
						+ whichShot[userShotChoice - 1] + ".");
				computerShotOutCome = "miss";
				}
			System.out.println("");
			if (userShotOutcome.equals("make")
					&& computerShotOutCome.equals("make"))
				{
				System.out.println("Since you both made the "
						+ whichShot[userShotChoice - 1]
						+ " no one gets a Letter.");
				} else if (userShotOutcome.equals("make")
					&& computerShotOutCome.equals("miss"))
				{
				System.out.println("Since you made the "
						+ whichShot[userShotChoice - 1]
						+ " and he missed. He gets a Letter.");
				computerTotalMisses++;
				} else if (userShotOutcome.equals("miss")
					&& computerShotOutCome.equals("make"))
				{
				System.out
						.println("Since you missed the "
								+ whichShot[userShotChoice - 1]
								+ " and he made the "
								+ whichShot[userShotChoice - 1]
								+ ". You get a Letter.");
				userTotalMisses++;
				} else
				{
				System.out.println("Both of you missed the "
						+ whichShot[userShotChoice - 1]
						+ ". So neither gets a letter.");
				}
			// System.out.println("userPercent" + userShotPercentage);
			// System.out.println("userrandom" + userShotRandomNumber);
			// System.out.println("compPercent" + computerShotPercentage);
			// System.out.println("comprandom " + computerShotRandomNumber);
			// System.out.println(computerPlayer);
			// System.out.println(computerShotChoice);

			switch (userTotalMisses)
				{
				case 1:
					{
					System.out.println("Your total letters are: P ");
					break;
					}
				case 2:
					{
					System.out.println("Your total letters are: PI");
					break;
					}
				case 3:
					{
					System.out
							.println("Dang man. Sorry but that was your last letter. You have PIG and lost the game.");
					keepPlaying = false;
					break;
					}
				}

			switch (computerTotalMisses)
				{
				case 1:
					{
					System.out.println("Opponents total letters are : P");
					break;
					}
				case 2:
					{
					System.out.println("Opponents total letters are : PI");
					break;
					}
				case 3:
					{
					System.out
							.println("congratulations man. That was his last Letter and he has recived PIG. You have won the GAME!.");
					keepPlaying = false;
					break;
					}
				}

			} while (keepPlaying == true);
		}
	}
