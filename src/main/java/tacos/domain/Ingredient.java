package tacos.domain;

import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor	
public class Ingredient {
	private final String id;
	private final String name;
	private final Type type;
	private Date createdAt;
	
	public static enum Type{
		WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
	}
}
