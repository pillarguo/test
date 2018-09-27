package com.imooc.girl.controller;


import com.imooc.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="h")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value = {"/hello"})
    @GetMapping("hello")
    public  String say(@RequestParam(value="id",required = false,defaultValue = "0") Integer Myid){
        return "id:"+Myid;
        //return  girlProperties.getCupSize()+girlProperties.getAge();
        //return "index";
    }

}
