package tacos.controller;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import tacos.domain.Ingredient;
import tacos.domain.Ingredient.Type;
import tacos.domain.Taco;

@Controller
@Slf4j
@RequestMapping("/design")
public class DesignController {

	@GetMapping
	public String showDesignForm(Model model) {
		List<Ingredient> ingredients = Arrays.asList(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
				new Ingredient("WRAP", "Flour Tortilla", Type.WRAP),
				new Ingredient("FLTO", "Flour Tortilla", Type.WRAP)
				);
		Type[] types = Ingredient.Type.values();
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), ingredients);
		}
		model.addAttribute("design", null);
		return "design";
	}
	

}
