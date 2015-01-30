public class Player
	{
	private String nameOfPlayer;
	private double freeThrowPercentage;
	private double threePointPercentage;
	private double midRangePercentage;
	private double dunkPercentage;
	private double backwardsShotPercentage;

	public Player(String nop, double ftp, double tpp, double mrp, double dp,
			double dsp)
		{
		nameOfPlayer = nop;
		freeThrowPercentage = ftp;
		threePointPercentage = tpp;
		midRangePercentage = mrp;
		dunkPercentage = dp;
		backwardsShotPercentage = dsp;
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

	public double getDunkPercentage()
		{
		return dunkPercentage;
		}

	public double getBackwardsShotPercentage()
		{
		return backwardsShotPercentage;
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
	
	public void setDunkPercentage(double dunkPercentage)
		{
		this.dunkPercentage = dunkPercentage;
		}
	public void setBackwardsShotPercentage(double backwardsShotPercentage)
		{
		this.backwardsShotPercentage = backwardsShotPercentage;
		}
	}
