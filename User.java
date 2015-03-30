/*
 * User framework class.  Should be accesible throughout the project.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version version 1.0
 * @since version 1.0
 */
public class User{
	
	/// Grizzly ID integer value
	int grizzlyID;
	
	/// Name string value
	String name;
	
	/// Major string value
	String major;
	
	/// GPA double value
	double gpa;
	
	/// Thesis Grade double value
	double thesisGrade;
	
	/*
	 * Default constructor for a user object.  Requires a number of parameters, including Grizzly ID, Name, Major, GPA, And Thesis Grade.
	 * 
	 * @param grizzlyID Integer value
	 * @param name String name of user
	 * @param major String major of user
	 * @param gpa Double GPA of user
	 * @param thesisGrade Double thesis grade of user
	 * 
	 * @returns User Representing a student.
	 */
	public User(int grizzlyID, String name, String major, double gpa, double thesisGrade) {
		
		//Set all instance variables
		this.grizzlyID = grizzlyID;
		this.name = name;
		this.major = major;
		this.gpa = gpa;
		this.thesisGrade = thesisGrade;
		
	}
}