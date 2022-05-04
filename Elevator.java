/*
 * This program simulates the movement of people in a building using an elevator
 * to test the algorithm for its different parts
 * Created By Tyler Albers
 * CSE 374
 * 05/06/2022
 */

import java.util.ArrayList;

public class Elevator {

	public static int MAX_CAPICITY;
	public int currentFloor;
	public int numberOfPeople;
	public boolean direction;
	public ArrayList<Person> people;

	/**
	 * Constructor for elevator
	 * 
	 * @param people       ArrayList of people in elevator
	 * @param currentFloor current floor of elevator
	 * @param d            direction of elevator
	 */
	public Elevator(ArrayList<Person> people, int currentFloor, boolean d) {
		this.people = people;
		this.currentFloor = currentFloor;
		this.direction = d;
	}

	/**
	 * Picks up person into elevator
	 * 
	 * @param p person to be picked up
	 */
	public void pickUp(Person p) {
		this.people.add(p);
		this.numberOfPeople = numberOfPeople + 1;
	}

	/**
	 * Drops off person to floor
	 * 
	 * @param p person to be dropped off
	 */
	public void dropOff(Person p) {
		this.people.remove(p);
		this.numberOfPeople = numberOfPeople - 1;
	}
}
