package lt.viko.eif.rcepauskas.blog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;

/**
 * A class that stores user's comment data
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Comment {

    @XmlAttribute
    private Integer id;
    private User author;
    private Date createdAt;
    private String content;

    public Comment() {
    }

    public Comment(Integer id, User author) {
        this.id = id;
        this.author = author;
        this.createdAt = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
