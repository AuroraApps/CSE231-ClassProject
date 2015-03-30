package edu.oakland.helper;
import java.util.*;
import edu.oakland.helper.*;
//I will comment stuff later
public class StudentList extends LinkedList{ 

public StudentNodes head;

	public StudentList(){
		head = null;
	}
	
	public boolean isEmpty(){
		
	return (head == null);
	
	}

	public void addToFront(int regOrder, int grizzID, String studentName, String studentMajor, double gpa, int thesisGrade){
	StudentNodes newLink = new StudentNodes(regOrder, grizzID, studentName, studentMajor, gpa, thesisGrade);
		
		newLink.next = head;
		
		head = newLink;
		
	}

	public StudentNodes removeStudent(){
		StudentNodes lastStudent = head;
		if(!isEmpty()){
			lastStudent = lastStudent.next;
		}else{
			System.out.println("The List is currently empty");
		}return lastStudent;
	}
	
	public void printList(){
		StudentNodes studentLink = head;
		while(studentLink != null){
			
			studentLink.display();
			
			System.out.println("Next Student: " + studentLink.next);
			
			studentLink = studentLink.next;
			
			System.out.println();
		}
	}
	
	public String find(String studentName){
		StudentNodes studentLink = head;
		if(!isEmpty()){
			while(studentLink.studentName != studentName){
				if(studentLink.next == null){
					return null;
				}else{
					studentLink = studentLink.next;
				}
			}
		}else{
			System.out.println("The List is currently empty");
		}
		return studentName;
	}
}	