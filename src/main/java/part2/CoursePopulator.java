package part2;

import java.util.ArrayList;
import java.util.Random;

import part1.CourseProgram;
import part1.Module;
import part1.Student;

public class CoursePopulator {
	

	public static void main(String[] args) {
		CourseProgram swEng = new CourseProgram("Software Engineering", 2016, 9, 1, 2017, 5, 30);
		
		Module m1 = new Module("Programming", "CT417");
		Module m2 = new Module("Maths", "MT434");
		Module m3 = new Module("Java", "AM976");
		Module m4 = new Module("Development", "DY481");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		for (int i = 0; i <100; i++){
			studentList.add(new Student(nameGen(), dateGen(), (int)(Math.random()*100000)));
		}
		for (int i = 0; i<25; i++){
			m1.addStudent(studentList.remove(0));
		}
		for (int i = 0; i<25; i++){
			m2.addStudent(studentList.remove(0));
		}
		for (int i = 0; i<25; i++){
			m3.addStudent(studentList.remove(0));
		}
		for (int i = 0; i<25; i++){
			m4.addStudent(studentList.remove(0));
		}
		
		swEng.addModule(m1);
		swEng.addModule(m2);
		swEng.addModule(m3);
		swEng.addModule(m4);
		
		swEng.printRegister();
		
		
		
		
		}
	
		public static String nameGen(){  //Method generates random names from a list of First names and surnames
			String[] firstnames = {"Brian ", "John ", "Aoife ", "Cosmic ", "Peter ", "Louise ", "Kate ", "Lucy ", "Frank ", "Sean ", "Eoghan ", "Bill ", 
					"Seamus ", "Samuel ", "Petrol "};
			
			String[] surnames = {"Beckham", "Stevens", "Hamilton", "Hendrix", "Peterson", "O'Brien", "McCormack", "McNulty", "O'Connor", "Lernihan",
					"Leonard", "Fromage", "Paul", "Gates", "West"};
			
			int rand = (int)(Math.random()*100);
			
			while (rand>=15 ) {
				rand = (int)(Math.random()*100); 
			}
			
			String fname = firstnames[rand];
			
			
			rand = (int)(Math.random()*100);
			while (rand>=15) {
				rand = (int)(Math.random()*100); 
			}
		
			String lname = surnames[rand];
			
			
			return fname + lname;
		}
		
	
		private static String dateGen(){  //Method generates a random date of birth
			
			Random r = new Random();
			int  day, month, year;
			String dayop, monthop, yearop;
			
			int rand = r.nextInt(29)+1;
			
			day = rand;
			
			
			rand = r.nextInt(11)+1;
			while (rand == 0 || rand > 12){
				rand = (int)Math.random()*100;
			}
			month = rand;
			
			rand = (int)Math.random()*10000;
			while (rand < 1920 || rand > 2005){
				rand = (int)(Math.random()*10000);
			}
			year = rand;
			
			if (month == 02 && day > 28)
				day = 28;
			
			if(day<10)
				dayop = "0" + Integer.toString(day);
			else
				dayop = Integer.toString(day);
			
			if(month<10)
				monthop = "0" + Integer.toString(month);
			else
				monthop = Integer.toString(month);
			
			yearop = Integer.toString(year);		
			String outputDate = dayop + "/" + monthop + "/" + yearop;

			return outputDate;
			
		}
		
		

}


