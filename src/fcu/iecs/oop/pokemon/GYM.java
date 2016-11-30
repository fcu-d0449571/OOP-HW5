package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(pokemon p1, pokemon p2)
	{
		int winner = (int) (Math.random()*2); 
		
		if(winner==0)
		{
			p1.setCp(p1.getCp()+500);
			System.out.println("The winner is "+p1.getName()+"  CP:"+p1.getCp());
		}
		else
		{
			p2.setCp(p2.getCp()+500);
			System.out.println("The winner is "+p2.getName()+"  CP:"+p2.getCp());
		}
	}
}