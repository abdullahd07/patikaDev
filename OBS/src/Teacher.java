public class Teacher {
    private String name;
    private String gsm;
    private String branch;


    Teacher (  String name, String gsm,String branch) {
        this.name=name;
        this.gsm=gsm;
        this.branch=branch;
    }
    public String getBranch(){
        return this.branch;
    }
    public String getName (){
        return this.name;
    }
}
