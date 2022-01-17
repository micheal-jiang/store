package tacos.test.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 泛型测试：类层级
 * 注意点 1.
 * @Author: jiangjw
 * @Date: 2022/1/17 9:42
 **/
public class GenericityTestForClass {
	public static <T> List<T> array2List(T[] nums) {
		List<T> result = new ArrayList<T>();
		for (T num : nums) {
			result.add(num);
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> integers = GenericityTestForClass.array2List(new Integer[]{1, 2, 3, 4, 5});
		List<Double> doubles = GenericityTestForClass.array2List(new Double[]{1.1, 2.4, 3.6});
		System.out.println(integers);
		System.out.println(doubles);
	}
}
