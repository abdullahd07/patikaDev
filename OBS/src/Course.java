public class Course {
    private String name;
    private int code;
    private String prefix;
    private double verbalWeight;
    private double examWeight;
    private Teacher teacher;


     Course (String name, int code, String prefix,double verbalWeight){
        this.name =name;
        this.code=code;
        this.prefix=prefix;
        this.verbalWeight=verbalWeight;
        this.examWeight = 1-verbalWeight;
        this.teacher=null;
     }

    public double getExamWeight (){
        return this.examWeight;
    }

    public double getVerbalWeight() {
        return verbalWeight;
    }
    public String getName(){
        return this.name;
    }

     public void addTeacher(Teacher teacher){
         if (this.prefix.equals(teacher.getBranch())){
             System.out.println(this.name +" Dersi için " + teacher.getName() +" atandı.");
             this.teacher=teacher;
         }
         else
             System.out.println(this.name + " dersi için  " + this.prefix + " branşına sahip bir öğretmen atanabilir! Seçmiş olduğunuz Öğretmen branşı" + teacher.getBranch());
     }

     public  void printInfo () {
         System.out.println(" Ders Adı:" + this.name + "\n Öğretmen:" + teacher.getName()+ "\n Sınav notu Etkisi:" + examWeight +"\n Sözlü Notu Etkisi:" + verbalWeight);
     }

    public double calculateCourseAverage(int examGrade, int verbalGrade) {
        return (examGrade * this.examWeight) + (verbalGrade * this.verbalWeight);
    }
}