package AissProyect.GitLabMiner.model;

import javax.persistence.*;

@Entity
@Table(name="commits")

public class Commit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="title")
    private String title;

    @Column(name="message")
    private String message;

    @Column(name="author_name")
    private String author_name;

    @Column(name="author_email")
    private String author_email;

    @Column(name="authored_date")
    private String authored_date;

    @Column(name="committer_name")
    private String committer_name;

    @Column(name="committer_email")
    private String committer_email;

    @Column(name="committed_date")
    private String committed_date;

    @Column(name="web_url")
    private String web_url;

    public Commit(){

    }
    public Commit(String title, String message, String author_name, String author_email, String authored_date,
                  String committer_name, String committer_email, String committed_date, String web_url) {
        this.title = title;
        this.message = message;
        this.author_name = author_name;
        this.author_email = author_email;
        this.authored_date = authored_date;
        this.committer_name = committer_name;
        this.committer_email = committer_email;
        this.committed_date = committed_date;
        this.web_url = web_url;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getAuthor_email() {
        return author_email;
    }

    public String getAuthored_date() {
        return authored_date;
    }

    public String getCommitter_name() {
        return committer_name;
    }

    public String getCommitter_email() {
        return committer_email;
    }

    public String getCommitted_date() {
        return committed_date;
    }

    public String getWeb_url() {
        return web_url;
    }
/*
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }

    public void setAuthored_date(String authored_date) {
        this.authored_date = authored_date;
    }

    public void setCommitter_name(String committer_name) {
        this.committer_name = committer_name;
    }

    public void setCommitter_email(String committer_email) {
        this.committer_email = committer_email;
    }

    public void setCommitted_date(String committed_date) {
        this.committed_date = committed_date;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }
     */
}
