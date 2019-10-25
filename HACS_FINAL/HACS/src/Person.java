//Factory and Bridge Pattern 
//This class is involved in bridge pattern to show the menu and in factory pattern to show the menu object. It has no idea about the high level or low level menus. 
import java.util.ArrayList;
import java.util.List;

public abstract class Person {
	Integer userType;
	String username;
	List<Course> theCoursesList = new ArrayList<>();
	CourseMenu courseMenu;

	public abstract Course showMenu(String course);
	public abstract void createCourseMenu(int courseLevel);
	public abstract List<Assignment> getAssignments(Course selectedCourse);
	public abstract void showRadioButtons(Course selectedCourse);
	public abstract void showLabels(Course selectedCourse);
	public abstract void ShowAddButton(Course selectedCourse, Assignment assignment);
	public abstract void submitSolution(Course course, Assignment assignment, Solution solution);
	public abstract List<Solution> viewSolution(Course selectedCourse, Assignment assignment);
	
	public CourseMenu getCourseMenu() {
		return courseMenu;
	}

	public void setCourseMenu(CourseMenu courseMenu) {
		this.courseMenu = courseMenu;
	}

	public List<Course> getCourseList() {
		return theCoursesList;
	}

	public void setCourseList(List<Course> courseList) {
		this.theCoursesList = courseList;
	}

	public String getUsername() {
		return username;
	}

	public void setName(String username) {
		this.username = username;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "Person [userType=" + userType + ", username=" + username + ", courseList=" + theCoursesList
				+ "]";
	}
	
}
