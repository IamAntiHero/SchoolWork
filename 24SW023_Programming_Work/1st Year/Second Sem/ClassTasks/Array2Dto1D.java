public class Array2Dto1D {
    public static void main(String[] args) {
        int[][] twoDArray = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        int rows = twoDArray.length;
        int cols = twoDArray[0].length;
        int[] oneDArray = convertTo1D(twoDArray, rows, cols);
        
        System.out.println("Original 2D Array:");
        printArray(twoDArray);
        
        System.out.println("\nConverted 1D Array:");
        printArray(oneDArray);
    }
    
    public static int[] convertTo1D(int[][] twoDArray, int rows, int cols) {
        int[] oneDArray = new int[rows * cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = i * cols + j;
                oneDArray[index] = twoDArray[i][j];
            }
        }
        
        return oneDArray;
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
