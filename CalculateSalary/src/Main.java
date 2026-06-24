//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("1 Numaralı Çalışan", 2000,45,1985);
        CalculateSalary salary = new CalculateSalary(employee1);
        System.out.println(salary);
    }
}