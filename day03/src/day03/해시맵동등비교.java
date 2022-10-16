package day03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵동등비교 {

	public static void main(String[] args) {
		 Map<Student, Integer> map = new Hashtable<Student, Integer>();
		 map.put(new Student(11, "홍길동"), 95);
		 map.put(new Student(22, "이순신"), 100);
		 map.put(new Student(33, "홍길동"), 90);
		 map.put(new Student(44, "최길동"), 95);
		 map.put(new Student(22, "이순신"), 80);
		 map.put(new Student(22, "이순신"), 70);
		 
		 Set<Student>  set = map.keySet();
		 Iterator<Student> it = set.iterator();
		 while(it.hasNext()) {
			Student key =  it.next();
			System.out.println( key + "  -  " + map.get(key) );
		 }
           
	}

}

class Student{
	int sno;
	String name;
	
	public Student(int sno, String name) {
		
		this.sno = sno; //학번
		this.name = name; //이름
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sno + "  " + name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student   ) {
		   Student s	= (Student) obj;
		   return name.equals(s.name) && sno==s.sno;
		} else {
			return false;
		}
		
	}
	
}
