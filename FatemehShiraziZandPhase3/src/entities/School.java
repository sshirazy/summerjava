package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School {
	private String _name;
	private int _numOfStudents;
	private boolean _housed;
	private ArrayList<String> _houseNames;
	private ArrayList<String> _courseNames;
	private Vector<String> _studentNames;
	private Vector<String> _professorNames;
	/* CONSTRUCTORS */
	public School(String name)
	{
		_name = name;
		_houseNames = new ArrayList<String>();
		_courseNames = new ArrayList<String>();
		_studentNames = new Vector<String>();
		_professorNames = new Vector<String>();
		_numOfStudents = 0;
		_housed = false;
	}
	public School(String name, ArrayList<String> houses, ArrayList<String> courses,
			ArrayList<Integer> years, Vector<String> students, Vector<String> professors)
	{
		_name = name;
		_houseNames = houses;
		_courseNames = courses;
		_studentNames = students;
		_professorNames = professors;
		if(_studentNames != null)
			_numOfStudents = _studentNames.size();
		else
			_numOfStudents = 0;
		if(houses == null || houses.isEmpty())
			_housed = false;
		else
			_housed = true;
	}

	public School() 
	{ 
	}

	/* GETTERS */
	public String getName() { return _name; }
	public ArrayList<String> getCourseNames() 
	{
		return _courseNames; 
	}
	public ArrayList<String> getHouseNames() 
	{
		return _houseNames; 
	}
	public Vector<String> getStudentNames()
	{
		return _studentNames;
	}
	public Vector<String> getProfessorNames()
	{
		return _professorNames;
	}
	public boolean getHoused()
	{
		return _housed;
	}
	public int getNumOfStudents()
	{
		return _numOfStudents;
	}
	/* SETTERS */
	public void setHoused(boolean housed)
	{
		_housed = housed;
	}
	public void setHouseNames(ArrayList<String> houses)
	{
		_houseNames = houses;
	}
	public void setCourseNames(ArrayList<String> courses)
	{
		_courseNames = courses;
	}
	public void setStudentNames(Vector<String> students)
	{
		_studentNames = students;
	}
	public void setProfessorNames(Vector<String> professors)
	{
		_professorNames = professors;
	}

}
