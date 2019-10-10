public class Main
{
    public static void main(String[] args)
    {
        Team team1 = new Team("Alpha","Tim D.","Robert H.","Garry E.","Jake T.");
        Team team2 = new Team("Bravo","Don G.","Ron A.","Bob D.","Tiffany K.");
        Team team3 = new Team("Charlie","Brett C.","Moe S.","Alfonso B.","Jermemy F.");

        Competition comp1 = new Competition("100 Meter Dash", 2018);
        Competition comp2 = new Competition("200 Meter Dash", 2019);

        comp1.setWinner(team1.getTeamName());
        comp1.setRunnerUp(team3.getTeamName());

        comp2.setWinner(team1.getTeamName());
        comp2.setRunnerUp(team2.getTeamName());

        team1.setCompetition1(comp1);
        team1.setCompetition2(comp2);

        team2.setCompetition1(comp1);
        team2.setCompetition2(comp2);

        team3.setCompetition1(comp1);
        team3.setCompetition2(comp2);

        team1.printInfo();
        System.out.println("-----------------------");

        team2.printInfo();
        System.out.println("-----------------------");

        team3.printInfo();
        System.out.println("-----------------------");

        System.out.println("Test copy constructor");
        Team test = new Team(team1);
        test.setTeam("Tim K.","Jake B.","Terry S.","Dwayne J.");
        test.printInfo();
        team1.printInfo();

    }
}