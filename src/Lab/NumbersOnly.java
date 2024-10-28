package Lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumbersOnly {
    public static void main(String[] args) {
        String inputFile = "src/Lab/myFile.txt";
        String outputFile = "src/Lab/outputFile.txt";
        try {
            Scanner input = new Scanner(new File(inputFile));
            PrintWriter pw = new PrintWriter(outputFile);
            while (input.hasNext()){
                String data = input.next();
                String extractedNumberOnly = data.replaceAll("[^0-9]", "");
                System.out.println(extractedNumberOnly);
                pw.printf("%3s", extractedNumberOnly);
            }
            input.close();
            pw.close();
        }
        catch (IOException e){

        }
    }
}