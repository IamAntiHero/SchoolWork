import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] myarr = {1, 2, 3, 4, 5};
        System.out.println("My Array: " + Arrays.toString(myarr));
        
        int[] copy = myarr.clone();
        System.out.println("Copied Array: " + Arrays.toString(copy));
    }
}
