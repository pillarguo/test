package com.imooc.girl.enums;

public enum  ResultEnums {

    UKNOW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY(101,"小学"),
    MIDLLE(102,"中学"),
    COLLEGE(103,"大学");

    private Integer code;
    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
