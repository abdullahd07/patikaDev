public class Employee {
    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    Employee (String name, double salary, double workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }



}


