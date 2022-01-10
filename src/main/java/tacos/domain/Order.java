package tacos.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor

public class Order {
	private final String id;
	private final String name;
	private Date createdAt;
	private List<Taco> tacos;
}
