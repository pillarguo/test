package com.imooc.girl.handle;

import com.imooc.girl.domain.Result;
import com.imooc.girl.excep.GirlExcep;
import com.imooc.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class ExceptionHadle {

    private final static Logger logger= LoggerFactory.getLogger(ExceptionHadle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlExcep){
            GirlExcep girlExcep=(GirlExcep) e;
            return ResultUtil.error(girlExcep.getCode(),girlExcep.getMessage());
        }else {
            logger.error("系统异常"+e);
            return ResultUtil.error(-1,"未知错误");
        }

    }
}
