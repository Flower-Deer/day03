package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 동등객체2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set_ = new HashSet<Person>();
		set_.add(new Person("010-1234-1234", "홍길동", 1));
		set_.add(new Person("010-1234-1234", "홍길동2", 1));
		set_.add(new Person("010-1234-1234", "홍길동3", 1));
		set_.add(new Person("010-1234-1234", "홍길동", 2));
		set_.add(new Person("010-1234-1234", "홍길동", 3));
		set_.add(new Person("010-1234-1234", "홍길동", 4));
		
		Iterator<Person> it = set_.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
class Person{
	
	String tel;
	String name;
	int total;
	
	public Person(String tel, String name, int total) {
		super();
		this.tel = tel;
		this.name = name;
		this.total = total;
	}
	@Override
	public String toString() {
		return "Person [tel=" + tel + ", name=" + name + ", total=" + total + "]";
	}
	
	@Override
	public int hashCode() {
	
		return name.hashCode() + tel.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof Person) {
			Person person = (Person)obj;
			return person.tel.equals(tel) && person.name.equals(name);
		}
		return false;
	}
}