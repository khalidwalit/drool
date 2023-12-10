package com.springhow.examples.drools.domain;

public class AnxityScore {
    private Integer id;
    private Integer totalScore;

    private String anxitytype;
    private String possibility;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public String getPossibility() {
        return possibility;
    }

    public void setPossibility(String possibility) {
        this.possibility = possibility;
    }

    public String getAnxitytype() {
        return anxitytype;
    }

    public void setAnxitytype(String anxitytype) {
        this.anxitytype = anxitytype;
    }
}
