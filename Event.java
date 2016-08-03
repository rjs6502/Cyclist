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
	private ArrayList<Rider> standings;
	
	/*
	 * DEFAULT CONSTRUCTOR
	 */
	public Event(){
		teams = new ArrayList<Team>();
		riders = new ArrayList<Rider>();
		finishedRiders = new ArrayList<Rider>();
		standings = new ArrayList<Rider>();
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
		
		/*
		 * SET UP TEAMS/RIDERS
		 */
		Team team1 = new Team();
		team1.generateTeam();
		Team team2 = new Team();
		team2.generateTeam();
		
		Rider rider1 = new Rider();
		Rider rider2 = new Rider();
		Rider rider3 = new Rider();
		Rider rider4 = new Rider();
		Rider rider5 = new Rider();
		Rider rider6 = new Rider();
		Rider rider7 = new Rider();
		Rider rider8 = new Rider();
		
		rider1.generateRider();
		rider2.generateRider();
		rider3.generateRider();
		rider4.generateRider();
		rider5.generateRider();
		rider6.generateRider();
		rider7.generateRider();
		rider8.generateRider();
		
		//this.addTeam(team1);
		//this.addTeam(team2);
		this.addRider(rider1);
		this.addRider(rider2);
		this.addRider(rider3);
		this.addRider(rider4);
		this.addRider(rider5);
		this.addRider(rider6);
		this.addRider(rider7);
		this.addRider(rider8);
		
		/*
		 * RACE
		 */
		for(Rider rider: riders){
			rider.rideFlat(30);
			rider.rideHill(10);
			rider.rideFlat(30);
			rider.rideMountain(30);
			
			finishedRiders.add(rider);
			System.out.println(rider.getName() + " - " + rider.getTotalTime());
		}
		System.out.println("\n");
		
		/*
		 * PLACE RIDERS
		 */
		Rider firstPlace = finishedRiders.get(0);
		Rider secondPlace = new Rider();
		Rider thirdPlace = new Rider();
		
		for(int i=0; i<finishedRiders.size(); i++){
			for(int j=i+1; j<finishedRiders.size(); j++){
				
				Rider currentRider = finishedRiders.get(j);
			
				//THIS SORT OF WORKS -- DONT GET RID OF IT!!!!!!!!!
				//firstPlace rider changes -- shift the standings
				if(currentRider.getTotalTime() < firstPlace.getTotalTime()){
					secondPlace = firstPlace;
					firstPlace = currentRider;
				}
				//firstPlace rider remains the same
				else if(currentRider.getTotalTime() > firstPlace.getTotalTime()){
					//if secondPlace hasn't been set then set it
					if(secondPlace.getName() == null){
						secondPlace = currentRider;
					}
					//otherwise compare secondPlace to the current rider
					else{
						//secondPlace rider changes -- shift the standings
						if(currentRider.getTotalTime() < secondPlace.getTotalTime()){
							thirdPlace = secondPlace;
							secondPlace = currentRider;
						}
						//secondPlace rider remains the same
						else if(currentRider.getTotalTime() > secondPlace.getTotalTime()){
							thirdPlace = currentRider;
						}
					}
				}
			}
		}
		
		System.out.println(firstPlace.getName() + " - " + firstPlace.getTotalTime());
		System.out.println(secondPlace.getName() + " - " + secondPlace.getTotalTime());
		System.out.println(thirdPlace.getName() + " - " + thirdPlace.getTotalTime());
	}
}