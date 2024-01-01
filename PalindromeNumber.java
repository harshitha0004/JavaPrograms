class Solution {
    public boolean isPalindrome(int x) {
        int num1 = x;
        int num2 = 0;

        while (x > 0) {
            int digit = x % 10;
            num2 = num2 * 10 + digit;
            x = x / 10;
        }

        return num1 == num2;
    }
    }
