package com.delta.backend.exam;

public class Gem extends AbstractWeapon
{
	protected AbstractWeapon weapon;

	public Gem(AbstractWeapon weapon)
	{
		this.weapon = weapon;
	}

	@Override
	public String getDescription()
	{
		return weapon.getDescription() + ", " + description;
	}

	@Override
	public int getAttack()
	{
		return weapon.getAttack() + attack;
	}
}
