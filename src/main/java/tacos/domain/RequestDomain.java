package tacos.domain;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import tacos.util.SpringUtils;

/**
 * @Description:
 * @Author: jiangjw
 * @Date: 2022/1/13 10:01
 **/

@Data
@Component
@Scope("request")
public class RequestDomain {
	private User user;

	public static void putInUser(User user) {
		RequestDomain requestDomain = SpringUtils.getBean("requestDomain");
		requestDomain.setUser(user);
	}


	public static User getUser() {
		RequestDomain requestDomain = SpringUtils.getBean("requestDomain");
		Assert.notNull(requestDomain.user,"请先putIn一个bean，再去get它！！！");
		return requestDomain.user;
	}
}
