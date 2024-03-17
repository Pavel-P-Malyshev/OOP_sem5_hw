package hw.View;
import hw.Model.*;

public class TeacherView {
    public void PrintTeacherInfo(Teacher teacher){
        System.out.println("Information about TeacherID "+teacher.getTeachedId()+" : ");
        System.out.println(teacher.getFio()+" , "+teacher.GetBirthYear()+" , "+teacher.GetTel());
    }
}
