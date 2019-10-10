// Cody Gentry

public class Competition
{
    private String name;
    private String winner;
    private String runnerUp;
    private int year;

    public Competition(String n,int y)
    {
        this.name = n;
        this.year = y;
        runnerUp = "";
        winner = "";
    }

    public String getName()
    {
        return name;
    }
    
    public String getWinner()
    {
        return winner;
    }
    
    public String getRunnerUp()
    {
        return runnerUp;
    }

    public int getYear()
    {
        return year;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setWinner(String w)
    {
        winner = w;
    }

    public void setRunnerUp(String r)
    {
        runnerUp = r;
    }

    public void setYear(int y)
    {
        year = y;
    }
}