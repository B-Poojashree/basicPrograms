public class palindromesubstring {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println("Palindromic substrings:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
