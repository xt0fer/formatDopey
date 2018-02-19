import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long endTime = 0;

        double samson = 18945.89374297492742393874;
        for(int i=0; i < 10000000; i++) {
            double shorn = Math.floor(samson * 100) / 100;
        }

        endTime = System.currentTimeMillis();

        double shorn0 = Math.floor(samson * 100) / 100;
        System.out.printf("shorn %f \n", shorn0);

        long timeneeded =  endTime - startTime;
        System.out.printf("math takes %d ms; %d - %d \n", timeneeded, startTime, endTime);

        startTime = System.currentTimeMillis();
        DecimalFormat grading = new DecimalFormat("#.##");

        for(int i=0; i < 10000000; i++) {
            double shorn =  Double.parseDouble(grading.format(samson));
        }

        endTime = System.currentTimeMillis();

        timeneeded =  endTime - startTime;
        System.out.printf("Formatting takes %d ms; %d - %d \n", timeneeded, startTime, endTime);

    }
}
