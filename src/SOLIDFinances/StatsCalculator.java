package SOLIDFinances;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StatsCalculator {

    double min(List<Double> data){ return data.stream().mapToDouble(d->d).min().getAsDouble(); }
    double max(List<Double> data){
        return data.stream().mapToDouble(d->d).max().getAsDouble();
    }
    double avg(List<Double> data){
        return data.stream().mapToDouble(d->d).average().getAsDouble();
    }

    public String mostCommonPayee(List<String> payees){
        Map<String,Long> mappings = payees.stream().collect(Collectors.groupingBy(d->d,Collectors.counting()));

        String mostFrequent="";
        long largest=0l;

        for(Map.Entry<String,Long> entry : mappings.entrySet()){
            if(entry.getValue()>largest){
                mostFrequent=entry.getKey();
                largest=entry.getValue();
            }
        }

        return mostFrequent;
    }
}
