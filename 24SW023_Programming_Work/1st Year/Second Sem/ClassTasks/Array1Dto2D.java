public class Array1Dto2D {
    public static void main(String[] args) {
        int[] oneDArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int rows = 3;
        int cols = 4;
        
        int[][] twoDArray = convertTo2D(oneDArray, rows, cols);
        
        System.out.println("Original 1D Array:");
        printArray(oneDArray);
        
        System.out.println("\nConverted 2D Array:");
        printArray(twoDArray);
    }
    
    public static int[][] convertTo2D(int[] oneDArray, int rows, int cols) {
        int[][] twoDArray = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = i * cols + j;
                
                if (index < oneDArray.length) {
                    twoDArray[i][j] = oneDArray[index];
                }
            }
        }
        
        return twoDArray;
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
