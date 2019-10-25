//factory and bridge pattern
//Abstract product of the factory method
import java.util.List;

public abstract class CourseMenu {
	public abstract void showMenu(Course selectedCourse);
	public abstract void showAddButton(Course selectedCourse, Assignment assignment);
	public abstract List<Assignment> showViewButton(Course selectedCourse);
	public abstract void showRadios(Course selectedCourse);
	public abstract void showComboxes(Course selectedCourse);
	public abstract void showLabel(Course selectedCourse);
}