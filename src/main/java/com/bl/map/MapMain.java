package com.bl.map;

public class MapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = hashmap.get(word);
            if (value == null) {
                value = 1;
            }
            value += 1;
            hashmap.add(word, value);
        }
        System.out.println(hashmap);
    }
}


