public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Fibonacci Series (first " + n + " terms):");
        
        int[] fibonacci = generateFibonacci(n);
        
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
    
    public static int[] generateFibonacci(int n) {
        int[] fibonacci = new int[n];
        
        if (n >= 1) {
            fibonacci[0] = 0;
        }
        
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        return fibonacci;
    }
}
