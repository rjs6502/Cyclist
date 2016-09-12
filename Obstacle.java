public class Obstacle {
	
	/*
	 * ATTRIBUTES
	 */
	private String name; //only here for the reaslism aspect of the game. allows me to add iconinc landmarks as obstacles
	private String type; //mountain, hill, flat, tt
	private int distance; //miles
	private int difficultyRating; //used for adjusting the riders speed on the obstacle 1-10
	private int availablePoints; //take total number and assign break them up into 1st place = .5, 2nd place = .3, 3rd place = .2
	
	/*
	 * DEFAULT CONSTRUCTOR
	 */
	public Obstacle(String _type, int _difficultyRating){
		type = _type;
		difficultyRating = _difficultyRating;
	}
	
	/*
	 * ACCESSORS AND MUTATORS
	 */
	//name
	public void setName(String _name){
		name = _name;
	}
	public String getName(){
		return name;
	}
	//type
	public void setType(String _type){
		type = _type;
		if(_type.equalsIgnoreCase("Mountain")){
			
		}
		else if(_type.equalsIgnoreCase("Hill")){
			
		}
		else if(_type.equalsIgnoreCase("Flat")){
			
		}
		else if(_type.equalsIgnoreCase("TT")){
			
		}
	}
	public String getType(){
		return type;
	}
	//distance
	public void setDistance(int _distance){
		distance = _distance;
	}
	public int getDistance(){
		return distance;
	}
	//difficulty rating
	public void setDifficultyRating(int _difficultyRating){
		difficultyRating = _difficultyRating;
	}
	public int getDifficultyRating(){
		return difficultyRating;
	}
	//available points
	public void setAvailablePoints(int _availablePoints){
		availablePoints = _availablePoints;
		
		//1st place - .5 of total points
		//2nd place = .3 of total points
		//3rd place = .2 of total points
	}
	public int getAvailablePoints(){
		return availablePoints;
	}
	
	/*
	 * GENERAL FUNCTIONALITY
	 */
	//take in the rating of the rider 
	public void convertSpeed(){
		if(this.getName().equalsIgnoreCase("Mountain")){
			//reduce speed
		}
		else if(this.getName().equalsIgnoreCase("Hill")){
			//reduce speed
		}
		else if(this.getName().equalsIgnoreCase("Flat")){
			//reduce speed
		}
		else if(this.getName().equalsIgnoreCase("TT") || this.getName().equalsIgnoreCase("Time Trial")){
			//reduce speed
		}
	}
}
