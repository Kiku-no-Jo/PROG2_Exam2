package com.yangusTrip.Places;

import java.time.LocalDate;

public class Review {
    private int id;
    private User author;
    private String details;
    private double score;
    private LocalDate reviewDate;

    public Review(int id, User author, String details, double score, LocalDate reviewDate) {
        this.id = id;
        this.author = author;
        this.details = details;
        this.score = score;
        this.reviewDate = reviewDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 1 || score > 5) {
            throw new IllegalArgumentException(score + " is not a valid score. Score must be between 1 and 5");
        }
        this.score = score;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }
}
