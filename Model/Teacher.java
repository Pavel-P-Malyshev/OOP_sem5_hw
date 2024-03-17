package hw.Model;

//For Model

public class Teacher extends User {
    private int TeacherId;

    public Teacher(String fio, int birth, int tel, int id){
        super(fio, birth, tel);
        this.TeacherId=id;
    }

    public int getTeachedId(){
        return this.TeacherId;
    }

}
