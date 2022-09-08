package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scan = new Scanner(new File("studentData.txt"));
		while (scan.hasNext()) {
			Student s = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextDouble());
			System.out.println(s);
			studentList.add(s);
		}
		System.out.println("*************");
		System.out.println(studentList);
		System.out.println("*************");
		printList(studentList);
		System.out.println("*************");
		Collections.sort(studentList);
		printList(studentList);
		System.out.println("*************");
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getlName().compareTo(s2.getlName()) == 0) {
					return s1.getfName().compareTo(s2.getfName());
				} else {
					return s1.getlName().compareTo(s2.getlName());
				}
			}
		});
		printList(studentList);
		System.out.println("*************");
		Collections.sort(studentList, new StudentComparator());
		printList(studentList);
		System.out.println("*************");
	}

	private static void printList(List<Student> stuList) {
		for (Student s : stuList) {
			System.out.println(s);
		}
	}

}
