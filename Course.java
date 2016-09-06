//a course object will be able to construct itself
//possibly keep track of each jersey's points then worry about accumulating the points in an event



//can be a time trial or a normal race
public class Course {
	/*
	 * ATTRIBUTES
	 */
	private String name;
	private String country;
	private int distance;
	
	/*
	 * DEFAULT CONSTRUCTOR
	 */
	public Course(){
		
	}
	
	/*
	 * ACCESSORS AND MUTATORS
	 */
	//name
	public void setName(String _name){
		
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
	//distance
	public void setDistance(int _distance){
		distance = _distance;
	}
	public int getDistance(){
		return distance;
	}
}
