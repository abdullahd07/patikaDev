public class Match {
    private Fighter fighter1;
    private Fighter fighter2;
    private Fighter firstFighter;
    private Fighter secondFighter;

    Match(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }


    void runMatch() {

        int chooseFighter = (int) (Math.random() * 2) + 1;

        switch (chooseFighter) {
            case 1:
                firstFighter = fighter1;
                secondFighter = fighter2;
                break;
            case 2:
                firstFighter = fighter2;
                secondFighter = fighter1;
                break;
        }

        int round = 1;

        while (firstFighter.getHealth() > 0 && secondFighter.getHealth() > 0) {
            System.out.println("--------------"+round+".Round---------------------");
            firstFighter.hit(secondFighter);
            System.out.println(secondFighter.getName() + " Kalan Can: " + secondFighter.getHealth());

            if (secondFighter.getHealth() <= 0) {
                break;
            }

            secondFighter.hit(firstFighter);
            System.out.println(firstFighter.getName() + " Kalan Can: " + firstFighter.getHealth());

            round ++;
        }




        if (firstFighter.getHealth() <= 0) {
            System.out.println("=========================================");
            System.out.println("         MAÇI KAZANAN "+ secondFighter.getName() +" Oluyor!");
            System.out.println("=========================================");
        } else {
            System.out.println("=========================================");
            System.out.println("            MAÇI KAZANAN "+ firstFighter.getName() +" Oluyor!");
            System.out.println("=========================================");
        }
    }
}
