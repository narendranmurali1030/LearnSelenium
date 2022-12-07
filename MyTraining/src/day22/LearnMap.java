package day22;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> studentInformation = new LinkedHashMap<Integer, String>();

		// adding each value

		studentInformation.put(10, "Tinto");
		studentInformation.put(1, "Arun");
		studentInformation.put(2, "Arun");
		studentInformation.put(4, "Catherine");
		studentInformation.put(5, "David");
		studentInformation.put(6, "Ezhumalai");
		studentInformation.put(7, "Zara");
		studentInformation.put(8, "Zoro");
		studentInformation.put(9, "Pinto");
		studentInformation.put(3, "Balaji");

		// iterating each values

		for (Entry each : studentInformation.entrySet()) {

			Object eachRollNumber = each.getKey();
			Object eachName = each.getValue();

			System.out.println(eachRollNumber + "-->" + eachName);
		}

		System.out.println("-------------------");

		for (Entry each : studentInformation.entrySet()) {

			System.out.println(each);
		}

		// adding all values

		TreeMap<Integer, String> studentsInformationOrdered = new TreeMap<Integer, String>();

		studentsInformationOrdered.putAll(studentInformation);

		System.out.println("-------------------");

		for (Entry each : studentsInformationOrdered.entrySet()) {

			Object eachRollNumber = each.getKey();
			Object eachName = each.getValue();

			System.out.println(eachRollNumber + "-->" + eachName);
		}

		// size

		System.out.println("-------------------");

		System.out.println(studentsInformationOrdered.size());

		// getKey and getValue

		System.out.println("-------------------");

		System.out.println(studentsInformationOrdered.get(8));

		// remove and removeAll

		System.out.println("-------------------");

		System.out.println(studentsInformationOrdered.size());

		studentsInformationOrdered.remove(5);

		System.out.println(studentsInformationOrdered.size());

		studentsInformationOrdered.clear();

		System.out.println(studentsInformationOrdered.size());
		
		// containsKey
		
		System.out.println("-------------------");
		
		studentInformation.remove(5);
		
		boolean flag = studentInformation.containsKey(5);
		System.out.println(flag);
		
		// containsValue
		
		System.out.println("-------------------");
		
		flag = studentInformation.containsValue("Tinto");
		
		System.out.println(flag);
		
		
		
		
		
		
		

	}

}
