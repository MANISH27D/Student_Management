package manage;

public class student_Manage {
    private int student_id;
    private String student_name;
    private  int student_class;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_class() {
        return student_class;
    }

    public void setStudent_class(int student_class) {
        this.student_class = student_class;
    }

    public int getGetStudent_age() {
        return getStudent_age;
    }

    public void setGetStudent_age(int getStudent_age) {
        this.getStudent_age = getStudent_age;
    }

    private int getStudent_age;

    public student_Manage(int student_id, String student_name, int student_class, int getStudent_age) {
        super();
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_class = student_class;
        this.getStudent_age = getStudent_age;
    }
    public student_Manage( String student_name, int student_class, int getStudent_age) {
        super();
        this.student_name = student_name;
        this.student_class = student_class;
        this.getStudent_age = getStudent_age;
    }
    public student_Manage( String student_name) {
        super();
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "student_Manage{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_class=" + student_class +
                ", getStudent_age=" + getStudent_age +
                '}';
    }

    public student_Manage(int student_id){
        super();
    }
}

