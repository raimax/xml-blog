package lt.viko.eif.rcepauskas.blog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * A class that stores user's rating data
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Rating {
    private User user;
    private boolean isLiked;

    public Rating() {
    }

    public Rating(User user, boolean isLiked) {
        this.user = user;
        this.isLiked = isLiked;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    @Override
    public String toString() {
        String ratingString = "\t\tuser: " + this.user.toString() + "\n\t"
                + "\tis liked: " + this.isLiked + "\n\n";

        return ratingString;
    }
}
