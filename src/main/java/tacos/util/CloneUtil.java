package tacos.util;

import org.springframework.beans.BeanUtils;

import java.io.*;

/**
 * @Description: 深度克隆工具类
 * @Author: jiangjw
 * @Date: 2022/1/11 13:33
 **/
public class CloneUtil {

	/**
	 * @description: 浅拷贝
	 * @auther: jiangjw
	 * @date: 2022/1/11 13:42
	 */
	public static <T extends Serializable> T shallowClone(T  entity) throws Exception {
		Object cloneEntity = entity.getClass().getConstructor().newInstance();
		BeanUtils.copyProperties(entity,cloneEntity);
		return (T) cloneEntity;
	}

	/**
	 * @description: 深拷贝
	 * @auther: jiangjw
	 * @date: 2022/1/11 13:53
	 */
	public static <T extends Serializable> T deepClone(T  entity) {
		T cloneEntity = null;
		try {
			// 写入字节流
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ObjectOutputStream obs = new ObjectOutputStream(out);
			obs.writeObject(entity);
			obs.close();

			// 分配内存，写入原始对象，生成新对象
			ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(ios);
			// 返回生成的新对象
			cloneEntity = (T) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cloneEntity;
	}
}
