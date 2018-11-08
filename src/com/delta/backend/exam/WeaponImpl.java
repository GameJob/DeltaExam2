package com.delta.backend.exam;

public abstract class WeaponImpl implements Weapon
{
	protected String description = "";
	protected int attack;

	public String toString()
	{
		return "[Description] " + getDescription() + " [Attack] " + getAttack();
	}
}
