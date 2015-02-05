import java.util.ArrayList;

public class Runner
	{

	

	public static void main(String[] args)
		{
		PlayGame.greetPlayer();
		ArrayList<Player> dataOfPlayers = DataOfPlayers.addPlayers();
		ArrayList<Player> myTeam = PlayGame.makeTeam(dataOfPlayers);
		PlayGame.printMyTeam(myTeam);
		PlayGame.playGame(dataOfPlayers, myTeam);
		}

	}