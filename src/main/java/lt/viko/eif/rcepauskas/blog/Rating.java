package lt.viko.eif.rcepauskas.blog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

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
}
