import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author ajay bandi
 *
 */
public class LinkedListPracticeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testArrayList();
		System.out.println("*****************");
		testLinkedList();
		System.out.println("*****************");
		testArrayListAdvanced();
		System.out.println("*****************");
		testLinkedListAdvanced();
		System.out.println("*****************");
		testRemoveElements();
		System.out.println("*****************");

	}// end of main

	public static void testArrayList() {
		// Create an instance of array list and view as a List
		List<Integer> objList = new ArrayList<>(); // polymorphic substitution
		// Adding object in list
		objList.add(1);
		objList.add(3);
		objList.add(5);

		// Display the list
		System.out.println("List is: " + objList);

		// Removal of an element
		objList.remove(1);

		// Display the list
		System.out.println("List after removal of 1: " + objList);

		// Checking emptiness
		if (objList.isEmpty()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Compute the size of the list
		System.out.println("Size of the list: " + objList.size());
	}// end of testArrayList

	/**
	 * Test LinkedList as a view of list
	 */
	public static void testLinkedList() {
		// Create an instance of Linkedlist and view as a list
		List<Integer> objList = new LinkedList<>();
		// Adding object in list
		objList.add(1);
		objList.add(2);
		objList.add(3);

		// Display the list
		System.out.println(objList);

		// Removal of an element
		objList.remove(1);

		// Display the list
		System.out.println(objList);

		// Checking emptiness
		if (objList.isEmpty()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Compute the size of the list
		System.out.println(objList.size());
	}

	/**
	 * Test other behaviors of a List
	 */
	public static void testArrayListAdvanced() {
		// Create an instance of an ArrayList and view as a List

		List<Integer> objListFirst = new ArrayList<>();
		System.out.println("First list: " + objListFirst);
		// Add first 5 prime numbers in the list in sequence
		objListFirst.add(2);
		objListFirst.add(3);
		objListFirst.add(5);
		objListFirst.add(7);
		objListFirst.add(11);

		// Display the first list
		System.out.println("First list: " + objListFirst);

		// Add 6th prime number at index 2 at an Index
		objListFirst.add(2, 13);

		// Display the first list
		System.out.println("Updated first list: " + objListFirst);

		// Create an instance of second arrayList and view as a list
		List<Integer> objListSecond = new ArrayList<>();

		// Add first 5 odd numbers in the second list
		objListSecond.add(1);
		objListSecond.add(3);
		objListSecond.add(5);
		objListSecond.add(7);
		objListSecond.add(9);

		// Display the second list
		System.out.println("Second List: " + objListSecond);

		// Add the second list into first list
		objListFirst.addAll(objListSecond);

		// Display the first list
		System.out.println("Merge of two lists: " + objListFirst);

		// Check whether the prime number 7 is in the first list
		if (objListFirst.contains(7)) {
			System.out.println("7 is not in the list");
		} else {
			System.out.println("7 is in the list");
		}

		// Check whether the second list is a subset of the first
		// list
		if (objListFirst.containsAll(objListSecond)) {
			System.out.println("The second list is a subset of the first" + " list");
		} else {
			System.out.println("The second list is not a subset of the " + "first list");
		}

		// Check whether the second list is equal to the first list
		if (objListFirst.equals(objListSecond)) {
			System.out.println("The first list is equal to the second one");
		} else {
			System.out.println("The first list is not equal to the second one");
		}

		// Display 2 + all the elements of the first arraylist
		objListFirst.forEach((e) -> System.out.println(2 * e));
		System.out.println(objListFirst);

		// Display the element at an index 5
		System.out.println("Element at index 5 in the first array list: " + objListFirst.get(5));

		// Display the class of the object objListFirst
		System.out.println("Class name of the variable objListFirst: " + objListFirst.getClass());

		// Display hash code
		System.out.println("Hash code for the first array list: " + objListFirst.hashCode());

		// Display the index of an element 13 in the first list
		System.out.println("Index of 13 in the first array list : " + objListFirst.indexOf(13));

		// Display the last index of an element 5 in the first list
		System.out.println("Lst index of 5 in the first array list : " + objListFirst.lastIndexOf(5));

		// Display all the elements of the first list using iterator
		Iterator<Integer> objIterator = objListFirst.iterator();
		System.out.print("First list via iterator: ");
		while (objIterator.hasNext()) {
			System.out.print(objIterator.next() + " ");
		}
		System.out.print("\n");
		// Display the elements of the first list in the reverse oder
		ListIterator<Integer> objListIterator = objListFirst.listIterator(11);
		/*
		 * while(objListIterator.hasNext()) { Integer x = objListIterator.next(); }
		 */

		System.out.print("First list via iterator in reverse direction: ");

		while (objListIterator.hasPrevious()) {
			System.out.print(objListIterator.previous() + " ");
		}
		System.out.print("\n");

		// Display last 2 elements of the first array list
		Integer size = objListFirst.size();
		ListIterator<Integer> objListIteratorFrom5 = objListFirst.listIterator(size - 2);

		System.out.print("Last two elements of the first array list via " + "iterator: ");
		while (objListIteratorFrom5.hasNext()) {
			System.out.print(objListIteratorFrom5.next() + " ");
		}
		System.out.print("\n");

		// Delete the first occurrence of 5 from the first list
		objListFirst.remove(5);
		System.out.println("The first array list after deleting first 5: " + objListFirst);

		// Delete all occurrence of 3 from the first list
		objListFirst.removeIf(n -> (n == 3));
		System.out.println("The first array list after deleting all 3: " + objListFirst);

		// Retain only those elements of the first list which are in
		// the second list
		objListFirst.retainAll(objListSecond);
		System.out.println(
				"Retain only those elements of the first list" + "which are in the second list: " + objListFirst);
		// Remove the second list of elements from the first list
		objListFirst.removeAll(objListSecond);
		System.out.println("The first list after removing all elements " + "of the second list : " + objListFirst);

		// Multiply 2 with each element of the first list
		objListFirst.add(5);
		objListFirst.add(7);
		objListFirst.replaceAll(n -> (n * 2));
		System.out.println("The first list after multiplying by 2: " + objListFirst);

		// Sublist
		List<Integer> objListSub = objListFirst.subList(0, 2);
		System.out.println("Sublist: " + objListSub);

		// Delete all the elements from the second list
		// objListSecond.clear();
	}

	public static void testLinkedListAdvanced() {
		// Create an instance of an ArrayList and view as a List
		List<Integer> objListFirst = new LinkedList<>();

		// Add first 5 prime numbers in the list in sequence
		objListFirst.add(2);
		objListFirst.add(3);
		objListFirst.add(5);
		objListFirst.add(7);
		objListFirst.add(11);

		// duplicate each item in the above list
		objListFirst.addAll(objListFirst);
		System.out.println("The list after duplicating: " + objListFirst);

		// delete all 2 and 3 from the above list
		objListFirst.removeIf((n) -> ((n == 2) || (n == 3)));
		System.out.println("The list after removing 2 and 3: " + objListFirst);
	}

	public static void testRemoveElements() {
		// Create Array List
		List<Integer> objArrayList = new ArrayList<>();

		// Adding objects in the Array list
		objArrayList.add(2);
		objArrayList.add(3);
		objArrayList.add(5);
		objArrayList.add(7);
		objArrayList.add(11);

		System.out.println("ArrayList: " + objArrayList);

		for (int i = 0; i < objArrayList.size(); i++) {
			objArrayList.remove(i);
		}

		System.out.println("The Arraylist after removing all elements: " + objArrayList);

		// Create Linked List
		List<Integer> objLinkedList = new LinkedList<>();

		// Adding objects in the Linked list
		objLinkedList.add(2);
		objLinkedList.add(3);
		objLinkedList.add(5);
		objLinkedList.add(7);
		objLinkedList.add(11);

		System.out.println("LinkedList: " + objLinkedList);

		for (int i = 0; i < objLinkedList.size(); i++) {
			objLinkedList.remove(i);
		}

		System.out.println("The Linkedlist after removing all elements: " + objLinkedList);

	}
}
