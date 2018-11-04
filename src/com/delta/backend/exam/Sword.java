package com.delta.backend.exam;

public class Sword extends AbstractWeapon
{
	public Sword()
	{
		description = "Sword";
		attack = 100;
	}
	
	@Override
	public String getDescription()
	{
		return description;
	}

	@Override
	public int getAttack()
	{
		return attack;
	}
}
