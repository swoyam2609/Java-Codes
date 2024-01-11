package ApnaCollegeCourse.L19RecursionIII;

public class permutations {
    static void printPermutation(String prefix, String input) {
        if (input.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < input.length(); i++) {
                char temp = input.charAt(i);
                printPermutation(prefix+temp, input.substring(0, i)+input.substring(i+1));
            }
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        printPermutation("", input);
    }
}
