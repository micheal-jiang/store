package tacos.test.lamboda;

import org.springframework.util.Assert;

import java.util.function.Predicate;

/**
 * @Description: lambda表达式简单测试
 * 变量不再仅仅是对象和基本类型，还可以是算法。
 * lambda出现之前，算法只能用对象中的某个方法来等价表示，相当于杀鸡用牛刀。造成代码冗余，如匿名内部类实现。
 * @Author: jiangjw
 * @Date: 2022/1/10 14:48
 **/
public class LambodaTest {
	private static Predicate<String> predicate = name -> name.startsWith("蒋");

	public static void main(String[] args) {
		System.out.println(predicate.test("邹家"));
		System.out.println(predicate.test("蒋剑伟"));
		Assert.isTrue(!predicate.test("邹家"),"");
		Assert.isTrue(predicate.test("蒋剑伟"),"");
	}
}
