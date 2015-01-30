import java.util.ArrayList;

public class DataOfPlayers
	{

	static ArrayList<Player> dataOfPlayers = new ArrayList<Player>();

	public static void addPlayers()
		{
		dataOfPlayers.add(new Player("Steve Nash", 90.4, 42.8, 75.4, 35.2, 10.7));
		dataOfPlayers.add(new Player("Shaquille O'Neal", 52.7, 4.5, 55, 99.999, 78.9));
		
		}
	}
