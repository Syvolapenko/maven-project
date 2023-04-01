package com.group10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersonIdTest {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static void main(String[] args) {
        PersonId personId = new PersonId("Max", "Syvolapenko");
        String json = GSON.toJson(personId);
        System.out.println(json);
    }
}