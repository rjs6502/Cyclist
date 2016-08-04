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
		
		rider1.generateRider();
		rider2.generateRider();
		rider3.generateRider();
		rider4.generateRider();
		rider5.generateRider();
		
		//this.addTeam(team1);
		//this.addTeam(team2);
		this.addRider(rider1);
		this.addRider(rider2);
		this.addRider(rider3);
		this.addRider(rider4);
		this.addRider(rider5);
		
		/*
		 * RACE
		 */
		for(Rider rider: riders){
			rider.rideFlat(30);
			rider.rideHill(10);
			rider.rideFlat(30);
			rider.rideMountain(30);
			
			finishedRiders.add(rider);
			System.out.println("Rider: " + rider.getName() + " finished!  --> " + rider.getTotalTime());
		}
		
		/*
		 * PLACE RIDERS
		 */
		Rider firstPlace = finishedRiders.get(0);
		Rider secondPlace = new Rider();
		//Rider thirdPlace = new Rider();
		
		System.out.println("\nThe overall leader is currently " + firstPlace.getName() + " - " + firstPlace.getTotalTime());
		
//		for(int i=0; i<finishedRiders.size(); i++){
//			for(int j=i+1; j<finishedRiders.size(); j++){
//				
//				//rider J was FASTER than firstPlace -- new first place rider!
//				if(firstPlace.getTotalTime() < finishedRiders.get(j).getTotalTime()){
//					
//					if(secondPlace.getTotalTime() < finishedRiders.get(j).getTotalTime()){
//						
//					}
//					else if(secondPlace.getTotalTime() > finishedRiders.get(j).getTotalTime()){
//						secondPlace = finishedRiders.get(j);
//					}
//					
//					System.out.println("\nOverall leader is still " + firstPlace.getName() + "\nTime: " + firstPlace.getTotalTime());
//				}
//				else if(firstPlace.getTotalTime() > finishedRiders.get(j).getTotalTime()){
//					secondPlace = firstPlace;
//					firstPlace = finishedRiders.get(j);
//					System.out.println("\nNew overall leader!! -- " + firstPlace.getName() + "\nTime: " + firstPlace.getTotalTime());
//				}
//			}
//		}
		
		System.out.println("\nFirst Place: " + firstPlace.getName() + "\n - Time: " + firstPlace.getTotalTime());
		System.out.println("Second Place: " + secondPlace.getName() + "\n - Time: " + secondPlace.getTotalTime());
		
	}
	
}









/*
public class MyBubbleSort {
  
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
  
    }
}



for(int i=0;i<n-1;i++) {="" for(int="" j="0;j&lt;n-1-i;j++)" if(array[j]="">array[j+1])
swapNumbers(j,j+1,array);
}
*/