//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Bilgisayar Programcılığı",1,"PRG",0.2);
        Course course2 = new Course("Tarih",1,"TRH",0.2);
        Course course3 = new Course("Fizik",1,"FZK",0.2);

        Teacher teacher1 = new Teacher("Abdullah Değirmenci","111111","PRG");
        Teacher teacher2 = new Teacher("İkinci Öğretmen","111111","TRH");
        Teacher teacher3 = new Teacher("Üçüncü Öğretmen","111111","FZK");

        course1.addTeacher(teacher1);
        course2.addTeacher(teacher2);
        course3.addTeacher(teacher3);

        Student student = new Student("Öğrenci 1","1","12",course1,course2,course3);
        student.addBulkNotes(90,100,85,90,60,75);
        student.isPass();
        student.printNotes();

    }
}