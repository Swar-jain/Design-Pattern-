//factory and bridge pattern
//a subclass of the CourseMenu, which is a concrete product. 
import java.util.List;

public class HighLevelCourseMenu extends CourseMenu {

	@Override
	public void showMenu(Course selectedCourse) {
		System.out.println("Show menu of Highlevel course");
	}

	@Override
	public void showAddButton(Course selectedCourse, Assignment assignment) {
		System.out.println("Show add button of Highlevel course");
		List<Assignment> assignmentList = selectedCourse.getAssignments();
		assignmentList.add(assignment);
		selectedCourse.setAssignments(assignmentList);
	}

	@Override
	public List<Assignment> showViewButton(Course selectedCourse) {
		System.out.println("Show view button of Highlevel course");
		List<Assignment> assignmentList = selectedCourse.getAssignments();
		return assignmentList;
	}

	@Override
	public void showRadios(Course selectedCourse) {
		System.out.println("Show radios of Highlevel course");
	}

	@Override
	public void showComboxes(Course selectedCourse) {
		System.out.println("Show comboxes of Highlevel course");
	}

	@Override
	public void showLabel(Course selectedCourse) {
		System.out.println("Show label of Highlevel course");
	}
}
