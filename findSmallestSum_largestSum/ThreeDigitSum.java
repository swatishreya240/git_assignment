public class ThreeDigitSum {
    public static void main(String[] args) {
        int smallestSum = Integer.MAX_VALUE;
        int largestSum = Integer.MIN_VALUE;

        for (int i = 100; i <= 999; i++) {
            int sum = digitSum(i);
            if (sum < smallestSum) {
                smallestSum = sum;
            }
            if (sum > largestSum) {
                largestSum = sum;
            }
        }

        System.out.println("Smallest three-digit sum: " + smallestSum);
        System.out.println("Largest three-digit sum: " + largestSum);
    }

    // Method to calculate the sum of digits of a number
    private static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}



