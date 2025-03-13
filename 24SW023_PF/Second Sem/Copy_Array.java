import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(sourceArray));
        
        int[] destination1 = Arrays.copyOf(sourceArray, sourceArray.length);
        System.out.println("1. Arrays.copyOf(): " + Arrays.toString(destination1));
        
        int[] destination2 = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destination2, 0, sourceArray.length);
        System.out.println("2. System.arraycopy(): " + Arrays.toString(destination2));
        
        int[] destination3 = sourceArray.clone();
        System.out.println("3. clone(): " + Arrays.toString(destination3));
        
        int[] destination4 = Arrays.copyOfRange(sourceArray, 0, sourceArray.length);
        System.out.println("4. Arrays.copyOfRange(): " + Arrays.toString(destination4));
        
        int[] destination5 = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            destination5[i] = sourceArray[i];
        }
        System.out.println("5. Manual loop: " + Arrays.toString(destination5));
        
        Integer[] sourceObjectArray = new Integer[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            sourceObjectArray[i] = sourceArray[i];
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(sourceObjectArray));
        Integer[] destination6 = list.toArray(new Integer[0]);
        System.out.println("6. ArrayList conversion: " + Arrays.toString(destination6));
        
        int[] destination7 = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destination7, 0, sourceArray.length);
        System.out.println("7. Copy full array: " + Arrays.toString(destination7));
        
        int[] destination8 = new int[sourceArray.length + 2];
        System.arraycopy(sourceArray, 0, destination8, 1, sourceArray.length);
        System.out.println("8. Copy with offset: " + Arrays.toString(destination8));
        
        int[] destination9 = new int[sourceArray.length];
        if (sourceArray.length >= 0) System.arraycopy(sourceArray, 0, destination9, 0, sourceArray.length);
        System.out.println("9. Copy with check: " + Arrays.toString(destination9));
        
        int[] destination10 = new int[3];
        System.arraycopy(sourceArray, 1, destination10, 0, 3);
        System.out.println("10. Copy subset: " + Arrays.toString(destination10));
    }
}
