public class Solution {
	String name;

	public Solution(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		System.out.println("Solutions present..");
		return  name;
	}
}
