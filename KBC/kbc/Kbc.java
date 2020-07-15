package kbc;
import java.util.Scanner;



public class Kbc 
{
static Scanner sc= new Scanner (System.in);
static char x,t;
static int i,y,choose,c1=0,c2=0,c3=0,c4=0,f1=0,f2=0,f3=0,f4=0;
static int a[]={10000,40000,80000,320000,1250000,5000000,10000000};
static String l[]={"1 : Audience poll","2 : Phone a friend","3 : Expert Advice","4 : Double dip"};

	




public static void main(String[] args) 
	{
		System.out.println("\t\t\t\t\t\t\t\tLet's play KAUN BANEGA CROREPATI");
		System.out.println("\t\t\t\t\t\t\t\t********************************");
		System.out.println("\nRULES OF THE GAME ARE:" );
		System.out.println("\n\n##You'll have to answer 7 questions correctly to win 1 crore");
		for(i=1; i<=7; i++)
		{
		System.out.println(" " +i+"- Rs." +a[i-1]);
		}
		System.out.println("\n\n##You'll get the help of 4 lifelines\n");
		for(i=1; i<=4;i++)
		{
		System.out.println(" "+l[i-1]);
		}
		
		
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		System.out.println("\n________________________________________________________________________________________________");
		System.out.println("\n\t\t\t\t\t\t\t\t    Thank You for playing KBC\n");
		System.out.println("\t\t\t\t\t\t\t\t\t   GAME OVER");
		System.out.println("\t\t\t\t\t\t\t\t********************************");

		
		
	}
	
	
//QUESTION 1

public static void q1()
{
	System.out.println("\n________________________________________________________________________________________________");
	System.out.println("\n1. WHICH OF THESE ANIMALS CAN LAUNCH THEIR TONGUES AT A GREAT SPEED UP TO A DISTANCE OF MORE THAN TWICE THEIR BODY LENGTH TO CATCH THEIR PREY?");
	System.out.println("a. House Lizard\t  b. Tortoise\tc. Crocodile\td. Chameleon");
	choose=4;
	
	
	System.out.println("\n--Do you want to play(p) or exit(e)?");
	x=sc.next().charAt(0);
	
	if(x=='p'||x=='P')
	{
//1.PLAY WITHOUT LIFELINES
		
			System.out.println("--Do you want a lifeline? (y/n)");
			x=sc.next().charAt(0);
			
			
			if(x=='n'||x=='N')
			{
				System.out.println("Enter Option");
				x=sc.next().charAt(0);
				switch(x)
				{
				case 'a':
				case 'b':
				case 'c':System.out.println("WRONG ANSWER!!!");
						System.out.println("*****You win Rs. 0*****");
						System.out.println("\n\t\t\t\t\t\t\t\t    Thank You for playing KBC\n");
						System.out.println("\t\t\t\t\t\t\t\t\t   GAME OVER");
						System.out.println("\t\t\t\t\t\t\t\t********************************");

						System.exit(0);
				case 'd': System.out.println("CORRECT ANSWER!!!");
						System.out.println("*****You win Rs."+a[0]+"*****");
						
						
				}
				if(x!='a' && x!='b' && x!='c' && x!='d' )
				{
					System.out.println("OOPS. Invalid character, you'll have to start the game again.");
					System.exit(0);
				}
				
			}
	         else if (x=='y'||x=='Y')
			{
//1.LIFELINES	        	 
	        	 if(c1!=1 || c2!=1 || c3!=1 || c4!=1)
		        	{
	        
		        do{
		        	f1=0;f2=0;f3=0;f4=0;
					System.out.println("\n--Which lifeline do you want ?");
					System.out.println("1.AUDIENCE POLL\t\t2.PHONE A FRIEND\t3.EXPERT ADVICE\t\t4.DOUBLE DIP");
					y=sc.nextInt();
					
					switch(y)
					{

					case 1:if(c1==0)
						{
							
								audiencepoll();
								c1=1;
								System.out.println("\nEnter your answer.");
								x=sc.next().charAt(0);
								switch(x)
								{
									case 'a':
									case 'b':
									case 'c':System.out.println("\nWRONG ANSWER!!!");
											System.out.println("*****You win Rs. 0*****");
											System.exit(0);
									case 'd': System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[0]+"*****");
											
								}
								if(x!='a' && x!='b' && x!='c' && x!='d' )
								{
									System.out.println("OOPS. Invalid character, you'll have to start the game again.");
									System.exit(0);
								}
						}
							else
							{
								System.out.println("\n\n##You have already used this lifeline");
								System.out.println("Choose another lifeline...");
								System.out.println("*****************************************");
								f1=1;
							}
								break;
								
					
					case 2: if(c2==0)
							{
								phoneafriend();
								c2=1;
								System.out.println("\nEnter your answer.");
								x=sc.next().charAt(0);
								switch(x)
								{
									case 'a':
									case 'b':
									case 'c':System.out.println("\nWRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs. 0*****");
											System.exit(0);
									case 'd': System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[0]+"*****");
								}
								if(x!='a' && x!='b' && x!='c' && x!='d' )
								{
									System.out.println("OOPS. Invalid character, you'll have to start the game again.");
									System.exit(0);
								}
							}
							else
							{
								System.out.println("\n\n##You have already used this lifeline");
								System.out.println("Choose another lifeline...");
								System.out.println("*****************************************");
								f2=1;
							}
								break;
							
		
					
					
					case 3:if(c3==0)
							{	
								expertadvice();
								c3=1;
								System.out.println("\nEnter your answer.");
								x=sc.next().charAt(0);
								switch(x)
								{
									case 'a':
									case 'b':
									case 'c':System.out.println("\nWRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs. 0*****");
											System.exit(0);
									case 'd': System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[0]+"*****");
								}
								if(x!='a' && x!='b' && x!='c' && x!='d' )
								{
									System.out.println("OOPS. Invalid character, you'll have to start the game again.");
									System.exit(0);
								}
							}
						else 
						{
							
								System.out.println("\n\n##You have already used this lifeline");
								
								System.out.println("Choose another lifeline...");
								System.out.println("*****************************************");
								f3=1;
						}
								
								break;
								
		
							
					
					
					case 4: if(c4==0)
							{
								c4=1;
								System.out.println("Your two options are");
								System.out.println("b. Tortoise\t\td. Chameleon");
								System.out.println("\nEnter your answer.");
								x=sc.next().charAt(0);
								switch(x)
								{
									case 'a':
									case 'b':
									case 'c':System.out.println("\nWRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs. 0*****");
											System.exit(0);
									case 'd': System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[0]+"*****");
								}
								if(x!='a' && x!='b' && x!='c' && x!='d' )
								{
									System.out.println("OOPS. Invalid character, you'll have to start the game again.");
									System.exit(0);
								}
							}
							else
							{
								System.out.println("\n\n##You have already used this lifeline");
								System.out.println("Choose another lifeline...");
								System.out.println("*****************************************");
								f4=1;
							}
								break;
								
	
				
				
					}
	        
				
		        
	        }while (((f1 !=0) || (f2 !=0) || (f3 !=0) || (f4 !=0)) );//c1!=0 && 
		        	}
		        	else
		        	{
//1.LIFELINES OVER
		        		System.out.println("YOU HAVE USED ALL THE LIFELINES");
		        		System.out.println("\n--Do you want to play(p) or exit(e)?");
		        		x=sc.next().charAt(0);
		        		
		        		if(x=='p'||x=='P')
		        		{
		        			
		        					System.out.println("Enter Option");
		        					x=sc.next().charAt(0);
		        					switch(x)
		        					{
		        					case 'a':
		        					case 'b':
		        					case 'c':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
		        							System.out.println("*****You win Rs. 0*****");
		        							System.exit(0);
		        					case 'd': System.out.println("CORRECT ANSWER!!!");
		        							System.out.println("*****You win Rs."+a[0]+"*****");
		        							break;
		        					
		        					default: System.out.println("OOPS. Invalid character, you'll have to start the game again.");
		        						System.exit(0);
		        					}
		        					
		        		}
		        		
		        		
		        		
		        		else if(x=='e'||x=='E')
		        		{
		        			System.out.println("*****Yon win Rs.0*****");
		        			System.exit(0);
		        		}
		        		
		        		
		        		else
		        		{
		        			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
		        			System.exit(0);
		        		}

		        	}
		        	
			
			}
			
			else
				{
					System.out.println("OOPS. Invalid character. You'll have to start the game again.");
					System.exit(0);
				}
	}
	
//1.EXIT
	
	else if(x=='e'||x=='E')
	{
		System.out.println("*****Yon win Rs.0*****");
		System.exit(0);
	}
	
	
	else
	{
		System.out.println("OOPS. Invalid character. You'll have to start the game again.");
		System.exit(0);
	}

	
}

	
	
	
	
//QUESTION 2
	
	public static void q2()
	{
		System.out.println("\n________________________________________________________________________________________________");
		System.out.println("\n2. WHICH POLITICIAN, OFTEN CALLED THE 'MUFFLER MAN'?");
		System.out.println("a. Rahul Gandhi\t\tb. Arvind Kejriwal\tc. Narendra Modi\t d. Manmohan Singh");
		choose=2;
		
		
		System.out.println("\n--Do you want to play(p) or exit(e)?");
		x=sc.next().charAt(0);
		
		if(x=='p'||x=='P')
		{
//2.PLAY WITHOUT LIFELINES	
			
				System.out.println("--Do you want a lifeline? (y/n)");
				x=sc.next().charAt(0);
				
				
				if(x=='n'||x=='N')
				{
					System.out.println("Enter Option");
					x=sc.next().charAt(0);
					switch(x)
					{
					case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
							System.out.println("*****You win Rs."+a[0]+"*****");
							System.exit(0);
					case 'b':System.out.println("CORRECT ANSWER!!!");
							System.out.println("*****You win Rs."+a[1]+"*****");
							break;
					case 'c':
					case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
							System.out.println("*****You win Rs."+a[0]+"*****");
							System.exit(0); 
							
							
					}
					if(x!='a' && x!='b' && x!='c' && x!='d' )
					{
						System.out.println("OOPS. Invalid character, you'll have to start the game again.");
						System.exit(0);
					}
					
				}
		         else if (x=='y'||x=='Y')
				{
//2.LIFELINES		        	 
		        	 if(c1!=1 || c2!=1 || c3!=1 || c4!=1)
			        	{
		        
			        do{
			        	f1=0;f2=0;f3=0;f4=0;
						System.out.println("\n--Which lifeline do you want ?");
						System.out.println("1.AUDIENCE POLL\t\t2.PHONE A FRIEND\t3.EXPERT ADVICE\t\t4.DOUBLE DIP");
						y=sc.nextInt();
						
						switch(y)
						{
							case 1:if(c1==0)
							{
								
									audiencepoll();
									c1=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[0]+"*****");
											System.exit(0);
									case 'b':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[1]+"*****");
											break;
									case 'c':
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[0]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
							}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f1=1;
								}
									break;
									
						
						case 2: if(c2==0)
								{
									phoneafriend();
									c2=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[0]+"*****");
											System.exit(0);
									case 'b':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[1]+"*****");
											break;
									case 'c':
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[0]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f2=1;
								}
									break;
								
			
						
						
						case 3:if(c3==0)
								{	
									expertadvice();
									c3=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[0]+"*****");
											System.exit(0);
									case 'b':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[1]+"*****");
											break;
									case 'c':
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[0]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
							else 
							{
								
									System.out.println("\n\n##You have already used this lifeline");
									
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f3=1;
							}
									
									break;
									
			
								
						
						
						case 4: if(c4==0)
								{
									c4=1;
									System.out.println("Your two options are");
									System.out.println("a. Rahul Gandhi\t\tb. Arvind Kejriwal");
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[0]+"*****");
											System.exit(0);
									case 'b':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[1]+"*****");
											break;
									case 'c':
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[0]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f4=1;
								}
									break;
									
		
					
					
						}
		        
					
			        
		        }while (((f1 !=0) || (f2 !=0) || (f3 !=0) || (f4 !=0)) );//c1!=0 && 
			        	}
			        	else
			        	{
//2.LIFELINES OVER
			        		System.out.println("YOU HAVE USED ALL THE LIFELINES");
			        		System.out.println("\n--Do you want to play(p) or exit(e)?");
			        		x=sc.next().charAt(0);
			        		
			        		if(x=='p'||x=='P')
			        		{
			        			
			        					System.out.println("Enter Option");
			        					x=sc.next().charAt(0);
			        					switch(x)
			        					{
			        					case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[0]+"*****");
												System.exit(0);
										case 'b':System.out.println("CORRECT ANSWER!!!");
												System.out.println("*****You win Rs."+a[1]+"*****");
												break;
										case 'c':
										case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[0]+"*****");
												System.exit(0); 
			        					
			        					default: System.out.println("OOPS. Invalid character, you'll have to start the game again.");
			        						System.exit(0);
			        					}
			        					
			        		}
			        		
			        		
			        		
			        		else if(x=='e'||x=='E')
			        		{
			        			System.out.println("*****Yon win Rs."+a[0]+"*****");
			        			System.exit(0);
			        		}
			        		
			        		
			        		else
			        		{
			        			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			        			System.exit(0);
			        		}

			        	}
			        	
				
				}
				
				else
					{
						System.out.println("OOPS. Invalid character. You'll have to start the game again.");
						System.exit(0);
					}
		}
		
//2.EXIT
		
		else if(x=='e'||x=='E')
		{
			System.out.println("*****Yon win Rs."+a[0]+"*****");
			System.exit(0);
		}
		
		
		else
		{
			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			System.exit(0);
		}
	
		
	}
	
	
	
//QUESTION 3
	
	public static void q3()
	{
		System.out.println("\n________________________________________________________________________________________________");
		System.out.println("\n3.WHICH OF THESE SMARTPHONE TOOL IS USED F0R SHARING AN INTERNET CONNECTION?");
		System.out.println("a.Hotspot\tb.GPS\tc.Talkback\td.Bluetooth");
		choose=1;
		
		
		System.out.println("\n--Do you want to play(p) or exit(e)?");
		x=sc.next().charAt(0);
		
		if(x=='p'||x=='P')
		{
			
//3.PLAY WITHOUT LIFELINES
			
				System.out.println("--Do you want a lifeline? (y/n)");
				x=sc.next().charAt(0);
				
				
				if(x=='n'||x=='N')
				{
					System.out.println("Enter Option");
					x=sc.next().charAt(0);
					switch(x)
					{
					case 'a':System.out.println("CORRECT ANSWER!!!");
							System.out.println("*****You win Rs."+a[2]+"*****");
							break;
					
					case 'b':
					case 'c':
					case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
							System.out.println("*****You win Rs."+a[1]+"*****");
							System.exit(0);

							
					}
					if(x!='a' && x!='b' && x!='c' && x!='d' )
					{
						System.out.println("OOPS. Invalid character, you'll have to start the game again.");
						System.exit(0);
					}
					
				}
		         else if (x=='y'||x=='Y')
				{
//3.LIFELINES		        	 
		        	 if(c1!=1 || c2!=1 || c3!=1 || c4!=1)
			        	{
		        
			        do{
			        	f1=0;f2=0;f3=0;f4=0;
						System.out.println("\n--Which lifeline do you want ?");
						System.out.println("1.AUDIENCE POLL\t\t2.PHONE A FRIEND\t3.EXPERT ADVICE\t\t4.DOUBLE DIP");
						y=sc.nextInt();
						
						switch(y)
						{
							case 1:if(c1==0)
							{
								
									audiencepoll();
									c1=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[2]+"*****");
											break;
									
									case 'b':
									case 'c':
									case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[1]+"*****");
											System.exit(0);
				
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
							}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f1=1;
								}
									break;
									
						
						case 2: if(c2==0)
								{
									phoneafriend();
									c2=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[2]+"*****");
											break;
							
									case 'b':
									case 'c':
									case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[1]+"*****");
											System.exit(0);

									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f2=1;
								}
									break;
								
			
						
						
						case 3:if(c3==0)
								{	
									expertadvice();
									c3=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[2]+"*****");
											break;
							
									case 'b':
									case 'c':
									case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[1]+"*****");
											System.exit(0);
		
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
							else 
							{
								
									System.out.println("\n\n##You have already used this lifeline");
									
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f3=1;
							}
									
									break;
									
			
								
						
						
						case 4: if(c4==0)
								{
									c4=1;
									System.out.println("Your two options are");
									System.out.println("a.Hotspot\t\td.Bluetooth");
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[2]+"*****");
											break;
							
									case 'b':
									case 'c':
									case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[1]+"*****");
											System.exit(0);
			
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f4=1;
								}
									break;
									
		
					
					
						}
		        
					
			        
		        }while (((f1 !=0) || (f2 !=0) || (f3 !=0) || (f4 !=0)) );//c1!=0 && 
			        	}
			        	else
//3.LIFLINES OVER
			        		{
			        		System.out.println("YOU HAVE USED ALL THE LIFELINES");
			        		System.out.println("\n--Do you want to play(p) or exit(e)?");
			        		x=sc.next().charAt(0);
			        		
			        		if(x=='p'||x=='P')
			        		{
			        			
			        					System.out.println("Enter Option");
			        					x=sc.next().charAt(0);
			        					switch(x)
			        					{
			        					case 'a':System.out.println("CORRECT ANSWER!!!");
												System.out.println("*****You win Rs."+a[2]+"*****");
												break;
								
										case 'b':
										case 'c':
										case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[1]+"*****");
												System.exit(0);
		
			        					default: System.out.println("OOPS. Invalid character, you'll have to start the game again.");
			        						System.exit(0);
			        						
			        					}
			        					
			        		}
			        		
			        		
			        		
			        		else if(x=='e'||x=='E')
			        		{
			        			System.out.println("*****Yon win Rs."+a[1]+"*****");
			        			System.exit(0);
			        		}
			        		
			        		
			        		else
			        		{
			        			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			        			System.exit(0);
			        		}

			        	}
			        	
				
				}
				
				else
					{
						System.out.println("OOPS. Invalid character. You'll have to start the game again.");
						System.exit(0);
					}
		}
		
//3.EXIT	
		
		else if(x=='e'||x=='E')
		{
			System.out.println("*****Yon win Rs."+a[1]+"*****");
			System.exit(0);
		}
		
		
		else
		{
			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			System.exit(0);
		}
	
		
	}
	
	
	
//QUESTION 4
	
	public static void q4()
	{
		System.out.println("\n________________________________________________________________________________________________");
		System.out.println("\n4. WHAT IS THE NAME OF THE SUPERFAST TRAIN INTRODUCED IN 2017 BETWEEN MUMBAI AND GOA?");
		System.out.println("a. Flying Rani Express \t\tb. Gatiman Express\tc. Tejas Express\t d. Karnavati Express");
		choose=3;
		
		
		System.out.println("\n--Do you want to play(p) or exit(e)?");
		x=sc.next().charAt(0);
		
		if(x=='p'||x=='P')
		{
//4.PLAY WITHOUT LIFELINES	
			
				System.out.println("--Do you want a lifeline? (y/n)");
				x=sc.next().charAt(0);
				
				
				if(x=='n'||x=='N')
				{
					System.out.println("Enter Option");
					x=sc.next().charAt(0);
					switch(x)
					{
					case 'a':
					case 'b':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
							System.out.println("*****You win Rs."+a[2]+"*****");
							System.exit(0);
					case 'c':System.out.println("CORRECT ANSWER!!!");
							System.out.println("*****You win Rs."+a[3]+"*****");
							break;
					case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
							System.out.println("*****You win Rs."+a[2]+"*****");
							System.exit(0); 
							
							
					}
					if(x!='a' && x!='b' && x!='c' && x!='d' )
					{
						System.out.println("OOPS. Invalid character, you'll have to start the game again.");
						System.exit(0);
					}
					
				}
		         else if (x=='y'||x=='Y')
				{
//4.LIFELINES		        	 
		        	 if(c1!=1 || c2!=1 || c3!=1 || c4!=1)
			        	{
		        
			        do{
			        	f1=0;f2=0;f3=0;f4=0;
						System.out.println("\n--Which lifeline do you want ?");
						System.out.println("1.AUDIENCE POLL\t\t2.PHONE A FRIEND\t3.EXPERT ADVICE\t\t4.DOUBLE DIP");
						y=sc.nextInt();
						
						switch(y)
						{
							case 1:if(c1==0)
							{
								
									audiencepoll();
									c1=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':
									case 'b':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[2]+"*****");
											System.exit(0);
									case 'c':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[3]+"*****");
											break;
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[2]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
							}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f1=1;
								}
									break;
									
						
						case 2: if(c2==0)
								{
									phoneafriend();
									c2=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':
									case 'b':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[2]+"*****");
											System.exit(0);
									case 'c':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[3]+"*****");
											break;
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[2]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f2=1;
								}
									break;
								
			
						
						
						case 3:if(c3==0)
								{	
									expertadvice();
									c3=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':
									case 'b':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[2]+"*****");
											System.exit(0);
									case 'c':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[3]+"*****");
											break;
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[2]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
							else 
							{
								
									System.out.println("\n\n##You have already used this lifeline");
									
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f3=1;
							}
									
									break;
									
			
								
						
						
						case 4: if(c4==0)
								{
									c4=1;
									System.out.println("Your two options are");
									System.out.println("b. Gatiman Express\t\tc. Tejas Express");
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':
									case 'b':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[2]+"*****");
											System.exit(0);
									case 'c':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[3]+"*****");
											break;
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[2]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f4=1;
								}
									break;
									
		
					
					
						}
		        
					
			        
		        }while (((f1 !=0) || (f2 !=0) || (f3 !=0) || (f4 !=0)) );//c1!=0 && 
			        	}
			        	else
			        	{
//4.LIFELINES OVER
			        		System.out.println("YOU HAVE USED ALL THE LIFELINES");
			        		System.out.println("\n--Do you want to play(p) or exit(e)?");
			        		x=sc.next().charAt(0);
			        		
			        		if(x=='p'||x=='P')
			        		{
			        			
			        					System.out.println("Enter Option");
			        					x=sc.next().charAt(0);
			        					switch(x)
			        					{
			        					case 'a':
			        					case 'b':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
			        							System.out.println("*****You win Rs."+a[2]+"*****");
			        							System.exit(0);
			        					case 'c':System.out.println("CORRECT ANSWER!!!");
			        							System.out.println("*****You win Rs."+a[3]+"*****");
			        							break;
			        					case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
			        							System.out.println("*****You win Rs."+a[2]+"*****");
			        							System.exit(0); 	
			        					
			        					default: System.out.println("OOPS. Invalid character, you'll have to start the game again.");
			        							System.exit(0);
			        					}
			        					
			        		}
			        		
			        		
			        		
			        		else if(x=='e'||x=='E')
			        		{
			        			System.out.println("*****Yon win Rs."+a[2]+"*****");
			        			System.exit(0);
			        		}
			        		
			        		
			        		else
			        		{
			        			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			        			System.exit(0);
			        		}

			        	}
			        	
				
				}
				
				else
					{
						System.out.println("OOPS. Invalid character. You'll have to start the game again.");
						System.exit(0);
					}
		}
		
//4.EXIT
		
		else if(x=='e'||x=='E')
		{
			System.out.println("*****Yon win Rs."+a[2]+"*****");
			System.exit(0);
		}
		
		
		else
		{
			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			System.exit(0);
		}
	
		
	}

	

//QUESTION 5

	public static void q5()
	{
		System.out.println("\n________________________________________________________________________________________________");
		System.out.println("\n5. Which of these rivers does not flow from east to west? ");
		System.out.println("a. Narmada\t  b. Tapti\tc. Mahih\td. Chambal");
		choose=4;
		
		
		System.out.println("\n--Do you want to play(p) or exit(e)?");
		x=sc.next().charAt(0);
		
		if(x=='p'||x=='P')
		{
//5.PLAY WITHOUT LIFELINES
			
				System.out.println("--Do you want a lifeline? (y/n)");
				x=sc.next().charAt(0);
				
				
				if(x=='n'||x=='N')
				{
					System.out.println("Enter Option");
					x=sc.next().charAt(0);
					switch(x)
					{
					case 'a':
					case 'b':
					case 'c':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
							System.out.println("*****You win Rs."+a[3]+"*****");
							System.exit(0);
					case 'd': System.out.println("CORRECT ANSWER!!!");
							System.out.println("*****You win Rs."+a[4]+"*****");
							
							
					}
					if(x!='a' && x!='b' && x!='c' && x!='d' )
					{
						System.out.println("OOPS. Invalid character, you'll have to start the game again.");
						System.exit(0);
					}
					
				}
		         else if (x=='y'||x=='Y')
				{
//5.LIFELINES	        	 
		        	 if(c1!=1 || c2!=1 || c3!=1 || c4!=1)
			        	{
		        
			        do{
			        	f1=0;f2=0;f3=0;f4=0;
						System.out.println("\n--Which lifeline do you want ?");
						System.out.println("1.AUDIENCE POLL\t\t2.PHONE A FRIEND\t3.EXPERT ADVICE\t\t4.DOUBLE DIP");
						y=sc.nextInt();
						
						switch(y)
						{

						case 1:if(c1==0)
							{
								
									audiencepoll();
									c1=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
										case 'a':
										case 'b':
										case 'c':System.out.println("\nWRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[3]+"*****");
												System.exit(0);
										case 'd': System.out.println("CORRECT ANSWER!!!");
												System.out.println("*****You win Rs."+a[4]+"*****");
												
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
							}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f1=1;
								}
									break;
									
						
						case 2: if(c2==0)
								{
									phoneafriend();
									c2=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
										case 'a':
										case 'b':
										case 'c':System.out.println("\nWRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[3]+"*****");
												System.exit(0);
										case 'd': System.out.println("CORRECT ANSWER!!!");
												System.out.println("*****You win Rs."+a[4]+"*****");
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f2=1;
								}
									break;
								
			
						
						
						case 3:if(c3==0)
								{	
									expertadvice();
									c3=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
										case 'a':
										case 'b':
										case 'c':System.out.println("\nWRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[3]+"*****");
												System.exit(0);
										case 'd': System.out.println("CORRECT ANSWER!!!");
												System.out.println("*****You win Rs."+a[4]+"*****");
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
							else 
							{
								
									System.out.println("\n\n##You have already used this lifeline");
									
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f3=1;
							}
									
									break;
									
			
								
						
						
						case 4: if(c4==0)
								{
									c4=1;
									System.out.println("Your two options are");
									System.out.println("a. Narmada\t\td. Chambal");
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
										case 'a':
										case 'b':
										case 'c':System.out.println("\nWRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[3]+"*****");
												System.exit(0);
										case 'd': System.out.println("CORRECT ANSWER!!!");
												System.out.println("*****You win Rs."+a[4]+"*****");
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f4=1;
								}
									break;
									
		
					
					
						}
		        
					
			        
		        }while (((f1 !=0) || (f2 !=0) || (f3 !=0) || (f4 !=0)) );//c1!=0 && 
			        	}
			        	else
			        	{
//5.LIFELINES OVER
			        		System.out.println("YOU HAVE USED ALL THE LIFELINES");
			        		System.out.println("\n--Do you want to play(p) or exit(e)?");
			        		x=sc.next().charAt(0);
			        		
			        		if(x=='p'||x=='P')
			        		{
			        			
			        					System.out.println("Enter Option");
			        					x=sc.next().charAt(0);
			        					switch(x)
			        					{
			        					case 'a':
			        					case 'b':
			        					case 'c':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
			        							System.out.println("*****You win Rs."+a[3]+"*****");
			        							System.exit(0);
			        					case 'd': System.out.println("CORRECT ANSWER!!!");
			        							System.out.println("*****You win Rs."+a[4]+"*****");
			        							break;
			        					
			        					default: System.out.println("OOPS. Invalid character, you'll have to start the game again.");
			        						System.exit(0);
			        					}
			        					
			        		}
			        		
			        		
			        		
			        		else if(x=='e'||x=='E')
			        		{
			        			System.out.println("*****Yon win Rs."+a[3]+"*****");
			        			System.exit(0);
			        		}
			        		
			        		
			        		else
			        		{
			        			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			        			System.exit(0);
			        		}

			        	}
			        	
				
				}
				
				else
					{
						System.out.println("OOPS. Invalid character. You'll have to start the game again.");
						System.exit(0);
					}
		}
		
//5.EXIT
		
		else if(x=='e'||x=='E')
		{
			System.out.println("*****Yon win Rs."+a[3]+"*****");
			System.exit(0);
		}
		
		
		else
		{
			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			System.exit(0);
		}

		
	}


	
	
	
//QUESTION 6
	
	public static void q6()
	{
		System.out.println("\n________________________________________________________________________________________________");
		System.out.println("\n6. WHO AMONG THESE IS WIDELY REGARDED AS THE INVENTOR OF THE AIR CONDITIONER??");
		System.out.println("a. Isaac Singer\t\tb. Willis Carrier\tc. Henry Ford\t d. Henning Holck-Larsen");
		choose=2;
		
		
		System.out.println("\n--Do you want to play(p) or exit(e)?");
		x=sc.next().charAt(0);
		
		if(x=='p'||x=='P')
		{
//6.PLAY WITHOUT LIFELINES	
			
				System.out.println("--Do you want a lifeline? (y/n)");
				x=sc.next().charAt(0);
				
				
				if(x=='n'||x=='N')
				{
					System.out.println("Enter Option");
					x=sc.next().charAt(0);
					switch(x)
					{
					case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
							System.out.println("*****You win Rs."+a[4]+"*****");
							System.exit(0);
					case 'b':System.out.println("CORRECT ANSWER!!!");
							System.out.println("*****You win Rs."+a[5]+"*****");
							break;
					case 'c':
					case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
							System.out.println("*****You win Rs."+a[4]+"*****");
							System.exit(0); 
							
							
					}
					if(x!='a' && x!='b' && x!='c' && x!='d' )
					{
						System.out.println("OOPS. Invalid character, you'll have to start the game again.");
						System.exit(0);
					}
					
				}
		         else if (x=='y'||x=='Y')
				{
//6.LIFELINES		        	 
		        	 if(c1!=1 || c2!=1 || c3!=1 || c4!=1)
			        	{
		        
			        do{
			        	f1=0;f2=0;f3=0;f4=0;
						System.out.println("\n--Which lifeline do you want ?");
						System.out.println("1.AUDIENCE POLL\t\t2.PHONE A FRIEND\t3.EXPERT ADVICE\t\t4.DOUBLE DIP");
						y=sc.nextInt();
						
						switch(y)
						{
							case 1:if(c1==0)
							{
								
									audiencepoll();
									c1=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[4]+"*****");
											System.exit(0);
									case 'b':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[5]+"*****");
											break;
									case 'c':
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[4]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
							}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f1=1;
								}
									break;
									
						
						case 2: if(c2==0)
								{
									phoneafriend();
									c2=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[4]+"*****");
											System.exit(0);
									case 'b':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[5]+"*****");
											break;
									case 'c':
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[4]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f2=1;
								}
									break;
								
			
						
						
						case 3:if(c3==0)
								{	
									expertadvice();
									c3=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[4]+"*****");
											System.exit(0);
									case 'b':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[5]+"*****");
											break;
									case 'c':
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[4]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
							else 
							{
								
									System.out.println("\n\n##You have already used this lifeline");
									
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f3=1;
							}
									
									break;
									
			
								
						
						
						case 4: if(c4==0)
								{
									c4=1;
									System.out.println("Your two options are");
									System.out.println("b. Willis Carrier\t\tc. Henry Ford");
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[4]+"*****");
											System.exit(0);
									case 'b':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[5]+"*****");
											break;
									case 'c':
									case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[4]+"*****");
											System.exit(0); 
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f4=1;
								}
									break;
									
		
					
					
						}
		        
					
			        
		        }while (((f1 !=0) || (f2 !=0) || (f3 !=0) || (f4 !=0)) );
			        	}
			        	else
			        	{
//6.LIFELINES OVER
			        		System.out.println("YOU HAVE USED ALL THE LIFELINES");
			        		System.out.println("\n--Do you want to play(p) or exit(e)?");
			        		x=sc.next().charAt(0);
			        		
			        		if(x=='p'||x=='P')
			        		{
			        			
			        					System.out.println("Enter Option");
			        					x=sc.next().charAt(0);
			        					switch(x)
			        					{
			        					case 'a':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[4]+"*****");
												System.exit(0);
										case 'b':System.out.println("CORRECT ANSWER!!!");
												System.out.println("*****You win Rs."+a[5]+"*****");
												break;
										case 'c':
										case 'd':System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[4]+"*****");
												System.exit(0); 
			        					
			        					default: System.out.println("OOPS. Invalid character, you'll have to start the game again.");
			        						System.exit(0);
			        					}
			        					
			        		}
			        		
			        		
			        		
			        		else if(x=='e'||x=='E')
			        		{
			        			System.out.println("*****Yon win Rs."+a[4]+"*****");
			        			System.exit(0);
			        		}
			        		
			        		
			        		else
			        		{
			        			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			        			System.exit(0);
			        		}

			        	}
			        	
				
				}
				
				else
					{
						System.out.println("OOPS. Invalid character. You'll have to start the game again.");
						System.exit(0);
					}
		}
		
//6.EXIT
		
		else if(x=='e'||x=='E')
		{
			System.out.println("*****Yon win Rs."+a[4]+"*****");
			System.exit(0);
		}
		
		
		else
		{
			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			System.exit(0);
		}
	
		
	}

	
	
	
//QUESTION 7
	
	public static void q7()
	{
		System.out.println("\n________________________________________________________________________________________________");
		System.out.println("\n7.WHICH TEXTILE MIL DID JAMSETJI NUSSERWANJI TATA ESTABLISHED IN 1869?");
		System.out.println("a.Alexandra Mil\t\tb.Empress Mil \tc.Lancashire Mil\td.Victoria Mil");
		choose=1;
		
		
		System.out.println("\n--Do you want to play(p) or exit(e)?");
		x=sc.next().charAt(0);
		
		if(x=='p'||x=='P')
		{
			
//7.PLAY WITHOUT LIFELINES
			
				System.out.println("--Do you want a lifeline? (y/n)");
				x=sc.next().charAt(0);
				
				
				if(x=='n'||x=='N')
				{
					System.out.println("Enter Option");
					x=sc.next().charAt(0);
					switch(x)
					{
					case 'a':System.out.println("CORRECT ANSWER!!!");
							System.out.println("*****You win Rs."+a[6]+"*****");
							break;
					
					case 'b':
					case 'c':
					case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
							System.out.println("*****You win Rs."+a[5]+"*****");
							System.exit(0);

							
					}
					if(x!='a' && x!='b' && x!='c' && x!='d' )
					{
						System.out.println("OOPS. Invalid character, you'll have to start the game again.");
						System.exit(0);
					}
					
				}
		         else if (x=='y'||x=='Y')
				{
//7.LIFELINES		        	 
		        	 if(c1!=1 || c2!=1 || c3!=1 || c4!=1)
			        	{
		        
			        do{
			        	f1=0;f2=0;f3=0;f4=0;
						System.out.println("\n--Which lifeline do you want ?");
						System.out.println("1.AUDIENCE POLL\t\t2.PHONE A FRIEND\t3.EXPERT ADVICE\t\t4.DOUBLE DIP");
						y=sc.nextInt();
						
						switch(y)
						{
							case 1:if(c1==0)
							{
								
									audiencepoll();
									c1=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[6]+"*****");
											break;
									
									case 'b':
									case 'c':
									case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[5]+"*****");
											System.exit(0);
				
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
							}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f1=1;
								}
									break;
									
						
						case 2: if(c2==0)
								{
									phoneafriend();
									c2=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[6]+"*****");
											break;
							
									case 'b':
									case 'c':
									case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[5]+"*****");
											System.exit(0);

									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f2=1;
								}
									break;
								
			
						
						
						case 3:if(c3==0)
								{	
									expertadvice();
									c3=1;
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[6]+"*****");
											break;
							
									case 'b':
									case 'c':
									case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[5]+"*****");
											System.exit(0);
		
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
							else 
							{
								
									System.out.println("\n\n##You have already used this lifeline");
									
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f3=1;
							}
									
									break;
									
			
								
						
						
						case 4: if(c4==0)
								{
									c4=1;
									System.out.println("Your two options are");
									System.out.println("a.Alexandra Mil\t\tc.Lancashire Mil");
									System.out.println("\nEnter your answer.");
									x=sc.next().charAt(0);
									switch(x)
									{
									case 'a':System.out.println("CORRECT ANSWER!!!");
											System.out.println("*****You win Rs."+a[6]+"*****");
											break;
							
									case 'b':
									case 'c':
									case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
											System.out.println("*****You win Rs."+a[5]+"*****");
											System.exit(0);
			
									}
									if(x!='a' && x!='b' && x!='c' && x!='d' )
									{
										System.out.println("OOPS. Invalid character, you'll have to start the game again.");
										System.exit(0);
									}
								}
								else
								{
									System.out.println("\n\n##You have already used this lifeline");
									System.out.println("Choose another lifeline...");
									System.out.println("*****************************************");
									f4=1;
								}
									break;
									
		
					
					
						}
		        
					
			        
		        }while (((f1 !=0) || (f2 !=0) || (f3 !=0) || (f4 !=0)) );
			        	}
			        	else
//7.LIFLINES OVER
			        		{
			        		System.out.println("YOU HAVE USED ALL THE LIFELINES");
			        		System.out.println("\n--Do you want to play(p) or exit(e)?");
			        		x=sc.next().charAt(0);
			        		
			        		if(x=='p'||x=='P')
			        		{
			        			
			        					System.out.println("Enter Option");
			        					x=sc.next().charAt(0);
			        					switch(x)
			        					{
			        					case 'a':System.out.println("CORRECT ANSWER!!!");
												System.out.println("*****You win Rs."+a[6]+"*****");
												break;
								
										case 'b':
										case 'c':
										case 'd': System.out.println("WRONG ANSWER.\nThank you for playing KBC.");
												System.out.println("*****You win Rs."+a[5]+"*****");
												System.exit(0);
		
			        					default: System.out.println("OOPS. Invalid character, you'll have to start the game again.");
			        						System.exit(0);
			        						
			        					}
			        					
			        		}
			        		
			        		
			        		
			        		else if(x=='e'||x=='E')
			        		{
			        			System.out.println("*****Yon win Rs."+a[5]+"*****");
			        			System.exit(0);
			        		}
			        		
			        		
			        		else
			        		{
			        			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			        			System.exit(0);
			        		}

			        	}
			        	
				
				}
				
				else
					{
						System.out.println("OOPS. Invalid character. You'll have to start the game again.");
						System.exit(0);
					}
		}
		
//7.EXIT	
		
		else if(x=='e'||x=='E')
		{
			System.out.println("*****Yon win Rs."+a[5]+"*****");
			System.exit(0);
		}
		
		
		else
		{
			System.out.println("OOPS. Invalid character. You'll have to start the game again.");
			System.exit(0);
		}
	
		
	}
	
	
	

	
	
//AUDIENCE POLL
	
	public static void audiencepoll()
	{
		if (choose==1)
		{
			System.out.println("OPTION a : 55%\tOPTION b : 25%\nOPTION c : 12%\tOPTION d : 8%");
			
		}
		if (choose==2)
		{
			System.out.println("OPTION a : 20%\tOPTION b : 70%\nOPTION c : 5%\tOPTION d : 10%");
			
		}
		if (choose==3)
		{
			System.out.println("OPTION a : 18%\tOPTION b : 4%\nOPTION c : 62%\tOPTION d : 16%");
			
		}
		if (choose==4)
		{
			System.out.println("OPTION a : 2%\tOPTION b : 13%\nOPTION c : 5%\tOPTION d : 80%");
			
			
		}
	}
	
	
//PHONE A FRIEND
	
	public static void phoneafriend()
	{
		System.out.println("\nWhom do you want to call?");
		System.out.println("1.Palak\t\t2.Kuhu\t\t3.Shahid\t4.Rajiv ?");
		y=sc.nextInt();
			if(choose==1)
				System.out.println("##Your friend says the answer is option a.");
			if(choose==2)
				System.out.println("##Your friend says the answer is option b.");
			if(choose==3)
				System.out.println("##Your friend says the answer is option c.");
			if(choose==4)
				System.out.println("##Your friend says the answer is option d.");
		

	}
	
	
// EXPERT ADVICE
	
	public static void expertadvice()
	{
		if(choose==1)
			System.out.println("##Expert says that the answer is option a.");
		if(choose==2)
			System.out.println("##Expert says that the answer is option b.");
		if(choose==3)
			System.out.println("##Expert says that the answer is option c.");
		if(choose==4)
			System.out.println("##Expert says that the answer is option d.");
		
	}
	
}
