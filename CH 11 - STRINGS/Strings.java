import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    // Palindromic String
    public static boolean validPalindrome(String str) {
        // Two pointer approach
        // int start = 0, end = str.length() - 1;
        // while (start<end) {
        // if (str.charAt(start)!=str.charAt(end)) {
        // return false;
        // }
        // start++;
        // end--;
        // }
        // return true;
        // by for loop
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not a palindrome
                return false;
            }
        }
        return true;
    }

    // Shortest Path
    public static float getPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // South
            if (direction == 'S') {
                y--;
            }
            // North
            else if (direction == 'N') {
                y++;
            }
            // West
            else if (direction == 'W') {
                x--;
            }
            // East
            else if (direction == 'E') {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    // Substring
    public static String substring(String str, int start, int end) {
        String substr = "";
        for (int i = start; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    // toUpperCase
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    // String compression
    public static String compress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");
        // Strings are immutable
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a word : ");
        // String name;
        // String name1;
        // name = sc.next(); // Takes only word
        // System.out.print("Enter the full sentence : ");
        // name1 = sc.nextLine();
        // System.out.println("String name is : " + name);
        // System.out.println("String name1 is : " + name1);
        // System.out.println("The length of the String is : "+name1.length());

        // Concatenation
        // String firstName = "Prakash";
        // String lastName = "Tiwari";
        // String fullName = firstName + " " + lastName;
        // System.out.println("Concatenated String is : " + fullName);
        // System.out.println("Char at index 0 is " + fullName.charAt(0));
        // printLetters(fullName);
        // String str = "racecar";
        // System.out.println("String " + str + " is a valid palindrome : " +
        // validPalindrome(str));
        // String path = "WNEENESENNN";
        // System.out.print("The path length from start to destination is " +
        // getPath(path));

        // Comparison
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if (s1 == s2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        // if (s1 == s3) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // if(s1.equals(s3)){
        // System.out.println("Strings are equal");
        // } else{
        // System.out.println("Strings are not equal");
        // }

        // Substring
        // String str = "Hello World";
        // System.out.println("Substring is : "+str.substring(2,7));
        // System.out.println(substring(str, 0, 5));

        // String fruits[] = { "apple", "mango", "banana" };

        // String largest = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }
        // }
        // System.out.println(largest);

        // String Builders
        // StringBuilder sb = new StringBuilder("");
        // for(char ch ='a';ch<='z';ch++){
        // sb.append(ch);
        // }
        // System.out.println(sb);

        // String str = "hii, i am sadie";
        // System.out.println("To uppercase : " + toUpperCase(str));

        String str = "aaabbcccdd";
        System.out.println(compress(str));
        sc.close();
    }
}
