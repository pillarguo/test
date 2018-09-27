package com.imooc.girl.excep;

import com.imooc.girl.enums.ResultEnums;

public class GirlExcep extends RuntimeException {

    private Integer code;

    public GirlExcep(ResultEnums enums){
        super(enums.getMsg());
        this.code=enums.getCode();
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
