package com.example.demo;

public class FindFirstUniqueCharacter {
    static String str = "efficient";
    static String str1 = "mahsa";

    public static void main(String[] args) {
        try {
            System.out.println(findFirstUniqueCharacter(str));
            System.out.println(findFirstUniqueCharacter(str1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * Find the first unique character of the given string.
     * Example: efficient -> c
     */
    private static Character findFirstUniqueCharacter(String input) {
        String str = null;
        char[] outErr = null;
        Character outPut = null;
        if (input.length() == 0 || input.equals(null)) {
            str = "the string is empty";
            outErr = str.toCharArray();
            System.out.println(outErr);
        }

        for (Character ch : input.toCharArray()) {
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                outPut = ch;
                return outPut;
            } else {
                str = "no pair char";
                outErr = str.toCharArray();
                System.out.println(outErr);
            }
        }
        return outPut;
    }
}