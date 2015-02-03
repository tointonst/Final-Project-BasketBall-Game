import java.util.ArrayList;

public class DataOfPlayers
	{

	static ArrayList<Player> dataOfPlayers = new ArrayList<Player>();

	public static void addPlayers()
		{
		dataOfPlayers.add(new PointGuard("Steve Nash", 90.4, 42.8, 75.4, 35.2, true));
		dataOfPlayers.add(new Center("Shaquille O'Neal", 52.7, 4.5, 55, 99.999, true, 10.6));
		
		}
	}
