package FootballStatistic;

public class Result  {
    private  Club  club1;
    private Club club2;
    private String result;

    public Result(Club club1, Club club2, String result) {
        this.club1 = club1;
        this.club2 = club2;
        this.result = result;
    }

    public Result(Club club1, Club club2) {
        this.club1 = club1;
        this.club2 = club2;
    }
    //    public Result(String club1, String club2, String result1, String result2) {
//        this.club1 = club1;
//        this.club2 = club2;
//        this.result1 = result1;
//        this.result2 = result2;
//    }


    public  Result(){

    }

    public Club getClub1() {
        return club1;
    }

    public void setClub1(Club club1) {
        this.club1 = club1;
    }

    public Club getClub2() {
        return club2;
    }

    public void setClub2(Club club2) {
        this.club2 = club2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "club1=" + club1 +
                ", club2=" + club2 +
                ", result='" + result + '\'' +
                '}';
    }


}
