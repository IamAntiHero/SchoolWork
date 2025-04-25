public class ArraySplitter {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int splitPoint = 5;
        
        int[] firstPart = new int[splitPoint];
        int[] secondPart = new int[originalArray.length - splitPoint];
        
        splitArray(originalArray, firstPart, secondPart, splitPoint);
        
        System.out.print("Original array: ");
        printArray(originalArray);
        
        System.out.print("First part: ");
        printArray(firstPart);
        
        System.out.print("Second part: ");
        printArray(secondPart);
    }
    
    public static void splitArray(int[] original, int[] firstPart, int[] secondPart, int splitPoint) {
        for (int i = 0; i < splitPoint; i++) {
            firstPart[i] = original[i];
        }
        
        for (int i = 0; i < secondPart.length; i++) {
            secondPart[i] = original[splitPoint + i];
        }
    }
    
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
