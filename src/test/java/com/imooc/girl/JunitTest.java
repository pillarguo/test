package com.imooc.girl;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import com.invoke.MethodInvoke;

public class JunitTest {



    @BeforeClass
    public static void befClass(){
        System.out.println("before class");
    }
    @AfterClass
    public static void  aftClass(){
        System.out.println("after class");
    }
    @Before
    public  void bef(){
        System.out.println("before");
    }
    @After
    public  void aft(){
        System.out.println("after");
    }
    @Test
    public  void te(){
        System.out.println("test");
    }


//    @Test
//    public void testAdd(){
//        assertEquals(5,MethodInvoke.add(3,2));
//    }
//
//    @Test
//    public void testDivide(){
//        assertEquals(3.0,MethodInvoke.divide(6,2),0.001);
//    }


}
