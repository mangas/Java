/**
 * Created by fa on 26/10/15.
 */
public class Utils {

    public static int findIndex(int[] array, int[] subArray) {

        if ( subArray == null ||  subArray.length == 0)
            return -1;

        if ( array == null || array.length == 0)
            return -1;

        for (int i=0; i<=array.length-subArray.length; i++)
            if (findFromIndex(array,subArray,i))
                return i;

        return -1;
    }

    private static boolean findFromIndex(int[] array, int[] subArray, int i) {
        if (subArray.length > array.length-i)
            return false;

        for (int j=0;j<subArray.length;j++)
            if ( array[j+i] != subArray[j] )
                return false;

        return true;
    }

}
