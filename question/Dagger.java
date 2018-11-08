package question;

public class Dagger extends Weapon
{
	@Override
	public String getDescription()
	{
		return "Dagger" + super.getDescription();
	}

	@Override
	public int getAttack()
	{
		return 50 + super.getAttack();
	}
}
