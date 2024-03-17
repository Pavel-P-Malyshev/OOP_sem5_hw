package hw.Model;

import java.util.List;


// Задача 1 - Data/model
// � Создать package – model. Работу продолжаем в нем
// � Реализовать абстрактный класс User и его наследники Student и Teacher. 
// Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
// наследники собственные параметры (какие, по вашему выбору – Пример: 
// studentId для Student, teacherId для Teacher)

public class GroupModel {

   private Teacher teacher;
   private List<Student> students;
   private int groupId;

   public GroupModel(Teacher teacher, List<Student> students, int id)
    {
        this.teacher=teacher;
        this.students=students;
        this.groupId=id;

    }

    public int getGroupId(){
        return this.groupId;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public List<Student> getStudents(){
        return this.students;
    }

    
}
