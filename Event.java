//Racing Event
import java.util.*;

public class Event {
	
	/*
	 * ATTRIBUTES
	 */
	private Thread race;
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
	public void setCourse(Course _course){
		course = _course;
	}
	public Course getCourse(){
		return course;
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
