package tacos.domain;

import java.util.List;

/*
 * 仓库
 */
public interface IngredientRepository {
	List<Ingredient> findAll();
	Ingredient findOne(String id);
	Ingredient save(Ingredient entity);
	
}
