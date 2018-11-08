package question;

public class Knife extends Weapon
{
	@Override
	public String getDescription()
	{
		return "Knife" + super.getDescription();
	}

	@Override
	public int getAttack()
	{
		return 30 + super.getAttack();
	}
}
