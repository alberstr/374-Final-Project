/*
 * This program simulates the movement of people in a building using an elevator
 * to test the algorithm for its different parts
 * Created By Tyler Albers
 * CSE 374
 * 05/06/2022
 */

import java.util.ArrayList;

public class Building {

	public int numberOfPeopleInBuilding; // number of people in the building
	public ArrayList<Integer> floors;
	public ArrayList<Elevator> elevators;
	public ArrayList<Person> peopleB;

	/**
	 * Constructor for a building object
	 * 
	 * @param floors    Arraylist of the amount of floors in the building
	 * @param elevators ArrayList of elevators in the building
	 * @param peopleB   ArrayList of people in the building
	 */
	public Building(ArrayList<Integer> floors, ArrayList<Elevator> elevators, ArrayList<Person> peopleB) {
		this.floors = floors;
		this.elevators = elevators;
		this.peopleB = peopleB;
	}

	/**
	 * This method brings every person, up or down, from their source floor to their
	 * destination floor
	 */
	public void operate() {
		// while there are people to move and an elevator has not hit capacity
		while (peopleB.size() > 0) {
			// loop through all floors in building
			for (int i = 0; i < floors.size(); i++) {
				// if the person is moving UP and is on the same floor as the elevator
				// then pick them up
				for (int j = 0; j < peopleB.size(); j++) {
					if (peopleB.get(j).direction == true
							&& peopleB.get(j).sourceFloor == elevators.get(0).currentFloor) {
						elevators.get(0).pickUp(peopleB.get(j));
					}
				}
				// increment to check next floor for UPWARD passengers
				elevators.get(0).currentFloor = i + 1;
			}
			if (elevators.get(0).direction == true) {
				// go from floor 1 up
				for (int i = 0; i < floors.size(); i++) {
					// now check at all the persons destinations floors
					// to see if they match the current floor (i)
					for (int j = 0; j < elevators.get(0).people.size(); j++) {
						// if the destination floor matches i then drop off
						if (i == elevators.get(0).people.get(j).destinationFloor
								&& elevators.get(0).people.get(j).direction == true) {
							// remove person from people (elevator)
							elevators.get(0).dropOff(elevators.get(0).people.get(j));
							// loop through peopleB remove person from peopleB (building)
							for (int k = 0; k < peopleB.size(); k++) {
								if (peopleB.get(k).destinationFloor == i) {
									peopleB.remove(peopleB.get(k));
								}
							}
							// update elevators current floor
							// elevators.get(0).currentFloor = i;
						}
					}
				}
				// System.out.println("Everyone going UP is dropped off!");
				elevators.get(0).direction = false;
			}
			// bring elevator to top floor and set direction to DOWN
			elevators.get(0).currentFloor = floors.size();
			elevators.get(0).direction = false;
			// loop through all people in building
			for (int i = floors.size(); i > 0; i--) {
				// if the person is moving DOWN and is on the same floor as the elevator
				// then pick them up
				for (int j = 0; j < peopleB.size(); j++) {
					if (peopleB.get(j).direction == false
							&& peopleB.get(j).sourceFloor == elevators.get(0).currentFloor) {
						elevators.get(0).pickUp(peopleB.get(j));
					}
				}
				// de-increment elevator with i until floor matches soureFloor or passenger
				elevators.get(0).currentFloor = i - 1;
			}

			// Now operate elevator for persons going down
			if (elevators.get(0).direction == false) {
				// go from top floor DOWN
				for (int i = floors.size(); i >= -1; i--) {
					// now check at all the persons destinations floors
					// to see if they match the current floor (i)
					for (int j = 0; j < elevators.get(0).people.size(); j++) {
						// if the destination floor matches i then drop off
						if (i == elevators.get(0).people.get(j).destinationFloor
								&& elevators.get(0).people.get(j).direction == false) {
							// remove person from people (elevator)
							elevators.get(0).dropOff(elevators.get(0).people.get(j));
							// remove person from peopleB (building)
							for (int k = 0; k < peopleB.size(); k++) {
								if (peopleB.get(k).destinationFloor == i) {
									peopleB.remove(peopleB.get(k));
								}
							}
							// update elevators current floor
							elevators.get(0).currentFloor = i;
						}
					}
				}
				elevators.get(0).direction = true;
				// System.out.println("Everyone going DOWN is dropped off!");
				// System.out.println(peopleB.size());
			}
		}
	}
}
