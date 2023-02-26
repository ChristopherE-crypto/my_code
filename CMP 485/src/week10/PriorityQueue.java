package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Student {
	
	int id;
	String name;
	double cgpa;
	
	public Student(int id, String name, double cgpa) {
		
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getID() {
		
		return this.id;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public double getCGPA() {
		
		return this.cgpa;
	}
	
	@Override
	public String toString() {
		
		return this.getName() + " " + this.getCGPA() + " " + this.getID();
	}

	public int compareCGPA(Student s) {
		
		if(this.getCGPA() > s.getCGPA()) {
			
			return 1;
		}
		else if(this.getCGPA() < s.getCGPA()) {
			
			return -1;
		}
		else {
			
			return 0;
		}
	}
	
	public int compareName(Student s) {
		
		return this.getName().compareTo(s.getName());
	}
	
	public int compareID(Student s) {
		
		if(this.getID() > s.getID()) {
			
			return 1;
		}
		else if(this.getID() < s.getID()) {
			
			return -1;
		}
		else {
			
			return 0;
		}
	}
}

class Priorities {
	
	public List<Student> getStudents(List<String> events){
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		for(int i = 0; i < events.size(); i++) {
			
			if(events.get(i).charAt(0) == 'E') {
				
				String line = events.get(i).substring(6);
				
				String [] info = line.split(" ");
				
				students.add(new Student(Integer.valueOf(info[2]), info[0], Double.valueOf(info[1])));
			}
			
			if(events.get(i).equals("SERVED")) {
				
			}
		}
		
		
			
		
		return students;
		
	}
}

public class PriorityQueue {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		ArrayList<String> events = new ArrayList<String>();
		
		String num = scnr.nextLine();
		
		int n = Integer.valueOf(num);
		
		int i = 0;
		
		while(i < n) {
			
			String event = scnr.nextLine();
			
			events.add(event);
			
			i++;
		}
		
		System.out.println(events.toString());
		
		Priorities p = new Priorities();
		
		ArrayList<Student> students = (ArrayList<Student>) p.getStudents(events);
		
		System.out.println(students.toString());

	}

}
