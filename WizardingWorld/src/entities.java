import java.util.*;
import java.util.Date;


public class entities {
	public class School {
		private String _name;
		private int _numOfStudents;
		private boolean _housed;
		private ArrayList <String> _houseNames;
		private ArrayList <String> _courseNames;
		private Vector <String> _studentsNames;
		private Vector <String> _proffesorNames;
		
		public School (String name){
		_name = name;
		_houseNames = new ArrayList <String> ();
		_courseNames = new ArrayList <String> ();
		_studentsNames = new Vector <String> ();
		_proffesorNames = new Vector <String> ();
		_numOfStudents = 0;
		_housed = false ;
		}
		
 	public School (String name  , int numOfStudent, boolean housed , ArrayList <String> houseNames , 
 			ArrayList <String>  courseNames , Vector<String> studentsNames , Vector<String> proffesorNames ){
 		_name= name;
 		_houseNames = houseNames;
 		_courseNames = courseNames;
 		_studentsNames = studentsNames;
 		_proffesorNames = proffesorNames;
 		if (_studentsNames!= null)
 			_numOfStudents = _studentsNames.size();
 		else 
 			_numOfStudents = 0;
 		if (houseNames == null || houseNames.isEmpty())
 			_housed = false ;
 		else 
 			_housed = true ;
 		
 	}
 	
 	
 	 public String getname () {
 		 return _name;
 		
 	 }
 	 public void setname (String name){
 		 this._name = name ;
 	 
 	}
 	 public int getnumOfStudents (){
 		 return _numOfStudents;

 	 }
 	 public void setNumOfStudents (int numOfStudents){
 		 this._numOfStudents = numOfStudents;
 		
 	 }
 	 public ArrayList<String> gethouseNames(){
 		 return _houseNames;
 	 }
 	 public void sethouseNames (){
 		 this._houseNames = gethouseNames();
 	 }
 	 public ArrayList <String> getcourseNames (){
 		 return _courseNames;
 	 }
 	 public void setcourseNames (){
 		 this._courseNames = getcourseNames();
 	 }
		
 	 public Vector <String> getProffesorNames (){
 		 return _proffesorNames;
 	 }
 	 public void setProffesorNames (){
 		 this._proffesorNames = getProffesorNames();
 	 }
 	 public Vector <String> getstudentsNames (){
 		 return _studentsNames;
 	 }
 	 public void setstudentsNames (){
 		 this._studentsNames = getstudentsNames();
 	 }
 			
	}
	
	public class Course {
		private String _name;
		private char _minGrade;
		private String _proffesorName;
		private int _year;
		private Vector <String> _studentNames;
		
		public Course (String name , char minGrade, int year ,String proffesorName ,  Vector <String> studentNames){
	 		_name= name;
	 		_minGrade = minGrade;
	 		_year = year;
	 		_proffesorName = proffesorName;
	 		_studentNames = studentNames;
		}
	 	

	 	 public String getname () {
	 		 return _name;
	 		
	 	 }
	 	 public void setname (String name){
	 		 this._name = name ;
	 	 
	 	}
	 	public int getyear (){
	 		 return _year;

	 	 }
	 	 public void setyear (int year){
	 		 this._year = year;
	 		
	 	 }
	 	 public String getproffesorName (){
	 		 return _proffesorName;

	 	 }
	 	 public void setproffesorName (String proffesorName){
	 		 this._proffesorName = proffesorName;
	 	 }
	 	public Vector <String> getstudentNames (){
	 		 return _studentNames;
	 	 }
	 	 public void setstudentsNames (){
	 		 this._studentNames = getstudentNames();
	 	 }
		
	}
	public class Person {
		private String _name;
		private String _houseName;
		private String _bloodStatus;
		private String _school;
		private Date _birthday;
		
		public Person(String name , String houseName, String bloodStatus ,String school , Date birthday){
	 		_name = name;
	 		_houseName = houseName;
	 		_bloodStatus = bloodStatus;
	 		_school = school;
	 		_birthday = birthday;
	 		
	 		 public String getname () {
		 		 return _name;
		 		
		 	 }
		 	 public void setname (String name){
		 		 this._name = name ;
		 	 
		 	}
		 	 public String gethouseName () {
		 		 return _houseName;
		 		
		 	 }
		 	 public void sethouseName (String houseName){
		 		 this._houseName = houseName ;
		 	 
		 	}
		 	 public String getbloodStatus () {
		 		 return _bloodStatus;
		 		
		 	 }
		 	 public void setbloodStatus (String bloodStatus){
		 		 this._name = bloodStatus ;
		 	 
		 	}
		 	 public String getschool () {
		 		 return _school;
		 		
		 	 }
		 	 public void setschool (String school){
		 		 this._school = school ;
		 	 
		 	}
		 	 public Date getbirthday () {
		 		 return _birthday;
		 		
		 	 }
		 	 public void setbirthday (Date birthday){
		 		 this._birthday = birthday ;
		 	 
		 	}
		}
	 	


}

