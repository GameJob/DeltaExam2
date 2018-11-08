package question;

import com.delta.backend.exam.AbstractWeapon;
import com.delta.backend.exam.Dagger;
import com.delta.backend.exam.Knife;
import com.delta.backend.exam.Sword;

public class WeaponFactory
{
	public enum WeaponType
	{
		DAGGER, KNIFE, SWORD
	}

	protected AbstractWeapon createWeapon(WeaponType weaponType)
	{
		AbstractWeapon weapon = null;
		switch (weaponType)
		{
		case DAGGER:
			weapon = new Dagger();
			break;
		case KNIFE:
			weapon = new Knife();
			break;
		case SWORD:
			weapon = new Sword();
			break;
		default:
			weapon = new Sword();
			break;
		}
		return weapon;
	}
}
