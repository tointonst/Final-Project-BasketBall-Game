import java.util.ArrayList;

public class Runner
	{

	public static void main(String[] args)
		{
		ArrayList<Player> dataOfPlayers = DataOfPlayers.addPlayers();
		PlayGame.makeTeam(dataOfPlayers);
	
		}

	}