public class Bitwise_Operator {
    public static void main(String[] args) {
        int a = 5; // In binary: 0101
        int b = 3; // In binary: 0011

        // Bitwise AND
        int andResult = a & b; // Result: 1 (0001 in binary)
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b; // Result: 7 (0111 in binary)
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // Result: 6 (0110 in binary)
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // Result: -6 (in two's complement)
        System.out.println("Bitwise NOT of a: " + notResult);
    }
    
}
