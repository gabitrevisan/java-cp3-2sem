package com.genesimilarity.api.model;

import java.util.List;

public class GeneRequest {
    private String tracing_id;
    private String alignment_uuid;
    private List<String> sequences;  // Lista de sequências de DNA

    // Getters and setters
    public String getTracing_id() {
        return tracing_id;
    }

    public void setTracing_id(String tracing_id) {
        this.tracing_id = tracing_id;
    }

    public String getAlignment_uuid() {
        return alignment_uuid;
    }

    public void setAlignment_uuid(String alignment_uuid) {
        this.alignment_uuid = alignment_uuid;
    }

    public List<String> getSequences() {
        return sequences;
    }

    public void setSequences(List<String> sequences) {
        this.sequences = sequences;
    }
}
