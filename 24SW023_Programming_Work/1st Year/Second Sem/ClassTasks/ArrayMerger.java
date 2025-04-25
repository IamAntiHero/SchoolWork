public class ArrayMerger {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.print("First array: ");
        printArray(array1);

        System.out.print("Second array: ");
        printArray(array2);
        
        int[] mergedArray = mergeArrays(array1, array2);
        System.out.print("Merged array: ");
        printArray(mergedArray);
    }
    

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        // Copy elements from the first array
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        
        // Copy elements 
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        
        return mergedArray;
    }
    
    // Helper function to print an array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
