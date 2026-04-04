//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));

    }

    static  int fibonacci (int number) {
        if (number ==1 || number ==2) {
            return 1;
        }
        return fibonacci(number -1 ) + fibonacci(number -2);
    }
}