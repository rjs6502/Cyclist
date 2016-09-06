//

import java.util.*;

public class Bike {
	
	/*
	 * ATTRIBUTES
	 */
	private Random rand;
	private String name;
	private int ratingMtn; // 1-10 (10 being the best)
	private int ratingHill; // 1-10 (10 being the best)
	private int ratingFlat; // 1-10 (10 being the best)
	private int ratingTT; // 1-10 (10 being the best)
	private String[] names = {
		"Trek Madone","Giant Propel Advanced SL","Cervelo S2","Fuji Sl 1.1","Specialized S-Works","Litespeed T1SL","Cannondale SuperSix Evo",
		"Colnago C60","Parlee Altum","KTM Revelator Prestige Di2","Jamis Xenith","Cipollini NK1K","BH Ultralight","Felt F1","Pinarello F8",
		"Mercier Galaxy","Wilier Zero.6","Windsor Bradford","Look 795 Aerolight","BMC SLR01","Focus Izalco","Ridley Helium SL","Orbea Orca",
		"Lapierre Xelius SL","Scott Adict","Canyon Aeroad CF SLX","Merida Scultura","Bianchi Oltre XR2","Argon 18 Gallium Pro"
	};
	
	/*
	 * DEFAULT CONSTRUCTOR
	 */
	public Bike(){
		rand = new Random();
	}
	/*
	 * PARAM CONSTRUCTOR
	 */
	public Bike(String makeNmodel){
		rand = new Random();
		
		name = makeNmodel;
	}
	
	/*
	 * ACCESSORS AND MUTATORS
	 */
	//make & model
	public void setName(String makeNmodel){
		name = makeNmodel;
	}
	public String getName(){
		return name;
	}
	//mountain rating
	public void setRatingMtn(int _ratingMtn){
		ratingMtn = _ratingMtn;
	}
	public int getRatingMtn(){
		return ratingMtn;
	}
	//hill rating
	public void setRatingHill(int _ratingHill){
		ratingHill = _ratingHill;
	}
	public int getRatingHill(){
		return ratingHill;
	}
	//flat rating
	public void setRatingFlat(int _ratingFlat){
		ratingFlat = _ratingFlat;
	}
	public int getRatingFlat(){
		return ratingFlat;
	}
	//time trial rating
	public void setRatingTT(int _ratingTT){
		ratingTT = _ratingTT;
	}
	public int getRatingTT(){
		return ratingTT;
	}
	//overall rating
	public int getRatingOverall(){
		return ( ( getRatingMtn() + getRatingHill() + getRatingFlat() + getRatingTT() ) / 4 );
	}
	
	/*
	 * GENERATOR FUNCTIONS
	 */
	public void generateName(){
		this.setName(names[rand.nextInt(names.length)]);
	}
	public void generateRatings(){
		Random randomRatingMtn = new Random();
		Random randomRatingHill = new Random();
		Random randomRatingFlat = new Random();
		Random randomRatingTT = new Random();
		
		this.setRatingMtn(randomRatingMtn.nextInt((10 - 1) + 1) + 1);
		this.setRatingHill(randomRatingHill.nextInt((10 - 1) + 1) + 1);
		this.setRatingFlat(randomRatingFlat.nextInt((10 - 1) + 1) + 1);
		this.setRatingTT(randomRatingTT.nextInt((10 - 1) + 1) + 1);
	}
	public void generateBike(){
		if(this.getName() == null){
			this.generateName();
			this.generateRatings();
		}
		else
		{
			this.generateRatings();
		}
	}
	
}
