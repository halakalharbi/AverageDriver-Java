package averagee;

import java.util.Scanner;

public class Average {

    private int[] data;
    private double mean;

    // CONSTRUCTOR OF AVERAGE TO ALLOCATE MEMORY FOR THE ARRAY
    public Average() {

        data = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter The Score Number" + (i + 1) + ";");
            data[i] = input.nextInt();
        }
        // CALLING THE 2 METOHODS ---------------
        selectinSort();
        CalculateMean();
    }
    /*
THIS METHOD IS TO REARRANGE THE DATA THAT HAS BEEN ENTERED  
           BY THE USER IN DECREASING OREDER
    */
    public void selectinSort() {
        int maxIndex;
        int maxValue;

        for (int start = 0; start < data.length - 1; start++) {
            maxIndex = start;
            maxValue = data[start];

            for (int index = start + 1; index < data.length; index++) {
                if (data[index] > maxValue) {
                    maxValue = data[index];
                    maxIndex = index;
                }
                data[maxIndex] = data[start];
                data[start] = maxValue;
            }
        }

    }
    /*
    THIS METHOD IS TO ACCESS EACH SCORE IN THE ARRAY AND ADD 
            IT TO A RUNNINGTOTAL BY THE - data.length
    */
    public void CalculateMean() {
        int total = 0;
        for (int i = 0; i < data.length; i++) {

            total += data[i];
        }
        mean = total / data.length;
    }
    /*
    THIS METHOD IS TO RETURN A STRING CONTAINS DATA IN DECREASING ORDER
    */
    public String toString()
    {
        String output="The test in decreasing order\n";
        
        for(int i =0; i< data.length ; i++)
        {
            output=output+data[i]+"\t";
        }
        output=output+"\n the average is:"+mean;
        return output;
    }
}
