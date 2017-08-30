package SOLIDFinances;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Number of purchases");

        int n;

        n=s.nextInt();

        //s.close();

        s=new Scanner(System.in);

        List<String> payees=new ArrayList<>();
        List<Double> costs=new ArrayList<>();

        String tmp[];

        String line;

        System.out.println("Enter your purchases");
        while(n>0){

            line=s.nextLine();

            tmp=line.split(" ");

            payees.add(tmp[0]);
            costs.add(Double.parseDouble(tmp[1]));

            n--;
        }

        double min=costs.stream().mapToDouble(d->d).min().getAsDouble();
        double max = costs.stream().mapToDouble(d->d).max().getAsDouble();
        double average = costs.stream().mapToDouble(d->d).average().getAsDouble();

        Map<String,Long> mappings = payees.stream().collect(Collectors.groupingBy(d->d,Collectors.counting()));

        String mostFrequent="";
        long largest=0l;

        for(Map.Entry<String,Long> entry : mappings.entrySet()){
            if(entry.getValue()>largest){
                mostFrequent=entry.getKey();
                largest=entry.getValue();
            }
        }

        String today=new Date().toString();

        System.out.println(today);
        System.out.println("Min: $"+min);
        System.out.println("Max: $"+max);
        System.out.println("Avg: $"+average);
        System.out.println("Frequent Payee: "+mostFrequent);

    }
}
