import java.util.Arrays;

public class PatternRepeater {

    /* Implement method to sort an array of integers */

      public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

}
