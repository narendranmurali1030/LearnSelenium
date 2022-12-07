package day21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> studentNames = new ArrayList<>();

		// <generic>

		// adding elements
		studentNames.add("AAKASH");
		studentNames.add("ARJUN");
		studentNames.add("BALU");
		studentNames.add("ZARA");
		studentNames.add("DEEPA");
		studentNames.add("AARTHI");
		studentNames.add("KARTHIK");
		studentNames.add("SUNDAR");
		

		// size
		int arrayListSize = studentNames.size();
		System.out.println("Array Size =>" + arrayListSize);

		// index based adding
		studentNames.add(0, "AADVIk");

		// contains
		System.out.println(studentNames.contains("AADVIk"));

		// Cloning
		ArrayList<String> clonedStudentNames = new ArrayList<>(studentNames);
		clonedStudentNames.add("HELLO");
		System.out.println(studentNames.containsAll(clonedStudentNames));

		// toArray
		Object[] myNewArray = clonedStudentNames.toArray();

		for (Object each : myNewArray) {
			System.out.println(each);

		}

		System.out.println("------------------------------");

		for (String each : studentNames) {
			System.out.println(each);

		}

		System.out.println("---------------------------------");

		// get
		for (int i = 0; i < studentNames.size(); i++) {
			System.out.println(studentNames.get(i));
		}

		System.out.println("---------------------------------");

		// empty
		System.out.println(studentNames.isEmpty());

		// clear
		studentNames.clear();

		// empty
		System.out.println(studentNames.isEmpty());

		ArrayList<String> newArrayList = new ArrayList<>();
		newArrayList.add("One");
		newArrayList.add("Two");

		// addAll
		clonedStudentNames.addAll(newArrayList);

		System.out.println("------------------------------");

		for (String each : clonedStudentNames) {
			System.out.println(each);

		}

		// removeAll
		clonedStudentNames.removeAll(newArrayList);

		System.out.println("------------------------------");

		for (String each : clonedStudentNames) {
			System.out.println(each);

		}

		// remove
		clonedStudentNames.remove(0);

		System.out.println("------------------------------");

		for (String each : clonedStudentNames) {
			System.out.println(each);

		}

		// Sorting ArrayList
		Collections.sort(clonedStudentNames);

		System.out.println("------------------------------");

		for (String each : clonedStudentNames) {
			System.out.println(each);

		}

		List<String> arrayList1 = new ArrayList<String>();
		ArrayList<String> studentNames1 = new ArrayList<>();
		
		ArrayList<Integer> studentRollNumber = new ArrayList<>();
		studentRollNumber.add(84845511);
		studentRollNumber.add(84845511);
		studentRollNumber.add(84845511);
		studentRollNumber.add(84845511);
		studentRollNumber.add(84845511);
		
		System.out.println("---------------------------");
		
		for (Integer each : studentRollNumber) {
			System.out.println(each);
		}
		
		

	}

}
