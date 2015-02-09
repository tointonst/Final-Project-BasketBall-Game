
public class SmallForward extends BigMan{

	public SmallForward(String p, String nop, double ftp, double tpp, double mrp,
			double lp, boolean hh)
		{
		super(p, nop, ftp, tpp, mrp, lp, hh);
		myPlayerTemperature = (PlayerTemperature) new noStreak();
		}
	
	@Override
	public String toString()
		{
		return getNameOfPlayer() + "   " + getThreePointPercentage() + "   " + getMidRangePercentage() + "   " + getLayupPercentage();
		}

	
      
}
