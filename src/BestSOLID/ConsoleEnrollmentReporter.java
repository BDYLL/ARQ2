package BestSOLID;

import java.util.List;

public class ConsoleEnrollmentReporter implements EnrollmentReporter {

    @Override
    public void report(List<Subject> enrollment, Student student) {
        System.out.println("------ Enrollment " + student.getName() + "-------");
        enrollment.forEach(s-> System.out.println(s.getName()));
    }
}
