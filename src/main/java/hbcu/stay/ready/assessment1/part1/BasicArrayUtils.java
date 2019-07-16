package hbcu.stay.ready.assessment1.part1;

import java.lang.reflect.Array;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        String str ="";

        for(int i=0;i<stringArray.length;i++){
            for(int j=i;j<stringArray.length;) {
                System.out.println(stringArray[i]);
                str =stringArray[i];
                if(str==stringArray[j]) {
                    break;
                }

            } if (!(str==stringArray[i+1])){
                return str;
            }
        }


        return str;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {

        String str ="";

        for(int i=0;i<stringArray.length;i++){
            for(int j=i;j<stringArray.length;j++) {
                System.out.println(stringArray[i++]+" "+stringArray[j]);
                str =stringArray[i++];
                if(str==stringArray[j]) {
                    break;
                }

                return str;
            }
        }


        return str;
    }


    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        String[] reverseArray = new
                String[stringArray.length];
        int reverseArrayIndex = 0;
        for(int arrayIndex = stringArray.length-1; arrayIndex>=0;
        arrayIndex--) {
            reverseArray[reverseArrayIndex] = stringArray[arrayIndex];
            reverseArrayIndex++;
        }
          return reverseArray;
        }


    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        return null;
    }
}
