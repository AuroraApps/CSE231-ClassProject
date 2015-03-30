package edu.oakland.helper;
import edu.oakland.production.*;
import edu.oakland.test.*;
import junit.framework.*;
import java.util.*;

public class DummyDataBase{
	
	public void insertStudent(){
		System.out.println("The insert method was called.");
	}
	
	public void findStudent(){
		System.out.println("The find method was called.");
	}
	
	public void removeStudent(){
		System.out.println("The remove method was called.");
	}
	
}
