package edu.evacodekitchen.hotelapp;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Hotel hotel1 = new Hotel(new RoomType[] {RoomType.DOUBLE, RoomType.LUXORY}, new Bicycle[] {new Bicycle(1), new Bicycle(2)}); 
		Hotel hotel1 = new Hotel(Arrays.asList(RoomType.DOUBLE, RoomType.LUXORY), Arrays.asList(new Bicycle(1), new Bicycle(2))); 
		
		Bicycle bicycle3 = new Bicycle(3);
		// Hotel hotel2 = new Hotel(new RoomType[] {RoomType.DOUBLE, RoomType.FAMILY, RoomType.SINGLE}, new Bicycle[] {bicycle3, new Bicycle(4)});
		Hotel hotel2 = new Hotel(Arrays.asList(RoomType.DOUBLE, RoomType.FAMILY, RoomType.SINGLE), Arrays.asList(bicycle3, new Bicycle(4))); 
		
		Guest guest1 = new Guest("guest name1", RoomType.DOUBLE, 2);
		hotel1.addGuest(guest1);

		Guest guest2 = new Guest("guest name2", RoomType.FAMILY, 3);
		hotel2.addGuest(guest2);
		
		guest2.rentBicycle(bicycle3, 3);
		
		System.out.println("final price for guest1 in hotel1 : " + hotel1.calculateFinalPrice(guest1));

		System.out.println("final price for guest2 in hotel2 : " + hotel2.calculateFinalPrice(guest2));

		
		// Ez új Guest objektumot adna át neki, ami így nincs a hotel vendégei között!!
		// System.out.println("final price for guest1 in hotel1 : " + hotel1.calculateFinalPrice(new Guest("guest name1", RoomType.DOUBLE, 2)));
		
		//Guest guest3 = new Guest("guest name1", RoomType.DOUBLE, 2);
		//hotel1.addGuest(guest3);
		//System.out.println("final price for guest1 in hotel1 : " + hotel1.calculateFinalPrice(guest3));

		// Felülírtuk a Guest osztály equals és hashCode metódusait!!
		System.out.println("final price for guest1 in hotel1 : " + hotel1.calculateFinalPrice(new Guest("guest name1", RoomType.DOUBLE, 2)));

		
		System.out.println("final price for guest2 in hotel1 : " + hotel1.calculateFinalPrice(new Guest("guest name2", RoomType.FAMILY, 3)));
		
	}
}
