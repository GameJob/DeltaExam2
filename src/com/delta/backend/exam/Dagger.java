package com.delta.backend.exam;

public class Dagger extends WeaponImpl
{
	public Dagger()
	{
		description = "Dagger";
		attack = 50;
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
