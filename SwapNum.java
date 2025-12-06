public class SwapNum {

    // Method 1: Swap using a temporary variable
    public static int[] swapWithTemp(int a, int b) {
        // Store the value of 'a' in a temporary variable
        int temp = a;
        // Assign the value of 'b' to 'a'
        a = b;
        // Assign the original value of 'a' (stored in 'temp') to 'b'
        b = temp;
        // Return the swapped values as an array
        return new int[]{a, b};
    }

    
    
    // Method 2: Swap using XOR (bitwise operation)
    public static int[] swapWithXOR(int a, int b) {
        // XOR the values and store the result in 'a'
        a = a ^ b;
        // XOR the new 'a' with 'b' to get the original 'a' and store in 'b'
        b = a ^ b;
        // XOR the new 'a' with the new 'b' to get the original 'b' and store in 'a'
        a = a ^ b;
        // Return the swapped values as an array
        return new int[]{a, b};
    }

    
    
    // Method 3: Swap using Arithmetic operations (Addition and Subtraction)
    public static int[] swapWithArithmetic(int a, int b) {
        // Add 'a' and 'b' and store the sum in 'a'
        a = a + b;
        // Subtract 'b' from the sum to get the original 'a' and store in 'b'
        b = a - b;
        // Subtract the new 'b' (original 'a') from the sum to get the original 'b' and store in 'a'
        a = a - b;
        // Return the swapped values as an array
        return new int[]{a, b};
    }

    
    
    // Method 4: Swap using Multiplication and Division
    public static int[] swapWithMultiplication(int a, int b) {
        // Ensure neither number is zero to avoid division by zero
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Cannot swap using multiplication when one number is zero.");
        }
        // Multiply 'a' and 'b' and store the product in 'a'
        a = a * b;
        // Divide the product by 'b' to get the original 'a' and store in 'b'
        b = a / b;
        // Divide the product by the new 'b' (original 'a') to get the original 'b' and store in 'a'
        a = a / b;
        // Return the swapped values as an array
        return new int[]{a, b};
    }

    
    
    // Method 5: Swap using Collections (List)
    public static java.util.List<Integer> swapWithList(int a, int b) {
        // Return the swapped values by reversing their order in a list
        return java.util.Arrays.asList(b, a);
    }

    
    
    
    public static void main(String[] args) {
        int a = 2, b = 3;  // Initial values to be swapped

        // Swap using Temporary Variable
        int[] swappedTemp = swapWithTemp(a, b);
        System.out.println("Swap using Temporary Variable: a = " + swappedTemp[0] + ", b = " + swappedTemp[1]);

        // Swap using XOR (Bitwise Operation)
        int[] swappedXOR = swapWithXOR(a, b);
        System.out.println("Swap using XOR: a = " + swappedXOR[0] + ", b = " + swappedXOR[1]);

        // Swap using Arithmetic (Addition/Subtraction)
        int[] swappedArithmetic = swapWithArithmetic(a, b);
        System.out.println("Swap using Arithmetic: a = " + swappedArithmetic[0] + ", b = " + swappedArithmetic[1]);

        // Swap using Multiplication and Division
        int[] swappedMultiplication = swapWithMultiplication(a, b);
        System.out.println("Swap using Multiplication: a = " + swappedMultiplication[0] + ", b = " + swappedMultiplication[1]);

        // Swap using List (Collections)
        java.util.List<Integer> swappedList = swapWithList(a, b);
        System.out.println("Swap using List: a = " + swappedList.get(0) + ", b = " + swappedList.get(1));
    }
}
