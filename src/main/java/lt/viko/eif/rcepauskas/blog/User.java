package lt.viko.eif.rcepauskas.blog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;

/**
 * A class that stores user's data
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

    @XmlAttribute
    private Integer id;
    private String username;
    private String email;
    private Date joinedAt;

    public User() {
    }

    public User(Integer id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.joinedAt = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Date joinedAt) {
        this.joinedAt = joinedAt;
    }

    @Override
    public String toString() {
        String userString = "\n\t\t\tid: " + this.id + "\n\t\t"
                + "\tusername: " + this.username + "\n\t\t"
                + "\temail: " + this.email + "\n\t\t"
                + "\tjoined at:" + this.joinedAt;

        return userString;
    }
}
