package BestSOLID;

import java.util.Scanner;

public class ConsoleStudentInput implements StudentInput {


    @Override
    public Student acceptStudent() {

        Scanner s = new Scanner(System.in);

        System.out.println("Name:");
        String name = s.nextLine();

        System.out.println("Semester:");
        int semester = Integer.parseInt(s.nextLine());

        return new Student(name,semester);
    }
}
