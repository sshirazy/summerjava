package entities;

import java.util.*;

public class Professor extends Person{
	
	private Map <Integer, Course> _courses; //list of courses and the year he taught them
	private String _note; //if there is any special quality
	
	
	public Professor () //initializing
	{
		super ();
		_courses = new HashMap <Integer, Course> ();
		_note = new String ();
	}
	public Professor (Map <Integer, Course> courses, String note)
	{
		super (null, null, null, null, null);
		_courses = courses;
		_note = note;
	}
	
	//getter
	public Map <Integer, Course> getCourses ()
	{
		return _courses;
	}
	public String getNote ()
	{
		return _note;
	}
	//setter
	public void setCourses (Map <Integer, Course> courses)
	{
		_courses = courses;
	}
	public void setNote (String note)
	{
		_note = note;
	}
}
