//Iterator pattern 
//Has methods which are overridden by the child classes - CourseIterator and SolutionIterator
public abstract class ListIterator {
	public abstract boolean hasNext(int i);
	public abstract int next(int i);
}
