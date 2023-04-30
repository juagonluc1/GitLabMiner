package AissProyect.GitLabMiner.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name="name")
    private String name;

    @Column(name="avatar_url")
    private String name_url;

    @Column(name="web_url")
    private String web_url;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Comment> comments;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Issue> issues;

    public User(){
    }

    public User(String username, String name, String name_url, String web_url) {
        this.username = username;
        this.name = name;
        this.name_url = name_url;
        this.web_url = web_url;
        this.comments = new ArrayList<>();
        this.issues = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getName_url() {
        return name_url;
    }

    public String getWeb_url() {
        return web_url;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Issue> getIssues() {
        return issues;
    }
/*
    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName_url(String name_url) {
        this.name_url = name_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setIssues(List<Comment> issues) {
        this.issues = issues;
    }
     */
}
