
public class BigMan extends Player{

    protected boolean hasHeight = true;
    
	public BigMan(String p,String nop, double ftp, double tpp, double mrp, double lp, boolean hh)
		{
		super(p, nop, ftp, tpp, mrp, lp);
		hasHeight = hh;
		}
	
	public boolean getHasHeight()
		{
		return hasHeight;
		}

	@Override
	public String toString()
		{
		return getPosition() + " " + getNameOfPlayer() + " " + getFreeThrowPercentage() + " " + getThreePointPercentage() + " " + getMidRangePercentage() + " " + getLayupPercentage() + getHasHeight();
		}

	

}
