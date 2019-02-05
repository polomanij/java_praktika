package praktika_krugikovroman;

import calsses.Dices;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import tools.*;

/**
 * 
 * Praktika 8 task 1
 * @author Roman Kruglikov EDTR22 183531
 */

public class Praktika8_1_krugikovroman {

    public static void main(String[] args) {
        //PRAKTIKA_8-1
        
        /*
        System.out.println("************************************************************************************\n");
        System.out.println("Roman Kruglikov EDTR12 Praktika_8-1");
        System.out.println("Work with array\n");
        System.out.println("************************************************************************************\n");
        
        //Get the randomNumbers array with values from 0 to 20
        int[] randomNumbers = ArrayTools.getRandomNumbersArray(10, 0, 20);
        
        System.out.println("Array numbers: \n");
        ArrayTools.printArray(randomNumbers);
        
        //Find even randomNumbers array elements
        Map evenArrElements = ArrayTools.findEven(randomNumbers);
        
        System.out.println("\nThe even array numbers:\n");
        for ( Object index : evenArrElements.keySet() ) {
            System.out.println("Index: " + index + " Number: " + evenArrElements.get(index));
        }

        //Find min and max array numbers
        Map arrMaxWithCount = ArrayTools.getMaxWithCount(randomNumbers);
        int arrMaxNum = (int) arrMaxWithCount.get("maxNumber");
        int arrMinNum = ArrayTools.getMin(randomNumbers);
        
        System.out.println("\nMax number in array: " + arrMaxNum);
        System.out.println("Amount of max numbers in array: " + arrMaxWithCount.get("maxNumberCount"));
        System.out.println("Indexes of max numbers in array: " + arrMaxWithCount.get("maxNumbersIndexes"));
        
        //Get average without min and max values
        float average = ArrayTools.averageWithoutMaxMin(randomNumbers, arrMinNum, arrMaxNum);
        
        System.out.println("\nAverage without min and max: " + average);
        
        //Determine that array is an increasing sequence
        boolean isIncreasingSequence = ArrayTools.isIncreasingSequence(randomNumbers);
        
        System.out.println("\nThe array is increasing sequence: " + isIncreasingSequence);
        
        //Find second by size array number
        int secondBySize = ArrayTools.findSecondBySize(randomNumbers);
        
        System.out.println("Second by size array number: " + secondBySize);
        */
        
        //PRAKTIKA_8-2
        /*
        System.out.println("************************************************************************************\n");
        System.out.println("Roman Kruglikov EDTR12 Praktika_8-2");
        System.out.println("To roll the dices\n");
        System.out.println("************************************************************************************\n");
        
        boolean stop = false;
        int attempt = 0;
        Scanner scanner = new Scanner(System.in);
        Dices dices = new Dices();
        
        while (!stop) {
            if (attempt > 100000) {
                System.out.println("Your attempts are end. Game is over.");
                dices.showDicesRollRes();
            }
            
            System.out.println("Type one of next numbers: ");
            System.out.println("1. - Roll;\n2. - Check reults;\n3. - Exit;");
            
            String command = scanner.nextLine();
            
            if (command.equals("1")) {
                System.out.println("\nYou've just caught: " + dices.roll());
                System.out.println("You have still " + attempt + "attempts.\n");
                attempt++;
            } else if (command.equals("2")) {
                dices.showDicesRollRes();
            } else if (command.equals("3")) {
                System.out.println("Good bye !");
                stop = true;
            } else {
                System.out.println("Command is incorrect !");
            }
        }
        */
        
        //Praktika9
        System.out.println("************************************************************************************\n");
        System.out.println("Roman Kruglikov EDTR12 Praktika_9");
        System.out.println("Work with string\n");
        System.out.println("************************************************************************************\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type any sentence:\n");
        String string = scanner.nextLine();
        
        //String in upper or lower case
        System.out.println( StringTools.changeCase(string, "upper") );
        System.out.println( StringTools.changeCase(string, "lower") );
        
        //Number of words
        int numOffords = StringTools.wordsAmount(string);
        
        System.out.println("Number of words: " + numOffords);
        
        //Most long and short words
        
    }
    
}
