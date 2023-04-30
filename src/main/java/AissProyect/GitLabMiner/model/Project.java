package AissProyect.GitLabMiner.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="projects")

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="web_url")
    private String web_url;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "project_id")
    private List<Commit> commits;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "project_id")
    private List<Issue> issues;

    public Project(){

    }

    public Project(String name, String web_url) {
        this.name = name;
        this.web_url = web_url;
        this.commits = new ArrayList<>();
        this.issues = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWeb_url() {
        return web_url;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public List<Issue> getIssues() {
        return issues;
    }
/*
    public void setName(String name) {
        this.name = name;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }
    */
}
