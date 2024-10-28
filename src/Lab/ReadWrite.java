package Lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {
        String inputFile = "src/Lab/myFile.txt";
        String outputFile = "src/Lab/outputFile.txt";
        try {
            File f = new File(inputFile);
            Scanner retrieveFile = new Scanner(f);
            PrintWriter pw = new PrintWriter(outputFile);
            while (retrieveFile.hasNextLine()){
                String data = retrieveFile.nextLine();
                pw.print(data + "\n");
                System.out.println(data);
            }
            retrieveFile.close();
            pw.close();
        }
        catch (IOException e){

        }
    }
}