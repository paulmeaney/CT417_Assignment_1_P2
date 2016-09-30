package part2;

import part1.CourseProgram;
import part1.Module;

public class CoursePopulator {

	public static void main(String[] args) {
		CourseProgram swEng = new CourseProgram("Software Engineering", 2016, 9, 1, 2017, 5, 30);
		
		Module m1 = new Module("Programming", "CT417");
		Module m2 = new Module("Maths", "MT434");
		Module m3 = new Module("Java", "AM976");
		Module m4 = new Module("Development", "DY481");

	}

}
