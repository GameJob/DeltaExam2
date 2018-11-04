package com.delta.backend.exam;

public abstract class AbstractWeapon
{
	protected String description = "";
	protected int attack;

	public abstract String getDescription();

	public abstract int getAttack();

	public String toString()
	{
		return "[Description] " + getDescription() + " [Attack] " + getAttack();
	}
}
