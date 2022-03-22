package lt.viko.eif.rcepauskas.blog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    Post post;

    @BeforeEach
    void setUp() {
        post = new Post();
        assertNotNull(post);
    }

    @Test
    void setContentWithSummary() {
        post.setContentWithSummary("contentcontentcontentcontentcontentcontent");

        assertEquals("contentcontentcontentcontentcontentcontent", post.getContent());
        assertEquals("contentcontentcontentcontentcontentconte...", post.getSummary());

        post.setContentWithSummary("content");

        assertEquals("content", post.getContent());
        assertEquals("content", post.getSummary());
    }

    @Test
    void setId() {
        post.setId(444);
        assertEquals(444, post.getId());
    }

    @Test
    void setTitle() {
        post.setTitle("title");
        assertEquals("title", post.getTitle());
    }

    @Test
    void setCategory() {
        post.setCategory("category");
        assertEquals("category", post.getCategory());
    }

    @Test
    void setAuthor() {
        post.setAuthor(new User());
        assertNotNull(post.getAuthor());
    }

    @Test
    void setCreatedAt() {
        post.setCreatedAt(new Date());
        assertNotNull(post.getCreatedAt());
    }

    @Test
    void setSummary() {
        post.setSummary("cummary...");
        assertEquals("cummary...", post.getSummary());
    }

    @Test
    void setContent() {
        post.setContent("content");
        assertEquals("content", post.getContent());
    }

    @Test
    void setComments() {
        List<Comment> comments = new ArrayList<>();
        post.setComments(comments);

        assertNotNull(post.getComments());
    }

    @Test
    void setTags() {
        List<String> tags = new ArrayList<>();
        post.setTags(tags);

        assertNotNull(post.getTags());
    }

    @Test
    void setViews() {
        post.setViews(444);
        assertEquals(444, post.getViews());
    }

    @Test
    void setRatings() {
        List<Rating> ratings = new ArrayList<>();
        post.setRatings(ratings);

        assertNotNull(post.getRatings());
    }
}