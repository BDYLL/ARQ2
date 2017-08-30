package BestSOLID;

import java.util.Arrays;
import java.util.List;

public class HardcodePossibleClassEnlister implements PossibleClassEnlister {
    @Override
    public List<Subject> report(int semester) {
       if(semester<=5){
           return Arrays.asList(new Subject("Math",semester),new Subject("OOP",semester));
       }
       return Arrays.asList(new Subject("Math",semester),new Subject("OOP",semester), new Subject("SoftwareDesign",semester));
    }
}
