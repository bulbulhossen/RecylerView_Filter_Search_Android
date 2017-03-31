package com.example.bulbulhossenbd.recylerview_filter_searchbox;

/**
 * Created by bulbulhossenbd on 3/31/2017.
 */

public class QuizObject {
    private int id;
    private String word;
    private String meaning;

    public QuizObject(int id, String word) {
        this.id = id;
        this.word = word;
    }

    public QuizObject(int id, String word, String meaning) {
        this.id = id;
        this.word = word;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }
}