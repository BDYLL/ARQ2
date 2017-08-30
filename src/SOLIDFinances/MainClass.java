package SOLIDFinances;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass {
    private MainClass(){}


    public static void main(String[] args) {

        fileExample();


    }

    private static void consoleExample(){
        PayeeInput input= new PayeeInput(System.in);
        StatsCalculator calculator = new StatsCalculator();
        Reporter reporter = new Reporter(System.out);

        SOLIDExercise exercise = new SOLIDExercise(input,calculator,reporter);

        exercise.financeProcess();
    }

    private static void fileExample(){
        PayeeInput input = null;
        try {
            input = new PayeeInput(new FileInputStream(new File("C:\\Users\\dyane\\Desktop\\Exercise1\\SOLIDFiles\\Input.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StatsCalculator calculator = new StatsCalculator();
        Reporter reporter = null;
        try {
            reporter = new Reporter(new FileOutputStream(new File("C:\\Users\\dyane\\Desktop\\Exercise1\\SOLIDFiles\\Output.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        SOLIDExercise exercise = new SOLIDExercise(input,calculator,reporter);

        exercise.financeProcess();
    }

    private static void consoleToFileExample(){
        PayeeInput input= new PayeeInput(System.in);
        StatsCalculator calculator = new StatsCalculator();

        Reporter reporter = null;
        try {
            reporter = new Reporter(new FileOutputStream(new File("C:\\Users\\dyane\\Desktop\\Exercise1\\SOLIDFiles\\Output.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        SOLIDExercise exercise = new SOLIDExercise(input,calculator,reporter);

        exercise.financeProcess();
    }

    private static void fileToConsoleExample(){
        PayeeInput input = null;
        try {
            input = new PayeeInput(new FileInputStream(new File("C:\\Users\\dyane\\Desktop\\Exercise1\\SOLIDFiles\\Input.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StatsCalculator calculator = new StatsCalculator();
        Reporter reporter = new Reporter(System.out);

        SOLIDExercise exercise = new SOLIDExercise(input,calculator,reporter);

        exercise.financeProcess();
    }
}
