import java.util.ArrayList;

public class DataOfPlayers extends Player
	{

	public DataOfPlayers(String p, String nop, double ftp, double tpp, double mrp,
			double lp)
		{
		super( p, nop, ftp, tpp, mrp, lp);
		// TODO Auto-generated constructor stub
		}

	

	public static ArrayList<Player> addPlayers()
		{
		dataOfPlayers.add(new PointGuard("PG" , "Steve Nash", 90.4, 42.8, 75.4, 35.2, true));
		dataOfPlayers.add(new Center("C", "KD", 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new Center("C", "AI", 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new Center("C", "Lebron James", 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new Center("C", "MJ" , 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new Center("C", "Steph Curry", 52.7, 4.5, 55, 99.999, true, 10.6));
		return dataOfPlayers;
		}
	}
