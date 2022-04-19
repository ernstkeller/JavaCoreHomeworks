package Lesson1;

public class Team {

    private String teamName;
    private Competitor[] competitors;

    public Team(String teamName, Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.println("Результат команды: " + teamName);
        for (Competitor competitor : competitors) {
            competitor.result();
        }
    }

}
