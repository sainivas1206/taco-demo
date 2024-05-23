package tacos;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
	
	@NotNull
	@Size(min = 5, message = "Taco name should be atleat 5 characters")
	private String name;

	@NotNull
	@Size(min = 1, message = "You must select atleast 1 taco ingredient")
	private List<Ingredient> ingredients;
}