package question;

public class PlayGround
{
	public static void main(String [] args)
	{
		Weapon sword = new Sword();
		sword.setDiamond(true);
		sword.setAmber(true);
		
		Weapon knife = new Knife();
		knife.setPearl(true);
		
		Weapon dagger = new Dagger();
		dagger.setRuby(true);
		
		System.out.println(sword);
		System.out.println(knife);
		System.out.println(dagger);
	}
}
