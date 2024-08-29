public class reverseWordInString {
    public static void main(String[] args) {
        String str = "I am an online educator";
        String result = reverseWords(str);
        System.out.println(result);
    }

    public static String reverseWords(String str) {
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }

        sb.reverse();  // Reverse and append the last word which are in stored in sb
        ans += sb;     // Add the last word to the result

        return ans;
    }
}
