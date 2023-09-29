import java.util.Scanner;

public class StudentGradeCalculator {
    public static void calculate() {
        Scanner sc = new Scanner(System.in);

        int bio, chm, eng, mth, phy, total, average;

        char grade;

        String remark = "";
        System.out.println("!! ENTER THE MARKS !! \n");
        System.out.println(" BIOLOGY ");
        bio = sc.nextInt();
        System.out.println(" CHEMISTRY ");
        chm = sc.nextInt();
        System.out.println(" ENGLISH ");
        eng = sc.nextInt();
        System.out.println(" MATHEMATICS ");
        mth = sc.nextInt();
        System.out.println(" PHYSICS ");
        phy = sc.nextInt();

        total = bio + chm + eng + mth + phy;
        average = total / 5;
        if (average > 90) {
            grade = 'O';
        } else if (average >= 80) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else if (average >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        switch (grade) {
            case 'O':
                remark = "OUTSTANDING";
                System.out.println("*************************");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("*************************");
                break;
            case 'A':
                remark = "EXCELLENT";
                System.out.println("*************************");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("*************************");

                break;
            case 'B':
                remark = "VERY GOOD";
                System.out.println("*************************");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("*************************");
                break;
            case 'C':
                remark = "GOOD";
                System.out.println("*************************");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("*************************");
                break;
            case 'D':
                remark = "POOR";
                System.out.println("*************************");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("*************************");
                break;
            case 'E':
                remark = "VER POOR";
                System.out.println("*************************");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("*************************");
                break;
            case 'F':
                remark = "FAIL";
                System.out.println("*************************");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("*************************");
                break;
            default:
                System.out.println(remark);
        }
    }

    public static void main(String[] args) {
        calculate();
    }


}