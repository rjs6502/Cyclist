import java.util.*;

public class Course {
	/*
	 * ATTRIBUTES
	 */
	private String name;
	private String country;
	private int distance;
	private ArrayList<Obstacle> courseProfile;
	
	/*
	 * DEFAULT CONSTRUCTOR
	 */
	public Course(){
		courseProfile = new ArrayList<Obstacle>();
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
	//race course
	public void setCourseProfile(ArrayList<Obstacle> _courseProfile){
		courseProfile = _courseProfile;
	}
	public ArrayList<Obstacle> getCourseProfile(){
		return courseProfile;
	}
	
}
