package services;

import java.util.Vector;

import java.io.*;

import entities.Student;

public class StudentService {
	private Student student; //The student the services are performed on
	private Vector<Student> allStudents; //All students in the system
	private String fileName;
	public void getData(String fileName)
	{
		try {
			FileInputStream fis = new FileInputStream (fileName);
			DataInputStream in = new DataInputStream(fis);
		    BufferedReader br = new BufferedReader(new InputStreamReader(in));
		    String line;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
