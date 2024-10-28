package Lab;

import java.io.*;
import java.util.Scanner;

public class AutoclosureDemo {
    public static void main(String[] args) throws IOException {
        String input = "src/Lab/myFile.txt";
        String output = "src/Lab/outputFile.txt";

        try(
                Scanner scanner = new Scanner(new BufferedReader(new FileReader(input)));
                PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
                BufferedWriter bw = new BufferedWriter(new FileWriter(output));
                )
        {
            while(scanner.hasNext()){
                String trimmedLine = scanner.nextLine().trim();
                if(!trimmedLine.isEmpty()){
                    String[] listOfTrimmedInteger = trimmedLine.split("\\s+");
                    for(String x: listOfTrimmedInteger){
                        
                    }
                }
            }
        }
    }
}
