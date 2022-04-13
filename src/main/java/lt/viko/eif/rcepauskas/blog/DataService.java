package lt.viko.eif.rcepauskas.blog;

import java.util.ArrayList;
import java.util.List;

/**
 * A class used to generate data for the blog
 */
public class DataService {

    /**
     * Creates users and posts for the blog
     * @return {@link Blog} object with generated data
     */
    public static Blog createBlogData() {
        Blog blog = new Blog();
        blog.setPosts(createPosts());
        blog.setUsers(createUsers());

        return blog;
    }

    public static List<Post> createPosts() {
        List<Post> posts = new ArrayList<>();

        Post post1 = new Post(1, "title1", "lifestyle", new User(1, "admin", "admin@site.com"), 132);
        post1.setContentWithSummary("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vitae lectus porttitor, " +
                "scelerisque augue eu, vehicula metus. Class aptent taciti sociosqu ad litora torquent per conubia " +
                "nostra, per inceptos himenaeos.");
        post1.setComments(createComments());
        post1.setRatings(createRatings());
        post1.setTags(createTags());

        Post post2 = new Post(2, "title2", "travel", new User(1, "admin", "admin@site.com"), 367);
        post2.setContentWithSummary("Vestibulum facilisis feugiat risus sit amet consequat. Donec sodales massa et magna molestie " +
                "pellentesque id sed diam. Sed lobortis consequat condimentum.");
        post2.setComments(createComments());
        post2.setRatings(createRatings());
        post2.setTags(createTags());

        posts.add(post1);
        posts.add(post2);

        return posts;
    }

    public static List<User> createUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "admin", "admin@site.com"));
        users.add(new User(2, "user456", "user456@gamil.com"));
        users.add(new User(3, "user884", "user884@mail.com"));
        users.add(new User(4, "john", "john@site.com"));
        users.add(new User(5, "bob", "bob@site.com"));

        return users;
    }

    private static List<Comment> createComments() {
        List<Comment> comments = new ArrayList<>();

        Comment comment1 = new Comment(1, new User(1, "admin", "admin@site.com"));
        comment1.setContent("This is a comment");
        Comment comment2 = new Comment(2, new User(2, "user456", "user456@gamil.com"));
        comment2.setContent("This is a comment");
        Comment comment3 = new Comment(3, new User(3, "user884", "user884@mail.com"));
        comment3.setContent("This is a comment");

        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);

        return comments;
    }

    private static List<Rating> createRatings() {
        List<Rating> ratings = new ArrayList<>();

        ratings.add(new Rating(new User(1, "admin", "admin@site.com"), true));
        ratings.add(new Rating(new User(2, "user456", "user456@gmail.com"), false));
        ratings.add(new Rating(new User(3, "user884", "user884@mail.com"), true));

        return ratings;
    }

    private static List<String> createTags() {
        return List.of("tag1", "tag2", "tag3", "tag4", "tag5");
    }
}
