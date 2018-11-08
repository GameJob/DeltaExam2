package question;

import com.delta.backend.exam.AbstractWeapon;
import com.delta.backend.exam.Amber;
import com.delta.backend.exam.Diamond;
import com.delta.backend.exam.Pearl;
import com.delta.backend.exam.Ruby;

import question.WeaponFactory.WeaponType;

public class PlayGroundF
{
	public static void main(String [] args)
	{
		WeaponFactory weaponFactory = new WeaponFactory();
		
		AbstractWeapon sword = weaponFactory.createWeapon(WeaponType.SWORD);
		sword = new Diamond(sword);
		sword = new Amber(sword);

		AbstractWeapon knife = weaponFactory.createWeapon(WeaponType.KNIFE);
		knife = new Pearl(knife);

		AbstractWeapon dagger = weaponFactory.createWeapon(WeaponType.DAGGER);
		dagger = new Ruby(dagger);
		
		System.out.println(sword);
		System.out.println(knife);
		System.out.println(dagger);
	}
}
