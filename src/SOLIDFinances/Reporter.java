package SOLIDFinances;


import java.io.*;
import java.util.Date;

public class Reporter {

    private OutputStream out;

    public Reporter(OutputStream out){
        this.out=out;
    }



    public void report(double min, double max, double avg, String mostCommonPayee,Date date){
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(this.out));

        try{
            writer.write(date.toString());
            writer.newLine();
            writer.write("Min: "+min);
            writer.newLine();
            writer.write("Max: "+max);
            writer.newLine();
            writer.write("Avg: "+avg);
            writer.newLine();
            writer.write("Most Frequent Payee: "+mostCommonPayee);
            writer.newLine();

            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
