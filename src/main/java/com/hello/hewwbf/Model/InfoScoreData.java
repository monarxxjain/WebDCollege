package com.hello.hewwbf.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "infoscore")
public class InfoScoreData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int scoreId;

    @Column
    private String githubownername;

    @Column
    private int score;

    public InfoScoreData() {
    }

    public InfoScoreData(int scoreId, String githubownername, int score) {
        this.scoreId = scoreId;
        this.githubownername = githubownername;
        this.score = score;
    }

    public int getScoreId() {
        return this.scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    public String getGithubownername() {
        return this.githubownername;
    }

    public void setGithubownername(String githubownername) {
        this.githubownername = githubownername;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
