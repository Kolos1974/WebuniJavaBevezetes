package edu.evacodekitchen.javabasics.tostring;

public class InheritanceFromObjectDemo {
	public static void main(String[] args) {
//		Person person = new Person();
		Person person = new Person("Kiss Géza", 1980);
		person.birthYear = 1900;
		person.name = "Joe";
		System.out.println(person);
	}
}
