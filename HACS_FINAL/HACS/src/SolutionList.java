//This class has the other possible solutions available and prints by accessing methods of the solution iterator class. 
import java.util.ArrayList;

@SuppressWarnings({ "serial", "rawtypes" })
public class SolutionList extends ArrayList{
	private String[] solution = {"sol1", "sol2", "sol3"};
	private int i = 0;
	SolutionIterator solutionIterator = new SolutionIterator();
	
	public void Print()
	{
		while(solutionIterator.hasNext(i)!= false){
			System.out.println(solution[solutionIterator.next(i)]);
			i++;
		}
		
	}
	
	

}
