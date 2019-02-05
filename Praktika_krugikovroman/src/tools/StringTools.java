package tools;

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
}
