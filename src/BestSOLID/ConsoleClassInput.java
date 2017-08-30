package BestSOLID;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleClassInput implements ClassInput {
    @Override
    public List<Subject> acceptClasses(List<Subject> possibleClasses) {

        List<Subject> enrollment = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        String answer ="";

        do{
            possibleClasses.forEach(s2-> System.out.println(s2.getName()));

            System.out.println("Which subject you like to enroll?");
            System.out.println("Subject:");

            answer = s.nextLine();

            Subject dummy = new Subject(answer);



            if(possibleClasses.contains(dummy)){
                enrollment.add(dummy);
                System.out.println(">>> Done. Good look on your '" + answer + "' class");
            }
            else{
                System.out.println("Cannot enter "+dummy.getName());
            }

        }while(!"Exit".equals(answer));


        return enrollment;
    }
}
