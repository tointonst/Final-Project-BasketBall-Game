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
		dataOfPlayers.add(new SmallForward("3", "Kevin Durant", 89.1, 35.8, 66, 69.8, true));
		dataOfPlayers.add(new Center("5", "Dwight Howard", 52.7, 15, 45, 83.2, true, 10.6));
		dataOfPlayers.add(new ShootingGuard("2", "James Harden", 86.2, 34.5, 60.2, 71.2, true));
		dataOfPlayers.add(new PowerForward("4", "LaMarcus Aldridge" , 72.1, 20.9, 68, 82.1, true));
		dataOfPlayers.add(new ShootingGuard("2", "Kobe Bryant", 91.4, 38.9, 76.3, 65.9, true));
		return dataOfPlayers;
		}
	}
