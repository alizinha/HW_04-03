package nyc.c4q.alizinha;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by c4q-Allison on 4/1/15. I need more time to complete this assignment.
 *
 *
 *ASSIGNMENT:
 1. Create a class to calculate the distribution of characters in the contents of a text file.
 2. Your class called DistributionCalculator should implement a method calculate(File textFile)
 which accepts as input a Text file.
 3. It reads the contents of the file and returns an ArrayList which contains the distribution/percentage
 of characters (a-z) in the text file.
 4. You should lowercase lines before you do the calculation.
 5. Call the calculate method from main and print the distribution.
 6. You can ignore characters which do not belong in the range(a-z) for doing your calculation.
 */
public class DistributionCalculator {

//   public static ArrayList<String> calculate(File textFile) {
//    System.out.println(calculate.size());
//       String list = "";
//
//
//       return list;
//    }



    public static void main(String[] args) throws IOException {
        Scanner textFile = new Scanner(new File("/Users/c4q-Allison/Desktop/accesscode/HW_04-03/src/nyc/c4q/alizinha/MaryOliverWildGeese.txt"));
//        System.out.print(sc);

// File textFile = new File("/Users/c4q-Allison/Desktop/accesscode/HW_04-03/src/nyc/c4q/alizinha/MaryOliverWildGeese.txt");
//        Scanner scanner = new Scanner(textFile);
//        System.out.println();


    }
}
