package challenge;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Classe para mapear o coment�rio da receita no MongoDB
 *
 */

@Document
public class RecipeComment {
    @Id
    private ObjectId _id;
    private String comment;

    public RecipeComment() {}

    public RecipeComment(ObjectId _id, String comment) {
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
