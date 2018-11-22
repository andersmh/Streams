package code;

import java.util.List;

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

		List<Person> p = null;
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		p.add(p7);

	}
}
