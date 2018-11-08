package com.delta.backend.exam;

public abstract class Gem implements Weapon
{
	protected String description = "";
	protected int attack;
	
	protected Weapon weapon;

	public Gem(Weapon weapon)
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

	public String toString()
	{
		return "[Description] " + getDescription() + " [Attack] " + getAttack();
	}
}
