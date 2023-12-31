package com.karel.program;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translations;

    public Dictionary() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public int amountOfWords() {
        return translations.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        for (String key : translations.keySet()) {
            list.add(key + " = " + translations.get(key));
        }
        return list;
    }
}
