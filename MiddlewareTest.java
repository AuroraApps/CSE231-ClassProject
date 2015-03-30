package edu.oakland.test;
import junit.framework.*;
import edu.oakland.production.*;
import edu.oakland.helper.*;
/**
*Constructs a linked list and tests said linked list. 
*I will comment stuff later
*@author Blair / Nicolas 
*@version "version 2.0"
*@since 150318
*/
public class MiddlewareTest extends TestCase{
	private StudentNodes newLink;
	private StudentList studentList;
	//private Database database;
	
	public void setUp(){
		//database = new Database(studentMajor, studentName, grizzID, gpa, thesisGrade, regOrder);
		 newLink = new StudentNodes();
		 studentList = new StudentList();
		 studentList.addToFront(10, 348689, "Grant", "CS", 3.88, 99);
		 studentList.addToFront(9, 348689, "Chamberlain", "CS", 3.99, 96);
		 studentList.addToFront(8, 348689, "O'Brien", "IT", 3.44, 85);
         studentList.addToFront(7, 348689, "Kominsky", "IT", 3.23, 70);
		 studentList.addToFront(6, 348689, "Hardy", "IT", 3.68, 99);
		 studentList.addToFront(5, 348689, "Rominske", "CS", 3.82, 79);
		 studentList.addToFront(4, 348689, "Brady", "CS", 3.77, 92);
		 studentList.addToFront(3, 348689, "Breaux", "CS", 3.95, 98);
		 studentList.addToFront(2, 348689, "Smith", "IT", 3.47, 78);
		 studentList.addToFront(1, 348689, "Jones", "IT", 3.82, 95);
		 
		//insert, find, remove middleware methods
		//database methods peak pop
		//njhalkey@oakland.edu 
		
	}
	
	public void testInsert(){
		assertEquals("Brady" , studentList.find("Brady"));
		studentList.printList();
	}
	
	public void testFind(){
		
	}
	
	public void testRemove(){
		
	}
}