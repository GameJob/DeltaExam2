package com.delta.backend.exam;

public class PlayGround
{
	public static void main(String [] args)
	{
		AbstractWeapon sword = new Sword();
		sword = new Diamond(sword);
		sword = new Amber(sword);

		AbstractWeapon knife = new Knife();
		knife = new Pearl(knife);

		AbstractWeapon dagger = new Dagger();
		dagger = new Ruby(dagger);
		
		System.out.println(sword);
		System.out.println(knife);
		System.out.println(dagger);
	}
}
