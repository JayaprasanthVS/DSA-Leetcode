public class Solution {
    public String reverseVowels(String s) {
       
         char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU"; // All vowels, lowercase and uppercase

        while (left < right) {
            // Move the left pointer to the right until a vowel is found
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move the right pointer to the left until a vowel is found
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            // Swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        // Convert the character array back to a string
        return new String(chars);
    }
}
