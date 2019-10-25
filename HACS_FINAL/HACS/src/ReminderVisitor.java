//Visitor Pattern
//
import java.util.List;

public class ReminderVisitor extends NodeVisitor {
    //this function visits every course. 
	@Override
	public void visitFacade(Course course) {
			visitCourse(course);
		
	}
     //Visiting every assignment in the course 
	@Override
	public void visitCourse(Course course) {
		List<Assignment> assignmentList = course.getAssignments();
		for(Assignment a : assignmentList) {
			visitAssignment(a);
		}
	}
	
	//Visits the assignment and gives reminder
	@Override
	public void visitAssignment(Assignment assignment) {
			System.out.println(assignment.getAssignmentName() + " is due in " + assignment.getDeadLine());
		
	}
}
