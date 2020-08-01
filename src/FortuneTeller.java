
public class FortuneTeller {
	
	public User user;
	public int retire = 0;
	public String vacationHome = "";
	public String transport = ""; 
	public String bankBalance = "";
	
	// the constructor below will set the attribute variables for FortuneTeller based on user
	
	public FortuneTeller(User user) {
		this.user = user;		
		setRetirement();
		setVacation();
		setTransport();
		setBankBalance();
	}	
		
		public void setRetirement() {
			if (user.getAge() % 2 == 0) {
				retire = 73;
			}
			else {
				retire = 2;
			}
		}
		
		public void setVacation() {	
			
			if (user.getSiblings() < 0) {						//sets the location of vacation home
				vacationHome = "Somewhere in Death Valley";
			}
			else if (user.getSiblings() == 0) {
				 vacationHome = "Jersey City, NJ";
			}
			else if (user.getSiblings() == 1) { 
				 vacationHome = "Akron, Ohio";
			}
			else if (user.getSiblings() == 2) {
				vacationHome =  "Cayman Islands";
			}
			else if (user.getSiblings() == 3) {
				vacationHome = "Cape Breton, Nova Scotia";
			}
			else if (user.getSiblings() == 4) {
				vacationHome = "Stockholm, Sweden";
			}
			else if (user.getSiblings() == 5 ) {
				vacationHome =  "Paris, France";
			}
			else {
				vacationHome = "Clearwater, FL";
			}
		}
		
		public void setTransport() {    //sets the transport based on color
			String [] colorList = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
			String [] transportList = {"Bugatti Chiron", "Bentley Mulsanne", "scooter", "broomstick", "magic carpet",   
				"1995 Honda Accord", "1980 VW bus"};
			for (int i = 0; i < 7; i++) {					
				if (colorList[i].equals(user.getColor())) {
				transport = transportList[i];
				}
			}
		}
		
		public void setBankBalance() {  //sets the bank balance based on the number of siblings
			if (user.getMonth() == 1) {
				bankBalance = "$0.00";
			}
			else if  (user.getMonth() > 1 && user.getMonth() <= 4) {
				bankBalance =  "$576,823.28";
			}
			else if  (user.getMonth() > 4 && user.getMonth() <= 8) {
				bankBalance = "a billion dollars";
			}
			else if  (user.getMonth() > 8 && user.getMonth() <= 12) {
				bankBalance = "a billion dollars";
			}
			else {
				bankBalance = "about twelve bucks";
			}
		
		}
}