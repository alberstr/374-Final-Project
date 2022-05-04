/*
 * This program simulates the movement of people in a building using an elevator
 * to test the algorithm for its different parts
 * Created By Tyler Albers
 * CSE 374
 * 05/06/2022
 */

public class Person {

	public int sourceFloor;
	public int destinationFloor;
	public boolean direction;

	/**
	 * Constructor for person
	 * 
	 * @param sourceFloor      floor person starts
	 * @param destinationFloor floor person wants to be dropped off
	 * @param direction        direction person is moving, true if up, false if down
	 */
	public Person(int sourceFloor, int destinationFloor, boolean direction) {
		this.sourceFloor = sourceFloor;
		this.destinationFloor = destinationFloor;
		this.direction = direction;
	}
}
