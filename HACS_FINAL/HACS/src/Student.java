//Factory and Bridge pattern
// concrete implementation of the person class. 
import java.util.List;

public class Student extends Person {

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
		if(courseLevel == 1)
			this.courseMenu = new HighLevelCourseMenu();
		else
			this.courseMenu = new LowLevelCourseMenu();
	}
	
	@Override
	public List<Assignment> getAssignments(Course selectedCourse) {
		return this.courseMenu.showViewButton(selectedCourse);
	}
	
	@Override
	public void showRadioButtons(Course selectedCourse) {
		this.courseMenu.showRadios(selectedCourse);
	}

	@Override
	public void showLabels(Course selectedCourse) {
		this.courseMenu.showLabel(selectedCourse);
	}

	

	@Override
	public void submitSolution(Course course, Assignment assignment, Solution solution) {
		List<Assignment> assignmentList = course.getAssignments();
		for(Assignment newAssignment : assignmentList) {
			if(newAssignment.assignmentName.equals(assignment.assignmentName)) {
				newAssignment.solutionList.add(solution);
			}
		}
	}

	@Override
	public List<Solution> viewSolution(Course course, Assignment assignment) {
		List<Assignment> assignmentList = course.getAssignments();
		for(Assignment newAssignment : assignmentList) {
			if(newAssignment.assignmentName.equals(assignment.assignmentName)) {
				return newAssignment.getSolutionList();
			}
		}
		return null;
	}

	@Override
	public void ShowAddButton(Course selectedCourse, Assignment assignment) {
		// TODO Auto-generated method stub
		
	}
}

