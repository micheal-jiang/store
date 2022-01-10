package tacos.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.slf4j.Slf4j;
import tacos.domain.Ingredient;
import tacos.domain.Ingredient.Type;
import tacos.domain.IngredientRepository;
import tacos.domain.Order;
import tacos.domain.Taco;

@Controller
@Slf4j
@RequestMapping("/ingredient")
/*
 * sessionAttribute注解可以指定一些参数写入session，而不是request的生命周期
 */
@SessionAttributes({"order"})
public class IngredientController {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	@GetMapping("/save")
	@ResponseBody
	public String  save() {
		Ingredient entity = ingredientRepository.save(new Ingredient("1", "haha", Ingredient.Type.CHEESE) );
		return entity.toString();
	}
	
	@GetMapping("/findOne")
	@ResponseBody
	public String  findOne() {
		Ingredient findOne = ingredientRepository.findOne("1");
		System.out.println(findOne);
		return "/product/list";
	}
	
	@GetMapping("/findAll")
	@ResponseBody
	public String  findAll() {
		List<Ingredient> findAll = ingredientRepository.findAll();
		System.out.println(findAll);
		return "/product/list";
	}
	
	@GetMapping("/index")
	@ResponseBody
	public Object  index(Model model) {
		Object order = model.getAttribute("order2");
		System.out.println(order);
		model.addAttribute("order2", "test1");
		
		return order;
	}
	
	/*
	 * 当重定向的时候，使用addAttribute可以把参数再次写入url中
	 * addAttribute也可以把数据放给页面
	 * addFlashAttribute不知道怎么用，后续探究
	 */
	@GetMapping("/index2")
//	@ResponseBody
	public String  index2(RedirectAttributes redirectAttributes) {
	
		redirectAttributes.addAttribute("order4", "order4");
		
		return "redirect:/ingredient/index3";
	}
	@GetMapping("/index3")
	@ResponseBody
	public String  index3(HttpServletRequest  request,Model model) {
		
		Object order =request.getParameter("order4");
		
		System.out.println(order);
		
		
		return "redirect:/ingredient/index2";
	}
	
	@ModelAttribute(name = "order")
	public Order order() {
		System.out.println("order()");
		return new Order(null,null);
	}
	
	@ModelAttribute(name = "taco")
	public Taco taco() {
		System.out.println("order()");
		return new Taco(null);
	}
}
