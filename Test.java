/*
 * This program simulates the movement of people in a building using an elevator
 * to test the algorithm for its different parts
 * Created By Tyler Albers
 * CSE 374
 * 05/06/2022
 */

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		// BUILDING ONE
		ArrayList<Integer> floors = new ArrayList<Integer>();
		ArrayList<Elevator> elevators = new ArrayList<Elevator>();
		ArrayList<Person> peopleB = new ArrayList<Person>();
		ArrayList<Person> peopleE = new ArrayList<Person>();

		// Manually adding in floors for testing
		for (int i = 0; i < 10; i++) {
			floors.add(i);
		}

		// Manually adding in people for testing
		// 0 is equal to first floor of building
		Person p1One = new Person(0, 1, true); // moving UP from floor 1 to 2
		Person p2One = new Person(1, 0, false); // moving DOWN from floor 2 to 1
		Person p3One = new Person(0, 2, true); // moving UP from floor 1 to 3
		Person p4One = new Person(2, 1, false); // moving DOWN from floor 3 to 1
		Person p5One = new Person(4, 9, true);
		// next 5
		Person p6One = new Person(9, 0, false);
		Person p7One = new Person(9, 1, true);
		Person p8One = new Person(4, 3, false);
		Person p9One = new Person(8, 9, true);
		Person p10One = new Person(4, 3, false);
		peopleB.add(p1One); // up
		peopleB.add(p3One);
		peopleB.add(p2One); // up
		peopleB.add(p4One);
		peopleB.add(p5One);
		// next 5
		peopleB.add(p6One);
		peopleB.add(p7One);
		peopleB.add(p8One);
		peopleB.add(p9One);
		peopleB.add(p10One);

		// Manually adding in elevator(s) for testing
		Elevator e1 = new Elevator(peopleE, 0, true);
		elevators.add(e1);

		// create building and run
		Building b1 = new Building(floors, elevators, peopleB);
		// long start1 = System.nanoTime();
		long start1 = System.currentTimeMillis();
		b1.operate();
		// long end1 = System.nanoTime();
		long end1 = System.currentTimeMillis();
		System.out.println("Building One Time to Run: " + (end1 - start1) + " miliseconds.");
		// System.out.println("Building One Time to Run: " + (end1 - start1) + " nanoseconds.");
		
		// BUILDING TWO
		ArrayList<Integer> floors2 = new ArrayList<Integer>();
		ArrayList<Elevator> elevators2 = new ArrayList<Elevator>();
		ArrayList<Person> peopleB2 = new ArrayList<Person>();
		ArrayList<Person> peopleE2 = new ArrayList<Person>();

		for (int i = 0; i < 100; i++) {
			floors2.add(i);
		}

		Person p1Two = new Person(0, 9, true);
		Person p2Two = new Person(14, 0, false);
		Person p3Two = new Person(0, 98, true);
		Person p4Two = new Person(39, 29, false);
		Person p5Two = new Person(9, 19, true);
		Person p6Two = new Person(99, 0, false);
		Person p7Two = new Person(49, 61, true);
		Person p8Two = new Person(74, 3, false);
		Person p9Two = new Person(98, 99, true);
		Person p10Two = new Person(74, 73, false);
		peopleB2.add(p1Two);
		peopleB2.add(p2Two);
		peopleB2.add(p3Two);
		peopleB2.add(p4Two);
		peopleB2.add(p5Two);
		peopleB2.add(p6Two);
		peopleB2.add(p7Two);
		peopleB2.add(p8Two);
		peopleB2.add(p9Two);
		peopleB2.add(p10Two);

		Elevator e2 = new Elevator(peopleE2, 0, true);
		elevators2.add(e2);

		Building b2 = new Building(floors2, elevators2, peopleB2);
		long start2 = System.currentTimeMillis();
		// long start2 = System.nanoTime();
		b2.operate();
		long end2 = System.currentTimeMillis();
		// long end2 = System.nanoTime();
		System.out.println("Building Two Time to Run: " + (end2 - start2) + " miliseconds.");
		// System.out.println("Building Two Time to Run: " + (end2 - start2) + " nanoseconds.");

		// BUILDING THREE
		ArrayList<Integer> floors3 = new ArrayList<Integer>();
		ArrayList<Elevator> elevators3 = new ArrayList<Elevator>();
		ArrayList<Person> peopleB3 = new ArrayList<Person>();
		ArrayList<Person> peopleE3 = new ArrayList<Person>();

		for (int i = 0; i < 10000; i++) {
			floors3.add(i);
		}
		
		// first set of 10 test people
		Person p1Three = new Person(0, 9, true);
		Person p2Three = new Person(14, 0, false);
		Person p3Three = new Person(0, 98, true);
		Person p4Three = new Person(39, 29, false);
		Person p5Three = new Person(9, 19, true);
		Person p6Three = new Person(99, 0, false);
		Person p7Three = new Person(49, 61, true);
		Person p8Three = new Person(74, 3, false);
		Person p9Three = new Person(98, 99, true);
		Person p10Three = new Person(74, 73, false);
		peopleB3.add(p1Three);
		peopleB3.add(p2Three);
		peopleB3.add(p3Three);
		peopleB3.add(p4Three);
		peopleB3.add(p5Three);
		peopleB3.add(p6Three);
		peopleB3.add(p7Three);
		peopleB3.add(p8Three);
		peopleB3.add(p9Three);
		peopleB3.add(p10Three);
		
		// next set of 10 test people
//		Person p11Three = new Person(3, 87, true);
//		Person p12Three = new Person(14, 3, false);
//		Person p13Three = new Person(6, 78, true);
//		Person p14Three = new Person(49, 22, false);
//		Person p15Three = new Person(27, 35, true);
//		Person p16Three = new Person(66, 0, false);
//		Person p17Three = new Person(12, 50, true);
//		Person p18Three = new Person(13, 3, false);
//		Person p19Three = new Person(43, 44, true);
//		Person p20Three = new Person(91, 1, false);
//		peopleB3.add(p11Three);
//		peopleB3.add(p12Three);
//		peopleB3.add(p13Three);
//		peopleB3.add(p14Three);
//		peopleB3.add(p15Three);
//		peopleB3.add(p16Three);
//		peopleB3.add(p17Three);
//		peopleB3.add(p18Three);
//		peopleB3.add(p19Three);
//		peopleB3.add(p20Three);

		Elevator e3 = new Elevator(peopleE3, 0, true);
		elevators3.add(e3);

		Building b3 = new Building(floors3, elevators3, peopleB3);
		long start3 = System.currentTimeMillis();
		// long start3 = System.nanoTime();
		b3.operate();
		long end3 = System.currentTimeMillis();
		// long end3 = System.nanoTime();
		System.out.println("Building Three Time to Run: " + (end3 - start3) + " miliseconds.");
		// System.out.println("Building Three Time to Run: " + (end3 - start3) + " nanoseconds.");
	}

}
