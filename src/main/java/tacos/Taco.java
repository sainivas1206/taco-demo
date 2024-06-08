package tacos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
	
	@Id
	private Long id;

	private Date createdAt = new Date();

	@NotNull
	@Size(min = 5, message = "Taco name should be atleat 5 characters")
	private String name;

	@Size(min=1, message="You must choose at least 1 ingredient")
  	private List<IngredientRef> ingredients = new ArrayList<>();

	public void addIngredient(Ingredient taco) {
		this.ingredients.add(new IngredientRef(taco.getId()));
	}
}