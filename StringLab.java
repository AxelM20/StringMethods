 import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        // Task 1: Working with String Methods
        System.out.println("== Task 1: String Methods ==");

        String str = " Welcome to the Java String Lab! ";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // substring()
        System.out.println("Substring 'Java': " + str.substring(18, 22));

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // contains()
        System.out.println("Contains 'Lab': " + str.contains("Lab"));

        // replace()
        System.out.println("Replace 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));

        // split()
        System.out.println("Split by spaces:");
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        // trim()
        System.out.println("Trimmed string: '" + str.trim() + "'");

        // equals() and equalsIgnoreCase()
        String compareStr = "java string lab!";
        System.out.println("Equals: " + str.trim().equals(compareStr));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(compareStr));

        // Task 2: Loop Challenges with Strings
        System.out.println("\n== Task 2: Loop Challenges ==");

        // For Loop: Count Vowels
        int vowelCount = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        // While Loop: Check for Palindrome
        String word = "racecar";
        int left = 0, right = word.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is '" + word + "' a palindrome? " + isPalindrome);

        // Do...While Loop: Input Validation
        Scanner input = new Scanner(System.in);
        String userSentence;
        do {
            System.out.print("Enter a sentence that contains 'Java': ");
            userSentence = input.nextLine();
        } while (!userSentence.contains("Java"));
        System.out.println("Thank you!");

        // Task 3: StringBuilder
        System.out.println("\n== Task 3: StringBuilder ==");

        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);

        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sb);

        int startDelete = sb.indexOf("Learning");
        int endDelete = startDelete + "Learning".length();
        sb.delete(startDelete, endDelete);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Task 4: StringBuffer
        System.out.println("\n== Task 4: StringBuffer ==");

        StringBuffer buffer = new StringBuffer("Multithreading Lab");
        buffer.append(" - Learning Java");
        System.out.println("After append: " + buffer);

        buffer.insert(buffer.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + buffer);

        int startDel = buffer.indexOf("Learning");
        int endDel = startDel + "Learning".length();
        buffer.delete(startDel, endDel);
        System.out.println("After delete: " + buffer);

        buffer.reverse();
        System.out.println("After reverse: " + buffer);
    }
}
