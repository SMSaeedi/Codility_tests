package com.example.demo;

public class FindFirstUniqueCharacter {
    static String str = "efficient";
    static String str1 = "mahsa";
    static String str2 = "ssff";
    static String str3 = "";

    public static void main(String[] args) {
        System.out.println(findFirstUniqueCharacter(str));
        System.out.println(findFirstUniqueCharacter(str1));
        System.out.println(findFirstUniqueCharacter(str2));
        System.out.println(findFirstUniqueCharacter(str3));
    }

    /*
     * Find the first unique character of the given string.
     * Example: efficient -> c
     */
    private static Character findFirstUniqueCharacter(String input) {
        String str;
        boolean uniqueCount = false;
        Character outPut = null;

        if (input.length() == 0 || input.equals(null)) {
            str = "the string is empty";
            System.out.println(str);
            return Character.valueOf(str.toCharArray()[3]);
        }

        for (Character ch : input.toCharArray()) {
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                outPut = ch;
                uniqueCount = true;
                return outPut;
            }
        }

        if (!uniqueCount) {
            str = "no first pair char";
            System.out.println(str);
            return Character.valueOf(str.toCharArray()[2]);
        }

        return null;
    }
}