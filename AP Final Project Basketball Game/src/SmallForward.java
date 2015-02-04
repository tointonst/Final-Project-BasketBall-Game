
public class SmallForward extends BigMan{

	public SmallForward(String p, String nop, double ftp, double tpp, double mrp,
			double lp, boolean hh)
		{
		super(p, nop, ftp, tpp, mrp, lp, hh);
		// TODO Auto-generated constructor stub
		}
	
	@Override
	public String toString()
		{
		return getPosition() + " " + getNameOfPlayer() + " " + getFreeThrowPercentage() + " " + getThreePointPercentage() + " " + getMidRangePercentage() + " " + getLayupPercentage() + getHasHeight();
		}

	
      
}
