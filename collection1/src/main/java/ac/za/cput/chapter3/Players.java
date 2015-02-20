package ac.za.cput.chapter3;

/**
 * Created by student on 2015/02/20.
 */
public class Players {
    int score;
    String name11;
    String team;

    public Players(int score1, String Name1, String team1)
    {
        score=score1;
        name11=Name1;
        team=team1;
    }
    public String toString()
    {
        return(score+ name11+ team);
    }
}
