// Cody Gentry

public class Team
{

    private String teamName;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private Competition competition1;
    private Competition competition2;

    public Team(String n,String m1,String m2,String m3,String m4)
    {
        teamName = n;
        name1 = m1;
        name2 = m2;
        name3 = m3;
        name4 = m4;
        competition1 = null;
        competition2 = null;
    }

    public Team(Team other)
    {
        teamName = other.teamName;
        name1 = other.name1;
        name2 = other.name2;
        name3 = other.name3;
        name4 = other.name4;
        competition1 = other.competition1;
        competition2 = other.competition2;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public String getName1()
    {
        return name1;
    }

    public String getName2()
    {
        return name2;
    }

    public String getName3()
    {
        return name3;
    }

    public String getName4()
    {
        return name4;
    }

    public void printInfo()
    {
        System.out.println("Team name: " + teamName);
        System.out.println("Roster: "  + name1 + ", " + name2 + ", " + name3 + ", " + name4);
        System.out.println("Competitions participated: " );

        if(competition1 != null)
        {
            System.out.println(competition1.getName() + "," + competition1.getYear());
            System.out.println("Winning team: " + competition1.getWinner());
            System.out.println("Runner-up: " + competition1.getRunnerUp());
        }
        System.out.println();

        if(competition2 != null)
        {
            System.out.println(competition2.getName() + "," + competition2.getYear());
            System.out.println("Winning team: " + competition2.getWinner());
            System.out.println("Runner-up: " + competition2.getRunnerUp());
        }
        System.out.println();
    }

    public void setCompetition1(Competition newComp)
    {
        competition1 = newComp;
    }

    public void setCompetition2(Competition newComp)
    {
        competition2 = newComp;
    }

    public void setTeam(String m1,String m2,String m3,String m4)
    {
        name1 = m1;
        name2 = m2;
        name3 = m3;
        name4 = m4;
    }
}