
public class Guard extends Player
	{

	protected boolean hasQuickness = true;
	
	public Guard(String p,String nop, double ftp, double tpp, double mrp, double lp, boolean hq)
		{
		super(p, nop, ftp, tpp, mrp, lp);
		hasQuickness =hq;
		}

	public boolean getHasQuickness()
		{
		return hasQuickness;
		}

	@Override
	public String toString()
		{
		return getPosition() + " " + getNameOfPlayer() + " " + getFreeThrowPercentage() + " " + getThreePointPercentage() + " " + getMidRangePercentage() + " " + getLayupPercentage() + " " + getHasQuickness();
		}


	}
