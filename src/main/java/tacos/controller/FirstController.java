package tacos.controller;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tacos.domain.Ingredient;
import tacos.util.CloneUtil;

import java.util.List;

/**
 * @Description:
 * @Author: jiangjw
 * @Date: 2022/1/11 12:05
 **/
@Controller
@Slf4j
@RequestMapping("/first")
public class FirstController {

	@GetMapping("/getNProduct")
	@ResponseBody
	public List<Ingredient> getNProduct(Integer num){
		Ingredient  one = new Ingredient("1", "name", Ingredient.Type.CHEESE);
		Ingredient two = null;
		try {
			two = CloneUtil.deepClone(one);
			if (1==1){
				throw new RuntimeException("test");
			}
		} catch (Exception e) {
			throw new RuntimeException("e");
		}
		one.setNext(two);
//		if (1==1){
//			throw new RuntimeException("test");
//		}
		return Lists.newArrayList(one,two);
	}
}
