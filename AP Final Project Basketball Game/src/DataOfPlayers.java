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
		dataOfPlayers.add(new PointGuard("1" , "Steph Curry", 90.4, 42.8, 75.4, 35.2, true));
		dataOfPlayers.add(new SmallForward("3", "Kevin Durant", 52.7, 4.5, 55, 99.999, true));
		dataOfPlayers.add(new Center("5", "Dewight Howard", 52.7, 4.5, 55, 99.999, true, 10.6));
		dataOfPlayers.add(new ShootingGuard("2", "James Harden", 52.7, 4.5, 55, 99.999, true));
		dataOfPlayers.add(new PowerForward("4", "LaMarcus Aldridge" , 52.7, 4.5, 55, 99.999, true));
		dataOfPlayers.add(new ShootingGuard("2", "Kobe Bryant", 52.7, 4.5, 55, 99.999, true));
		return dataOfPlayers;
		}
	}
