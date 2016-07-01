//Play the game!

public class PlayCyclist {
	
	public static void main(String[] args){
		
//		String[] firstTier = {
//			"AG2R La Mondiale","Astana Pro Team","BMC Racing Team","Cannondale Pro Cycling","Dimension Data","Etixx - Quick-Step",
//			"FDJ","IAM Cycling","Lampre-Merida","Lotto Soudal","Movistar Team","Orica - GreenEdge","Team Giant - Alpecin","Team Katusha",
//			"Team LottoNl-Jumbo","Team Sky","Tincoff Team","Trek-Segafredo"
//		};
//		String[] secondTier = {
//			"Androni Giocattoli - Sidermec","Bardiani CSF","Bora-Argon 18","Caja Rural - Seguros RGA","CCC Sprandi Polkowice",
//			"Cofidis, Solutions Credits","Delko Marseille Provence KTM","Direct Energie","Drapac Professional Cycling",
//			"Elevate Pro Cycling p/b Bicycle World","Fortuneo - Vital Concept","Funvic Soul Cycles - Cycling","Gazprom - Rusvelo",
//			"Nippo - Vini Fantini","ONE Pro Cycling","Roompot - Oranje Peleton","Stolting Service Group","Team Novo Nordisk",
//			"Team Roth","Topsport Vlaanderen - Baloise","UnitedHealthcare Professional Cycling Team","Verva ActiveJet Pro Cycling Team",
//			"Wanty - Groupe Gobert"
//		};
//		String[] thirdTier = {
//			"An Post - Chainreaction","Avanti IsoWhey Sports","Axeon Hagens Berman","Crelan - Vastgoedservice Continental Team",
//			"Cycling Academy Team","Cylance - Incycle Pro Cycling Team p/b Cannondale","Elevate Pro Cycling p/b Bicycle World",
//			"Holowesko - Citadel Racing Team","Jamis","Jelly Belly p/b Maxxis","Lupus Racing Team","Rally Cycling","Silber Pro Cycling",
//			"Skydive Dubai Pro Cycling Team","State of Matter MAAP Racing","Synergy Baku Cycling Project","Team 3M","Team Illuminate",
//			"Team Jamis","Team WIGGINS","Veranda's Willems Cycling Team"
//		};
		
		Rider rider = new Rider();
		rider.generateRider();
		Rider rider2 = new Rider();
		rider2.generateRider();
		Rider rider3 = new Rider();
		rider3.generateRider();
		
//		//rider 1
//		System.out.println("Name: " + rider.getName()); //name
//		System.out.println("Age: " + rider.getAge()); //age
//		System.out.println("Country: " + rider.getCountry()); //country
//		System.out.println("Height: " + rider.getHeight()); //height
//		System.out.println("Weight: " + rider.getWeight()); //weight
//		System.out.println("Rating Mtn: " + rider.getRatingMtn()); //ratings
//		System.out.println("Rating Hill: " + rider.getRatingHill()); //ratings
//		System.out.println("Rating Flat: " + rider.getRatingFlat()); //ratings
//		System.out.println("Rating TT: " + rider.getRatingTT()); //ratings
//		System.out.println("Speed Mtn: " + rider.getSpeedMtn()); //ratings
//		System.out.println("Speed Hill: " + rider.getSpeedHill()); //ratings
//		System.out.println("Speed Flat: " + rider.getSpeedFlat()); //ratings
//		System.out.println("Speed TT: " + rider.getSpeedTT() + "\n"); //ratings
//		
//		//rider 2
//		System.out.println("Name: " + rider2.getName()); //name
//		System.out.println("Age: " + rider2.getAge()); //age
//		System.out.println("Country: " + rider2.getCountry()); //country
//		System.out.println("Height: " + rider2.getHeight()); //height
//		System.out.println("Weight: " + rider2.getWeight()); //weight
//		System.out.println("Rating Mtn: " + rider2.getRatingMtn()); //ratings
//		System.out.println("Rating Hill: " + rider2.getRatingHill()); //ratings
//		System.out.println("Rating Flat: " + rider2.getRatingFlat()); //ratings
//		System.out.println("Rating TT: " + rider2.getRatingTT()); //ratings
//		System.out.println("Speed Mtn: " + rider2.getSpeedMtn()); //ratings
//		System.out.println("Speed Hill: " + rider2.getSpeedHill()); //ratings
//		System.out.println("Speed Flat: " + rider2.getSpeedFlat()); //ratings
//		System.out.println("Speed TT: " + rider2.getSpeedTT() + "\n"); //ratings
		
//		Thread race = new Thread(){
//			public void run(){
//				rider.ride(100);
//				rider2.ride(100);
//				rider3.ride(100);
//			}
//		};
//		
//		race.start();
		
		Event tour = new Event();
		tour.startEvent();

	}
	
}
