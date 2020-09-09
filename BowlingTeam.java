//Exercise on pages 386-391

public class BowlingTeam
{
	//data file variables for this class
	private String teamName;
	private String[] members = new String[4];

	//No custom constructor, this class uses the java default constructor

	//mutator (setter) method for teamName
	public void setTeamName(String team)
	{
		teamName = team;
	}
	//accessor (getter) method for teamName
	public String getTeamName()
	{
		return teamName;
	}

	//mutator (setter) method for members
	public void setMember(int number, String name)
	{
		members[number] = name;
	}

	//accessor (getter) method for members[]
	public String getMember(int number)
	{
		return members[number];
	}


}