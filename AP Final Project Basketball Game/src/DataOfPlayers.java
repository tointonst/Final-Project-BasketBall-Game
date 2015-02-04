import java.util.ArrayList;

public class DataOfPlayers extends Player
	{

	public DataOfPlayers(String nop, double ftp, double tpp, double mrp,
			double lp)
		{
		super(nop, nop, ftp, tpp, mrp, lp);
		// TODO Auto-generated constructor stub
		}

	

	public static ArrayList<Player> addPlayers()
		{
		dataOfPlayers.add(new PointGuard("Steve Nash", 90.4, 42.8, 75.4, 35.2, true));
		dataOfPlayers.add(new Center("KD", 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new Center("MJ", 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new Center("AI", 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new Center("Steph Curry", 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new Center("Lebron James", 52.7, 4.5, 55, 99.999, true, 10.6));
		return dataOfPlayers;
		}
	}
