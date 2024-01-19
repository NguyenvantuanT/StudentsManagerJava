import manager.StudentManager;
import models.Student;
import utils.MenuUtil;
import utils.Validator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Student st = new Student();
//        Student st2 = new Student("a", "Nhu Y", 20, "Java", "DN", 9.6f);
//        st.setName("Nhi");
//        System.out.println(st.getName());
//        System.out.println(st2.getName());

//        st.printStudent();
//        st2.printStudent();
//        System.out.println();
//        System.out.println(st);

        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        students.add(new Student("1", "D", 11, "Math", "HA", 9f));
        students.add(new Student("2", "C", 11, "English", "DN", 9f));
        students.add(new Student("3", "A", 11, "Physics", "Hue", 9f));
        students.add(new Student("4", "B", 12, "History", "HA", 9f));
        students.add(new Student("5", "M", 12, "History", "HA", 8f));
        students.add(new Student("6", "N", 12, "Math", "HA", 8f));

        StudentManager studentManager = new StudentManager(students);

        int i;
        do {
//            MenuUtil obj = new MenuUtil();
//            obj.printMenu();
            MenuUtil.printMenu();
            do {
                i = Validator.getInt(scanner, "Choice: ");
                if ((i < 1) || (i > 6))
                    System.out.println("Enter a number from 1 to 6");
            } while ((i < 1) || (i > 6));

            switch (i) {
                case 1 -> studentManager.addStudent();
                case 2 -> studentManager.showAllStudentList();
                case 3 -> studentManager.sortStudentByMediumScoreGradual();
                case 4 -> studentManager.showAllCourseList();
                case 5 -> {
                    String search = Validator.getString(scanner, "Enter ID or Name for search: ");
                    studentManager.searchStudentByIdOrName(search);
                }
                case 6 -> System.out.print("Program is finish");
            }
            System.out.println();
        } while (i != 6);
    }
}
