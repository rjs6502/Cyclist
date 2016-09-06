import java.util.*;

public class Event {
	
	/*
	 * ATTRIBUTES
	 */
	private String name;
	private Course course;
	private ArrayList<Team> teams;
	private ArrayList<Rider> riders;
	private ArrayList<Rider> finishedRiders;
	private ArrayList<Rider> mountainJerseyStandings;
	private ArrayList<Rider> sprintJerseyStandings;
	private ArrayList<Rider> youngRiderJerseyStandings;
	private ArrayList<Rider> overallLeaderJerseyStandings;
	
	/*
	 * DEFAULT CONSTRUCTOR
	 */
	public Event(){
		teams = new ArrayList<Team>();
		riders = new ArrayList<Rider>();
		finishedRiders = new ArrayList<Rider>();
		mountainJerseyStandings = new ArrayList<Rider>();
		sprintJerseyStandings = new ArrayList<Rider>();
		youngRiderJerseyStandings = new ArrayList<Rider>();
		overallLeaderJerseyStandings = new ArrayList<Rider>();
	}
	
	/*
	 * ACCESSORS AND MUTATORS
	 */
	//Name
	public void setName(String _name){
		name = _name;
	}
	public String getName(){
		return name;
	}
	//Course
	public void setCourse(Course _course){
		course = _course;
	}
	public Course getCourse(){
		return course;
	}
	//teams
	public void setTeams(ArrayList<Team> _teams){
		teams = _teams;
		for(Team team: teams){
			for(Rider rider: team.getRiders()){
				riders.add(rider);
			}
		}
	}
	public ArrayList<Team> getTeams(){
		return teams;
	}
	public void addTeam(Team team){
		teams.add(team);
		for(Rider rider: team.getRiders()){
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
	//mountain jersey
	public void setMountainJerseyStandings(Rider firstPlace, Rider secondPlace, Rider thirdPlace){
		mountainJerseyStandings.add(firstPlace);
		mountainJerseyStandings.add(secondPlace);
		mountainJerseyStandings.add(thirdPlace);
	}
	public ArrayList<Rider> getMountainJerseyStandings(){
		return mountainJerseyStandings;
	}
	//sprint jersey
	public void setSprintJerseyStandings(Rider firstPlace, Rider secondPlace, Rider thirdPlace){
		sprintJerseyStandings.add(firstPlace);
		sprintJerseyStandings.add(secondPlace);
		sprintJerseyStandings.add(thirdPlace);
	}
	public ArrayList<Rider> getSprintJerseyStandings(){
		return sprintJerseyStandings;
	}
	//young rider jersey
	public void setYoungRiderJerseyStandings(Rider firstPlace, Rider secondPlace, Rider thirdPlace){
		youngRiderJerseyStandings.add(firstPlace);
		youngRiderJerseyStandings.add(secondPlace);
		youngRiderJerseyStandings.add(thirdPlace);
	}
	public ArrayList<Rider> getYoungRiderJerseyStandings(){
		return youngRiderJerseyStandings;
	}
	//overall leader jersey
	public void setOverallLeaderJerseyStandings(Rider firstPlace, Rider secondPlace, Rider thirdPlace){
		overallLeaderJerseyStandings.add(firstPlace);
		overallLeaderJerseyStandings.add(secondPlace);
		overallLeaderJerseyStandings.add(thirdPlace);
	}
	public ArrayList<Rider> getOverallLeaderJerseyStandings(){
		return overallLeaderJerseyStandings;
	}

	/*
	 * GENERAL FUNCTIONALITY
	 */
	public void swapRiders(int firstRider, int secondRider){
		Rider tempRider = finishedRiders.get(firstRider);
		finishedRiders.set(firstRider, finishedRiders.get(secondRider));
		finishedRiders.set(secondRider, tempRider);
	}
	public void placeRiders(){
		for(int i=0; i<finishedRiders.size(); i++){
			for(int k=i+1; k<finishedRiders.size(); k++){
				if(finishedRiders.get(i).getRaceTime() > finishedRiders.get(k).getRaceTime()){
					this.swapRiders(i,k);
				}
			}
		}
	}
	
	//start event
	public void startEvent(){
		
		//Open riders
		Rider rider1 = new Rider();
		rider1.generateRider();
		Rider rider2 = new Rider();
		rider2.generateRider();
		Rider rider3 = new Rider();
		rider3.generateRider();
		Rider rider4 = new Rider();
		rider4.generateRider();
		Rider rider5 = new Rider();
		rider5.generateRider();
		Rider rider6 = new Rider();
		rider6.generateRider();
		
		//Teams
		Team team1 = new Team();
		team1.generateRiders();
		Team team2 = new Team();
		team2.generateRiders();
		
		//add teams and riders
		this.addRider(rider1);
		this.addRider(rider2);
		this.addRider(rider3);
		this.addRider(rider4);
		this.addRider(rider5);
		this.addRider(rider6);
		this.addTeam(team1);
//		this.addTeam(team2);
		
		//race
//		for(Rider rider: riders){
//			rider.rideFlat(35);
//			rider.rideHill(10);
//			rider.rideFlat(35);
//			rider.rideMountain(20);
//			rider.rideFlat(10);
//			
//			finishedRiders.add(rider);
//		}
//		
//		//place riders
//		this.placeRiders();
//		
//		//results
//		int place = 1;
//		for(Rider rider: finishedRiders){
//			System.out.println(place + ": " + rider.getName() + " - " + rider.getRaceTime());
//			place++;
//		}
		
		for(Rider rider: riders){
			Thread theRider = new Thread(rider);
			theRider.start();
		}
	}
}
