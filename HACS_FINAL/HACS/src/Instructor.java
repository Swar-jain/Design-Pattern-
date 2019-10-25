//Factory and bridge pattern
//the concrete implementation of the person class 
import java.util.List;

public class Instructor extends Person {

	@Override
	public Course showMenu(String courseName) {
		Course selectedCourse = null;
		for(Course course : this.theCoursesList) {
			if(course.courseName.equals(courseName))
				selectedCourse = course;
		}
		if(selectedCourse == null)
			return selectedCourse;
		
		createCourseMenu(selectedCourse.courseLevel);
		return selectedCourse;
	}
	
	@Override
	public void createCourseMenu(int courseLevel) {
		if(courseLevel == 0)
			this.courseMenu = new HighLevelCourseMenu();
		else
			this.courseMenu = new LowLevelCourseMenu();
	}
	
	@Override
	public List<Assignment> getAssignments(Course selectedCourse) {
		List<Assignment> assignment = this.courseMenu.showViewButton(selectedCourse);
		return assignment;
	}
	
	@Override
	public void showRadioButtons(Course selectedCourse) {
		//this.courseMenu.showRadios(selectedCourse);
	}

	@Override
	public void showLabels(Course selectedCourse) {
		//this.courseMenu.showLabel(selectedCourse);
	}

	@Override
	public void ShowAddButton(Course selectedCourse, Assignment assignment) {
		this.courseMenu.showAddButton(selectedCourse, assignment);
		showRadioButtons(selectedCourse);
		showLabels(selectedCourse);
	}

	@Override
	public void submitSolution(Course course, Assignment assignment, Solution solution) {
		
	}

	@Override
	public List<Solution> viewSolution(Course selectedCourse, Assignment assignment) {
		return null;
	}	
}
