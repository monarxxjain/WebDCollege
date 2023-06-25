package com.hello.hewwbf.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "info")
public class InfoData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;

    @Column
    private String githhubwebdev;

    @Column
    private String githhubappdev;

    @Column
    private String githubownername;

    @Column
    private String githubreponame;

    @Column
    private String githubblockchain;

    @Column
    private String githubdesign;

    @Column
    private String githubml;

    @Column
    private String codeforcesusername;

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

    public InfoData(int userId,int fossscore, int infosecscore, int webscore, int appscore, int blockchainscore, int mlscore, int designscore, String githhubwebdev, String githhubappdev, String githubownername, String githubreponame, String githubblockchain, String githubdesign, String githubml, String codeforcesusername) {

        this.githhubwebdev = githhubwebdev;
        this.githhubappdev = githhubappdev;
        this.githubownername = githubownername;
        this.githubreponame = githubreponame;
        this.githubblockchain = githubblockchain;
        this.githubdesign = githubdesign;
        this.githubml = githubml;
        this.codeforcesusername = codeforcesusername;
        this.webscore=webscore;
        this.appscore=appscore;
        this.blockchainscore= blockchainscore;
        this.mlscore=mlscore;
        this.designscore=designscore;
        this.infosecscore=infosecscore;
        this.fossscore = fossscore;
    }


    public InfoData() {

    }


    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGithhubwebdev() {
        return this.githhubwebdev;
    }

    public void setGithhubwebdev(String githhubwebdev) {
        this.githhubwebdev = githhubwebdev;
    }

    public String getGithhubappdev() {
        return this.githhubappdev;
    }

    public void setGithhubappdev(String githhubappdev) {
        this.githhubappdev = githhubappdev;
    }

    public String getGithubownername() {
        return this.githubownername;
    }

    public void setGithubownername(String githubownername) {
        this.githubownername = githubownername;
    }

    public String getGithubreponame() {
        return this.githubreponame;
    }

    public void setGithubreponame(String githubreponame) {
        this.githubreponame = githubreponame;
    }

    public String getGithubblockchain() {
        return this.githubblockchain;
    }

    public void setGithubblockchain(String githubblockchain) {
        this.githubblockchain = githubblockchain;
    }

    public String getGithubdesign() {
        return this.githubdesign;
    }

    public void setGithubdesign(String githubdesign) {
        this.githubdesign = githubdesign;
    }

    public String getGithubml() {
        return this.githubml;
    }

    public void setGithubml(String githubml) {
        this.githubml = githubml;
    }

    public String getCodeforcesusername() {
        return this.codeforcesusername;
    }

    public void setCodeforcesusername(String codeforcesusername) {
        this.codeforcesusername = codeforcesusername;
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
