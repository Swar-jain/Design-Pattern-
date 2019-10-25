//Homework assignment, distribution and collection system
//There are 4 users : Username = pepe, Password = 1111; Username = yaya, Password = 2222; Username = yape, password = 3333; Inst1 = 1111

import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		boolean login = false;
		Facade facade = new Facade();
		
		//Welcome Message
		System.out.println("HOMEWORK ASSIGNMENT, DISTRIBUTION AND COLLECTION SYSTEM");
		System.out.println("========================================================");
		Scanner scanner = new Scanner(System.in);
			
		//Login, facade class accesses this
		System.out.println("Enter your username : ");
		String username = scanner.nextLine();
		System.out.println("Enter your password :");
		String password = scanner.nextLine();
		login = facade.login(username, password);
		if(login){
			System.out.println("Login Sucessful!!!");
			System.out.println("Hi " + username + "!");
		}
		else
			System.out.println("Login failed! Please try again");
		
		System.out.println("Departments available");
		//Lists all departments using iterator design pattern
		facade.listAllDept();
		
		
		//Listing all courses available 
		List<Course> Courses = facade.createCourseList();
		facade.CourseTakenByUser();
		System.out.println("List of all courses available for this semester...");
		System.out.println("==================================================");
		for(Course c : Courses)
			System.out.println(c);
		System.out.println("==================================================");
		
		
		//Listing courses taken by a particular person
		System.out.println("Courses taken by " + facade.person.username);
		for(Course c : facade.person.theCoursesList)
			System.out.println(c);
		
		//Ask the course which the user wants to see
		Course inputCourse = null;
		while(inputCourse == null) {
			System.out.println("Select a course for which you want to see the option for");
			String choice = scanner.nextLine();
			inputCourse = facade.selectCourse(choice);
		}
		
		
		String date1 = "17th October 2019";
		String date2 = "20th October 2019";
		Assignment A1 = new Assignment("Assignment1", date1);
		Assignment A2 = new Assignment("Assignment2", date2);
		inputCourse.assignments.add(A1);
		inputCourse.assignments.add(A2);
		
		
		String input = "1";
		//Factory and bridge pattern is utilized here
		//prints data as required by the choice made by user 
		while(!input.equals("q")) {
			//For the student
			if(facade.person.userType.equals(0)) {
				System.out.println("1 - View Assignemnt\n2 - Submit Solution\n3 - View Solution\n4 - Quit");
				input = scanner.nextLine();
				if(input.equals("1")) {
					 					//View Assignment 
										List<Assignment> assignmentList = facade.viewAssignment(inputCourse);
										facade.showLabels(inputCourse);
										if(assignmentList != null) {
											            System.out.println("Assignments for this subject : ");
														for(Assignment assignment : assignmentList)
																			System.out.println(assignment);
														//Iterator pattern
														System.out.println("Do you want to see the solutions available?");
														facade.listOtherSolutions();
														System.out.println("REMINDER!!");
														//visitor pattern is used here
														facade.remind(inputCourse);
													}
													else
														System.out.println("No assignments");
									  }
				else if(input.equals("2")){
											//Submit Solution
											
											List<Assignment> assignmentList = facade.viewAssignment(inputCourse);
											if(assignmentList != null) {
														facade.showRadioButtons(inputCourse);
														System.out.println("Assignments for this subject : ");
											for(Assignment assignment : assignmentList)
														System.out.println(assignment);
											System.out.println("Select assignment for which you want to submit solution");
											String assignmentSol = scanner.nextLine();
											Assignment newAssignment = null;
											for(Assignment assignment : assignmentList) {
													if(assignment.assignmentName.equals(assignmentSol))
														newAssignment = new Assignment(assignmentSol, assignment.getDeadLine());
											}
											if(newAssignment == null) {
													System.out.println("Please enter a valid assignment name");
											}
											else {
													System.out.println("Enter solution name");
													String Input = scanner.nextLine();
													Solution solution = new Solution(Input);
													facade.submitSolution(inputCourse, newAssignment, solution);
											}
											}
											else
													System.out.println("No assignments");
										}
				else if(input.equals("3")){
											//View Solution
											List<Assignment> assignmentList = facade.viewAssignment(inputCourse);
											if(assignmentList != null) {
													for(Assignment assignment : assignmentList)
															System.out.println(assignment);
													System.out.println("Select assignment for which you want to view solutions submitted");
													String assignmentSol = scanner.nextLine();
													Assignment newAssignment = null;
													for(Assignment assignment : assignmentList) {
														if(assignment.assignmentName.equals(assignmentSol))
																newAssignment = new Assignment(assignmentSol,assignment.getDeadLine());
											}
							
											if(newAssignment == null) {
													System.out.println("Please enter a valid assignment name");
											}
											else {
												List<Solution> solList = facade.viewSolution(inputCourse, newAssignment);
												for(Solution sol : solList)
															System.out.println(sol);

												
												
											}
											}				
				  						}
					
			else if(input.equals("4"))
				                    //Quit
									break;
			}
			
			//For the Teacher
			if(facade.person.userType.equals(1)){
										System.out.println("1 - Add Assignment\n2 - View Assignemnt\n3 - Solutions Submitted\n4 - Quit");
										input = scanner.nextLine();
										if(input.equals("1")) {
													//Add Assignment
													facade.showRadioButtons(inputCourse);
													System.out.println("Enter the name of the assignment");
													String assignmentName = scanner.nextLine();
													System.out.println("Enter deadline for submission");
													String date = scanner.nextLine();
													Assignment assignment = new Assignment(assignmentName, date);
													facade.addAssignment(inputCourse, assignment);
													List<Course> course = facade.getCourseList();
													for(Course c : course ){
														if(c.courseName.equals(inputCourse.courseName)) {
																					c.assignments.add(assignment);
														}
													}
								 
							}
				else if(input.equals("2")) {
					 								//View Assignment
													facade.viewButtons(inputCourse);
													List<Assignment> assignmentList = facade.viewAssignment(inputCourse);
													if(assignmentList != null) {
																for(Assignment assignment : assignmentList)
																					System.out.println(assignment);
													}
													else
														System.out.println("No assignments");
													}
				else if(input.equals("3")) {
											//View solutions 
												System.out.println("Submissions so far..");
												facade.listOtherSolutions();
						
					}
			    else if(input.equals("4"))
									break; //Quit
											}
				}
		
		scanner.close();
	}
	
}
