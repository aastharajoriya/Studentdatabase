import java.util.*;

public class StudentMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];

        System.out.print("Enter Physics mark = ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry mark = ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Maths mark = ");
        marks[2] = sc.nextInt();
        System.out.print("Enter Hindi mark = ");
        marks[3] = sc.nextInt();
        System.out.print("Enter English mark = ");
        marks[4] = sc.nextInt();

        int percentage = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;

        System.out.println("Physics marks = " + marks[0]);
        System.out.println("Chemistry marks = " + marks[1]);
        System.out.println("Maths marks = " + marks[2]);
        System.out.println("Hindi marks = " + marks[3]);
        System.out.println("English marks = " + marks[4]);
        System.out.println("Percentage = " + percentage + " %");
    }
}
