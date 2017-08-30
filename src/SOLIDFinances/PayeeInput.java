package SOLIDFinances;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayeeInput{

    private InputStream input;
    private List<String> payees;
    private List<Double> costs;


    public PayeeInput(InputStream input){
        this.input=input;

    }

    public void getInput(){
        InputStreamReader isr= new InputStreamReader(this.input);

        try {
            BufferedReader reader = new BufferedReader(isr);

            String line = reader.readLine();

            int numberOfPayees = Integer.parseInt(line);

            this.payees=new ArrayList<>();
            this.costs=new ArrayList<>();

            line = reader.readLine();

            String tmp[];

            while(numberOfPayees>0){
                tmp=line.split(" ");

                this.payees.add(tmp[0]);
                this.costs.add(Double.parseDouble(tmp[1]));

                numberOfPayees--;
                line=reader.readLine();
            }


            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<String> getPayees() {
        return this.payees;
    }

    public List<Double> getCosts() {
        return this.costs;
    }
}
