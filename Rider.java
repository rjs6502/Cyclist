import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Rider implements Runnable{
	/*
	 * STATIC VALUES
	 */
	private final int MIN_AGE	 = 16;
	private final int MAX_AGE	 = 40;
	private final int MIN_HEIGHT = 64; //inches (5'4")
	private final int MAX_HEIGHT = 74; //inches (6'2")
	private final int MIN_WEIGHT = 115; //lbs
	private final int MAX_WEIGHT = 170; //lbs
	private final int MIN_RATING = 1;
	private final int MAX_RATING = 10;
	
	/*
	 * ATTRIBUTES
	 */
	private Random rand;
	private String name;
	private int age; //16-40 (would like to implement progression and regression as a rider ages)
	private String country;
	private int height;
	private int weight;
	private Bike bike;
	private int ratingMtn; // 1-10 (10 being the best)
	private int ratingHill; // 1-10 (10 being the best)
	private int ratingFlat; // 1-10 (10 being the best)
	private int ratingTT; // 1-10 (10 being the best)
	private double speedMtn;
	private double speedHill;
	private double speedFlat;
	private double speedTT;
	private double raceTime;
	private String[] firstName = { //generator -- first name
		"Noah","Liam","Mason","Jacob","William","Ethan","James","Alexander","Michael","Benjamin",
		"Elijah","Daniel","Aiden","Logan","Matthew","Lucas","Jackson","David","Oliver","Jayden",
		"Joseph","Gabriel","Samuel","Carter","Anthony","John","Dylan","Luke","Henry","Andrew",
		"Isaac","Christopher","Joshua","Wyatt","Sebastian","Owen","Caleb","Nathan","Ryan","Jack",
		"Hunter","Levi","Christian","Jaxon","Julian","Landon","Grayson","Jonathan","Isaiah","Charles",
		"Thomas","Aaron","Eli","Connor","Jeremiah","Cameron","Josiah","Adrian","Colton","Jordan",
		"Brayden","Nicholas","Robert","Angel","Hudson","Lincoln","Evan","Dominic","Austin","Gavin",
		"Nolan","Parker","Adam","Chase","Jace","Ian","Cooper","Easton","Kevin","Jose",
		"Tyler","Brandon","Asher","Jaxson","Mateo","Jason","Ayden","Zachary","Carson","Xavier",
		"Leo","Ezra","Bentley","Sawyer","Kayden","Blake","Nathaniel","Ryder","Theodore","Elias" 
	};
	private String[] beginningLastName = { //generator -- last name
		"Kr", "Ca", "Ra", "Mrok", "Cru",
		"Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
		"Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
		"Mar", "Luk" 
	};
	private String[] middleLastName = { //generator -- last name
			"air", "ir", "mi", "sor", "mee", "clo", "red",
			"cra", "ark", "arc", "miri", "lori", "cres", "mur",
			"zer", "marac", "zoir", "slamar", "salmar", "urak"
	};
	private String[] endLastName = { //generator -- last name
			"d", "ed", "ark", "arc", "es", "er", "der",
	        "tron", "med", "ure", "zur", "cred", "mur" 
	};
	private String[] countries = { //generator -- country
			"Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Aruba","Australia",
			"Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin",
			"Bhutan","Bolivia","Bosnia and Herzegovina","Botswana","Brazil","Brunei ","Bulgaria","Burkina Faso","Burma","Burundi",
			"Cambodia","Cameroon","Canada","Cape Verde","Central African Republic","Chad","Chile","China","Colombia","Comoros",
			"Congo, Democratic Republic of the","Congo, Republic of the","Costa Rica","Cote d'Ivoire","Croatia","Cuba","Curacao","Cyprus","Czech Republic","Denmark",
			"Djibouti","Dominica","Dominican Republic","East Timor (see Timor-Leste)","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia",
			"Ethiopia","Fiji","Finland","France","Gabon","Gambia, The","Georgia","Germany","Ghana","Greece",
			"Grenada","Guatemala","Guinea","Guinea-Bissau","Guyana","Haiti","Holy See","Honduras","Hong Kong","Hungary",
			"Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy","Jamaica","Japan",
			"Jordan","Kazakhstan","Kenya","Kiribati","Korea, North","Korea, South","Kosovo","Kuwait","Kyrgyzstan","Laos",
			"Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macau","Macedonia",
			"Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico",
			"Micronesia","Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique","Namibia","Nauru","Nepal",
			"Netherlands","Netherlands Antilles","New Zealand","Nicaragua","Niger","Nigeria","North Korea","Norway","Oman","Pakistan",
			"Palau","Palestinian Territories","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland","Portugal","Qatar",
			"Romania","Russia","Rwanda","Saint Kitts and Nevis","Saint Lucia","Saint Vincent and the Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia",
			"Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Sint Maarten","Slovakia","Slovenia","Solomon Islands","Somalia",
			"South Africa","South Korea","South Sudan","Spain","Sri Lanka","Sudan","Suriname","Swaziland","Sweden","Switzerland",
			"Syria","Taiwan","Tajikistan","Tanzania","Thailand","Timor-Leste","Togo","Tonga","Trinidad and Tobago","Tunisia",
			"Turkey","Turkmenistan","Tuvalu","Uganda","Ukraine","United Arab Emirates","United Kingdom","Uruguay","Uzbekistan","Vanuatu",
			"Venezuela","Vietnam","Yemen","Zambia","Zimbabwe",
	};
	
	/*
	 * DEFAULT CONSTRUCTOR
	 * use this to test Rider functionality
	 */
	public Rider(){
		rand = new Random();
	}
	/*
	 * PARAM CONSTRUCTOR
	 * for creating a specific rider
	 */
	public Rider(String _name, int _age, String _country, int _height, int _weight, int _ratingMtn, int _ratingHill, int _ratingFlat, int _ratingTT){
		rand = new Random();
		
		name = _name;
		age = _age;
		country = _country;
		height = _height;
		weight = _weight;
		ratingMtn = _ratingMtn;
		ratingHill = _ratingMtn;
		ratingFlat = _ratingFlat;
		ratingTT = _ratingTT;
	}
	
	/*
	 * ACCESSORS & MUTATORS
	 */
	//name
	public void setName(String _name){
		name = _name;
	}
	public String getName(){
		return name;
	}
	//age
	public void setAge(int _age){
		age = _age;
	}
	public int getAge(){
		return age;
	}
	//country
	public void setCountry(String _country){
		country = _country;
	}
	public String getCountry(){
		return country;
	}
	//height - can be in any format - arbitrary data - just for display/realism
	public void setHeight(int _height){
		height = _height;
	}
	public int getHeight(){
		return height;
	}
	//weight
	public void setWeight(int _weight){
		weight = _weight;
	}
	public int getWeight(){
		return weight;
	}
	//mountain
	public void setRatingMtn(int _ratingMtn){
		ratingMtn = _ratingMtn;
		
		switch(_ratingMtn){
			case 1:
				this.setSpeedMtn(20.5);
				break;
			case 2:
				this.setSpeedMtn(21);
				break;
			case 3:
				this.setSpeedMtn(21.5);
				break;
			case 4:
				this.setSpeedMtn(22);
				break;
			case 5:
				this.setSpeedMtn(22.5);
				break;
			case 6:
				this.setSpeedMtn(23);
				break;
			case 7:
				this.setSpeedMtn(23.5);
				break;
			case 8:
				this.setSpeedMtn(24);
				break;
			case 9:
				this.setSpeedMtn(24.5);
				break;
			case 10:
				this.setSpeedMtn(25);
				break;
		}
	}
	public int getRatingMtn(){
		return ratingMtn;
	}
	public void setSpeedMtn(double _speedMtn){
		speedMtn = _speedMtn;
	}
	public double getSpeedMtn(){
		return speedMtn;
	}
	//hill
	public void setRatingHill(int _ratingHill){
		ratingHill = _ratingHill;
		
		switch(_ratingHill){
			case 1:
				this.setSpeedHill(23.3);
				break;
			case 2:
				this.setSpeedHill(23.6);
				break;
			case 3:
				this.setSpeedHill(23.9);
				break;
			case 4:
				this.setSpeedHill(24.2);
				break;
			case 5:
				this.setSpeedHill(24.5);
				break;
			case 6:
				this.setSpeedHill(24.8);
				break;
			case 7:
				this.setSpeedHill(25.1);
				break;
			case 8:
				this.setSpeedHill(25.4);
				break;
			case 9:
				this.setSpeedHill(25.7);
				break;
			case 10:
				this.setSpeedHill(26);
				break;
		}
	}
	public int getRatingHill(){
		return ratingHill;
	}
	public void setSpeedHill(double _speedHill){
		speedHill = _speedHill;
	}
	public double getSpeedHill(){
		return speedHill;
	}
	//flat
	public void setRatingFlat(int _ratingFlat){
		ratingFlat = _ratingFlat;
		
		switch(_ratingFlat){
			case 1:
				this.setSpeedFlat(25.3);
				break;
			case 2:
				this.setSpeedFlat(25.6);
				break;
			case 3:
				this.setSpeedFlat(25.9);
				break;
			case 4:
				this.setSpeedFlat(26.2);
				break;
			case 5:
				this.setSpeedFlat(26.5);
				break;
			case 6:
				this.setSpeedFlat(26.8);
				break;
			case 7:
				this.setSpeedFlat(27.1);
				break;
			case 8:
				this.setSpeedFlat(27.4);
				break;
			case 9:
				this.setSpeedFlat(27.7);
				break;
			case 10:
				this.setSpeedFlat(28);
				break;
		}
	}
	public int getRatingFlat(){
		return ratingFlat;
	}
	public void setSpeedFlat(double _speedFlat){
		speedFlat = _speedFlat;
	}
	public double getSpeedFlat(){
		return speedFlat;
	}
	//time trial
	public void setRatingTT(int _ratingTT){
		ratingTT = _ratingTT;
		
		switch(_ratingTT){
			case 1:
				this.setSpeedTT(29.2);
				break;
			case 2:
				this.setSpeedTT(29.4);
				break;
			case 3:
				this.setSpeedTT(29.6);
				break;
			case 4:
				this.setSpeedTT(29.8);
				break;
			case 5:
				this.setSpeedTT(30);
				break;
			case 6:
				this.setSpeedTT(30.2);
				break;
			case 7:
				this.setSpeedTT(30.4);
				break;
			case 8:
				this.setSpeedTT(30.6);
				break;
			case 9:
				this.setSpeedTT(30.8);
				break;
			case 10:
				this.setSpeedTT(31);
				break;
		}
	}
	public int getRatingTT(){
		return ratingTT;
	}
	public void setSpeedTT(double _speedTT){
		speedFlat = _speedTT;
	}
	public double getSpeedTT(){
		return speedTT;
	}
	//overall rating
	public void setOverallRating(int rating){
		this.setRatingMtn(rating/4);
		this.setRatingHill(rating/4);
		this.setRatingFlat(rating/4);
		this.setRatingTT(rating/4);
	}
	public int getRatingOverall(){
		return ( ( getRatingMtn() + getRatingHill() + getRatingFlat() + getRatingTT() ) / 4 );
	}
	//bike
	public void setBike(Bike _bike){
		bike = _bike;
	}
	public Bike getBike(){
		return bike;
	}
	//race time
	public double getRaceTime(){
		DecimalFormat formatter = new DecimalFormat("#.###");
		double formattedTime = Double.parseDouble(formatter.format(raceTime));
		
		
		return formattedTime;
	}
	
	/*
	 * GENERAL FUNCTIONALITY
	 */
	
	//Ride
	public void ride(int distance){
		int distanceCovered = 0; //keeps track of distance covered
		double timeCheck = 0; //keeps track of overall time
		double time = distance / this.getSpeedFlat(); //total time to complete the course
		double minutesPerMile = ( time / distance) * 60; //used for adjusting Thread.sleep() based on a riders speed
		boolean racing = true;
		
		System.out.println(this.getName() + " started!");
		//every loop is 1 mile
		while(racing){
			try
			{	
				if(distanceCovered < distance){
					Thread.sleep((long)(minutesPerMile * 500)); //Time to complete 1 mile
					timeCheck += minutesPerMile;
					distanceCovered++; //completed a mile
				}
				else if(distanceCovered == distance){
					System.out.println(this.getName() + " " + " is done! - " + timeCheck + " - " + this.getSpeedFlat());
					racing = false;
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
	//Ride Mountain
	public double rideMountain(int distance){
		//time = distance/speed
		double obstacleDistance = (double)distance;
		double timeToCompleteObstacle = obstacleDistance/this.getSpeedMtn();
		
		raceTime += timeToCompleteObstacle;
		
		return timeToCompleteObstacle;
	}
	//Ride Hill
	public double rideHill(int distance){
		//time = distance/speed
		double obstacleDistance = (double)distance;
		double timeToCompleteObstacle = obstacleDistance/this.getSpeedHill();
		
		raceTime += timeToCompleteObstacle;
		
		return timeToCompleteObstacle;
	}
	//Ride Flat
	public double rideFlat(int distance){
		//time = distance/speed
		double obstacleDistance = (double)distance;
		double timeToCompleteObstacle = obstacleDistance/this.getSpeedFlat();
		
		raceTime += timeToCompleteObstacle;
		
		return timeToCompleteObstacle;
	}
	//Ride Time Trial
	public double rideTimeTrial(int distance){
		//time = distance/speed
		double obstacleDistance = (double)distance;
		double timeToCompleteObstacle = obstacleDistance/this.getSpeedTT();
		
		raceTime += timeToCompleteObstacle;
		
		return timeToCompleteObstacle;
	}
	//Ratings -- eventually use it to generate pro teams with a minimum rider overall of 'x'
	public void generateRatings(){
		
		Random randomRatingMtn = new Random();
		Random randomRatingHill = new Random();
		Random randomRatingFlat = new Random();
		Random randomRatingTT = new Random();
		
		this.setRatingMtn(randomRatingMtn.nextInt((10 - 1) + 1) + 1);
		this.setRatingHill(randomRatingHill.nextInt((10 - 1) + 1) + 1);
		this.setRatingFlat(randomRatingFlat.nextInt((10 - 1) + 1) + 1);
		this.setRatingTT(randomRatingTT.nextInt((10 - 1) + 1) + 1);
		
		if(this.getBike() != null){
			//adjusted mountain rating
			int newMountainRating = this.getRatingMtn() + this.getBike().getRatingMtn();
			this.setRatingMtn(newMountainRating);
			//adjusted hill rating
			int newHillRating = this.getRatingHill() + this.getBike().getRatingHill();
			this.setRatingHill(newHillRating);
			//adjusted flat rating
			int newFlatRating = this.getRatingFlat() + this.getBike().getRatingFlat();
			this.setRatingFlat(newFlatRating);
			//adjusted tt rating
			int newTTRating = this.getRatingTT() + this.getBike().getRatingTT();
			this.setRatingTT(newTTRating);
		}
	}
	//Name
	public void generateName(){		
		this.setName(
				firstName[rand.nextInt(firstName.length)] + " " + 
				beginningLastName[rand.nextInt(beginningLastName.length)] + 
				middleLastName[rand.nextInt(middleLastName.length)]+
				endLastName[rand.nextInt(endLastName.length)]);
	}
	//Country
	public void generateCountry(){
		this.setCountry(countries[rand.nextInt(countries.length)]);
				
	}
	//Age
	public void generateAge(){
		this.setAge(rand.nextInt((40-16)+1)+16);
	}
	//Physicals -- height & weight
	public void generatePhysicals(){
		this.setHeight(rand.nextInt((74-64)+1)+64);
		this.setWeight(rand.nextInt((170-115)+1)+115);
	}
	//Rider-auto-gen
	public void generateRider(){
		this.generateName();
		this.generateAge();
		this.generatePhysicals();
		this.generateCountry();
		this.generateRatings();
	}
	
	@Override
	public void run() {
		this.ride(21);
	}
}
