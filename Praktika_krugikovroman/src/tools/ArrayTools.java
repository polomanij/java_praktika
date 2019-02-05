package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author roman
 */
public class ArrayTools {
    /**
     * 
     * @param int arrayLength
     * @param int min
     * @param int max
     * @return the array with length == arrayLength, array values are random numbers from min to max
     */
    public static int[] getRandomNumbersArray(int arrayLength, int min, int max) {
        
        int[] randomNumbers = new int[arrayLength];
        
        for ( int i = 0; i < arrayLength; i++ ) {
            int randomNum = ArrayTools.getRandomNumber(min, max);
            
            randomNumbers[i] = randomNum;
        }
        
        return randomNumbers;
    }
    
    /**
     * 
     * @param int[] arr
     * @return HashMap, keys are even numbers indexes, values are even numbers
     */
    public static Map<Integer, Integer> findEven(int[] arr) {
        
        Map<Integer, Integer> evenArrElements = new HashMap<Integer, Integer>();
        
        int index = 0;
        for ( int num : arr ) {
            if ( num % 2 == 0 && num != 0) {
                evenArrElements.put(index, num);
            }
            index++;
        }
        
        return evenArrElements;
    }
    
    /**
     * 
     * @param arr
     * @return Map<String, String> with max number, amount and indexes of max number
     */
    public static Map<String, String> getMaxWithCount(int[] arr) {
        
        int maxNumber = arr[0];
        int maxNumberCount = 0;
        StringBuilder maxNumbersIndex = new StringBuilder();
        
        Map result = new HashMap<String, String>();
        int index = 0;
        
        for ( int num : arr ) {
            
            if (num > maxNumber) {
                maxNumber = num;
                maxNumberCount = 1;
                maxNumbersIndex.delete(0, maxNumbersIndex.length());
                maxNumbersIndex.append(index);
            } else if (num == maxNumber) {
                maxNumberCount += 1;
                maxNumbersIndex.append(" " + index);
            }
            index++;
        }
        
        result.put("maxNumber", maxNumber);
        result.put("maxNumberCount", maxNumberCount);
        result.put("maxNumbersIndexes", maxNumbersIndex.toString());
        
        return result;
    }
    
    /**
     * 
     * @param int[] arr
     * @return int min value in array
     */
    public static int getMin(int[] arr) {

        int min = arr[0];
        
        for ( int num : arr ) {
            if (num < min) min = num;
        }
        
        return min;
    }
    
    /**
     * 
     * @param int[] arr
     * @param int min
     * @param int max
     * @return float average without min and max values
     */
    public static float averageWithoutMaxMin(int[] arr, int min, int max) {
        
        float average = 0;
        
        int numbersAmount = 0;
        for ( int num : arr ) {
            if ( num < max && num > min) {
                average += num;
                numbersAmount++;
            }
        }
        
        return average / numbersAmount;
    }
    
    /**
     * 
     * @param int[] arr
     * @return boolean if array is increasing sequence true, else false
     */
    public static boolean isIncreasingSequence(int[] arr) {
        
        int currentNum = arr[0];
                
        for ( int num : arr ) {
            if (currentNum > num) {
                return false;
            }
            
            currentNum = num;
        }
        
        return true;
    }
    
    /**
     * 
     * @param int[] arr
     * @return int the second by size number of array
     */
    public static int findSecondBySize(int[] arr) {
        Map maxWithCount = ArrayTools.getMaxWithCount(arr);
        int maxNum = (int) maxWithCount.get("maxNumber");
        
        int seconBySize = 0;
        
        for ( int num : arr ) {
            if (num < maxNum && num > seconBySize) {
                seconBySize = num;
            }
        }
        
        return seconBySize;
    }
    
    /**
     * 
     * print the int[] array
     * @param int[] arr 
     */
    public static void printArray(int[] arr) {
        int i = 0;
        for ( int num : arr ) {
            System.out.println( String.valueOf(i) + ". " + num );
            i++;
        }
    }
    
    /**
     * Print the List<Integer>
     * @param List<Integer> arrList
     */
    public static void printArrayList(List<Integer> arrList) {
        int i = 1;
        for ( Integer num : arrList ) {
            System.out.println( String.valueOf(i) + ". " + num );
            i++;
        }
    }
    
    /**
     * 
     * @param min
     * @param max
     * @return 
     */
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}