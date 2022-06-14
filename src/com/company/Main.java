package com.company;

import java.util.*;

public class Main {
    public String breakDownWordReverse(String word){
        String reverseWord = null;
        List sortWord = new ArrayList();
        String[] splitWord = word.split("");
        sortWord = Arrays.asList(splitWord);
        Collections.reverse(sortWord);
        System.out.println(sortWord);


return reverseWord;

    }
    public String spinWords(String sentence) {
        //TODO: Code stuff here
        StringBuilder finalSentence = new StringBuilder();
        String finalWord =null;
        String[] words = sentence.split(" ");
        for(String word: words ){
            if(word.length()>4){
                finalWord = breakDownWordReverse(word);
                System.out.println(word);

                finalWord = word;
            }else{
                finalSentence.append(word + " ");
                finalWord = finalSentence.toString();

            }

        }


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
