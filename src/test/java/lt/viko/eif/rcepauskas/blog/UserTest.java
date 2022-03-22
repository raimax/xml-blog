package lt.viko.eif.rcepauskas.blog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void setUp() {
        user = new User();
        assertNotNull(user);
    }

    @Test
    void setId() {
        user.setId(444);
        assertEquals(444, user.getId());
    }

    @Test
    void setUsername() {
        user.setUsername("username");
        assertEquals("username", user.getUsername());
    }

    @Test
    void setEmail() {
        user.setEmail("email@email.com");
        assertEquals("email@email.com", user.getEmail());
    }

    @Test
    void setJoinedAt() {
        user.setJoinedAt(new Date());
        assertNotNull(user.getJoinedAt());
    }
}