package lt.viko.eif.rcepauskas.blog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatingTest {

    Rating rating;

    @BeforeEach
    void setUp() {
        rating = new Rating();
        assertNotNull(rating);
    }

    @Test
    void setUser() {
        rating.setUser(new User());
        assertNotNull(rating.getUser());
    }

    @Test
    void setLiked() {
        rating.setLiked(true);
        assertEquals(true, rating.isLiked());
    }
}