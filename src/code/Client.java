package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

	public static void main(String args[]) {

		Person p1 = new Person("Anders", "Halvorsen", "Male", 0234523452);
		Person p2 = new Person("Markus", "Dale", "Male", 234872983);
		Person p3 = new Person("Henriette", "Svalestad", "Female", 273949932);
		Person p4 = new Person("Lars", "Monsen", "Male", 1239834234);
		Person p5 = new Person("Mats", "Hansen", "Male", 234908345);
		Person p6 = new Person("Kjersti", "Berg", "Female", 394532344);
		Person p7 = new Person("Julie", "Juletre", "Female", 894563341);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p7);

		
		System.out.println();
		System.out.println();

		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		
		list 
			.stream()
			.filter(s -> s.getFirstName().length() < 6)
			.forEach(System.out::println);
				

	}
}
