package BestSOLID;

import java.util.List;

public class EnrollmentProcess {
    private StudentInput studentInput;
    private PossibleClassEnlister enlister;
    private ClassInput input;
    private EnrollmentReporter reporter;

    public EnrollmentProcess(StudentInput studentInput, PossibleClassEnlister enlister, ClassInput input, EnrollmentReporter reporter) {
        this.studentInput = studentInput;
        this.enlister = enlister;
        this.input = input;
        this.reporter = reporter;
    }

    public void enrollmentProcess(){
        Student student=this.studentInput.acceptStudent();
        List<Subject> possibleClasses = this.enlister.report(student.getSemester());
        List<Subject> classes=input.acceptClasses(possibleClasses);
        this.reporter.report(classes,student);
    }

}
