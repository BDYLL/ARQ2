package SOLIDFinances;

import java.util.Date;
import java.util.List;

public class SOLIDExercise {

    private Reporter reporter;
    private StatsCalculator calculator;
    private PayeeInput input;

    public SOLIDExercise(PayeeInput input,StatsCalculator calculator, Reporter reporter){
        this.input=input;
        this.calculator=calculator;
        this.reporter=reporter;
    }


    public void financeProcess(){

        this.input.getInput();

        List<Double> costs=this.input.getCosts();
        List<String> payees=this.input.getPayees();

        String mostCommonPayee = this.calculator.mostCommonPayee(payees);

        double min = this.calculator.min(costs);
        double max = this.calculator.max(costs);
        double avg = this.calculator.avg(costs);

        this.reporter.report(min,max,avg,mostCommonPayee,new Date());
    }

}
