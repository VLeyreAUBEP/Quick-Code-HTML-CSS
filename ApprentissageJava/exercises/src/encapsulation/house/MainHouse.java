package encapsulation.house;

import java.util.ArrayList;

public class MainHouse {
	public static void main(String[] args) {
		House house1 = new House("Avenue du paradis", 5, 165);
		ArrayList<Double> prices = house1.calculatePrice();
		System.out.println("La maison à l'adresse " + house1.getAdresse() + " contient " + house1.getNumberOfRooms() + " pièces et à une surface totale de " + house1.getArea() + " m²");
		System.out.println("Le prix de la maison vaut " + prices.get(1) + " CHF avec un prix du mètre carré correspondant à " + prices.get(0) + " CHF/m²");
	}
}
