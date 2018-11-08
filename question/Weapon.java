package question;

public class Weapon
{
	private String description = "";
	private int attack;
	private boolean hasDiamond;
	private boolean hasRuby;
	private boolean hasAmber;
	private boolean hasPearl;

	public String getDescription()
	{
		if (hasDiamond)
			description += ", Diamond";
		if (hasRuby)
			description += ", Ruby";
		if (hasAmber)
			description += ", Amber";
		if (hasPearl)
			description += ", Pearl";
		return description;
	}

	public int getAttack()
	{
		if (hasDiamond)
			attack += 5;
		if (hasRuby)
			attack += 3;
		if (hasAmber)
			attack += 2;
		if (hasPearl)
			attack += 1;
		return attack;
	}

	public boolean hasDiamond()
	{
		return hasDiamond;
	}

	public boolean hasRuby()
	{
		return hasRuby;
	}

	public boolean hasAmber()
	{
		return hasAmber;
	}

	public boolean hasPearl()
	{
		return hasPearl;
	}

	public void setDiamond(boolean hasDiamond)
	{
		this.hasDiamond = hasDiamond;
	}

	public void setRuby(boolean hasRuby)
	{
		this.hasRuby = hasRuby;
	}

	public void setAmber(boolean hasAmber)
	{
		this.hasAmber = hasAmber;
	}

	public void setPearl(boolean hasPearl)
	{
		this.hasPearl = hasPearl;
	}

	// Omitting Getters and Setters for other gems
	public String toString()
	{
		return "[Description] " + getDescription() + " [Attack] " + getAttack();
	}
}
