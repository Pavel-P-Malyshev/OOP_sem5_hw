package hw.View;
import java.util.List;


import hw.Model.*;

public class GroupView {

    public void PrintGroupInfo(GroupModel group){
        TeacherView tView = new TeacherView();
        StudentView sView= new StudentView();

        System.out.println("\n");
        System.out.println("Group "+group.getGroupId()+" includes: ");
        System.out.println("\n");
        System.out.println("Teachers:");
        tView.PrintTeacherInfo(group.getTeacher());
        System.out.println("\n");
        System.out.println("Students:");
        List<Student> slist=group.getStudents();

        for (Student student : slist) {
            sView.PrintStudentInfo(student);           
        }

        
    }
    
}
