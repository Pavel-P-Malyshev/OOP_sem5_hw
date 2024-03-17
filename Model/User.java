package hw.Model;


//For Model
public class User {
    
    private String FIO;
    private int BirthYear;
    private int tel;

    public User(String fio, int birthy, int tel){
        this.FIO=fio;
        this.BirthYear=birthy;
        this.tel=tel;
    }

    public String getFio(){
        return this.FIO;
    }

    public int GetBirthYear(){
        return this.BirthYear;
    }

    public int GetTel(){
        return this.tel;
    }


    
}
