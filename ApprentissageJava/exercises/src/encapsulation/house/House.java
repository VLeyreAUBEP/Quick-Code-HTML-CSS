package encapsulation.house;

import java.util.ArrayList;

public class House {
	private String adresse;
	private int numberOfRooms;
	private double area;
	
	public House(final String adresse, final int numberOfRooms, final double area) {
		this.adresse = adresse;
		this.numberOfRooms = numberOfRooms;
		this.area = area;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	public double getArea() {
		return area;
	} 
	
	public void setAdresse(final String adresse) {
		this.adresse = adresse;
	}
	
	public void setNumberOfRooms(final int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	public void setArea(final double area) {
		this.area = area;
	}
	
	public ArrayList<Double> calculatePrice(){
		final double squareMeterPrice = 12458.25;
		final double housePrice = area * squareMeterPrice;
		ArrayList<Double> tabPrice = new ArrayList<>();
		tabPrice.add(squareMeterPrice);
		tabPrice.add(housePrice);
		return tabPrice;
	}
}
