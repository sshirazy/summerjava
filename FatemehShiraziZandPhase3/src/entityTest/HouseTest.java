package entityTest;

import entities.*;

public class HouseTest {
	
	public boolean testConstructor(String name)
	{
		House Hogwarts = new House("hogwarts");
		String temp = "Hogwarts";
		
		if(temp.equals(Hogwarts.toString()))
			return true;
		
		return false;
	}
	public boolean testGetName()
	{
		House Hogwarts = new House("Hogwarts");
		String expected = "Hogwarts";
		String actual = Hogwarts.getName();
		return (actual.equals(expected));
		
	}
	
}




