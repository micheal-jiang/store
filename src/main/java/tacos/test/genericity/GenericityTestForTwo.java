package tacos.test.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: jiangjw
 * @Date: 2022/1/17 9:42
 **/
public class GenericityTestForTwo<T> {
	private T name;
	public GenericityTestForTwo(T name) {
		this.name = name;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public static <T> List<T> array2List(T[] nums) {
		List<T> result = new ArrayList<T>();
		for (T num : nums) {
			result.add(num);
		}
		return result;
	}
}
