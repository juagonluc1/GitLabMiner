package AissProyect.GitLabMiner.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="issues")

public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="ref_id")
    private String ref_id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="state")
    private String state;

    @Column(name="created_at")
    private String created_at;

    @Column(name="updated_at")
    private String updated_at;

    @Column(name="closed_at")
    private String closed_at;

    @Column(name="labels")
    private List<String> labels;

    @Column(name="upvotes")
    private Integer upvotes;

    @Column(name="downvotes")
    private Integer downvotes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name="issue_id")
    private List<Comment> comments;

    public Issue(){

    }
    public Issue(String ref_id, String title, String description, String state, String created_at,
                 String updated_at, String closed_at, List<String> labels, Integer upvotes, Integer downvotes) {
        this.ref_id = ref_id;
        this.title = title;
        this.description = description;
        this.state = state;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.closed_at = closed_at;
        this.labels = labels;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.comments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getRef_id() {
        return ref_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getState() {
        return state;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getClosed_at() {
        return closed_at;
    }

    public List<String> getLabels() {
        return labels;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public Integer getDownvotes() {
        return downvotes;
    }
/*
    public void setId(String id) {
        this.id = id;
    }

    public void setRef_id(String ref_id) {
        this.ref_id = ref_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setClosed_at(String closed_at) {
        this.closed_at = closed_at;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public void setDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
    }
     */
}
