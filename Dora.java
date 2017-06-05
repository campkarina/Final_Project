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
		System.out.println("Welcome to Dora the Explorer! Your goal in this adventure is to make sure Dora and Boots get home safely and in time for their family reunion (Type any number to proceed). ");
		String proceed = kb.next();
		System.out.println("Dora: Hello! My name is Dora and I really hope you can help me and Boots get home to our family. What is your name? ");
		String name = kb.next();
		System.out.println("Dora: Nice to meet you " + name + "! ");
		System.out.println ("Boots: Let's get started! (Say okay to proceed) ");
		String okay = kb.next();
		System.out.println("Dora: Where should we go first? Should we take the path on the right or left? (From now on, press any key or make a choice in order to proceed)");
		String firstp = kb.next();
		if(firstp.equals("right") || firstp.equals("left"))
		{
			if(firstp.equals("right"))
			{
				System.out.println("Boots: Look it's a river!");
				String n1 = kb.next(); 
				System.out.println("Dora: But how do we cross the river without drowing? There are some big stones we could use to cross or we could swim. Should we swim or walk across the stone path? (Choose from swim or walk)");
				String river = kb.next();
				if(river.equals("swim") || river.equals("walk"))
				{
					if(river.equals("swim"))
					{
						System.out.println("As Dora and Boots start to swim across the river, a pirate ship approaches them and stops them. The captain of the ship, Pirate Pig, demands that both Dora and Boots come aboard the ship as captives.");
						String n2 = kb.next(); 
						System.out.println("Pirate Pig: Arrrrrr! How dare you swim in our river?! Both of you are our captives now and you must come on my ship at once as my prisoners!");
						String n3 = kb.next(); 
						System.out.println("Dora: Oh no! What do we do now? Should we go on the ship or fight Pirate Pig and his fellow pirates? (Choose from prisoners or fight)");
						String swim = kb.next();
						if(swim.equals("prisoners") || swim.equals("fight"))
						{
							if(swim.equals("prisoners"))
							{
								System.out.println("Dora and Boots come onto the ship as prisoners but they trick all the pirates and jump off the ship and quickly swim across the river. They made it!");
								String n4 = kb.next(); 
								System.out.println("Boots: Phew! That was a close one!");
								String n5 = kb.next(); 
								System.out.println("Dora: We barely escaped the pirates. We should really get going so we can go home to our family in time.");
								String n6 = kb.next(); 
								System.out.println("As Dora and Boots go along the designated path, they come across a bridge. They are about to cross the bridge when a troll aproaches them.");
								String n7 = kb.next(); 
								System.out.println("Troll: How dare you step foot on my bridge!! You cannot cross without saying the special password.");
								String n8 = kb.next(); 
								System.out.println("Dora: Oh no! What do we do now," + name + "? " );
								String n9 = kb.next(); 
								System.out.println("Boots: Dora and " + name + ", I think I might know the password but it could be one of 3 options: key, #trolling, or please. " + name + ", What do you think it is? ");
								String password = kb.next();
								if(password.equals("key") || password.equals("#trolling") || password.equals("please"))
								{
									System.out.println("key");
									if(password.equals("key"))
									{
										System.out.println("The troll has set a trap for Dora and Boots and he ends up capturing Boots. The troll takes a golden key, runs away with Boots, locks him in the castle, and hides the key in a garden.");
										String n10 = kb.next();
										System.out.println("Dora: Noooo!!! We have to get Boots back! We need to rescue him right now. I know the troll has hiden the golden key in a mysterious, secret garden. Let's go! ");
										String k1 = kb.next();
										System.out.println("You and Dora reach the garden. You must help Dora find the key so you both can find Boots in time. ");
										String k2 = kb.next();
										System.out.println("Dora: Oh look at all of the red and blue roses! The key must be hidden in one of the rose bushes. Should I look into the red rose bush or blue rose bush? (Choose from red or blue)");
										String rose = kb.next();
										if(rose.equals("blue") || rose.equals("red"))
										{
											if(rose.equals("blue"))
											{
												System.out.println("YOU FOUND THE GOLDEN KEY!");
												String k3 = kb.next();
												System.out.println("Dora: Now that we found the key, lets's get out of here so we can save Boots! This is the last step to getting home! Now we just have to choose which direction to go to get home! Where do we go next: Northwest or Northeast? ");
												String direction = kb.next();
												if(direction.equals("Northeast") || direction.equals("Northwest"))
												{
													if(direction.equals("Northeast"))
														System.out.println("Dora: WE DID IT! WE ARE BACK HOME WITH ALL OF OUR FAMILY AND FRIENDS! WINNER");
													else
														System.out.println("You, Dora, and Boots go on the wrong path and get lost. You don't get Dora and Boots back home in time. GAME OVER");
												}
												
											}
											else
												System.out.println("You and Dora don't get to Boots in time and therefore don't get home in time. GAME OVER");
												
										}
									}
									else if(password.equals("#trolling"))
									{
										System.out.println("Troll: How did you guess that?! You got it right! You may now pass through. ");
										String k4 = kb.next();
										System.out.println("You, Dora, and Boots safely cross the troll bridge and make it home in time. ");
										String k5 = kb.next();
										System.out.println("Dora: WE DID IT! WE ARE BACK HOME WITH ALL OF OUR FAMILY AND FRIENDS! WINNER");
									}
									else
										System.out.println("Troll: WRONG!! Bad luck! Start over. GAME OVER ");
								}
								
							}	
							else
							{
								System.out.println("Dora and Boots are both not strong enough to fight all the pirates. Boots gets captured by Pirate Pig and his crew. The pirates take a golden key, lock Boots in the castle, and hide the key in a garden.");
								String k6 = kb.next();
								System.out.println("Dora: Noooo!!! We have to get Boots back! We need to rescue him right now. I know the troll has hiden the golden key in a mysterious, secret garden. Let's go! ");
								String k7 = kb.next();
								System.out.println("You and Dora reach the garden. You must help Dora find the key so you both can find Boots in time. ");
								String k8 = kb.next();
								System.out.println("Dora: Oh look at all of the red and blue roses! The key must be hidden in one of the rose bushes. Should I look into the red rose bush or blue rose bush? (Choose from red or blue)");
								String rose = kb.next();
								if(rose.equals("blue") || rose.equals("red"))
								{
									if(rose.equals("blue"))
									{
										System.out.println("YOU FOUND THE GOLDEN KEY!");
										String k9 = kb.next();
										System.out.println("Dora: Now that we found the key, lets's get out of here so we can save Boots! This is the last step to getting home! Now we just have to choose which direction to go to get home! Where do we go next: Northwest or Northeast? ");
										String direction = kb.next();
										if(direction.equals("Northeast") || direction.equals("Northwest"))
										{
											if(direction.equals("Northeast"))
												System.out.println("Dora: WE DID IT! WE ARE BACK HOME WITH ALL OF OUR FAMILY AND FRIENDS! WINNER");
											else
												System.out.println("You, Dora, and Boots go on the wrong path and get lost. You don't get Dora and Boots back home in time. GAME OVER");
										}
												
									}
									else
										System.out.println("You and Dora don't get to Boots in time and therefore don't get home in time. GAME OVER");
												
								}
								
							}
								
						}
					}	
					else
					{
						System.out.println("Dora and Boots make it across the river safe and sound.");
						String k10 = kb.next();
						System.out.println("As Dora and Boots go along the designated path, they come across a bridge. They are about to cross the bridge when a troll aproaches them.");
						String m1 = kb.next();
						System.out.println("Troll: How dare you step foot on my bridge!! You cannot cross without saying the special password.");
						String m2 = kb.next();
						System.out.println("Dora: Oh no! What do we do now," + name + "? " );
						String m3 = kb.next();
						System.out.println("Boots: Dora and " + name + ", I think I might know the password but it could be one of 3 options: key, #trolling, or please. " + name + "What do you think it is? ");
						String password = kb.next();
							if(password.equals("key") || password.equals("#trolling") || password.equals("please"))
							{
								if(password.equals("key"))
								{
									System.out.println("The troll has set a trap for Dora and Boots and he ends up capturing Boots. The troll takes a golden key, runs away with Boots, locks him in the castle, and hides the key in a garden.");
									String m4 = kb.next();
									System.out.println("Dora: Noooo!!! We have to get Boots back! We need to rescue him right now. I know the troll has hiden the golden key in a mysterious, secret garden. Let's go! ");
									String m5 = kb.next();
									System.out.println("You and Dora reach the garden. You must help Dora find the key so you both can find Boots in time. ");
									String m6 = kb.next();
									System.out.println("Dora: Oh look at all of the red and blue roses! The key must be hidden in one of the rose bushes. Should I look into the red rose bush or blue rose bush? (Choose from red or blue)");
									String rose = kb.next();
									if(rose.equals("blue") || rose.equals("red"))
									{
										if(rose.equals("blue"))
										{
											System.out.println("YOU FOUND THE GOLDEN KEY!");
											String m7 = kb.next();
											System.out.println("Dora: Now that we found the key, lets's get out of here so we can save Boots! This is the last step to getting home! Now we just have to choose which direction to go to get home! Where do we go next: Northwest or Northeast? ");
											String direction = kb.next();
											if(direction.equals("Northeast") || direction.equals("Northwest"))
											{
												if(direction.equals("Northeast"))
													System.out.println("Dora: WE DID IT! WE ARE BACK HOME WITH ALL OF OUR FAMILY AND FRIENDS! WINNER");
												else
													System.out.println("You, Dora, and Boots go on the wrong path and get lost. You don't get Dora and Boots back home in time. GAME OVER");
											}
												
										}
										else
											System.out.println("You and Dora don't get to Boots in time and therefore don't get home in time. GAME OVER");
									}
								}	
								else if(password.equals("#trolling"))
								{
									System.out.println("Troll: How did you guess that?! You got it right! You may now pass through. ");
									String m8 = kb.next();
									System.out.println("You, Dora, and Boots safely cross the troll bridge and make it home in time. ");
									String m9 = kb.next();
									System.out.println("Dora: WE DID IT! WE ARE BACK HOME WITH ALL OF OUR FAMILY AND FRIENDS! WINNER");
								}	
								else
									System.out.println("Troll: WRONG!! Bad luck! Start over. GAME OVER ");
									
										
							}
					}
				}
			}
		}	
		else
		{
			System.out.println("Dora and Boots: We have reached the troll bridge!)");
			String m10 = kb.next();
			System.out.println("They are about to cross the bridge when a troll aproaches them.");
			String p1 = kb.next();
			System.out.println("Troll: How dare you step foot on my bridge!! You cannot cross without saying the special password.");
			String p2 = kb.next();
			System.out.println("Dora: Oh no! What do we do now," + name + "? " );
			String p3 = kb.next();
			System.out.println("Boots: Dora and " + name + ", I think I might know the password but it could be one of 3 options: key, #trolling, or please. " + name + "What do you think it is? ");
			String password = kb.next();
			if(password.equals("key") || password.equals("#trolling") || password.equals("please"))
			{
				if(password.equals("key"))
				{
					System.out.println("The troll has set a trap for Dora and Boots and he ends up capturing Boots. The troll takes a golden key, runs away with Boots, locks him in the castle, and hides the key in a garden.");
					String p4 = kb.next();
					System.out.println("Dora: Noooo!!! We have to get Boots back! We need to rescue him right now. I know the troll has hiden the golden key in a mysterious, secret garden. Let's go! ");
					String p5 = kb.next();
					System.out.println("You and Dora reach the garden. You must help Dora find the key so you both can find Boots in time. ");
					String p6 = kb.next();
					System.out.println("Dora: Oh look at all of the red and blue roses! The key must be hidden in one of the rose bushes. Should I look into the red rose bush or blue rose bush? (Choose from red or blue)");
					String rose = kb.next();
					if(rose.equals("blue") || rose.equals("red"))
					{
						if(rose.equals("blue"))
						{
							System.out.println("YOU FOUND THE GOLDEN KEY!");
							String p7 = kb.next();
							System.out.println("Dora: Now that we found the key, lets's get out of here so we can save Boots! This is the last step to getting home! Now we just have to choose which direction to go to get home! Where do we go next: Northwest or Northeast? ");
							String direction = kb.next();
							if(direction.equals("Northeast") || direction.equals("Northwest"))
							{
								if(direction.equals("Northeast"))
									System.out.println("Dora: WE DID IT! WE ARE BACK HOME WITH ALL OF OUR FAMILY AND FRIENDS! WINNER");
								else
									System.out.println("You, Dora, and Boots go on the wrong path and get lost. You don't get Dora and Boots back home in time. GAME OVER");
							}
												
						}
						else
							System.out.println("You and Dora don't get to Boots in time and therefore don't get home in time. GAME OVER");
					}
				}	
				else if(password.equals("#trolling"))
				{
					System.out.println("Troll: How did you guess that?! You got it right! You may now pass through. ");
					String p8 = kb.next();
					System.out.println("You, Dora, and Boots safely cross the troll bridge and make it home in time. ");
					String p9 = kb.next();
					System.out.println("Dora: WE DID IT! WE ARE BACK HOME WITH ALL OF OUR FAMILY AND FRIENDS! WINNER");
				}	
				else
					System.out.println("Troll: WRONG!! Bad luck! Start over. GAME OVER ");
			}
		}
	}
}