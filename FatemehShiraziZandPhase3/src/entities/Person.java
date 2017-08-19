package entities;

public class Person {
	private String _name;
	private String _houseName;
	private String _bloodStatus;
	private String _school;
	private String _birthday;

	/* CONSTRUCTORS */
	public Person(String name)
	{
		_name = name;
		_houseName = "";
		_bloodStatus = "";
		_school = "";
		_birthday = new String();		
	}
	public Person(String name, String house, String bloodStatus, String school, String birthday)
	{
		_name = name;
		_houseName = house;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthday = birthday;
	}
	public Person ()
	{
		
	}
	/* GETTERS */
	public String getName()
	{
		return _name;
	}
	public String getHouseName()
	{
		return _houseName;
	}
	public String getBloodStatus()
	{
		return _bloodStatus;
	}
	public String getSchool()
	{
		return _school;
	}
	public String getBirthday()
	{
		return _birthday;
	}

	/* SETTERS */
	
	public void setName(String name)
	{
		_name = name;
	}
	public void setHouseName(String house)
	{
		_houseName = house;
	}
	public void setBloodStatus(String bloodStatus)
	{
		_bloodStatus = bloodStatus;
	}
	public void setSchool(String school)
	{
		_school = school;
	}
	public void setBirthday(String birthday)
	{
		_birthday = birthday;
	}
	public String toString()
	{
		String temp = new String();
		temp += _name + '\n' + "House Name : " + _houseName + '\n';
		return temp;
	}

}
