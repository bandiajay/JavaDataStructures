package hashSetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ActressDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actress a1 = new Actress("JayaSudha", 100.0, true);
		Actress a2 = new Actress("JayaPrada", 300.0, true);
		Actress a3 = new Actress("JayaLalitha", 500.0, true);
		Actress a4 = new Actress("JayaVijaya", 600.0, true);
		Actress a5 = new Actress("JayaMalini", 800.0, true);
		Actress a6 = new Actress("Janaki", 200.0, true);
		Actress a7 = new Actress("Jamuna", 400.0, true);
		Actress a8 = new Actress("Jhansi", 300.0, false);
		Actress a9 = new Actress("Jyothi", 300.0, false);
		Actress a10 = new Actress("Janaki", 200.0, true);

		Set<Actress> actressSet = new HashSet<Actress>();
		actressSet.add(a1);actressSet.add(a2);actressSet.add(a3);
		actressSet.add(a4);actressSet.add(a5);actressSet.add(a6);
		actressSet.add(a7);actressSet.add(a8);actressSet.add(a9);
		actressSet.add(a10);
		
		System.out.println(actressSet.size());
		
		Iterator<Actress> iterator = actressSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
