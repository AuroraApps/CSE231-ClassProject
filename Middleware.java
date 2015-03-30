//Import java util framework
import java.util.*;

//MAKE SURE TO IMPORT THE USER CLASS PACKAGE

/*
 * Middleware class for CSE231 class project.  Requires import of User class.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version version 1.0
 * @since version 1.0
 */
public class Middleware {
	
	/// Temporary stack of users to be sent to the database.
	private Stack users = new Stack();
	
	/*
	 * Default constructor for the Middleware Class.  Not needed in this specific task.
	 * 
	 * @returns Middleware
	 */
	public Middleware(){
		//Any cunstruction goes here.
	}	
	
	/*
	 * Method adds a user to a temporary private stack within midleware, called users.  Does NOT add a user to the database.
	 * 
	 * @param grizzlyID Integer value
	 * @param name String name of user
	 * @param major String major of user
	 * @param gpa Double GPA of user
	 * @param thesisGrade Double thesis grade of user
	 */
	public void createUser(int grizzlyID, String name, String major, double gpa, double thesisGrade){
		
		// Create a user object.
		User user = new User(grizzlyID, name, major, gpa, thesisGrade);
		// Add the user to the private users stack.
		users.push(user);
	}
		
}