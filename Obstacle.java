//intending to use this class to build a "course"
//types of obstacles would be flat, hill, mtn, geen jersey checkpoints, polka dot jersey checkpoints
public class Obstacle {
	
	/*
	 * ATTRIBUTES
	 */
	private String name;
	private int distance; //miles
	
	/*
	 * DEFAULT CONSTRUCTOR
	 */
	public Obstacle(){
		
	}
	
	/*
	 * ACCESSORS AND MUTATORS
	 */
	public void setName(String _name){
		name = _name;
	}
	public String getName(){
		return name;
	}
	public void setDistance(int _distance){
		distance = _distance;
	}
	public int getDistance(){
		return distance;
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
