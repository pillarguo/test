package com.imooc.girl;

import com.imooc.girl.domain.Girl;
import com.imooc.girl.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Autowired
    private Te te;

    @Test
    public void findOneTest(){
        Girl girl =girlService.findOne(9);
        Assert.assertEquals(new Integer(19),girl.getAge());
    }

    @Test
    public void tes(){
        Assert.assertEquals(new Integer(12),te.tt());
    }
}
