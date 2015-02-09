
public class PowerForward extends BigMan{

	public PowerForward(String p, String nop, double ftp, double tpp, double mrp,
			double lp, boolean hh)
		{
		super(p, nop, ftp, tpp, mrp, lp, hh);
		myPlayerTemperature = (PlayerTemperature) new StreakyCold();
		
		}

	@Override
	public String toString()
		{
		return getNameOfPlayer() + "   " + getThreePointPercentage() + "   " + getMidRangePercentage() + "   " + getLayupPercentage();
		}


}
