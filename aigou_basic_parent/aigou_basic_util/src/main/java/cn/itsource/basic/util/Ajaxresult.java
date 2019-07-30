package cn.itsource.basic.util;

public class Ajaxresult {
    private boolean success;
    private String message;
    private Object resultObj;
    private Integer errorCode;

    public boolean isSuccess() {
        return success;
    }
    //链式编程AjaxResult.me().setSuccess(true).setMessage("操作成功！")
    public Ajaxresult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Ajaxresult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public Ajaxresult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public Ajaxresult setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

}
