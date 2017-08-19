package entities;

import java.util.Vector;

public class Course {
	
	private String _name;
	private char _minGrade;
	private String _professorName;
	private int _year;
	private Vector<String> _studentNames;	
	
	/* CONSTRUCTORS */
	public Course(String name)
	{
		_name = name;
		_minGrade = 'O';
		_professorName = "";
		_year = 1996;
		_studentNames = new Vector<String>();
	}
	public Course(String name, String professor, char minGrade, int year)
	{
		_name = name;
		_professorName = professor;
		_minGrade = minGrade;
		_year = year;
		_studentNames = new Vector<String>();
	}
	
	/* GETTERS */
	public Vector<String> getStudentNames()
	{
		return _studentNames;
	}
	public String getProfessorName()
	{
		return _professorName;
	}
	public String getName()
	{
		return _name;
	}
	public char getMinGrade()
	{
		return _minGrade;
	}
	public int getYear()
	{
		return _year;
	}

	/* SETTERS */
	public void setStudentNames(Vector<String> students)
	{
		_studentNames = students;
	}
	public void setProffesorName(String professor)
	{
		_professorName = professor;
	}
	public void setName(String name)
	{
		_name = name;
	}
	public void setMinGrade(char minGrade)
	{
		_minGrade = minGrade;
	}
	public void setYear(int year)
	{
		_year = year;
	}
}

