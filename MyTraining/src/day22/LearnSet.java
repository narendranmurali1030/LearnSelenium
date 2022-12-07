package day22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> studentRollNumber = new LinkedHashSet<Integer>();

		studentRollNumber.add(102);
		studentRollNumber.add(104);
		studentRollNumber.add(101);
		studentRollNumber.add(103);
		studentRollNumber.add(105);

		studentRollNumber.add(101);
		studentRollNumber.add(102);
		studentRollNumber.add(103);
		studentRollNumber.add(104);
		studentRollNumber.add(105);

		for (Integer each : studentRollNumber) {
			System.out.println(each);
		}

		System.out.println("--------------------------");

		TreeSet<Integer> studentRollNumber1 = new TreeSet<Integer>();

		studentRollNumber1.add(102);
		studentRollNumber1.add(104);
		studentRollNumber1.add(101);
		studentRollNumber1.add(103);
		studentRollNumber1.add(105);

		for (Integer each : studentRollNumber1) {
			System.out.println(each);
		}

		System.out.println("-----------------------------");

		TreeSet<String> studentNames = new TreeSet<String>();

		studentNames.add("Arun");
		studentNames.add("Pandi");
		studentNames.add("Balu");
		studentNames.add("Catherine");
		studentNames.add("aARchana");

		for (String each : studentNames) {
			System.out.println(each);
		}

		System.out.println("-----------------------------");

		HashSet<String> studentNames1 = new HashSet<String>();

		studentNames1.add("Arun");
		studentNames1.add("Pandi");
		studentNames1.add("Balu");
		studentNames1.add("Catherine");
		studentNames1.add("aARchana");
		studentNames1.add("aARchana");
		studentNames1.add("aARchana");
		studentNames1.add("aARchana");
		studentNames1.add("aARchana");

		for (String each : studentNames1) {
			System.out.println(each);
		}

		// ways to iterate over the set with get method

		// way1 = passing collections as an object to the arraylist object

		System.out.println("---------------way 1-------------------------");

		ArrayList<String> obj1 = new ArrayList<String>(studentNames);

		for (int i = 0; i < obj1.size(); i++) {
			System.out.println(obj1.get(i));
		}

		// way 2 = using addAll method in the arraylist

		System.out.println("-----------------way2-----------------------");

		ArrayList<String> obj2 = new ArrayList<String>();
		obj2.addAll(studentNames);

		for (int i = 0; i < obj2.size(); i++) {
			System.out.println(obj2.get(i));
		}

		// way 3 = (traditional way of doing)

		System.out.println("-----------------way3-----------------------");

		ArrayList<String> obj3 = new ArrayList<String>();

		for (String each : studentNames) {
			obj3.add(each);
		}

		for (int i = 0; i < obj3.size(); i++) {
			System.out.println(obj3.get(i));
		}

		// way 4 = we are using List interface`s implemented method called copyOf
		// (collection)

		System.out.println("-----------------way4-----------------------");

		// List<String> obj4 = new ArrayList<String>();
		List<String> obj4 = List.copyOf(studentNames);

		for (int i = 0; i < obj4.size(); i++) {
			System.out.println(obj4.get(i));
		}

	}

}
