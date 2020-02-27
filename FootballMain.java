package FootballStatistic;

import java.util.Scanner;

public class FootballMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FootballInter footballInter = new FootballImple();
        while (true) {
            System.out.println(
                    " 1-> Add Club " +
            " 2-> Show Pirnt " +
            " 3-> Edit Club " +
            " 4-> Enter Result " +
            " 5-> Delete Club " +
            " 6-> Show all Result " +
            " 7-> Edit Result ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    footballInter.addClub();
                    break;
                case 2:
                    footballInter.showPrint();
                    break;
                case 3:
                    footballInter.editClub();
                    break;
                case 4:
                    footballInter.enterResult();
                    break;
                case 5:
                    footballInter.deleteClub();
                    break;
                case 6:
                    footballInter.showAllresult();
                    break;
                case 7:
                    footballInter.EditResult();
                    break;
            }


           /* switch (n) {
                case 1:


                    break;
                case 2:
                    footballInter.addClub2();
                    break;
                case 3:
                    if (footballInter.showClub()) {
                        int n1 = sc.nextInt();
                        while (true) {
                            System.out.println(
                                    " 1-> ShowClub " +
                                    " 2-> EditClub " +
                                    " 3-> EnterResult " +
                                    " 4-> DeleteClub " +
                                    " 5-> ShowAllResult ");
                            switch (n1) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;

                             }
                        }
                    }
                    break;

            }
        }
*/
        }

    }
}
