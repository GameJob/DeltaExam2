package question;

public class Sword extends Weapon
{
	@Override
	public String getDescription()
	{
		return "Sword" + super.getDescription();
	}

	@Override
	public int getAttack()
	{
		return 100 + super.getAttack();
	}
}
