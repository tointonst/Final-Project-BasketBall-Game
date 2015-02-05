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
		dataOfPlayers.add(new PointGuard("PG" , "Steph Curry", 90.4, 42.8, 75.4, 35.2, true));
		dataOfPlayers.add(new SmallForward("SF", "Kevin Durant", 52.7, 4.5, 55, 99.999, true));
		dataOfPlayers.add(new Center("C", "Dewight Howard", 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new SmallForward("C", "Lebron James", 52.7, 4.5, 55, 99.999, true));
		dataOfPlayers.add(new Center("C", "MJ" , 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new Center("C", "Steph Curry", 52.7, 4.5, 55, 99.999, true, 10.6));
		return dataOfPlayers;
		}
	}
