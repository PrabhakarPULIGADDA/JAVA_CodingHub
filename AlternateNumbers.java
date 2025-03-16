class AlternateNumbers {
    public static void main(String[] args) {
        int num = 25789; // Example number
        int count = 0; // To track position
        String result = ""; // To store alternate digits

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            if (count % 2 == 0) { // Check if position is alternate
                result = digit + result; // Add digit to result
            }
            count++;
            num = num / 10; // Remove the last digit
        }

        System.out.println("Alternate digits: " + result);
    }
}
