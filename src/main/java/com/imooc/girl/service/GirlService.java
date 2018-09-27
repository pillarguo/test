package com.imooc.girl.service;

import com.imooc.girl.domain.Girl;
import com.imooc.girl.enums.ResultEnums;
import com.imooc.girl.excep.GirlExcep;
import com.imooc.girl.repositor.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public void insetTwo(){
        Girl girlA=new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);


        Girl girlB=new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws  Exception{
        Girl girl=girlRepository.findOne(id);
        Integer age=girl.getAge();
        if (age<=10){
            throw new GirlExcep(ResultEnums.PRIMARY);
        }else if(age>10&& age<16){
            throw new GirlExcep(ResultEnums.MIDLLE);
        }else {
            throw new GirlExcep(ResultEnums.COLLEGE);
        }
    }

    /**
     * 通过id查询一个女生的信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }

}
