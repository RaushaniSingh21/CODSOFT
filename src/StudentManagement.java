import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("STUDENT MANAGEMENT SYSTEM MENU::");
            System.out.println("1. ADD StudentManagement.Student");
            System.out.println("2. REMOVE StudentManagement.Student");
            System.out.println("3. Search StudentManagement.Student");
            System.out.println("4. DISPLAY All Students");
            System.out.println("5. EXIT");
            System.out.print("Please enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ENTER STUDENT`S NAME: ");
                    String name = scanner.nextLine();
                    System.out.print("ENTER STUDENT`S ROLL NUMBER: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("ENTER STUDENT`S GRADE: ");
                    String grade = scanner.nextLine();
                    Student student = new Student(name, rollNumber, grade);
                    system.addStudent(student);
                    System.out.println("YOUR STUDENT SUCCESSFULLY ADDED");
                    break;

                case 2:
                    System.out.print("ENTER THE STUDENT`S ROLL NUMBER TO REMOVE: ");
                    int rollNumToRemove = scanner.nextInt();
                    Student studentToRemove = system.searchStudent(rollNumToRemove);
                    if (studentToRemove != null) {
                        system.removeStudent(studentToRemove);
                        System.out.println("YOUR STUDENT REMOVED SUCCESSFULLY.");
                    } else {
                        System.out.println("**STUDENT NOT FOUND**.");
                    }
                    break;

                case 3:
                    System.out.print("ENTER ROLL NUMBER TO SEARCH THE STUDENT: ");
                    int rollNumToSearch = scanner.nextInt();
                    Student searchedStudent = system.searchStudent(rollNumToSearch);
                    if (searchedStudent != null) {
                        System.out.println("*STUDENT FOUND* " + searchedStudent);
                    } else {
                        System.out.println("*STUDENT NOT FOUND* ");
                    }
                    break;

                case 4:
                    List<Student> allStudents = system.getAllStudents();
                    System.out.println("ALL STUDENTS:");
                    for (Student s : allStudents) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    System.out.println("EXITING!! STUDENT MANAGEMENT SYSTEM  .");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("**CHOICE INVALID**. TRY AGAIN. ");
            }
        }
    }

    static class StudentManagementSystem {
        private List<Student> students;

        public StudentManagementSystem() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void removeStudent(Student student) {
            students.remove(student);
        }

        public Student searchStudent(int rollNumber) {
            for (Student student : students) {
                if (student.getRollNumber() == rollNumber) {
                    return student;
                }
            }
            return null;
        }

        public List<Student> getAllStudents() {
            return students;
        }
    }

    static class Student {
        private String name;
        private int rollNumber;
        private String grade;

        public Student(String name, int rollNumber, String grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public String getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "StudentManagement.Student{" +
                    "name='" + name + '\'' +
                    ", rollNumber=" + rollNumber +
                    ", grade='" + grade + '\'' +
                    '}';
        }
    }
}