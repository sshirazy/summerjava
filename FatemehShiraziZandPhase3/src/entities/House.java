package entities;

import java.util.*;

public class House {
	private String _name; 					//name of house
	private School _school;					//school of this house in type of School
	private Vector<Student> _students;		//students who are members of the house
	private Professor _headTeacher;			//the head teacher of the house
	private ArrayList <String> _qualities;	//list of qualities of the house
	private Map <Integer, Student> _perfects;//perfects of the house per year
	
	public House (String name) //Initializing
	{
		_name = name;
		_school = new School ();
		_students = new Vector<Student> ();
		_headTeacher = new Professor ();
		_qualities = new ArrayList <String> ();
		_perfects = new HashMap <Integer, Student> ();
				
	}
	
	public House (String name, School school, Vector <Student> students,
			 Professor headTeacher, ArrayList <String> qualities, Map <Integer, Student> perfects)
	{
		 _name = name;
		 _school = school;
		 _students = students;
		 _headTeacher = headTeacher;
		 _qualities = qualities;
		 _perfects = perfects;
		 
	 }
	
	// Getters
	public String getName()
	{ 
		return _name;
	}
	public School getschool ()
	{
		return _school;
	}
	public Vector <Student> getStudent ()
	{
		return _students;
	}
	public Professor getHeadTeacher ()
	{
		return _headTeacher;
	}
	public ArrayList <String> getQualities ()
	{
		return _qualities;
	}
	public Map <Integer, Student> getPerfects ()
	{
		return _perfects;
	}
	
	//Setters
	
	public void setName (String name)
	{
		name = _name;
	}
	public void setSchool (School school)
	{
		_school = school;
	}
	public void setHeadTeacher (Professor headTeacher)
	{
		_headTeacher = headTeacher;
	}
	public void setQualities (ArrayList <String> qualities)
	{
		_qualities = qualities;
	}
	public String toString()
	{
		String temp = new String();
		temp += _name + '\n' + "House Name : " + _name + '\n';
		return temp;
	}
}