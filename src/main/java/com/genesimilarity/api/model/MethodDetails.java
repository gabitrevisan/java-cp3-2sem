package com.genesimilarity.api.model;

import java.util.List;

public class MethodDetails {
    private String name;
    private String about;
    private List<String> references;

    // Construtor vazio
    public MethodDetails() {}

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }
}
