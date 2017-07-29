import java.util.*;


public class entities {
	public class School {
		private String _name;
		private int _numOfStudents;
		private boolean _housed;
		private ArrayList <String> _houseNames;
		private ArrayList <String> _courseNames;
		private Vector <String> _studentsNames;
		private Vector <String> _proffesorNames;
		
 	public School (String name  , int numOfStudent, boolean housed , ArrayList <String> houseNames , ArrayList <String>  courseNames , Vector<String> studentsNames , Vector<String> proffesorNames ){
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
 	
 		
 		
 	}
 			
	
			


}
