package BestSOLID;

public class SOLIDMain {

    public static void main(String[] args) {

        StudentInput input= new ConsoleStudentInput();
        PossibleClassEnlister enlister= new HardcodePossibleClassEnlister();
        ClassInput classInput= new ConsoleClassInput();
        EnrollmentReporter reporter = new ConsoleEnrollmentReporter();

        EnrollmentProcess process = new EnrollmentProcess(input,enlister,classInput,reporter);

        process.enrollmentProcess();

    }
}
