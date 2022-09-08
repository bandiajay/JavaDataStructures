package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, ArrayList<String>> courseMap = new HashMap<String, ArrayList<String>>();
		ArrayList<String> caseList = new ArrayList<String>();
		caseList.add("Capstone");
		caseList.add("CI");
		caseList.add("BigData");
		caseList.add("WebApps");
		caseList.add("Capstone");

		ArrayList<String> bandiList = new ArrayList<String>(Arrays.asList("BigData", "GDP-2", "BigData", "Java"));

		ArrayList<String> hootList = new ArrayList<String>(
				Arrays.asList("ML", "ML", "WebApps", "WebApps", "DiscreteMath"));

		courseMap.put("case", caseList);
		courseMap.put("bandi", bandiList);
		courseMap.put("hoot", hootList);

		System.out.println(courseMap);

		// Question 1: How many faculty are teaching BigData?Who are they?
		System.out.println("********");
		whoTeach(courseMap, "BigData");
		System.out.println("********");

		// Question 2: How many courses each faculty is teaching?
		Set<String> facultySet = courseMap.keySet();
		for (String faculty : facultySet) {
			ArrayList<String> classesofFaculty = courseMap.get(faculty);
			System.out.println(faculty + ": " + classesofFaculty.size());
		}
		System.out.println("********");

		// Question 3: How many unique courses taught be each faculty
		for (String facultyName : courseMap.keySet()) {
			// get the values in a list and convert it to set.
			ArrayList<String> facultyCourses = courseMap.get(facultyName);
			HashSet<String> uniquecourses = new HashSet<String>(facultyCourses);
			System.out.println(facultyName + " teaches " + uniquecourses.size() + " unique classes. " + uniquecourses);
		}
	}

	private static void whoTeach(Map<String, ArrayList<String>> courseMap, String courseName) {
		int count = 0;
		for (String facultyName : courseMap.keySet()) {
			// For each key, we need to check the courseName.
			ArrayList<String> facultyCourses = courseMap.get(facultyName);
			if (facultyCourses.contains(courseName)) {
				count++;
				System.out.println(facultyName + " teaches " + courseName);
			}
		}
		System.out.println("A total of " + count + " faculty teaching " + courseName);
	}

}
