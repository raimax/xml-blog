package lt.viko.eif.rcepauskas.blog;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that holds blog's user and post data
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Blog {

    @XmlElementWrapper(name = "posts")
    @XmlElement(name = "post")
    private List<Post> posts;
    @XmlElementWrapper(name = "users")
    @XmlElement(name = "user")
    private List<User> users;

    public Blog() {
        posts = new ArrayList<>();
        users = new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        String blogString = "";

        for (Post post : posts) {
            blogString += post.toString();
        }

        for (User user : users) {
            blogString += user.toString();
        }

        return blogString;
    }
}
