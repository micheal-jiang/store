package tacos.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient implements Serializable {
	private String id;
	private String name;
	private Type type;
	private Date createdAt;

	private Ingredient next;

	public Ingredient(String id, String name, Type type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public static enum Type{
		WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
	}
}
