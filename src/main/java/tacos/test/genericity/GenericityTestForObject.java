package tacos.test.genericity;

/**
 * @Description: 泛型测试：对象层级
 * 注意点 1.最主要的是类右边的<T>，其他的T都是因它而来。
 * @Author: jiangjw
 * @Date: 2022/1/17 9:42
 **/
public class GenericityTestForObject<T> {

	private T name;
	public GenericityTestForObject(T name) {
		this.name = name;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public static void main(String[] args) {
		GenericityTestForObject<String> haha = new GenericityTestForObject<>("haha");
		System.out.println(haha.getName().getClass());

		GenericityTestForObject<Integer> integer = new GenericityTestForObject<>(4);
		System.out.println(integer.getName().getClass());
	}
}
