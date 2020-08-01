import java.util.Scanner;

public class Fortune {

	//the first three methods deal with user input. Check spelling, offers a list of colors, and provide a way to exit early.
	
	public static boolean colorSpell (String reply) {  
		String [] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
		reply.toLowerCase();
		int i = 0;
		while (i < 7 && !reply.equals(colors[i])) {
		i++;
		}
			if (i == 7) {
				return false;
			}
			return true;
	}
	
	public static void listColors() {
		String [] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
		for (int i = 0; i <= 6; i++) {
			System.out.println(colors[i]);
		}
	}
	
	public static void exit() {
		System.out.println("Pathetic! Nobody likes a quitter.");
		System.exit(0);
	}
		
	public static boolean quit(String reply) {
		reply.toLowerCase();
		if (reply.equals("quit")){
			return true;
		} else {
			return false;
			}
	}	
		
		public static User createUser (Scanner in) {					// this is the main questioning loop to create a User
			User user = new User();
			String reply = "";
			
			String [] questions = {
					 "Congratulations! On we go. All I need from you will be a few answers\n"  +                			//index 0- name question
					 "to a few basic questions of my own. For starters, I will need your name.\n Please" + 
					 " give me your first name, followed by a space, and then your last. If you're bored,\n" +
					 "simply type 'quit'.",
					 "I will also need to know your age please.",             													//index 1- age question
					 "We're getting there. A few more items. Your birth month please. Enter 1-12.",             			//index 2- birth month question
				     "I will also need your favorite ROYGBIV color. Enter 'help' if you're unsure of this.",     			//index 3- color question
					 "And finally, if you would please, tell me how siblings you have, to the best of your knowledge."}; 	//index 4- siblings question
			
			for (int i = 0; i <= 4; i++) {
				System.out.println(questions[i]);
				reply = in.nextLine();
				if (quit(reply) == true) {
					exit();
				}
					else if (i == 0) {										// will put the person's full name in the constructor
					while (reply.indexOf(" ") == -1) {
						System.out.println("You are determined to make this difficult. You should know that \n"
								+ "I am a computer, which means that I never give up. Please, just include a space somewhere.");
						reply = in.nextLine();
					}
					user.setNames(reply);
					System.out.println("Thank you " + user.getFirst() + ","); 
					}
					else if (i == 1) {										//will take the person's age
					int age = Integer.parseInt(reply);
					user.setAge(age);
					}
					else if (i == 2) {										//will take the person's month of birth
					int month = Integer.parseInt(reply);
					user.setBirthMonth(month);
					}
					else if (i == 3) {									  //takes the favorite color. Offers help, and sets the attribute color to the user
					reply.toLowerCase();
					while (reply.equals("help")) {
						System.out.println("Seriously? It's not that hard. Please just type the name of one of these colors.");
					listColors();
					reply = in.nextLine();
					}
					while (colorSpell(reply) == false) {
						System.out.println("You got this. Check your spelling.");
						reply = in.nextLine();
					}
						user.setColor(reply);
					} else {												//takes and sets the number of siblings
					
					int siblings = Integer.parseInt(reply);
					user.setSiblings(siblings);
					}	
				}
			return user;
			}
			
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String reply = "";
		
		System.out.println("At the conclusion of a brief conversation, I will be able to give you\n"
				+ "the answers to each and every one of your burning questions. All of your life's mysteries, solved.\n"
				+ "Shall we begin? A simple 'yes' or 'no' will do, but you should know that I'm persistent.");
		
		reply = in.nextLine();
		reply.toLowerCase();
		while (!reply.equals("yes")){
			System.out.println("Are you sure? I'll keep poking you until you say 'yes'.");
			reply = in.nextLine();
			reply.toLowerCase();
		}
		User victim = createUser(in);
		FortuneTeller tell = new FortuneTeller (victim);
		System.out.printf("You, %s %s, will retire in %d years with %s in the bank,\na vacation home in %s, and travel by a %s.", 
		                  victim.getFirst(), victim.getLast(), tell.retire, tell.bankBalance, tell.vacationHome, tell.transport);
	
	
	}
		
		
		
	
	}
	
		
		
	
	



