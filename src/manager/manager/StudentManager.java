package manager;

import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {}

    public StudentManager(List<Student> students) {
        this.students = students;
    }

    public void addStudent() {
        Student st = new Student();
        st.inputInformation();
        students.add(st);
    }

    public void showAllStudentList() {
        System.out.println("Show all Student List:");
//                    for (Student st : students) {
//                        System.out.println(st);
//                    }
        for (int j = 0; j < students.size(); j++) {
//                        System.out.println(students.get(j));
            students.get(j).printStudent();
        }
    }

    public void sortStudentByMediumScoreGradual() {
        System.out.println("Sort Student by Medium Score Gradual:");
        List<Student> list1 = new ArrayList<>(students);
//                    list1.addAll(students);

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getName().compareToIgnoreCase(st2.getName());
            }
        });

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if (st1.getMediumScore() > st2.getMediumScore())
                    return 1;
                if (st1.getMediumScore() < st2.getMediumScore())
                    return -1;
                else
                    return 0;
            }
        });

        for (Student st : list1) {
            st.printStudent();
        }
    }

    public void showAllCourseList() {
        System.out.println("Show all Course List:");
        List<String> courses = new ArrayList<>();
        for (Student st : students) {
            String course = st.getCourse();
            if (!courses.contains(course)) {
                courses.add(course);
            }
        }
        Collections.sort(courses);

        for (String course : courses) {
            System.out.println(course);
        }
    }

    public void searchStudentByIdOrName(String search) {
        search = search.toLowerCase();
        int d = 0;

        for (Student st : students) {
            String id = st.getId().toLowerCase();
            String name = st.getName().toLowerCase();

            if ((id.contains(search)) || (name.contains(search))) {
                System.out.println(st);
                d++;
            }
        }
        System.out.printf("There are %d results\n", d);
    }
}
