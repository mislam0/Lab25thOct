package Lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ManipulativeNumber2 {
    public static void main(String[] args) {
        String input = "src/Lab/input.txt";
        String output = "src/Lab/output.txt";

        File f = new File(input);
        try {
            Scanner scanFile = new Scanner(f);
            PrintWriter pw = new PrintWriter(output);
            while(scanFile.hasNextLine()){
                String data = scanFile.nextLine();
                Scanner dataScan = new Scanner(data);
                while(dataScan.hasNext()){
                    if(dataScan.hasNextInt()){
                        int integerValue = dataScan.nextInt();
                        int quadruple = integerValue*4;
                        pw.print(quadruple);
                    }
                    else {
                        dataScan.next();
                    }
                }
            }
            scanFile.close();
            pw.close();
        }
        catch(IOException e){

        }
    }
}
