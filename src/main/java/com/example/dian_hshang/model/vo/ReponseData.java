package com.example.dian_hshang.model.vo;

public class ReponseData {
    private Integer code;
    private String message;

    private Object data;

    // 防止外界创建此对象
    private ReponseData(){

    }

    private ReponseData(Integer code,String message,Object data){
        this.data=data;
        this.code=code;
        this.message=message;
    }


    public static ReponseData success(Object data){
        return new ReponseData(200,"success",data);
    }
    public static ReponseData error(Integer code,String message){
        return new ReponseData(code,message,null);
    }


    public Integer getCode() {
        return code;
    }




    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
