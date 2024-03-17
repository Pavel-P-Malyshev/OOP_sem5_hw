package hw.View;
import hw.Model.*;

// Создать package – view. Работу продолжаем в нем
// � Создать класс StudentView, содержащий в себе метод вывода в консоль
// данных студента поданных на вход
public class StudentView {

    public void PrintStudentInfo(Student student){
        System.out.println("Information about StudentID "+student.getStudentId()+" : ");
        System.out.println(student.getFio()+" , "+student.GetBirthYear()+" , "+student.GetTel());
    }
    
}
