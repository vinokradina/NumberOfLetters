package org.example;

public class Main {
    public static void main(String[] args) {
    }

    public static int countLetters(String str) {
        int count = 0;
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                count++;
            }
        }
        return count;
    }
}
