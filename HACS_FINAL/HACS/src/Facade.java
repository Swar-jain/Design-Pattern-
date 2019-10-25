
import java.util.List;
/*The façade pattern can make the task of accessing a large number of modules much simpler by providing an additional interface layer. */

public class Facade {
	Integer userType;
	Course selectedCourse;
	Integer courseLevel;
	List<Course> courseList;
	Person person;
	
	public Integer getUserType() {
		return userType;
	}

	public Course getSelectedCourse() {
		return selectedCourse;
	}

	public Integer getCourseLevel() {
		return courseLevel;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public Person getPerson() {
		return person;
	}
     /* Facade accesses login class */
	public boolean login(String name, String password) {
		Login login = new Login();
		int loginInfo = login.login(name, password);
		if(loginInfo == 0) {
			this.userType = 0;
			person = new Student();
			person.setName(name);
			person.setUserType(0);
			return true;
		}
		else if(loginInfo == 1) {
			this.userType = 1;
			person = new Instructor();
			person.setName(name);
			person.setUserType(1);
			return true;
		}
		return false;
	}
	
	/* Facade accesses CourseDetails class */
	public List<Course> createCourseList() {
		CourseDetails courseDetails = new CourseDetails();
		this.courseList = courseDetails.getAllCourses();
		return this.courseList;
	}
	
	public void CourseTakenByUser() {
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.getCourseDetails(person);
	}
	
	public Course selectCourse(String choice) {
		return this.person.showMenu(choice);
	}
	
	/* Facade accesses AssignmentMenu class */
	public List<Assignment> viewAssignment(Course selectedCourse) {
		return this.person.getAssignments(selectedCourse);
	}
	
	public void addAssignment(Course selectedCourse, Assignment assignment) {
		if(this.userType==1)
		   this.person.ShowAddButton(selectedCourse, assignment);
	}
	
	public void showRadioButtons(Course selectedCourse) {
		this.person.showRadioButtons(selectedCourse);
	}
	public void viewButtons(Course selectedCourse) {
		this.person.showRadioButtons(selectedCourse);
	}
	
	public void showLabels(Course selectedCourse) {
		this.person.showLabels(selectedCourse);
	}
    
	/* Facade accesses SolutionMenu class */
	public void submitSolution(Course course, Assignment assignment, Solution solution) {
		this.person.submitSolution(course, assignment, solution);
	}

	public List<Solution> viewSolution(Course selectedCourse, Assignment assignment) {
		return this.person.viewSolution(selectedCourse, assignment);
	}
	
	/* Facade accesses classes in visitor pattern */
	public void remind(Course course) {
		Reminder reminder = new Reminder();
		reminder.setReminder(course);
	}
	/* Facade accesses classes in the iterator pattern. */
	public void listOtherSolutions(){
		SolutionList solList = new SolutionList();
		solList.Print();
		
	}
	
	public void listAllDept(){
		ClassCourseList c = new ClassCourseList();
		c.Print();
		
	}
	
}
