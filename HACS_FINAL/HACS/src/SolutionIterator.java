//Iterator Pattern 
//Overrides the methods of the parent class List Iterator and is utilised by Solution list class. 
public class SolutionIterator {
	
	
	public boolean hasNext(int i)
	{
		return i < 3? true : false;
	}
	public int next(int i)
	{
		return i++;
	}
}
