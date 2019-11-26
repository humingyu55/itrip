package com.itrip.beans.dto;

public class Dto<T> {
    /**
     * 成功表示（true：成功，false：失败）
     */
    private String success;
    /**
     * 错误码（没有错误是：0）
     */
    private String errorCode;
    /**
     * 消息
     */
    private String msg;
    /**
     * 封装的数据
     */
    private T data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
