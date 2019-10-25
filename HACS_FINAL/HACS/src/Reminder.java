//Visitor Pattern
//This class uses the NodeVisitor class to set reminders. 
public class Reminder {
	NodeVisitor Visitor = new ReminderVisitor();
	
	public void setReminder(Course course) {
		Visitor.visitFacade(course);
	}
}
