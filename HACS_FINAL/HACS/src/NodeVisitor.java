//Visitor 
//The abstract class of visitor, the implementation is done in concrete visitor classes. 
public abstract class NodeVisitor {
	public abstract void visitFacade(Course course);
	public abstract void visitCourse(Course course);
	public abstract void visitAssignment(Assignment assignment);
}