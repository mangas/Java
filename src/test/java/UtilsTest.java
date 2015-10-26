import junit.framework.TestCase;
import junit.framework.TestSuite;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fa on 26/10/15.
 */

public class UtilsTest extends TestCase {

    private static int[] generateArray(int size, int init) {
        int[] array = new int[size];
        for (int i=0; i<size; i++)
            array[i]=init;

        return array;
    }

    public static void testNull(){
        assertEquals(-1, Utils.findIndex(null,null));
    }
    public static void testEmptyTestArray(){
        assertEquals(-1, Utils.findIndex(generateArray(0,0), new int[] {1,2,3} ));
    }

    public static void testEmptySubArray(){
        assertEquals(-1, Utils.findIndex(new int[]{1, 2, 3}, generateArray(0,0)));
    }
    public static void testNoMatch(){
        assertEquals(-1, Utils.findIndex(new int[] {1,2,3,4}, new int[]{5,6,7,8,9} ));
    }
    public static void testSameSizeMatch(){
        assertEquals(0, Utils.findIndex(new int[] {1,2,3,4}, new int[] {1,2,3,4} ));
    }
    public static void testDifferentSizeMatch(){
        assertEquals(3, Utils.findIndex(new int[] {3,5,7,3,32,34,47,56,75,2}, new int[] {3,32,34,47,56} ));
    }
    public static void testZeroMatch(){
        assertEquals(0, Utils.findIndex(new int[] {47,56,75,2,34,47,56,75,2}, new int[] {47,56,75} ));
    }
    public static void testLastMatch(){
        assertEquals(4, Utils.findIndex(new int[] {47,56,75,2,34,47,56,75,2}, new int[] {34,47,56,75,2} ));
    }
    public static void testLastSingleMatch(){
        assertEquals(8, Utils.findIndex(new int[] {47,56,75,5,34,47,56,75,2}, new int[] {2} ));
    }
    public static void testSmallerArray(){
        assertEquals(-1, Utils.findIndex(new int[] {2}, new int[] {47,56,75,5,34,47,56,75,2} ));
    }
    public static void testExample() {
        assertEquals(2, Utils.findIndex(new int[] {2,3,4,5}, new int[] {4,5} ));
    }

}
