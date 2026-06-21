//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 35);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 35);
        Fighter rocky = new Fighter("Rocky" , 15 , 100, 90, 35);
        Fighter ivan = new Fighter("Ivan" , 20 , 95, 100, 35);

        Fighter fighter1 = null;
        Fighter fighter2 =null;

        int chooseFighter1 = (int) (Math.random() * 4) + 1;

        int chooseFighter2 = 0;

        while (chooseFighter2==0 || chooseFighter2 == chooseFighter1) {
            chooseFighter2 = (int) (Math.random() * 4) + 1;
        }


        switch (chooseFighter1){
            case 1:
                fighter1=marc;
                break;
            case 2:
                fighter1=alex;
                break;
            case 3:
                fighter1=rocky;
                break;
            case 4:
                fighter1=ivan;
                break;
        }

        switch (chooseFighter2){
            case 1:
                fighter2=marc;
                break;
            case 2:
                fighter2=alex;
                break;
            case 3:
                fighter2=rocky;
                break;
            case 4:
                fighter2=ivan;
                break;
        }

        System.out.println("================= \nMaç Başlıyor! \n" + fighter1.getName() + " VS " + fighter2.getName() +"\n=================");

        Match match = new Match(fighter1,fighter2);

        match.runMatch();
    }
}