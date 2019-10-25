import java.util.ArrayList;
import java.util.List;

public class Assignment {
	String assignmentName;
	String deadLine;
	List<Solution> solutionList;
	Reminder reminder;
	
	public Assignment() {
		}
	
	public Assignment(String assignmentName, String date) {
		super();
		this.assignmentName = assignmentName;
		this.solutionList = new ArrayList<>();
		this.deadLine = date;
	}
	
	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}
	
	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public List<Solution> getSolutionList() {
		return solutionList;
	}

	public void setSolutionList(List<Solution> solutionList) {
		this.solutionList = solutionList;
	}

	@Override
	public String toString() {
		return assignmentName;
	}
}
