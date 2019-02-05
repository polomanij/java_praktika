package calsses;

import java.util.HashMap;
import java.util.Map;
import tools.ArrayTools;

/**
 *
 * @author roman
 */
public class Dices {
    private Map<Integer, Integer> dicesRollResults;

    public Dices() {
        this.dicesRollResults = new HashMap<Integer, Integer>();
        
        for (int i = 2; i < 13; i++) {
            this.dicesRollResults.put(i, 0);
        }
    }
    
    public int roll() {
        int randomPoints = ArrayTools.getRandomNumber(2, 12);
        System.out.println(randomPoints);
        
        int currRollResult = this.dicesRollResults.get(randomPoints);
        currRollResult++;
        
        this.dicesRollResults.put(randomPoints, currRollResult);
        
        return randomPoints;
    }
    
    public void showDicesRollRes() {
        System.out.println("*** Below you can see your rolling results ***\n");
        
        for ( Object num : this.dicesRollResults.keySet() ) {
            System.out.println("Edge: " + num + "; How often you've caught it: " + this.dicesRollResults.get(num));
        }
        
        System.out.println("\n");
    }

    public Map<Integer, Integer> getDicesRollResults() {
        return dicesRollResults;
    }

    public void setDicesRollResults(Map<Integer, Integer> dicesRollResults) {
        this.dicesRollResults = dicesRollResults;
    }
}
