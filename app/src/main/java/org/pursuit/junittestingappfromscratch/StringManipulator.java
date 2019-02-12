package org.pursuit.junittestingappfromscratch;

import java.util.ArrayList;
import java.util.List;

public class StringManipulator {

    private static StringManipulator instance;

    public static StringManipulator getInstance() {
        if (instance == null) {
            instance = new StringManipulator();
        }
        return instance;
    }

    private StringManipulator() {

    }

    public boolean isLessThan10(String input) {

        return input.length() < 10;
    }

    public boolean isOddLength(String input) {

        return (input.length() % 2) == 1;
    }

    public String zipperWords(String first, String second) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();

        while (i < first.length() && j < second.length()) {
            sb.append(first.charAt(i++));
            sb.append(second.charAt(j++));
        }
        if (i != first.length()) {
            sb.append(first.substring(i));
        }
        if (j != second.length()) {
            sb.append(second.substring(j));
        }
        return sb.toString();
    }

    public String deconstructedWord(String word) {

        String consanants =  word.replaceAll("AEIOUaeiou", "");

        if(!word.contains(consanants)){
            return word.replaceAll(consanants,"AEIOUaeiou");

        }else return consanants;

    }


}



