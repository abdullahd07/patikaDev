public class Student {
    private String name;
    private String stuNo;
    private String classes;

    private Course course1;
    private Course course2;
    private Course course3;

    private int examGrade1;
    private int verbalGrade1;

    private int examGrade2;
    private int verbalGrade2;

    private int examGrade3;
    private int verbalGrade3;

    private double average;
    private boolean isPass;

    public Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.isPass = false;
    }

    public  void addBulkNotes (int examGrade1, int verbalGrade1, int examGrade2,int verbalGrade2,int examGrade3,int verbalGrade3){

        if (examGrade1 >= 0 && examGrade1 <= 100 && verbalGrade1 >= 0 && verbalGrade1 <= 100) {
            this.examGrade1 = examGrade1;
            this.verbalGrade1 = verbalGrade1;
        } else {
            System.out.println("Hata: " + this.course1.getName() + " dersine ait notlar 0-100 arasında olmalıdır! Not kaydedilemedi.");
        }

        if (examGrade2 >= 0 && examGrade2 <= 100 && verbalGrade2 >= 0 && verbalGrade2 <= 100) {
            this.examGrade2 = examGrade2;
            this.verbalGrade2 = verbalGrade2;
        } else {
            System.out.println("Hata: " + this.course2.getName() + " dersine ait notlar 0-100 arasında olmalıdır! Not kaydedilemedi.");
        }

        if (examGrade3 >= 0 && examGrade3 <= 100 && verbalGrade3 >= 0 && verbalGrade3 <= 100) {
            this.examGrade3 = examGrade3;
            this.verbalGrade3 = verbalGrade3;
        } else {
            System.out.println("Hata: " + this.course3.getName() + " dersine ait notlar 0-100 arasında olmalıdır! Not kaydedilemedi.");
        }
    }



    public void  isPass (){
        if (calcAvarage()>55){
            System.out.println("Tebrikler Sınıfı Geçtiniz! Ortalamanız:" + calcAvarage() );
        }
        else {
            System.out.println("Sınıf Tekrarı");
        }
    }
    public double calcAvarage() {
        double c1 = this.course1.calculateCourseAverage(this.examGrade1, this.verbalGrade1);
        double c2 = this.course2.calculateCourseAverage(this.examGrade2, this.verbalGrade2);
        double c3 = this.course3.calculateCourseAverage(this.examGrade3, this.verbalGrade3);

        this.average = (c1 + c2 + c3) / 3.0;
        return this.average;
    }

    public void printNotes() {
        System.out.println(course1.getName() + " Ortalaması: " + this.course1.calculateCourseAverage(this.examGrade1, this.verbalGrade1));
        System.out.println(course2.getName() + " Ortalaması: " + this.course2.calculateCourseAverage(this.examGrade2, this.verbalGrade2));
        System.out.println(course3.getName() + " Ortalaması: " + this.course3.calculateCourseAverage(this.examGrade3, this.verbalGrade3));
        System.out.println("Genel Ortalama: " + calcAvarage());
    }


}