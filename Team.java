import java.util.*;

public class Team {
	/*
	 * STATIC VALUES
	 */
	private final int MAX_NUM_OF_RIDERS = 20;
	
	/*
	 * ATTRIBUTES
	 */
	private Random rand;
	private String name;
	private String country;
	private Bike teamBike;
	private ArrayList<Rider> riders;
	private String[] teamNameFirst = { //generator -- team name
		"Kr", "Ca", "Ra", "Mrok", "Cru",
		"Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
		"Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
		"Mar", "Luk" 
	};
	private String[] teamNameSecond = { //generator -- team name
		"air", "ir", "mi", "sor", "mee", "clo", "red",
		"cra", "ark", "arc", "miri", "lori", "cres", "mur",
		"zer", "marac", "zoir", "slamar", "salmar", "urak"
	};
	private String[] teamNameDesc = { // generator -- team name description
		"Team","Pro Cycling Team","Project","Riders","Concept","Cycling Team","Cycles","Bikes","Pro",
		"Professional Cycling Team","Pro Cycling","Professional Cycling","Cycling","Biking","Collection",
		"Group","Road Team","Pro Team"
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
	 * use this to test Team functionality
	 */
	public Team(){
		rand = new Random();
		riders = new ArrayList<Rider>(20); //max number of riders is 20
	}
	/*
	 * PARAM CONSTRUCTOR
	 * for creating a specific Team
	 */
	public Team(String _name, String _country){
		rand = new Random();
		riders = new ArrayList<Rider>(20); //max number of riders is 20
		
		name = _name;
		country = _country;
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
	//country
	public void setCountry(String _country){
		country = _country;
	}
	public String getCountry(){
		return country;
	}
	public ArrayList<Rider> getRiders(){
		return riders;
	}
	//team bike
	public void setTeamBike(Bike _teamBike){
		teamBike = _teamBike;
		
		for(Rider rider: riders){
			rider.setBike(_teamBike);
		}
	}
	public Bike getTeamBike(){
		return teamBike;
	}
	
	/*
	 * GENERAL FUNCTIONALITY
	 */
	//add a rider to the team
	public void addRider(Rider _rider){
		riders.add(_rider);
	}
	//remove a rider from the team
	public void removeRider(String _name){
		for(Rider rider: riders){
			if(rider.getName().equalsIgnoreCase(_name)){
				riders.remove(rider);
			}
			else{
				System.out.println("Cannot remove " + _name + " because they aren't on this team");
			}
		}
	}
	
	/*
	 * GENERATOR FUNCTIONS
	 */
	//name
	public void generateName(){
		this.setName(
				teamNameFirst[rand.nextInt(teamNameFirst.length)] +
				teamNameSecond[rand.nextInt(teamNameSecond.length)] + " " +
				teamNameDesc[rand.nextInt(teamNameDesc.length)]);
	}
	//country
	public void generateCountry(){
		this.setCountry(countries[rand.nextInt(countries.length)]);
	}
	//riders
	public void generateRiders(){
		for(int i=0; i<MAX_NUM_OF_RIDERS; i++){
			Rider rider = new Rider();
			rider.generateRider();
			this.addRider(rider);
		}
	}
	//team-auto-gen
	public void generateTeam(){
		this.generateName();
		this.generateCountry();
		this.generateRiders();
	}
}
