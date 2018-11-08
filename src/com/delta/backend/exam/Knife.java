package com.delta.backend.exam;

public class Knife extends WeaponImpl
{
	public Knife()
	{
		description = "Knife";
		attack = 30;
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
