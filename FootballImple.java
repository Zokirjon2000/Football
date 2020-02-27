package FootballStatistic;

import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

public class FootballImple implements FootballInter {
    private Scanner sc = new Scanner(System.in);
    private List<Club> allClub = new ArrayList<>();
      private int count ;
    private Map<String, List<Result>> stringListMap = new TreeMap<>();
    @Override
    public void addClub() {
        System.out.println(" Name: ");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(" UserName: ");
        sc = new Scanner(System.in);
        String UserName = sc.nextLine();
        Club club = new Club(name, UserName);
        allClub.add(club);

    }


    @Override
    public void showPrint() {
        if (allClub.size() < 2) {
            addClub();
            for (int i = 0; i < allClub.size(); i++) {
                System.out.println(allClub.get(i));
            }

        } else {
            for (int i = 0; i < allClub.size(); i++) {
                System.out.println(allClub.get(i));

            }
        }
    }

    @Override
    public void editClub() {
        for (int i = 0; i < allClub.size(); i++) {
            System.out.println((i + 1) + " -> " + allClub.get(i).getName());
        }
        System.out.println(" O'zgartiraydigon kamandani tanlang ");
        int n = sc.nextInt();
        System.out.println(" Enter new Name ");
        sc = new Scanner(System.in);
        String newName = sc.nextLine();
        if (allClub.size() < n) {
            System.out.println(" 404 ");
        } else {
            allClub.get(n - 1).setName(newName);
        }
    }

    @Override
    public void enterResult() {
        System.out.println(" Dateni kiriting ");
        sc = new Scanner(System.in);
        String date = sc.next();
        count ++;
        System.out.println(" 1 - tanlang ");
        for (int i = 0; i < allClub.size(); i++) {
            System.out.println((i + 1) + "->" + allClub.get(i).getName());
        }
        int n = sc.nextInt();
        System.out.println(" 2 - tanlang ");
        for (int i = 0; i < allClub.size(); i++) {
            if (n != i + 1) {
                System.out.println((i + 1) + "->" + allClub.get(i).getName());
            }
        }
        int n1 = sc.nextInt();
        Club club1 = allClub.get(n - 1);
        Club club2 = allClub.get(n1 - 1);
        List<Result> resultAll = new ArrayList<>();
        System.out.println(" Natijani kiriting (\"x:y\") ");
        String result = sc.next();
        String[] split = result.split(":");
        int i = Integer.parseInt(split[0]);
        int i1 = Integer.parseInt(split[1]);
        if (i > i1) {
            club1.setCountWin(club1.getCountWin() + 1);
            club2.setCountUnWin(club2.getCountUnWin() + 1);
        } else {
            club2.setCountWin(club2.getCountWin() + 1);
            club1.setCountUnWin(club1.getCountUnWin() + 1);
        }
        Result result1 = new Result(club1, club2, result);
        resultAll.add(result1);
        stringListMap.put(date, resultAll);


    }

    @Override
    public void deleteClub() {
        for (int i = 0; i < allClub.size(); i++) {
            System.out.println((i + 1) + " -> " + allClub.get(i).getName());
        }
        System.out.println(" O'chiraydigon  kamandani tanlang ");
        int n = sc.nextInt();
        allClub.remove(n - 1);
    }

    @Override
    public void showAllresult() {
        System.out.println(" dateni kiriting ");
        sc = new Scanner(System.in);
        String date = sc.nextLine();
        for (int i = 0; i < stringListMap.size(); i++) {
            System.out.println((i+1) + " -> " + stringListMap.get(date));
        }
        List<Result> results = stringListMap.get(date);
        for (Result s : results) {
            System.out.println(s.getClub1().getName() + " " + s.getResult() + " " + s.getClub2().getName());
        }
    }

    @Override
    public void EditResult() {
        System.out.println(" Enter Date ");
        sc = new Scanner(System.in);
        String date = sc.nextLine();
        List<Result> results = stringListMap.get(date);
        System.out.println(" Qaysi oyin natijasini ozgartirmoqchisiz ");
        int n = sc.nextInt();
        System.out.println(" Natijani kiriting ");
        String newResult = sc.next();
        results.get(n - 1).setResult(newResult);


    }
}

