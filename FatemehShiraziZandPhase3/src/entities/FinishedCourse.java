package entities;

public class FinishedCourse extends  Course {
	private Grades _grade; // grade received by students
	private boolean _passed; // if he pass or fail the course
	
	public FinishedCourse(String name)
	{
		super (name);
		_grade = Grades.O;
		_passed = false;
		
		
	}
	public FinishedCourse(String name, String professor, char minGrade, int year,
			Grades grade, boolean passed)
	{
		super (name, professor, minGrade, year);
		_grade = grade;
		if (_grade != Grades.T)//except "Troll" others pass the course
			_passed = true;
		else
			_passed = false;
	}
	
	//getter
	public Grades getGrade()
	{
		return _grade;
	}
	public boolean getPassed()
	{
		return _passed;
	}
	
	//setter 
	public void setGrade(Grades grade)
	{
		_grade = grade;
	}
	public void setPassed(boolean passed)
	{
		_passed = passed;
	}
}
