//Exercise on pages 386-391

import java.util.*;

public class BowlingTeamDemo
{
	public static void main(String[] args)
	{
		//variables and constants
		String name;
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		BowlingTeam bowlTeam = new BowlingTeam(); 

		//input phase
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the team name >>");
		name = input.nextLine();
		bowlTeam.setTeamName(name);
		System.out.println("Enter 4 team members please:");

		//Loop the process of entering members for the team
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print("Enter team member's name >> ");
			name = input.nextLine();
			bowlTeam.setMember(x, name);
		}

		//output phase
		System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		//loop the process of outputting each individual member of bowlTeam
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print(bowlTeam.getMember(x) + ", ");
		}
		System.out.println();

	}
}