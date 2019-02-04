package challenge;


import org.bson.types.ObjectId;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;


/**
 * Classe para mapear a receita no MongoDB
 *
 */
@Entity
public class Recipe {

    @Id
    private ObjectId _id;
    private String title;
    private String description;
    private List<String> likes;
    private List<String> ingredients;
    private List<Comment> comments;

    public Recipe(ObjectId _id, String title, String description, List<String> likes, List<String> ingredients, List<Comment> comments) {
        this._id = _id;
        this.title = title;
        this.description = description;
        this.likes = likes;
        this.ingredients = ingredients;
        this.comments = comments;
    }

    public ObjectId get_id() {
        return _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
