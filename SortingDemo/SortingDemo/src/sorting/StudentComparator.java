package sorting;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
//		if (s1.getGpa() < s2.getGpa()) {
//			return -1;
//		} else if (s1.getGpa() == s2.getGpa()) {
//			return 0;
//		} else {
//			return 1;
//		}
		if (s1.getIdNum() < s2.getIdNum()) {
			return 1;
		} else if (s1.getIdNum() == s2.getIdNum()) {
			return 0;
		} else {
			return -1;
		}

	}

}
