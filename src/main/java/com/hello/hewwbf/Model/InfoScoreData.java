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
    private int webscore;

    @Column
    private int appscore;

    @Column
    private int blockchainscore;

    @Column
    private int mlscore;

    @Column
    private int designscore;

    @Column
    private int infosecscore;

    @Column
    private int fossscore;

    public InfoScoreData() {
    }


    public InfoScoreData(int scoreId,int fossscore, String githubownername, int webscore, int infosecscore, int appscore, int blockchainscore, int mlscore, int designscore) {
        this.scoreId = scoreId;
        this.githubownername = githubownername;
        this.webscore = webscore;
        this.appscore = appscore;
        this.blockchainscore = blockchainscore;
        this.mlscore = mlscore;
        this.designscore = designscore;
        this.infosecscore = infosecscore;
        this.fossscore = fossscore;
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

    public int getWebscore() {
        return this.webscore;
    }

    public void setWebscore(int webscore) {
        this.webscore = webscore;
    }

    public int getAppscore() {
        return this.appscore;
    }

    public void setAppscore(int appscore) {
        this.appscore = appscore;
    }

    public int getBlockchainscore() {
        return this.blockchainscore;
    }

    public void setBlockchainscore(int blockchainscore) {
        this.blockchainscore = blockchainscore;
    }

    public int getMlscore() {
        return this.mlscore;
    }

    public void setMlscore(int mlscore) {
        this.mlscore = mlscore;
    }

    public int getDesignscore() {
        return this.designscore;
    }

    public void setDesignscore(int designscore) {
        this.designscore = designscore;
    }
    
    public int getInfosecscore() {
        return this.infosecscore;
    }

    public void setInfosecscore(int infosecscore) {
        this.infosecscore = infosecscore;
    }

    public int getFossscore() {
        return this.fossscore;
    }

    public void setFossscore(int fossscore) {
        this.fossscore = fossscore;
    }
}
