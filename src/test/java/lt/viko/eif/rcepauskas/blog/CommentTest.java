package lt.viko.eif.rcepauskas.blog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

    Comment comment;

    @BeforeEach
    void setUp() {
        comment = new Comment();
        Assertions.assertNotNull(comment);
    }

    @Test
    void setId() {
        comment.setId(444);
        Assertions.assertEquals(444, comment.getId());
    }

    @Test
    void setAuthor() {
        comment.setAuthor(new User());
        Assertions.assertNotNull(comment.getAuthor());
    }

    @Test
    void setCreatedAt() {
        comment.setCreatedAt(new Date());
        Assertions.assertNotNull(comment.getCreatedAt());
    }

    @Test
    void setContent() {
        comment.setContent("content");
        Assertions.assertEquals("content", comment.getContent());
    }
}