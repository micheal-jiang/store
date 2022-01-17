package tacos.exception;

/**
 * @Description:
 * @Author: jiangjw
 * @Date: 2022/1/12 16:04
 **/
public class BusinessException extends RuntimeException{
	public BusinessException(String message) {
		super(message);
	}
}
