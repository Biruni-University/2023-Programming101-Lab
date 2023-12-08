public class Q2 {
    public static void main(String[] args) {
        // Example double value
        double myDouble = 129.456;

        // Casting double to byte
        byte myByte = (byte) myDouble;

        // Printing results
        System.out.println("Original double value: " + myDouble);
        System.out.println("Casted byte value: " + myByte);

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("1. The double value is " + myDouble);
        System.out.println("2. When casting to byte, only the integer part is considered.");
        System.out.println("3. Byte can only hold values from -128 to 127.");
        System.out.println("4. If the integer part of double is larger than 127, it wraps around due to overflow.");
        System.out.println("5. In this case, " + (int) myDouble + " is casted to byte, resulting in " + myByte);
    }
}

