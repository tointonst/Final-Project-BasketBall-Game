
public class ShootingGuard extends Guard{

	public ShootingGuard(String p, String nop, double ftp, double tpp, double mrp,
			double lp, boolean hq)
		{
		super(p, nop, ftp, tpp, mrp, lp, hq);
		// TODO Auto-generated constructor stub
		}

	
	@Override
	public String toString()
		{
		return getPosition() + " " + getNameOfPlayer() + " " + getFreeThrowPercentage() + " " + getThreePointPercentage() + " " + getMidRangePercentage() + " " + getLayupPercentage() + " " + getHasQuickness();
		}

}
