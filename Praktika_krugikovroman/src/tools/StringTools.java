package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author roman
 */
public class StringTools {
    public static String changeCase(String str, String strCase) {
        
        if ( strCase.toLowerCase().equals("lower") ) {
            return str.toLowerCase();
        } else if ( strCase.toLowerCase().equals("upper") ) {
            return str.toUpperCase();
        }
        
        return str;
    }
    
    public static int wordsAmount(String str) {
        return str.split(" ").length;
    }
    
    public static Map<String, String> getLongShortWords(String str) {

        String[] words = str.split(" ");
        String mostLong = words[0];
        String mostShort = words[0];
        
        for ( String word : words ) {
            if ( word.length() > mostLong.length() ) {
                mostLong = word;
            } else if ( word.length() < mostShort.length() ) {
                mostShort = word;
            }
        }
        
        Map<String, String> shortLongWords = new HashMap<>();
        shortLongWords.put("short", mostShort);
        shortLongWords.put("long", mostLong);
        
        return shortLongWords;
    }
    
    /**
     * 
     * @param String str
     * @param boolean order
     * @return String[] if param order == true - order is ascending, else - descending
     */
    public static String[] showWordsInOrder(String str, boolean order) {
        
        List<String> listWords = Arrays.asList(str.split(" "));
        boolean isSorted = false;
        
        while (!isSorted) {
            isSorted = true;
            
            for (int i = 0; i < listWords.size() - 1; i++) {

                    if ( listWords.get(i).length() > listWords.get(i + 1).length() ) {
                        String tmp = listWords.get(i);
                        listWords.set(i, listWords.get(i + 1));
                        listWords.set(i + 1, tmp);
                        isSorted = false;
                    }
            }
        }
        
        if ( order == false ) {
            Collections.reverse(listWords);
        }
        
        return (String[]) listWords.toArray();
    }
    
    /**
     * 
     * @param String str
     * @param String word
     * @return ArrayList<Integer>, wich contain founded searched word indexes
     */
    public static ArrayList<Integer> findWord(String str, String word) {
        
        ArrayList<Integer> indexes = new ArrayList<>();
        int pos = str.indexOf(word);
        
        while (pos != -1) {
            indexes.add(pos);
            pos = str.indexOf(word, pos + 1);
        }
        
        return indexes;
    }
    
    /**
     * Get a string as argument and return list of words where first and last letters are equal
     * @param String str
     * @return ArrayList<String> 
     */
    public static ArrayList<String> equalFirstLastLetters(String str) {
        
        String[] words = str.split(" ");
        ArrayList<String> result = new ArrayList<>();
        
        for ( String word : words ) {
            String firstLetter = word.substring(0, 1);
            String lastLetter = word.substring(word.length() - 1);
            
            if ( firstLetter.equals(lastLetter) ) {
                result.add(word);
            }
        }
        
        return  result;
    }
    
    public static Map<String, String> findAnagrams(String str) {
        
        String[] stringWords = str.split(" ");
        Map<String, String> anagrams = new HashMap<>();
        
        for (int i = 0; i < stringWords.length; i++) {
            for (int j = i; j < stringWords.length; j++) {
                if ( (j == i) || ( stringWords[i].length() != stringWords[j].length() ) ) {
                    continue;
                }
                
                char[] word1 = stringWords[i].toCharArray();
                char[] word2 = stringWords[j].toCharArray();
                
                Arrays.sort(word1);
                Arrays.sort(word2);
                
                if ( Arrays.equals(word1, word2) ) {
                    anagrams.put(stringWords[i], stringWords[j]);
                }
            }
        }
        
        return anagrams;
    }
    
    public static ArrayList<String> findPalindromes(String str) {
        
        String[] stringWords = str.split(" ");
        ArrayList<String> palindromes = new ArrayList<>();
        
        for ( String word : stringWords ) {
            
            StringBuilder tmp = new StringBuilder(word);
            
            if ( word.equals( tmp.reverse().toString() ) ) {
                palindromes.add(word);
            }
        }
        
        return palindromes;
    }
    
}
