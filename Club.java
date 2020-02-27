package FootballStatistic;

public class Club {
    private String name;
    private  String username;
    private int countWin;
    private int countUnWin;

    public Club(String name, String username, int countWin, int countUnWin) {
        this.name = name;
        this.username = username;
        this.countWin = countWin;
        this.countUnWin = countUnWin;
    }

    public Club(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public Club(String name) {
        this.name = name;
    }
    public Club(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCountWin() {
        return countWin;
    }

    public void setCountWin(int countWin) {
        this.countWin = countWin;
    }

    public int getCountUnWin() {
        return countUnWin;
    }

    public void setCountUnWin(int countUnWin) {
        this.countUnWin = countUnWin;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", countWin=" + countWin +
                ", countUnWin=" + countUnWin +
                '}';
    }
}
