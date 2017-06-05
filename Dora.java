import java.util.Scanner;
public class Dora
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		choices();
	}
	public static void choices()
	{
		System.out.println("Welcome to Dora the Explorer! Your goal in this adventure is to make sure Dora and Boots get home safely and in time for their family reunion (Say next to proceed). ");
		String proceed = kb.next();
		System.out.println("Dora: Hello! My name is Dora and I really hope you can help me and Boots get home to our family. What is your name? ");
		String name = kb.next();
		System.out.println("Dora: Nice to meet you " + name + "! ");
		System.out.println ("Boots: Let's get started! (Say okay to proceed) ");
		String okay = kb.next();
		System.out.println("Dora: Where should we go first? Should we take the path on the right, left, or the middle?");
		String firstp = kb.next();
		if(firstp.equals("right") || firstp.equals("left") || firstp.equals("middle"))
		{
			if(firstp.equals("right"))
			{
				System.out.println("Boots: Look e (only from Neptune, Saturn, or Uranus) : ");
				String planet = kb.next();
				if(planet.equals("Neptune") || planet.equals("Saturn") || planet.equals("Uranus"))
				{
					if(planet.equals("Neptune"))
					{
						System.out.println("Pick a box 1 or 2: ");
						String nepbox = kb.next();
						if(nepbox.equals("1") || nepbox.equals("2"))
						{
							if(nepbox.equals("1"))
								System.out.println("You found the golden star! ");
							else
								System.out.println("Bad luck! ");
						}
					}	
					else if(planet.equals("Saturn"))
					{
						System.out.println("Pick a box 3 or 4: ");
						String satbox = kb.next();
						if(satbox.equals("3") || satbox.equals("4"))
						{
							if(satbox.equals("4"))
								System.out.println("You found the golden star! ");
							else
								System.out.println("Bad luck! ");
						}
					}
					else
					{
						System.out.println("Pick a box 5 or 6: ");
						String urbox = kb.next();
						if(urbox.equals("5") || urbox.equals("6"))
						{
							if(urbox.equals("6"))
								System.out.println("You found the golden star! ");
							else
								System.out.println("Bad luck! ");
						}
					}
				}
			}
		}	
		if(firstp.equals("red"))
		{
			System.out.println("Awesome! Choose a planet (only from Mars, Jupiter, or Venus)");
			String planet = kb.next();
			if(planet.equals("Mars") || planet.equals("Jupiter") || planet.equals("Venus"))
			{
				if(planet.equals("Mars"))
				{
					System.out.println("Pick a box 1 or 2: ");
					String marbox = kb.next();
					if(marbox.equals("1") || marbox.equals("2"))
					{
						if(marbox.equals("2"))
							System.out.println("You found the golden star! ");
						else
							System.out.println("Bad luck! ");
					}
				}
				else if(planet.equals("Jupiter"))
				{
					System.out.println("Pick a box 3 or 4: ");
					String jupbox = kb.next();
					if(jupbox.equals("3") || jupbox.equals("4"))
					{
						if(jupbox.equals("3"))
							System.out.println("You found the golden star! ");
						else
							System.out.println("Bad luck! ");
					}
				}
				else
				{
					System.out.println("Pick a box 5 or 6: ");
					String venbox = kb.next();
					if(venbox.equals("5") || venbox.equals("6"))
					{
						if(venbox.equals("5"))
							System.out.println("You found the golden star! ");
						else
							System.out.println("Bad luck! ");
					}
					else
					{
						//end game
					}
				}
			}
		}
		
		else if (firstp.equals("green"))
		{
			System.out.println("Great! Choose a planet (only from Earth or Mercury)");
			String planet = kb.next();
			if(planet.equals("Earth") || planet.equals("Mercury"))
			{
				if(planet.equals("Earth"))
				{
					System.out.println("Pick a box 1 or 2: ");
					String earbox = kb.next();
					if(earbox.equals("1") || earbox.equals("2"))
					{
						if(earbox.equals("2"))
							System.out.println("You found the golden star! ");
						else
							System.out.println("Bad luck! ");
					}
				}
				else
				{
					System.out.println("Pick a box 3 or 4: ");
					String merbox = kb.next();
					if(merbox.equals("3") || merbox.equals("4"))
					{
						if(merbox.equals("3"))
							System.out.println("You found the golden star! ");
						else
							System.out.println("Bad luck! ");
					}
				}
			}
		}
		else
		{
			System.out.println("Please enter blue, red, or green");
			choices();
		}
	}
}