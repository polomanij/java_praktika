package praktika_krugikovroman;

import calsses.Dices;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import tools.*;

/**
 * 
 * Praktika
 * @author Roman Kruglikov EDTR22 183531
 */

public class Praktika_krugikovroman {

    public static void main(String[] args) {
        //PRAKTIKA_8-1
        
        
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
        
        /*
        //Praktika9
        System.out.println("************************************************************************************\n");
        System.out.println("Roman Kruglikov EDTR12 Praktika_9");
        System.out.println("Work with string\n");
        System.out.println("************************************************************************************\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type any sentence:");
        String string = scanner.nextLine();
        
        //String in upper or lower case
        System.out.println( "\n" + StringTools.changeCase(string, "upper") );
        System.out.println( StringTools.changeCase(string, "lower") );
        
        //Number of words
        int numOfWords = StringTools.wordsAmount(string);
        
        System.out.println("\nNumber of words: " + numOfWords);
        
        //Most long and short words
        Map<String, String> shortLongWords = StringTools.getLongShortWords(string);
        
        System.out.println("\nMost short word: " + shortLongWords.get("short"));
        System.out.println("Most long word: " + shortLongWords.get("long"));    
        
        //Words in ascending or descending order
        String[] ascendig = StringTools.showWordsInOrder(string, true);
        String[] descendig = StringTools.showWordsInOrder(string, false);
        
        System.out.println("Ascending words order:");
        for ( String s : ascendig ) {
            System.out.println(s);
        }
        
        System.out.println("\nDescending words order:");
        for ( String s : descendig ) {
            System.out.println(s);
        }
        
        //Find word in the string
        String searhedWord = "world";
        
        ArrayList<Integer> wordIndexes = StringTools.findWord(string, searhedWord);
        
        if ( wordIndexes.isEmpty() ) {
            System.out.println("\nThere is no such words: " + searhedWord);
        } else {
            for ( Object index : wordIndexes.toArray() ) {
                System.out.println("Word: '" + searhedWord +  "' was found at: " + index);
            }
        }
        
        //Find words with equal first and last letters
        ArrayList<String> words = StringTools.equalFirstLastLetters(string);
        
        if ( !words.isEmpty() ) {
            System.out.println("\nWords with equal first and last letters");
            for ( Object word : words.toArray() ) {
                System.out.println(word);
            }
        }
        
        //Find anagrams
        Map<String, String> anagrams = StringTools.findAnagrams(string);
        
        if ( !anagrams.isEmpty() ) {
            System.out.println("\nWords anagrams:");
            for ( String word : anagrams.keySet() ) {
                System.out.println(word + " -> " + anagrams.get(word));
            }
        }
        
        //Find palindromes
        ArrayList<String> palindromes = StringTools.findPalindromes(string);
        
        if ( !palindromes.isEmpty() ) {
            System.out.println("\nPalindromes:");
            
            for ( Object palindrome : palindromes ) {
                System.out.println(palindrome);
            }
        }
        */
    }
    
}
