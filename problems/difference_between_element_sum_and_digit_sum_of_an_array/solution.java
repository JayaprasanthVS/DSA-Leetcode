class Solution {
    public int differenceOfSum(int[] nums) {
        int totalSum = 0;  // Sum of all the elements in the array
        int digitSum = 0;  // Sum of the digits of the elements in the array

        for (int num : nums) {
            totalSum += num;  // Add the number to the total sum

            // Sum the digits of the number if it's greater than or equal to 10
            while (num > 0) {
                digitSum += num % 10;  // Add the last digit to digitSum
                num /= 10;  // Remove the last digit
            }
        }

        // Return the absolute difference between the two sums
        return Math.abs(totalSum - digitSum);
    }
}
