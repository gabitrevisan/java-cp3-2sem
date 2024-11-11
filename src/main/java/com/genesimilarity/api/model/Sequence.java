package com.genesimilarity.api.model;

public class Sequence {
    private String sequenceUuid;
    private String sequence;

    // Construtor vazio
    public Sequence() {}

    // Getters e Setters
    public String getSequenceUuid() {
        return sequenceUuid;
    }

    public void setSequenceUuid(String sequenceUuid) {
        this.sequenceUuid = sequenceUuid;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
