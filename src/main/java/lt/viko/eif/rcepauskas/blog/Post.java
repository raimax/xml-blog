package lt.viko.eif.rcepauskas.blog;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Post {

    @XmlAttribute
    private Integer id;
    private String title;
    private String category;
    private User author;
    private Date createdAt;
    private String summary;
    private String content;
    private Integer views;
    @XmlElementWrapper(name = "ratings")
    @XmlElement(name = "rating")
    private List<Rating> ratings;
    @XmlElementWrapper(name = "comments")
    @XmlElement(name = "comment")
    private List<Comment> comments;
    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private List<String> tags;

    public Post() {
        this.ratings = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.tags = new ArrayList<>();
    }

    public Post(Integer id, String title, String category, User author, Integer views) {
        this.ratings = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.createdAt = new Date();
        this.views = views;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
