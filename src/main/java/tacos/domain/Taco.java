package tacos.domain;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import tacos.domain.Ingredient.Type;

@Data
@RequiredArgsConstructor
public class Taco {
	private final String id;
	String name;
	private Date createdAt;
	
	
}
