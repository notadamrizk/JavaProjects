package Projects;

import java.util.Arrays;
import static org.junit.Assert.*;

public class PangramChecker {

    public static void main(String[] args) {
        String pangram1 = "You shall not pass!";
        assertEquals(false, check(pangram1));

        System.out.println(check(pangram1));
    }
    public static boolean check(String sentence){
        sentence = sentence.toUpperCase();
        int[] intList = new int[26];
        for(int i = 0; i < sentence.length(); ++i){
            int charNumber = sentence.charAt(i) - 65;

            if(charNumber >= 0 && charNumber <= 25) {

                intList[charNumber]++;
            }
        }


        return !(Arrays.asList(intList).contains(0));
    }
}