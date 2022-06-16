package com.company;

import java.util.*;

public class Main {
    public String breakDownWordReverse(String word) {
        StringBuilder sortedWord = new StringBuilder();
        String reverseWord = "";
        List sortWord = new ArrayList();
        String[] splitWord = word.split("");
        sortWord = Arrays.asList(splitWord);
        Collections.reverse(sortWord);
        for (Object letter : sortWord){
            sortedWord.append(letter);
        }
        return sortedWord.toString();
    }

    public String spinWords(String sentence) {
        //TODO: Code stuff here
        StringBuilder finalSentence = new StringBuilder();
        String finalWord = "";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() > 4) {
                finalSentence.append(breakDownWordReverse(word) + " ");
            } else {
                finalSentence.append(word + " ");
            }
        }
        finalWord = finalSentence.toString().trim();
        System.out.println(finalWord);
        return finalWord;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Main testMain = new Main();
        testMain.spinWords(inputString);
    }
}
