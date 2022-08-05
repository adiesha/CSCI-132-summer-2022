package org.csci132;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @author : Adiesha
 * @created : 7/28/2022, Thursday
 **/
public class DuplicatedWord {
    public static void wordFrequency(String input) {
        // create a dictionary that can have keep Strings as keys and Integers as values
        // iterate the input string word by word
        // convert the word into lowercase word
        // remove unnecessary punctuation symbols
        // Input the word to the dictionary as a key if it does not contain the word, and the value 1
        // If the word already is in the dictionary update the value associated with that key by incrementing it by 1
        // Once you finish processing these words print each word and its frequency of occurrence in the sentence
        Map<String, Integer> wordMap = new HashMap<>();
        input = input.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "");
        input = input.toLowerCase(Locale.ROOT);
        for (String word : input.split(" ")) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.printf("Sentence: %s\n", input);

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.printf("Word: %s -> Frequency: %d%n", entry.getKey(), entry.getValue());
        }

        System.out.println("____________________________________________________________");
    }
}
