package lt.viko.eif.rcepauskas.blog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataServiceTest {

    @Test
    void createBlogData() {
        Blog blog = DataService.createBlogData();

        Assertions.assertNotNull(blog);
        Assertions.assertNotNull(blog.getPosts());
        Assertions.assertNotNull(blog.getUsers());
    }
}