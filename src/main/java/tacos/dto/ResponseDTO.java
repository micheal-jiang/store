/*
package tacos.dto;


import cn.com.jxlife.esale.policyserver.common.constant.CommonConst;
import cn.com.jxlife.esale.policyserver.common.constant.ResponseCodeConst;
import cn.com.jxlife.framework.jkit.security.sm.SM4Util;
import com.alibaba.fastjson.JSON;

import java.io.IOException;

*/
/**
 * 返回类
 *
 * @param <T>
 *//*

public class ResponseDTO<T> {

    protected Integer code;

    protected String msg;

    protected Boolean success;

    protected T data;

    public ResponseDTO() {
    }

    public ResponseDTO(ResponseCodeConst responseCodeConst, String msg) {
        this.code = responseCodeConst.getCode();
        this.msg = msg;
        this.success = responseCodeConst.isSuccess();
    }

    public ResponseDTO(ResponseCodeConst responseCodeConst, T data) {
        super();
        this.code = responseCodeConst.getCode();
        this.msg = responseCodeConst.getMsg();
        this.data = data;
        this.success = responseCodeConst.isSuccess();
    }

    public ResponseDTO(ResponseCodeConst responseCodeConst, T data, String msg) {
        super();
        this.code = responseCodeConst.getCode();
        this.msg = msg;
        this.data = data;
        this.success = responseCodeConst.isSuccess();
    }

    private ResponseDTO(ResponseCodeConst responseCodeConst) {
        this.code = responseCodeConst.getCode();
        this.msg = responseCodeConst.getMsg();
        this.success = responseCodeConst.isSuccess();
    }

    public ResponseDTO(ResponseDTO responseDTO) {
        this.code = responseDTO.getCode();
        this.msg = responseDTO.getMsg();
        this.success = responseDTO.isSuccess();
    }

    public static <T> ResponseDTO<T> succ() {
        return new ResponseDTO(ResponseCodeConst.SUCCESS);
    }

    public static <T> ResponseDTO<T> errorParam() {
        return new ResponseDTO(ResponseCodeConst.ERROR_PARAM);
    }

    public static <T> ResponseDTO<T> succData(T data, String msg) {
        return new ResponseDTO(ResponseCodeConst.SUCCESS, data, msg);
    }


    public static <T> ResponseDTO<T> succData(T data) {
        return new ResponseDTO(ResponseCodeConst.SUCCESS, data);
    }

    public static <T> ResponseDTO succMsg(String msg) {
        return new ResponseDTO(ResponseCodeConst.SUCCESS, msg);
    }

    public static <T> ResponseDTO failMsg(String msg) {
        return new ResponseDTO(ResponseCodeConst.ERROR_PARAM, msg);
    }
    public static <T> ResponseDTO<T> wrap(ResponseCodeConst codeConst) {
        return new ResponseDTO<>(codeConst);
    }

    public static <T> ResponseDTO<T> wrap(ResponseCodeConst codeConst, T t) {
        return new ResponseDTO<T>(codeConst, t);
    }

    public static <T> ResponseDTO<T> wrap(ResponseCodeConst codeConst, String msg) {
        return new ResponseDTO<T>(codeConst, msg);
    }

    public static <T> ResponseDTO<T> wrapMsg(ResponseCodeConst codeConst, String msg) {
        return new ResponseDTO<T>(codeConst, msg);
    }

    public String getMsg() {
        return msg;
    }

    public ResponseDTO setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public int getCode() {
        return code;
    }

    public ResponseDTO setCode(Integer code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResponseDTO setData(T data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" + "code=" + code + ", msg='" + msg + '\'' + ", success=" + success + ", data=" + data +
                '}';
    }


    public ResponseDTO encode(boolean ifSM4) throws IOException {
        if (ifSM4 && this.getData() != null) {
            ResponseDTO<String> encodedDto = new ResponseDTO<>();
            encodedDto.setSuccess(this.isSuccess());
            encodedDto.setCode(this.getCode());
            encodedDto.setMsg(this.getMsg());
            if (this.getData() != null) {
                encodedDto.setData( new SM4Util().encode(JSON.toJSONString(this.getData()), CommonConst.Key.PARAM_KEY));
            }
            return encodedDto;
        }
        return this;
    }
}
*/
