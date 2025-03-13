import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] myarr = {1, 2, 3, 4, 5};
        System.out.println("My Array: " + Arrays.toString(myarr));
        
        int[] copy1 = Arrays.copyOf(myarr, myarr.length);
        System.out.println("1st way: " + Arrays.toString(copy1));
        
        int[] copy2 = new int[myarr.length];
        System.arraycopy(myarr, 0, copy2, 0, myarr.length);
        System.out.println("2nd waay: " + Arrays.toString(copy2));
        
        int[] copy3 = myarr.clone();
        System.out.println("3rd way: " + Arrays.toString(copy3));
        
        int[] copy4 = Arrays.copyOfRange(myarr, 0, myarr.length);
        System.out.println("4th way: " + Arrays.toString(copy4));
        
        int[] copy5 = new int[myarr.length];
        for (int i = 0; i < myarr.length; i++) {
            copy5[i] = myarr[i];
        }
        System.out.println("5th way: " + Arrays.toString(copy5));
        
        Integer[] bigNums = new Integer[myarr.length];
        for (int i = 0; i < myarr.length; i++) {
            bigNums[i] = myarr[i];
        }
        List<Integer> mylist = new ArrayList<>(Arrays.asList(bigNums));
        Integer[] copy6 = mylist.toArray(new Integer[0]);
        System.out.println("6th way: " + Arrays.toString(copy6));
        
        int[] copy7 = new int[myarr.length];
        System.arraycopy(myarr, 0, copy7, 0, myarr.length);
        System.out.println("7th way: " + Arrays.toString(copy7));
        
        int[] copy8 = new int[myarr.length + 2];
        System.arraycopy(myarr, 0, copy8, 1, myarr.length);
        System.out.println("8th way: " + Arrays.toString(copy8));
        
        int[] copy9 = new int[myarr.length];
        if (myarr.length > 0) System.arraycopy(myarr, 0, copy9, 0, myarr.length);
        System.out.println("9th way: " + Arrays.toString(copy9));
        
        int[] copy10 = new int[3];
        System.arraycopy(myarr, 1, copy10, 0, 3);
        System.out.println("10th way: " + Arrays.toString(copy10));
    }
                         }
