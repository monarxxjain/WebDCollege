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

    public InfoData(int userId, String githhubwebdev, String githhubappdev, String githubownername, String githubreponame, String githubblockchain, String githubdesign, String githubml, String codeforcesusername) {

        this.githhubwebdev = githhubwebdev;
        this.githhubappdev = githhubappdev;
        this.githubownername = githubownername;
        this.githubreponame = githubreponame;
        this.githubblockchain = githubblockchain;
        this.githubdesign = githubdesign;
        this.githubml = githubml;
        this.codeforcesusername = codeforcesusername;
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
    


}
