//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number=6, a =0,b=1,c=0;

        for(int i =0; i<=number; i++){
            c= a + b;
            System.out.println(a + " + " + b +" = " +c);
            a=b;
            b=c;
        }
    }
}