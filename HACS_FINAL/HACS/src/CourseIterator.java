//Iterator pattern
//Overrides the functions of the parent class and is used by the ClassCourseList class to display the departments available to the user. 
public class CourseIterator extends ListIterator{
	public boolean hasNext(int i)
	{
		return i < 3? true : false;
	}
	public int next(int i)
	{
		return i++;
	}
	
}
