package treeSetDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CricketerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer c1 = new Cricketer("Virat Kohli", 500.0, true);
		Cricketer c2 = new Cricketer("Dhoni", 700.0, true);
		Cricketer c3 = new Cricketer("Rohit Sharma", 300.0, false);
		Cricketer c4 = new Cricketer("Hardik Pandya", 600.0, false);
		Cricketer c5 = new Cricketer("Jasprit Bumrah", 200.0, false);
		Cricketer c6 = new Cricketer("Sachin Tendulkar", 800.0, true);
		Cricketer c7 = new Cricketer("Sourav Ganguly", 900.0, true);
		Cricketer c8 = new Cricketer("V.V.S.Lakshman", 400.0, false);
		Cricketer c9 = new Cricketer("Rahul Dravid", 100.0, false);
		Cricketer c10 = new Cricketer("Dhoni", 700.0, true);
		Set<Cricketer> cricketerSet = new TreeSet<Cricketer>();
		cricketerSet.add(c1);cricketerSet.add(c2);cricketerSet.add(c3);
		cricketerSet.add(c4);cricketerSet.add(c5);cricketerSet.add(c6);
		cricketerSet.add(c7);cricketerSet.add(c8);cricketerSet.add(c9);
		cricketerSet.add(c10);
		
		System.out.println(cricketerSet.size());
		
		Iterator<Cricketer> iterator = cricketerSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
