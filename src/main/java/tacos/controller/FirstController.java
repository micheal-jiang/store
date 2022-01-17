package tacos.controller;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tacos.domain.Ingredient;
import tacos.domain.RequestDomain;
import tacos.domain.User;
import tacos.util.CloneUtil;

import java.util.ArrayList;
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

	@GetMapping("/getNProduct/{num}")
	@ResponseBody
	public List<Ingredient> getNProduct(@PathVariable("num") Integer num){
		ArrayList<Ingredient> list = Lists.newArrayList();
		Ingredient  one = new Ingredient("1", "name", Ingredient.Type.CHEESE);
		for (int i = 0; i < num; i++) {
			list.add(CloneUtil.deepClone(one));
		}
		return list;
	}


	@GetMapping("/loginIn/{username}/{password}")
	@ResponseBody
	public User loginIn(@PathVariable("username") String username, @PathVariable("password") String password){
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		RequestDomain.putInUser(user);

		//测试change的时候能正常change
//		User user2 = new User();
//		user2.setUsername("username");
//		user2.setPassword("password");
//		RequestDomain.putInUser(user2);
		return testGetUser();
	}
	//测试拿取user，一旦putIn，在任何方法中都可以get
	private User testGetUser(){
		return RequestDomain.getUser();
	}
}
