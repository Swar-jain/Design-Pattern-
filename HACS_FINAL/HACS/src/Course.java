import java.util.ArrayList;
import java.util.List;

public class Course {
	String courseName;
	Integer courseLevel;
	List<Assignment> assignments;
	
	Course() {
		this.assignments = new ArrayList<>();
	}
	
	Course(String name, Integer courseLevel) {
		this.courseName = name;
		this.courseLevel = courseLevel;
		this.assignments = new ArrayList<>();
	}
	
	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	
	public Integer getCourseLevel() {
		return courseLevel;
	}
	
	public void setCourseLevel(Integer courseLevel) {
		this.courseLevel = courseLevel;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return  courseName;
	}
}
