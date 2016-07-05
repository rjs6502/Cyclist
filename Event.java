//Racing Event
import java.util.*;

public class Event {
	
	/*
	 * ATTRIBUTES
	 */
	private Thread race;
	private String name;
	private Course course;
	private ArrayList<Team> teams;
	private ArrayList<Rider> riders;
	
	/*
	 * DEFAULT CONSTRUCTOR
	 */
	public Event(){
		
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
	public void setCourse(Course _course){
		course = _course;
	}
	public Course getCourse(){
		return course;
	}
	public void setTeams(ArrayList<Team> _teams){
		teams = _teams;
	}
	public ArrayList<Team> getTeams(){
		return teams;
	}
	public void setRiders(ArrayList<Rider> _riders){
		riders = _riders;
	}
	public ArrayList<Rider> getRiders(){
		return riders;
	}
	
	/*
	 * GENERATOR FUNCTIONS
	 */
	public void generateCourse(){
		
	},
	//teams -- used for pro races
	public void generateTeams(){
		
	}
	//riders -- used for not team - amateur races
	public void generateRiders(){
		
	}
	
	/*
	 * GENERAL FUNCTIONALITY
	 */
	public void startEvent(){
		//temporary to test the code
		Team tempTeam = new Team();
		for(int i=0; i<20; i++){
			teams.add(tempTeam);
		}
		
		for(Team team: teams){
			for(Rider rider: team.getRiders()){
				race = new Thread(){
					public void run(){
						rider.ride(100);
					}
				};
			}
		}
		
		race.start();
	}
}
