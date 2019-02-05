package challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;

	@Override
	public Recipe save(Recipe recipe) {
		return recipeRepository.save(recipe);
	}

	@Override
	public void update(String id, Recipe recipe) {
		Optional<Recipe> outdatedRevenue = recipeRepository.findById(id);

		if(outdatedRevenue.isPresent()){
			Recipe updatedRecipe = outdatedRevenue.get();
			updatedRecipe.setTitle(recipe.getTitle());
			updatedRecipe.setDescription(recipe.getDescription());
			updatedRecipe.setIngredients(recipe.getIngredients());
			recipeRepository.save(updatedRecipe);
		}
	}

	@Override
	public void delete(String id) {

	}

	@Override
	public Recipe get(String id) {
		return null;
	}



	@Override
	public List<Recipe> listByIngredient(String ingredient) {
		return recipeRepository.findAllByIngredientsEqualsOrderByTitleAsc(ingredient);
	}

	@Override
	public List<Recipe> search(String search) {
		return null;
	}

	@Override
	public void like(String id, String userId) {

	}

	@Override
	public void unlike(String id, String userId) {

	}

	@Override
	public RecipeComment addComment(String id, RecipeComment comment) {
		return null;
	}

	@Override
	public void updateComment(String id, String commentId, RecipeComment comment) {

	}

	@Override
	public void deleteComment(String id, String commentId) {

	}

	// metodo inicial para testar mongo com spring
//	@Override
//	public List<Recipe> index(String id) {
//		return recipeRepository.findAll();
//	}

}
