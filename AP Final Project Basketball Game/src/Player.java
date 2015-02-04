import java.util.ArrayList;

public class Player
	{
	protected String nameOfPlayer;
	protected double freeThrowPercentage;
	protected double threePointPercentage;
	protected double midRangePercentage;
	protected double layupPercentage;
  
	protected static ArrayList<Player> dataOfPlayers = new ArrayList<Player>();

	public Player(String nop, double ftp, double tpp, double mrp, double lp
			)
		{
		nameOfPlayer = nop;
		freeThrowPercentage = ftp;
		threePointPercentage = tpp;
		midRangePercentage = mrp;
		layupPercentage = lp;
		}

	public String getNameOfPlayer()
		{
		return nameOfPlayer;
		}

	public double getFreeThrowPercentage()
		{
		return freeThrowPercentage;
		}

	public double getThreePointPercentage()
		{
		return threePointPercentage;
		}

	public double getMidRangePercentage()
		{
		return midRangePercentage;
		}

	public double getLayupPercentage()
		{
		return layupPercentage;
		}

	public void setNameOfPlayer(String nameOfPlayer)
		{
		this.nameOfPlayer = nameOfPlayer;
		}

	public void setFreeThrowPercentage(double freeThrowPercentage)
		{
		this.freeThrowPercentage = freeThrowPercentage;
		}

	public void setThreePointPercentage(double threePointPercentage)
		{
		this.threePointPercentage = threePointPercentage;
		}
	public void setMidRangePercentage(double midRangePercentage)
		{
		this.midRangePercentage = midRangePercentage;
		}
	
	public void setLayupPercentage(double dunkPercentage)
		{
		this.layupPercentage = dunkPercentage;
		}
	
	}
