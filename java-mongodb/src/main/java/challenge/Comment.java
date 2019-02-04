package challenge;

import org.bson.types.ObjectId;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {

    @Id
    private ObjectId _id;
    private String comment;

    public Comment(ObjectId _id, String comment) {
        this._id = _id;
        this.comment = comment;
    }

    public ObjectId get_id() {
        return _id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
