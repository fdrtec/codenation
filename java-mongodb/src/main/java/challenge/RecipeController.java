package challenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {

	@Autowired
	private RecipeService service;

	@PostMapping("/recipe")
	public Recipe save(@RequestBody Recipe recipe) { return service.save(recipe);}

	public void update() {
		service.update(null, null);
	}

	public void delete() {
		service.delete(null);
	}

	public Recipe get() { return service.get(null);
	}

	@GetMapping("/recipe/{ingredient}")
	public List<Recipe> listByIngredient(@PathVariable ("ingredient") String ingredient) {
		return service.listByIngredient(ingredient);
	}

	public List<Recipe> search() {
		return service.search(null);
	}

	public void like() {
		service.like(null, null);
	}

	public void unlike() {
		service.unlike(null, null);
	}

	public RecipeComment addComment() {
		return service.addComment(null, null);
	}

	public void updateComment() {
		service.updateComment(null, null, null);
	}

	public void deleteComment() {
		service.deleteComment(null, null);
	}

//	@GetMapping("/receita")
//	public List<Recipe> list(String title) {
//		return service.index(title);
//	}

//	@GetMapping("/estabelecimentos")
//	public ResponseEntity<List<Estabelecimento>>getEstabelecimentos(){
//		return ResponseEntity.ok((estabelecimentoService.getEstabelecimentos()));
//	}

}
