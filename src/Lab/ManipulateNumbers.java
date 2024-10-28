package Lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ManipulateNumbers {
    public static void main(String[] args) {
        String input = "src/Lab/input.txt";
        String output = "src/Lab/output.txt";

        File f = new File(input);
        try {
            Scanner scanFile = new Scanner(f);
            PrintWriter pw = new PrintWriter(output);
            while(scanFile.hasNextLine()){
                String data = scanFile.nextLine();
                String[] element = data.split(" ");
                //int number = Integer.parseInt(element[0]);
                for(String x: element){
                    int xElement = Integer.parseInt(x);
                    int triple = xElement*3;
                    pw.printf("%5d",triple);
                }
            }
            scanFile.close();
            pw.close();
        }
        catch(IOException e){

        }
    }
}
