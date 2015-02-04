
public class Center extends BigMan {

    protected double blockShotPersentage;
	
	public Center(String p, String nop, double ftp, double tpp, double mrp, double lp,
			boolean hh, double bsp)
		{
		super(p, nop, ftp, tpp, mrp, lp, hh);
		blockShotPersentage = bsp;
		}
	public double getBlockShotPercentage()
		{
		return blockShotPersentage;
		}

	@Override
	public String toString()
		{
		return getPosition() + " " + getNameOfPlayer() + " " + getFreeThrowPercentage() + " " + getThreePointPercentage() + " " + getMidRangePercentage() + " " + getLayupPercentage() + " " + getHasHeight() + " " + getBlockShotPercentage();
		}


	
		}


