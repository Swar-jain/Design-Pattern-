import java.util.ArrayList;
import java.util.List;

public class CourseDetails {
	public void getCourseDetails(Person person) {
		String userName = person.getUsername();
		Course course1 = new Course("CSE870", 1);
		Course course2 = new Course("CSE880", 1);
		Course course3 = new Course("CSE890", 0);
		List<Course> courseList = new ArrayList<>();
		if(userName.equals("pepe")) {
			courseList.add(course1);
			courseList.add(course2);
			person.theCoursesList = courseList;
		}
		else if(userName.equals("yaya")) {
			courseList.add(course1);
			courseList.add(course3);
			person.theCoursesList = courseList;
		}
		else if(userName.equals("yape")) {
			courseList.add(course2);
			courseList.add(course3);
			person.theCoursesList = courseList;
		}
		else if(userName.equals("Inst1")) {
			courseList.add(course1);
			courseList.add(course2);
			courseList.add(course3);
			person.theCoursesList = courseList;
		}
	}
	
	public List<Course> getAllCourses() {
		Course course1 = new Course("CSE870", 1);
		Course course2 = new Course("CSE880", 1);
		Course course3 = new Course("CSE890", 0);
		List<Course> courseList = new ArrayList<>();
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		return courseList;
	}
}