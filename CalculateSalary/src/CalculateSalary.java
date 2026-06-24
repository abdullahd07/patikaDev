import com.sun.deploy.security.SelectableSecurityManager;

public class CalculateSalary {
    private  Employee employee;
    CalculateSalary(Employee employee){
        this.employee=employee;
    }
    int currentYear = 2021;

    double tax (){
        if (employee.getSalary() >=1000) {
            return employee.getSalary() * 0.03;
        }
        else
            return 0;
    }

    double calculateOverTime(){
        double overTime =0;
        double overTimeFee=30;
        if (employee.getWorkHours()>40){
            overTime = employee.getWorkHours()-40;
            return overTime * overTimeFee;
        }
        else {
            return 0;
        }
    }

    double calculateRaise (){
        int activeWorkingYear =currentYear - employee.getHireYear()  ;
        if ( activeWorkingYear <=9){
            return employee.getSalary() * 0.05;
        } else if ( activeWorkingYear >9 && activeWorkingYear < 20) {
            return employee.getSalary() * 0.1;
        }
        else
            return employee.getSalary() * 0.15;
    }

    double calculateSalary (){
        double netSalary =0;
       netSalary = employee.getSalary() - tax()+calculateOverTime();
        return netSalary;
    }

    @Override
    public String toString(){
        double raisedSalary= calculateSalary() + calculateRaise();
        return   "Adı: " + employee.getName()
                + "\nBrüt Maaşı: " + employee.getSalary()
                + "\nBaşlangıç Yılı: " + employee.getHireYear()
                + "\nÇalışma Saati: " + employee.getWorkHours()
                + "\nVergi: " + tax()
                + "\nBonus: " + calculateOverTime()
                + "\nMaaş Artışı: " + calculateRaise()
                + "\nVergi ve Bonuslar ile birlikte maaş : " + calculateSalary()
                + "\nZamlı Net Maaş: " + raisedSalary;
    }
}
