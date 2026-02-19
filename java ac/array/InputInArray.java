public class InputInArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        
        // Simulating input into the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10; // Example input: multiples of 10
        }
        
        // Displaying the contents of the array
        System.out.println("Array contents:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }    
}
