package lt.viko.eif.rcepauskas.blog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BlogTest {

    Blog blog;

    @BeforeEach
    void setUp() {
        blog = new Blog();
        Assertions.assertNotNull(blog);
    }

    @Test
    void setPosts() {
        List<Post> posts = new ArrayList<>();
        Post post = new Post();
        post.setId(444);
        posts.add(post);
        blog.setPosts(posts);

        Assertions.assertNotNull(blog.getPosts());
        Assertions.assertEquals(444, blog.getPosts().stream().filter(p -> p.getId() == 444).findAny().get().getId());
    }

    @Test
    void setUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(444);
        users.add(user);
        blog.setUsers(users);

        Assertions.assertNotNull(blog.getUsers());
        Assertions.assertEquals(444, blog.getUsers().stream().filter(p -> p.getId() == 444).findAny().get().getId());
    }

    @Test
    void getPosts() {
        List<Post> posts = new ArrayList<>();
        blog.setPosts(posts);

        assertEquals(posts, blog.getPosts());
    }

    @Test
    void getUsers() {
        List<User> users = new ArrayList<>();
        blog.setUsers(users);

        assertEquals(users, blog.getPosts());
    }
}