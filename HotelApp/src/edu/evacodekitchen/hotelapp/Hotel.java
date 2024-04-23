package edu.evacodekitchen.hotelapp;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private GuestNotInThisHotelException data = new GuestNotInThisHotelException();
	private List<RoomType> roomTypes;
	private List<Bicycle> bicyles;
	
	private List<Guest> guests;
	// private int currentNrOfGuests = 0;

	public Hotel(List<RoomType> list, List<Bicycle> list2) {
		this.roomTypes = list;
		this.bicyles = list2;
		guests = new ArrayList<Guest>();
	}

	public void addGuest(Guest guest) {
		// currentNrOfGuests++;
		// guests[currentNrOfGuests - 1] = guest;
		// guests.add(currentNrOfGuests - 1, guest);
		guests.add(guest);
	}

	public int calculateFinalPrice(Guest guest) {
		if (!guests.contains(guest)){
			throw new GuestNotInThisHotelException();
		}

		int finalPrice = 0;
		
		Bicycle bicycle = guest.getRentedBicyle();
		if (bicycle != null) {
			int nrOfDaysToRentTheBicycle = guest.getNrOfDaysToRentTheBicycle();
			finalPrice = bicycle.getPricePerDay() * nrOfDaysToRentTheBicycle;			
		}
		
		RoomType rentedRoomType = guest.getRentedRoomType();
		int nrOfDaysToRentTheRoom = guest.getNrOfDaysToRentTheRoom();
		finalPrice += rentedRoomType.getPricePerDay() * nrOfDaysToRentTheRoom;
		
		return finalPrice;
	}
	


}
