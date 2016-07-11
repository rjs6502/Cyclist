//Racing Event
import java.util.*;

public class Event{
	
	/*
	 * ATTRIBUTES
	 */
	private Thread race;
	private String name;
	private Course course;
	private ArrayList<Team> teams;
	private ArrayList<Rider> riders;
	private ArrayList<Rider> finishedRiders;
	
	/*
	 * DEFAULT CONSTRUCTOR
	 */
	public Event(){
		teams = new ArrayList<Team>();
		riders = new ArrayList<Rider>();
		finishedRiders = new ArrayList<Rider>();
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
	//course
	public void setCourse(Course _course){
		course = _course;
	}
	public Course getCourse(){
		return course;
	}
	//teams
	public void setTeams(ArrayList<Team> _teams){
		teams = _teams;
	}
	public ArrayList<Team> getTeams(){
		return teams;
	}
	public void addTeam(Team _team){
		teams.add(_team);
		
		for(Rider rider: _team.getRiders()){
			riders.add(rider);
		}
	}
	//riders
	public void setRiders(ArrayList<Rider> _riders){
		riders = _riders;
	}
	public ArrayList<Rider> getRiders(){
		return riders;
	}
	public void addRider(Rider rider){
		riders.add(rider);
	}
	
	/*
	 * GENERATOR FUNCTIONS
	 */
	public void generateCourse(){
		
	}
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
		Team team1 = new Team();
		team1.generateTeam();
		Team team2 = new Team();
		team2.generateTeam();
		Rider rider1 = new Rider();
		Rider rider2 = new Rider();
		Rider rider3 = new Rider();
		rider1.generateRider();
		rider2.generateRider();
		rider3.generateRider();
		this.addTeam(team1);
		this.addRider(rider1);
		this.addRider(rider2);
		this.addRider(rider3);
		
		//compose the course
//		for(Rider rider: riders){
//			race = new Thread(){
//				public void run(){
//					
//					rider.rideFlat(30);
//					rider.rideHill(10);
//					rider.rideFlat(30);
//					rider.rideMountain(30);
//					
//					finishedRiders.add(rider);
//				}
//			};
//			race.start();
//		}
		
		for(Rider rider: riders){
			rider.rideFlat(30);
			rider.rideHill(10);
			rider.rideFlat(30);
			rider.rideMountain(30);
			
			finishedRiders.add(rider);
			System.out.println("Rider: " + rider.getName() + " finished!  --> " + rider.getTotalTime());
		}
		
		ArrayList<Rider> standings = riders;
		
		for(int i=0; i<riders.size(); i++){
			for(int j=0; j<riders.size(); j++){
				
				//rider "i" was faster than rider "j"
				if(finishedRiders.get(i).getTotalTime() < finishedRiders.get(j).getTotalTime()){

					System.out.println("\n" + finishedRiders.get(i).getName() + " - " + finishedRiders.get(i).getTotalTime() + 
									   " is faster than " + finishedRiders.get(j).getName() + " - " + finishedRiders.get(j).getTotalTime()
							);
				}
				//rider "j" was faster than rider "i"
				else if(finishedRiders.get(j).getTotalTime() < finishedRiders.get(i).getTotalTime()){
					
				}
			}
		}
		
	}
	
}