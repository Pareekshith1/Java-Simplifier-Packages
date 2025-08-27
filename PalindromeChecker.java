public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // checks for palindrome string and returns boolean value.
        if (str == null)
            return false;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
