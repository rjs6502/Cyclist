import java.util.*;

//can be a time trial or a normal race
public class Course {
	/*
	 * STATIC VALUES
	 */
	private final int MIN_DISTANCE = 100; //miles
	private final int MAX_DISTANCE = 250; //miles
	private final int TT_MIN_DISTANCE = 2; //miles
	private final int TT_MAX_DISTANCE = 5; //miles
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