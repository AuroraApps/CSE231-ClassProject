package edu.oakland.helper;
import java.util.*;
import edu.oakland.helper.*;
//I will comment stuff later
public class StudentNodes{
	public String studentMajor;
	public String studentName;
	public int grizzID; 
	public int thesisGrade;
	public int regOrder;
	public double gpa;
	
	public StudentNodes next;
	
	public StudentNodes(){
		
	}

	public StudentNodes(int regOrder, int grizzID, String studentName, String studentMajor, double gpa, int thesisGrade){
		this.studentName = studentName;
		this.grizzID = grizzID;
		this.studentName = studentName;
		this.studentMajor = studentMajor;
		this.gpa = gpa;
		this.thesisGrade = thesisGrade;
		this.regOrder = regOrder;
	}
	
	public void display(){
		
		System.out.println(regOrder + "  " + grizzID + "  " + studentName + "  " + studentMajor + "  " + gpa + "  " + thesisGrade);
		
		}
		
	public String toString(){
		return studentName;
	}
}
