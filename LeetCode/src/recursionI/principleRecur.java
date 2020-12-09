package recursionI;

public class principleRecur {

    // Print a string in reverse order via recursion.
    public static void printReverse(String str) {
        if(str.length() <= 0) {
            System.out.print('\n');
        } else {
            System.out.print(str.charAt(str.length() - 1));
            printReverse(str.substring(0, str.length() - 1));
        }
    }

    // Reverse a char array IN place, a.k.a without creating a new array.
    public static void helpReverse(char[] s, int left, int right) {
        char tmp;

        if(left >= right) {
            return;
        } else {
            tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            helpReverse(s, left + 1, right - 1);
        }
    }
    public static void reverseArray(char[] s) {
        helpReverse(s, 0, s.length - 1);
    }

    public static void main(String[] args) {
        char[] s = {'h','e', 'l', 'l', 'o'};
        reverseArray(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}
