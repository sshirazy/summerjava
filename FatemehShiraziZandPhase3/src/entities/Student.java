package entities;

import java.util.*;

public class Student extends Person {
	private Vector <Course> _courses; //courses taken by students
	private Vector <FinishedCourse> _reportCard; //FinishedCourse card of student

	public Student()
	{
		super ();
		_courses = new Vector <Course> ();
		_reportCard = new Vector <FinishedCourse> ();
	}
	public Student(Vector <Course> courses, Vector <FinishedCourse> reportCard)
	{
		super ();
		_courses = courses;
		_reportCard = reportCard;
	}
	
	//getter 
	
	public Vector <Course> getCourses()
	{
		return  _courses;
	}
	public Vector <FinishedCourse> getReportCrad ()
	{
		return _reportCard;
	}
	
	//setter
	public void setCourses (Vector <Course> course)
	{
		_courses = course;
	}
	public void setReportCard (Vector <FinishedCourse> reportCard)
	
	{
		_reportCard = reportCard;
	}
	
		
}
	


