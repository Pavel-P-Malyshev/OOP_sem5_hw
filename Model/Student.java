package hw.Model;

//For Model
public class Student extends User{
    private int StudentId;

    public Student(String fio, int birth, int tel, int id){
        super(fio, birth, tel);
        this.StudentId=id;
    }

    public int getStudentId(){
        return this.StudentId;
    }
}
