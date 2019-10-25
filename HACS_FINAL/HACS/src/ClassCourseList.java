//This class specifies the other departments available and uses the CourseIterator class's methods to print the list of departments. 
public class ClassCourseList extends ArrayList {
	private String[] department = {"CSE", "IT", "EEE"};
	private int i = 0;
	CourseIterator courseIterator = new CourseIterator();
	
	public void Print()
	{
		while(courseIterator.hasNext(i)){
			System.out.println(department[courseIterator.next(i)]);
			i++;
		}
		
	}
	
}
