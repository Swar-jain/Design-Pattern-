//Bridge and factory pattern used here. 
//a subclass of the CourseMenu, which is a concrete product. 
import java.util.List;

public class LowLevelCourseMenu extends CourseMenu {

	@Override
	public void showMenu(Course selectedCourse) {
		System.out.println("Show menu of Lowlevel course");
	}

	@Override
	public void showAddButton(Course selectedCourse, Assignment assignment) {
		System.out.println("Show add button of Lowlevel course");
		List<Assignment> assignmentList = selectedCourse.getAssignments();
		assignmentList.add(assignment);
		selectedCourse.setAssignments(assignmentList);
	}

	@Override
	public List<Assignment> showViewButton(Course selectedCourse) {
		System.out.println("Show view button of Lowlevel course");
		List<Assignment> assignmentList = selectedCourse.getAssignments();
		return assignmentList;
	}

	@Override
	public void showRadios(Course selectedCourse) {
		System.out.println("Show radios of Lowlevel course");
	}

	@Override
	public void showComboxes(Course selectedCourse) {
		System.out.println("Show comboxes of Lowlevel course");
	}

	@Override
	public void showLabel(Course selectedCourse) {
		System.out.println("Show label of Lowlevel course");
	}
}
