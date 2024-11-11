package com.genesimilarity.api.model;

public class GeneSimilarityResponse {
    private Double distanceScore;
    private Double similarityScore;
    private Integer length;
    private Long processingTime;
    private String status;
    private String createdAt;

    // Getters and setters
    public Double getDistanceScore() {
        return distanceScore;
    }

    public void setDistanceScore(Double distanceScore) {
        this.distanceScore = distanceScore;
    }

    public Double getSimilarityScore() {
        return similarityScore;
    }

    public void setSimilarityScore(Double similarityScore) {
        this.similarityScore = similarityScore;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Long getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(Long processingTime) {
        this.processingTime = processingTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
